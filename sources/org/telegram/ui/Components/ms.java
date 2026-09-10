package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
public final class ms {
    public int f25278a;
    public int f25279b;
    public t01 f25280c;
    public int d;
    public int e;

    public static ms b(org.telegram.ui.Cells.r2 r2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f25278a = dialogFilter.f14645id;
        obj.f25279b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        t01 t01Var = new t01(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        t01Var.s(r2Var);
        obj.f25280c = t01Var;
        obj.f25280c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, t01Var.f27245a.getFontMetricsInt(), false), dialogFilter.entities, obj.f25280c.f27245a.getFontMetricsInt()));
        obj.f25280c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        t01 t01Var2 = obj.f25280c;
        obj.e = dp + ((int) t01Var2.f27247c);
        t01Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.j6.f18182r8;
        obj.d = org.telegram.ui.ActionBar.j6.w0(null, iArr[dialogFilter.color % iArr.length], false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f7;
        Paint paint = org.telegram.ui.ActionBar.j6.A0;
        int i10 = this.d;
        if (org.telegram.ui.ActionBar.j6.I.q()) {
            f7 = 0.2f;
        } else {
            f7 = 0.1f;
        }
        paint.setColor(org.telegram.ui.ActionBar.j6.l1(f7, i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.A0);
        this.f25280c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
