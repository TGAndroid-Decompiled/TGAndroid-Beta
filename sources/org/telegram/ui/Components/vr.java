package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;

public final class vr {

    public int f34034a;

    public int f34035b;

    public pz0 f34036c;
    public int d;

    public int f34037e;

    public static vr b(org.telegram.ui.Cells.p2 p2Var, MessagesController.DialogFilter dialogFilter) {
        vr vrVar = new vr();
        vrVar.f34034a = dialogFilter.f19622id;
        vrVar.f34035b = dialogFilter.color;
        String str = dialogFilter.name;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        pz0 pz0Var = new pz0(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
        pz0Var.s(p2Var);
        vrVar.f34036c = pz0Var;
        vrVar.f34036c.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, pz0Var.f31695a.getFontMetricsInt(), false), dialogFilter.entities, vrVar.f34036c.f31695a.getFontMetricsInt()));
        vrVar.f34036c.p(26);
        int iDp = AndroidUtilities.dp(9.32f);
        pz0 pz0Var2 = vrVar.f34036c;
        vrVar.f34037e = iDp + ((int) pz0Var2.f31697c);
        pz0Var2.j();
        int[] iArr = org.telegram.ui.ActionBar.g6.f23303r8;
        vrVar.d = org.telegram.ui.ActionBar.g6.w0(null, iArr[dialogFilter.color % iArr.length], false);
        return vrVar;
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.ActionBar.g6.A0.setColor(org.telegram.ui.ActionBar.g6.l1(org.telegram.ui.ActionBar.g6.I.q() ? 0.2f : 0.1f, this.d));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.f34037e, AndroidUtilities.dp(14.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.A0);
        this.f34036c.c(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
