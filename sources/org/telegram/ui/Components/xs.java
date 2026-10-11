package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
public final class xs {
    public int f33060a;
    public int f33061b;
    public m11 f33062c;
    public int d;
    public int f33063e;

    public static xs b(org.telegram.ui.Cells.s2 s2Var, MessagesController.DialogFilter dialogFilter) {
        ?? obj = new Object();
        obj.f33060a = dialogFilter.f17287id;
        obj.f33061b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        m11 m11Var = new m11(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        m11Var.s(s2Var);
        obj.f33062c = m11Var;
        obj.f33062c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, m11Var.f28676a.getFontMetricsInt(), false), dialogFilter.entities, obj.f33062c.f28676a.getFontMetricsInt()));
        obj.f33062c.p(26);
        int dp = AndroidUtilities.dp(9.32f);
        m11 m11Var2 = obj.f33062c;
        obj.f33063e = dp + ((int) m11Var2.f28678c);
        m11Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.h6.f21083r8;
        obj.d = org.telegram.ui.ActionBar.h6.x0(null, iArr[dialogFilter.color % iArr.length], false);
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
        paint.setColor(org.telegram.ui.ActionBar.h6.m1(f7, i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.f33063e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.h6.A0);
        this.f33062c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
