package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
public final class is {
    public int f25204a;
    public int f25205b;
    public v01 f25206c;
    public int d;
    public int e;

    public static is b(org.telegram.ui.Cells.s2 s2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f25204a = dialogFilter.f15832id;
        obj.f25205b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        v01 v01Var = new v01(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        v01Var.s(s2Var);
        obj.f25206c = v01Var;
        obj.f25206c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, v01Var.f28926a.getFontMetricsInt(), false), dialogFilter.entities, obj.f25206c.f28926a.getFontMetricsInt()));
        obj.f25206c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        v01 v01Var2 = obj.f25206c;
        obj.e = dp + ((int) v01Var2.f28928c);
        v01Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.h6.f19318r8;
        obj.d = org.telegram.ui.ActionBar.h6.w0(null, iArr[dialogFilter.color % iArr.length], false);
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
        paint.setColor(org.telegram.ui.ActionBar.h6.l1(f7, i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.h6.A0);
        this.f25206c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
