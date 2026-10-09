package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
public final class ws {
    public int f32667a;
    public int f32668b;
    public l11 f32669c;
    public int d;
    public int f32670e;

    public static ws b(org.telegram.ui.Cells.s2 s2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f32667a = dialogFilter.f17252id;
        obj.f32668b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        l11 l11Var = new l11(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        l11Var.s(s2Var);
        obj.f32669c = l11Var;
        obj.f32669c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, l11Var.f28220a.getFontMetricsInt(), false), dialogFilter.entities, obj.f32669c.f28220a.getFontMetricsInt()));
        obj.f32669c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        l11 l11Var2 = obj.f32669c;
        obj.f32670e = dp + ((int) l11Var2.f28222c);
        l11Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.i6.f21057r8;
        obj.d = org.telegram.ui.ActionBar.i6.x0(null, iArr[dialogFilter.color % iArr.length], false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f7;
        Paint paint = org.telegram.ui.ActionBar.i6.A0;
        int i10 = this.d;
        if (org.telegram.ui.ActionBar.i6.I.q()) {
            f7 = 0.2f;
        } else {
            f7 = 0.1f;
        }
        paint.setColor(org.telegram.ui.ActionBar.i6.m1(f7, i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.f32670e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.i6.A0);
        this.f32669c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
