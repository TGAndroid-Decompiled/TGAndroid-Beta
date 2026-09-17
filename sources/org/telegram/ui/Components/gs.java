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
    public int f24392a;
    public int f24393b;
    public h01 f24394c;
    public int d;
    public int e;

    public static gs b(org.telegram.ui.Cells.r2 r2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f24392a = dialogFilter.f15613id;
        obj.f24393b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        h01 h01Var = new h01(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        h01Var.s(r2Var);
        obj.f24394c = h01Var;
        obj.f24394c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, h01Var.f24437a.getFontMetricsInt(), false), dialogFilter.entities, obj.f24394c.f24437a.getFontMetricsInt()));
        obj.f24394c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        h01 h01Var2 = obj.f24394c;
        obj.e = dp + ((int) h01Var2.f24439c);
        h01Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.j6.f19120r8;
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
        this.f24394c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
