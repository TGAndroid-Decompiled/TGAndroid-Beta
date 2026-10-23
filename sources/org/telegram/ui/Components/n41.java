package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class n41 extends ClickableSpan {
    public final URLSpan f28829a;
    public final y41 f28830b;

    public n41(y41 y41Var, URLSpan uRLSpan) {
        this.f28830b = y41Var;
        this.f28829a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        y41 y41Var = this.f28830b;
        Utilities.CallbackReturn callbackReturn = y41Var.T;
        URLSpan uRLSpan = this.f28829a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                y41Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = y41Var.S;
        if (o2Var != null) {
            f5.q0(o2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f28829a instanceof q61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21309k5, false));
        textPaint.setAlpha(min);
    }
}
