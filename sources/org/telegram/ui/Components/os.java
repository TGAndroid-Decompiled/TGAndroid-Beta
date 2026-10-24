package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
public final class os {
    public int f29363a;
    public int f29364b;
    public h11 f29365c;
    public int d;
    public boolean e;
    public int f29366f;
    public int f29367g;

    public static os b(org.telegram.ui.Cells.q2 q2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f29363a = dialogFilter.f17862id;
        obj.f29364b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        h11 h11Var = new h11(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        h11Var.s(q2Var);
        obj.f29365c = h11Var;
        obj.f29365c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, h11Var.f26841a.getFontMetricsInt(), false), dialogFilter.entities, obj.f29365c.f26841a.getFontMetricsInt()));
        obj.f29365c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        h11 h11Var2 = obj.f29365c;
        obj.f29367g = dp + ((int) h11Var2.f26843c);
        h11Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.k6.f21443r8;
        int i10 = iArr[dialogFilter.color % iArr.length];
        obj.f29366f = i10;
        obj.e = true;
        obj.d = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f7;
        if (this.e) {
            this.d = org.telegram.ui.ActionBar.k6.x0(null, this.f29366f, false);
        }
        Paint paint = org.telegram.ui.ActionBar.k6.A0;
        int i10 = this.d;
        if (org.telegram.ui.ActionBar.k6.I.q()) {
            f7 = 0.2f;
        } else {
            f7 = 0.1f;
        }
        paint.setColor(org.telegram.ui.ActionBar.k6.o1(f7, i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.f29367g, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.k6.A0);
        this.f29365c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
