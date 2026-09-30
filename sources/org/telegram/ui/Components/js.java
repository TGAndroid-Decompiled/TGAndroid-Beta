package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
public final class js {
    public int f25542a;
    public int f25543b;
    public w01 f25544c;
    public int d;
    public int e;

    public static js b(org.telegram.ui.Cells.s2 s2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f25542a = dialogFilter.f15849id;
        obj.f25543b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        w01 w01Var = new w01(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        w01Var.s(s2Var);
        obj.f25544c = w01Var;
        obj.f25544c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, w01Var.f29766a.getFontMetricsInt(), false), dialogFilter.entities, obj.f25544c.f29766a.getFontMetricsInt()));
        obj.f25544c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        w01 w01Var2 = obj.f25544c;
        obj.e = dp + ((int) w01Var2.f29768c);
        w01Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.h6.f19335r8;
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
        this.f25544c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
