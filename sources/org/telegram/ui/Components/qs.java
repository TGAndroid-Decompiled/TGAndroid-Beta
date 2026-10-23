package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
public final class qs {
    public int f29698a;
    public int f29699b;
    public f11 f29700c;
    public int d;
    public int e;

    public static qs b(org.telegram.ui.Cells.r2 r2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f29698a = dialogFilter.f17799id;
        obj.f29699b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        f11 f11Var = new f11(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        f11Var.s(r2Var);
        obj.f29700c = f11Var;
        obj.f29700c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, f11Var.f26023a.getFontMetricsInt(), false), dialogFilter.entities, obj.f29700c.f26023a.getFontMetricsInt()));
        obj.f29700c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        f11 f11Var2 = obj.f29700c;
        obj.e = dp + ((int) f11Var2.f26025c);
        f11Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.h6.f21253r8;
        obj.d = org.telegram.ui.ActionBar.h6.x0(null, iArr[dialogFilter.color % iArr.length], false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f7;
        Paint paint = org.telegram.ui.ActionBar.h6.A0;
        int i10 = this.d;
        if (org.telegram.ui.ActionBar.h6.I.q()) {
            f7 = 0.2f;
        } else {
            f7 = 0.1f;
        }
        paint.setColor(org.telegram.ui.ActionBar.h6.m1(f7, i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.h6.A0);
        this.f29700c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
