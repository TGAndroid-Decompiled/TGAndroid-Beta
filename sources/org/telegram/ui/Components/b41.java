package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class b41 extends ClickableSpan {
    public final URLSpan f22849a;
    public final k41 f22850b;

    public b41(k41 k41Var, URLSpan uRLSpan) {
        this.f22850b = k41Var;
        this.f22849a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        k41 k41Var = this.f22850b;
        Utilities.CallbackReturn callbackReturn = k41Var.N;
        URLSpan uRLSpan = this.f22849a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                k41Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = k41Var.M;
        if (m2Var != null) {
            e5.q0(m2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f22849a instanceof b61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19187k5, false));
        textPaint.setAlpha(min);
    }
}
