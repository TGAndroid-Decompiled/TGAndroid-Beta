package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
public final class gs {
    public int f24449a;
    public int f24450b;
    public u01 f24451c;
    public int d;
    public int e;

    public static gs b(org.telegram.ui.Cells.s2 s2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f24449a = dialogFilter.f15822id;
        obj.f24450b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        u01 u01Var = new u01(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        u01Var.s(s2Var);
        obj.f24451c = u01Var;
        obj.f24451c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, u01Var.f28491a.getFontMetricsInt(), false), dialogFilter.entities, obj.f24451c.f28491a.getFontMetricsInt()));
        obj.f24451c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        u01 u01Var2 = obj.f24451c;
        obj.e = dp + ((int) u01Var2.f28493c);
        u01Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.j6.f19353r8;
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
        this.f24451c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
