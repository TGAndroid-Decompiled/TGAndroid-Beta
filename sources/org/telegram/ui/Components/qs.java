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
    public int f29683a;
    public int f29684b;
    public e11 f29685c;
    public int d;
    public int e;

    public static qs b(org.telegram.ui.Cells.r2 r2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f29683a = dialogFilter.f17799id;
        obj.f29684b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        e11 e11Var = new e11(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        e11Var.s(r2Var);
        obj.f29685c = e11Var;
        obj.f29685c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, e11Var.f25726a.getFontMetricsInt(), false), dialogFilter.entities, obj.f29685c.f25726a.getFontMetricsInt()));
        obj.f29685c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        e11 e11Var2 = obj.f29685c;
        obj.e = dp + ((int) e11Var2.f25728c);
        e11Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.h6.f21246r8;
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
        this.f29685c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
