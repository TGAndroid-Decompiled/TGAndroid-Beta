package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
public final class ts {
    public int f29481a;
    public int f29482b;
    public h11 f29483c;
    public int d;
    public int e;

    public static ts b(org.telegram.ui.Cells.s2 s2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f29481a = dialogFilter.f16708id;
        obj.f29482b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        h11 h11Var = new h11(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        h11Var.s(s2Var);
        obj.f29483c = h11Var;
        obj.f29483c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, h11Var.f25471a.getFontMetricsInt(), false), dialogFilter.entities, obj.f29483c.f25471a.getFontMetricsInt()));
        obj.f29483c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        h11 h11Var2 = obj.f29483c;
        obj.e = dp + ((int) h11Var2.f25473c);
        h11Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.g6.f20160r8;
        obj.d = org.telegram.ui.ActionBar.g6.x0(null, iArr[dialogFilter.color % iArr.length], false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f7;
        Paint paint = org.telegram.ui.ActionBar.g6.A0;
        int i10 = this.d;
        if (org.telegram.ui.ActionBar.g6.I.q()) {
            f7 = 0.2f;
        } else {
            f7 = 0.1f;
        }
        paint.setColor(org.telegram.ui.ActionBar.g6.m1(f7, i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.A0);
        this.f29483c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
