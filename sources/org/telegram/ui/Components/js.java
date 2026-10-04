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
    public int f27885a;
    public int f27886b;
    public e11 f27887c;
    public int d;
    public int f27888e;

    public static js b(org.telegram.ui.Cells.s2 s2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f27885a = dialogFilter.f17257id;
        obj.f27886b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        e11 e11Var = new e11(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        e11Var.s(s2Var);
        obj.f27887c = e11Var;
        obj.f27887c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, e11Var.f25877a.getFontMetricsInt(), false), dialogFilter.entities, obj.f27887c.f25877a.getFontMetricsInt()));
        obj.f27887c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        e11 e11Var2 = obj.f27887c;
        obj.f27888e = dp + ((int) e11Var2.f25879c);
        e11Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.i6.f21080r8;
        obj.d = org.telegram.ui.ActionBar.i6.w0(null, iArr[dialogFilter.color % iArr.length], false);
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
        paint.setColor(org.telegram.ui.ActionBar.i6.l1(f7, i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.f27888e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.i6.A0);
        this.f27887c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
