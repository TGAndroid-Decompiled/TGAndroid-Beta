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
    public int f27570a;
    public int f27571b;
    public l01 f27572c;
    public int d;
    public int f27573e;

    public static hs b(org.telegram.ui.Cells.r2 r2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f27570a = dialogFilter.f18055id;
        obj.f27571b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        l01 l01Var = new l01(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        l01Var.s(r2Var);
        obj.f27572c = l01Var;
        obj.f27572c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, l01Var.f28519a.getFontMetricsInt(), false), dialogFilter.entities, obj.f27572c.f28519a.getFontMetricsInt()));
        obj.f27572c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        l01 l01Var2 = obj.f27572c;
        obj.f27573e = dp + ((int) l01Var2.f28521c);
        l01Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.k6.f21914r8;
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
        rectF.set(0.0f, 0.0f, this.f27573e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.k6.A0);
        this.f27572c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
