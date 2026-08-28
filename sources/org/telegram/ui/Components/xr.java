package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
public final class xr {
    public int f34745a;
    public int f34746b;
    public nz0 f34747c;
    public int d;
    public int f34748e;

    public static xr b(org.telegram.ui.Cells.r2 r2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f34745a = dialogFilter.f19649id;
        obj.f34746b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        nz0 nz0Var = new nz0(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        nz0Var.s(r2Var);
        obj.f34747c = nz0Var;
        obj.f34747c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, nz0Var.f31221a.getFontMetricsInt(), false), dialogFilter.entities, obj.f34747c.f31221a.getFontMetricsInt()));
        obj.f34747c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        nz0 nz0Var2 = obj.f34747c;
        obj.f34748e = dp + ((int) nz0Var2.f31223c);
        nz0Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.f6.f23250r8;
        obj.d = org.telegram.ui.ActionBar.f6.w0(null, iArr[dialogFilter.color % iArr.length], false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f10;
        Paint paint = org.telegram.ui.ActionBar.f6.A0;
        int i9 = this.d;
        if (org.telegram.ui.ActionBar.f6.I.q()) {
            f10 = 0.2f;
        } else {
            f10 = 0.1f;
        }
        paint.setColor(org.telegram.ui.ActionBar.f6.l1(f10, i9));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.f34748e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.f6.A0);
        this.f34747c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
