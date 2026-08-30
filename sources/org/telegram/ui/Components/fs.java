package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
public final class fs {
    public int f24946a;
    public int f24947b;
    public k01 f24948c;
    public int d;
    public int e;

    public static fs b(org.telegram.ui.Cells.r2 r2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f24946a = dialogFilter.f16669id;
        obj.f24947b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        k01 k01Var = new k01(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        k01Var.s(r2Var);
        obj.f24948c = k01Var;
        obj.f24948c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, k01Var.f26082a.getFontMetricsInt(), false), dialogFilter.entities, obj.f24948c.f26082a.getFontMetricsInt()));
        obj.f24948c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        k01 k01Var2 = obj.f24948c;
        obj.e = dp + ((int) k01Var2.f26084c);
        k01Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.j6.f20160r8;
        obj.d = org.telegram.ui.ActionBar.j6.w0(null, iArr[dialogFilter.color % iArr.length], false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f10;
        Paint paint = org.telegram.ui.ActionBar.j6.A0;
        int i10 = this.d;
        if (org.telegram.ui.ActionBar.j6.I.q()) {
            f10 = 0.2f;
        } else {
            f10 = 0.1f;
        }
        paint.setColor(org.telegram.ui.ActionBar.j6.l1(f10, i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.A0);
        this.f24948c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
