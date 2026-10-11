package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
public final class xs {
    public int f33019a;
    public int f33020b;
    public n11 f33021c;
    public int d;
    public int f33022e;

    public static xs b(org.telegram.ui.Cells.s2 s2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f33019a = dialogFilter.f17251id;
        obj.f33020b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        n11 n11Var = new n11(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        n11Var.s(s2Var);
        obj.f33021c = n11Var;
        obj.f33021c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, n11Var.f28900a.getFontMetricsInt(), false), dialogFilter.entities, obj.f33021c.f28900a.getFontMetricsInt()));
        obj.f33021c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        n11 n11Var2 = obj.f33021c;
        obj.f33022e = dp + ((int) n11Var2.f28902c);
        n11Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.h6.f21047r8;
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
        rectF.set(0.0f, 0.0f, this.f33022e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.h6.A0);
        this.f33021c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
