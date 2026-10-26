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
    public int f32661a;
    public int f32662b;
    public q11 f32663c;
    public int d;
    public boolean e;
    public int f32664f;
    public int f32665g;

    public static ss b(org.telegram.ui.Cells.p2 p2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f32661a = dialogFilter.f19549id;
        obj.f32662b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        q11 q11Var = new q11(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        q11Var.s(p2Var);
        obj.f32663c = q11Var;
        obj.f32663c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, q11Var.f31788a.getFontMetricsInt(), false), dialogFilter.entities, obj.f32663c.f31788a.getFontMetricsInt()));
        obj.f32663c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        q11 q11Var2 = obj.f32663c;
        obj.f32665g = dp + ((int) q11Var2.f31790c);
        q11Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.y6.f23616r8;
        int i10 = iArr[dialogFilter.color % iArr.length];
        obj.f32664f = i10;
        obj.e = true;
        obj.d = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f7;
        if (this.e) {
            this.d = org.telegram.ui.ActionBar.y6.x0(null, this.f32664f, false);
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
        rectF.set(0.0f, 0.0f, this.f32665g, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.y6.A0);
        this.f32663c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
