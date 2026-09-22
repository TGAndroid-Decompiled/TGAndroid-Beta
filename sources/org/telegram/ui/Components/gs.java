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
    public int f24454a;
    public int f24455b;
    public g01 f24456c;
    public int d;
    public int e;

    public static gs b(org.telegram.ui.Cells.r2 r2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f24454a = dialogFilter.f15601id;
        obj.f24455b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        g01 g01Var = new g01(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        g01Var.s(r2Var);
        obj.f24456c = g01Var;
        obj.f24456c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, g01Var.f24144a.getFontMetricsInt(), false), dialogFilter.entities, obj.f24456c.f24144a.getFontMetricsInt()));
        obj.f24456c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        g01 g01Var2 = obj.f24456c;
        obj.e = dp + ((int) g01Var2.f24146c);
        g01Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.i6.f19091r8;
        obj.d = org.telegram.ui.ActionBar.i6.w0(null, iArr[dialogFilter.color % iArr.length], false);
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
        paint.setColor(org.telegram.ui.ActionBar.i6.l1(f7, i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.i6.A0);
        this.f24456c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
