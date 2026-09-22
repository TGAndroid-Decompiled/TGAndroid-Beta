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
    public int f24614a;
    public int f24615b;
    public w01 f24616c;
    public int d;
    public int e;

    public static gs b(org.telegram.ui.Cells.s2 s2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f24614a = dialogFilter.f15837id;
        obj.f24615b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        w01 w01Var = new w01(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        w01Var.s(s2Var);
        obj.f24616c = w01Var;
        obj.f24616c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, w01Var.f29860a.getFontMetricsInt(), false), dialogFilter.entities, obj.f24616c.f29860a.getFontMetricsInt()));
        obj.f24616c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        w01 w01Var2 = obj.f24616c;
        obj.e = dp + ((int) w01Var2.f29862c);
        w01Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.j6.f19368r8;
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
        this.f24616c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
