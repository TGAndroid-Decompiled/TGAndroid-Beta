package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
public final class hs {
    public int f24816a;
    public int f24817b;
    public f01 f24818c;
    public int d;
    public int e;

    public static hs b(org.telegram.ui.Cells.r2 r2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f24816a = dialogFilter.f15577id;
        obj.f24817b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        f01 f01Var = new f01(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        f01Var.s(r2Var);
        obj.f24818c = f01Var;
        obj.f24818c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, f01Var.f23783a.getFontMetricsInt(), false), dialogFilter.entities, obj.f24818c.f23783a.getFontMetricsInt()));
        obj.f24818c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        f01 f01Var2 = obj.f24818c;
        obj.e = dp + ((int) f01Var2.f23785c);
        f01Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.h6.f19046r8;
        obj.d = org.telegram.ui.ActionBar.h6.w0(null, iArr[dialogFilter.color % iArr.length], false);
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
        paint.setColor(org.telegram.ui.ActionBar.h6.l1(f7, i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.h6.A0);
        this.f24818c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
