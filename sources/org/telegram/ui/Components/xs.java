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
    public int f33022a;
    public int f33023b;
    public m11 f33024c;
    public int d;
    public int f33025e;

    public static xs b(org.telegram.ui.Cells.s2 s2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f33022a = dialogFilter.f17256id;
        obj.f33023b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        m11 m11Var = new m11(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        m11Var.s(s2Var);
        obj.f33024c = m11Var;
        obj.f33024c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, m11Var.f28600a.getFontMetricsInt(), false), dialogFilter.entities, obj.f33024c.f28600a.getFontMetricsInt()));
        obj.f33024c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        m11 m11Var2 = obj.f33024c;
        obj.f33025e = dp + ((int) m11Var2.f28602c);
        m11Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.i6.f21061r8;
        obj.d = org.telegram.ui.ActionBar.i6.x0(null, iArr[dialogFilter.color % iArr.length], false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f7;
        Paint paint = org.telegram.ui.ActionBar.i6.A0;
        int i10 = this.d;
        if (org.telegram.ui.ActionBar.i6.I.q()) {
            f7 = 0.2f;
        } else {
            f7 = 0.1f;
        }
        paint.setColor(org.telegram.ui.ActionBar.i6.m1(f7, i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.f33025e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.i6.A0);
        this.f33024c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
