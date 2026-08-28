package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class q21 extends ClickableSpan {
    public final URLSpan f31821a;
    public final z21 f31822b;

    public q21(z21 z21Var, URLSpan uRLSpan) {
        this.f31822b = z21Var;
        this.f31821a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        z21 z21Var = this.f31822b;
        Utilities.CallbackReturn callbackReturn = z21Var.J;
        URLSpan uRLSpan = this.f31821a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                z21Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = z21Var.I;
        if (o2Var != null) {
            y4.q0(o2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f31821a instanceof p41)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23126k5, false));
        textPaint.setAlpha(min);
    }
}
