package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
public final class ys {
    public int f33168a;
    public int f33169b;
    public r11 f33170c;
    public int d;
    public int f33171e;

    public static ys b(org.telegram.ui.Cells.s2 s2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f33168a = dialogFilter.f17004id;
        obj.f33169b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        r11 r11Var = new r11(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        r11Var.s(s2Var);
        obj.f33170c = r11Var;
        obj.f33170c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, r11Var.f29987a.getFontMetricsInt(), false), dialogFilter.entities, obj.f33170c.f29987a.getFontMetricsInt()));
        obj.f33170c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        r11 r11Var2 = obj.f33170c;
        obj.f33171e = dp + ((int) r11Var2.f29989c);
        r11Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.h6.f20821r8;
        obj.d = org.telegram.ui.ActionBar.h6.x0(null, iArr[dialogFilter.color % iArr.length], false);
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
        paint.setColor(org.telegram.ui.ActionBar.h6.m1(f7, i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.f33171e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.h6.A0);
        this.f33170c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
