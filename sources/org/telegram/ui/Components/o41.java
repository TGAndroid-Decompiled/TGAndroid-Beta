package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class o41 extends ClickableSpan {
    public final URLSpan f27538a;
    public final x41 f27539b;

    public o41(x41 x41Var, URLSpan uRLSpan) {
        this.f27539b = x41Var;
        this.f27538a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        x41 x41Var = this.f27539b;
        Utilities.CallbackReturn callbackReturn = x41Var.N;
        URLSpan uRLSpan = this.f27538a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                x41Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = x41Var.M;
        if (m2Var != null) {
            g5.p0(m2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f27538a instanceof q61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19727k5, false));
        textPaint.setAlpha(min);
    }
}
