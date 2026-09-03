package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
public final class es {
    public int f24679a;
    public int f24680b;
    public k01 f24681c;
    public int d;
    public int e;

    public static es b(org.telegram.ui.Cells.q2 q2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f24679a = dialogFilter.f16649id;
        obj.f24680b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        k01 k01Var = new k01(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        k01Var.s(q2Var);
        obj.f24681c = k01Var;
        obj.f24681c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, k01Var.f26122a.getFontMetricsInt(), false), dialogFilter.entities, obj.f24681c.f26122a.getFontMetricsInt()));
        obj.f24681c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        k01 k01Var2 = obj.f24681c;
        obj.e = dp + ((int) k01Var2.f26124c);
        k01Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.j6.f20134r8;
        obj.d = org.telegram.ui.ActionBar.j6.w0(null, iArr[dialogFilter.color % iArr.length], false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f10;
        Paint paint = org.telegram.ui.ActionBar.j6.A0;
        int i10 = this.d;
        if (org.telegram.ui.ActionBar.j6.I.q()) {
            f10 = 0.2f;
        } else {
            f10 = 0.1f;
        }
        paint.setColor(org.telegram.ui.ActionBar.j6.l1(f10, i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.A0);
        this.f24681c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
