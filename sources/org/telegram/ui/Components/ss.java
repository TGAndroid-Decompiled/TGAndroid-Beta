package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
public final class ss {
    public int f32665a;
    public int f32666b;
    public r11 f32667c;
    public int d;
    public boolean e;
    public int f32668f;
    public int f32669g;

    public static ss b(org.telegram.ui.Cells.p2 p2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f32665a = dialogFilter.f19548id;
        obj.f32666b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        r11 r11Var = new r11(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        r11Var.s(p2Var);
        obj.f32667c = r11Var;
        obj.f32667c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, r11Var.f32088a.getFontMetricsInt(), false), dialogFilter.entities, obj.f32667c.f32088a.getFontMetricsInt()));
        obj.f32667c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        r11 r11Var2 = obj.f32667c;
        obj.f32669g = dp + ((int) r11Var2.f32090c);
        r11Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.y6.f23617r8;
        int i10 = iArr[dialogFilter.color % iArr.length];
        obj.f32668f = i10;
        obj.e = true;
        obj.d = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f7;
        if (this.e) {
            this.d = org.telegram.ui.ActionBar.y6.x0(null, this.f32668f, false);
        }
        Paint paint = org.telegram.ui.ActionBar.y6.A0;
        int i10 = this.d;
        if (org.telegram.ui.ActionBar.y6.I.q()) {
            f7 = 0.2f;
        } else {
            f7 = 0.1f;
        }
        paint.setColor(org.telegram.ui.ActionBar.y6.o1(f7, i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.f32669g, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.y6.A0);
        this.f32667c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
