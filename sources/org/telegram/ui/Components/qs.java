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
    public int f29969a;
    public int f29970b;
    public i11 f29971c;
    public int d;
    public boolean e;
    public int f29972f;
    public int f29973g;

    public static qs b(org.telegram.ui.Cells.q2 q2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f29969a = dialogFilter.f17862id;
        obj.f29970b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        i11 i11Var = new i11(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        i11Var.s(q2Var);
        obj.f29971c = i11Var;
        obj.f29971c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, i11Var.f27162a.getFontMetricsInt(), false), dialogFilter.entities, obj.f29971c.f27162a.getFontMetricsInt()));
        obj.f29971c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        i11 i11Var2 = obj.f29971c;
        obj.f29973g = dp + ((int) i11Var2.f27164c);
        i11Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.k6.f21442r8;
        int i10 = iArr[dialogFilter.color % iArr.length];
        obj.f29972f = i10;
        obj.e = true;
        obj.d = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f7;
        if (this.e) {
            this.d = org.telegram.ui.ActionBar.k6.x0(null, this.f29972f, false);
        }
        Paint paint = org.telegram.ui.ActionBar.k6.A0;
        int i10 = this.d;
        if (org.telegram.ui.ActionBar.k6.I.q()) {
            f7 = 0.2f;
        } else {
            f7 = 0.1f;
        }
        paint.setColor(org.telegram.ui.ActionBar.k6.o1(f7, i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.f29973g, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.k6.A0);
        this.f29971c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
