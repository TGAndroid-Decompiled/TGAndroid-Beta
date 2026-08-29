package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
public final class bs {
    public int f27212a;
    public int f27213b;
    public zz0 f27214c;
    public int d;
    public int f27215e;

    public static bs b(org.telegram.ui.Cells.p2 p2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f27212a = dialogFilter.f19620id;
        obj.f27213b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        zz0 zz0Var = new zz0(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        zz0Var.s(p2Var);
        obj.f27214c = zz0Var;
        obj.f27214c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, zz0Var.f35460a.getFontMetricsInt(), false), dialogFilter.entities, obj.f27214c.f35460a.getFontMetricsInt()));
        obj.f27214c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        zz0 zz0Var2 = obj.f27214c;
        obj.f27215e = dp + ((int) zz0Var2.f35462c);
        zz0Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.g6.f23312r8;
        obj.d = org.telegram.ui.ActionBar.g6.w0(null, iArr[dialogFilter.color % iArr.length], false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f9;
        Paint paint = org.telegram.ui.ActionBar.g6.A0;
        int i10 = this.d;
        if (org.telegram.ui.ActionBar.g6.I.q()) {
            f9 = 0.2f;
        } else {
            f9 = 0.1f;
        }
        paint.setColor(org.telegram.ui.ActionBar.g6.l1(f9, i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.f27215e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.A0);
        this.f27214c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
