package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
public final class hs {
    public int f27609a;
    public int f27610b;
    public k01 f27611c;
    public int d;
    public int f27612e;

    public static hs b(org.telegram.ui.Cells.r2 r2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f27609a = dialogFilter.f18057id;
        obj.f27610b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        k01 k01Var = new k01(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        k01Var.s(r2Var);
        obj.f27611c = k01Var;
        obj.f27611c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, k01Var.f28225a.getFontMetricsInt(), false), dialogFilter.entities, obj.f27611c.f28225a.getFontMetricsInt()));
        obj.f27611c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        k01 k01Var2 = obj.f27611c;
        obj.f27612e = dp + ((int) k01Var2.f28227c);
        k01Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.k6.f21916r8;
        obj.d = org.telegram.ui.ActionBar.k6.w0(null, iArr[dialogFilter.color % iArr.length], false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f10;
        Paint paint = org.telegram.ui.ActionBar.k6.A0;
        int i10 = this.d;
        if (org.telegram.ui.ActionBar.k6.I.q()) {
            f10 = 0.2f;
        } else {
            f10 = 0.1f;
        }
        paint.setColor(org.telegram.ui.ActionBar.k6.l1(f10, i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.f27612e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.k6.A0);
        this.f27611c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
