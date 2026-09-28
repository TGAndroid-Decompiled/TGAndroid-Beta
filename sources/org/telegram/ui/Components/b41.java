package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class b41 extends ClickableSpan {
    public final URLSpan f22862a;
    public final k41 f22863b;

    public b41(k41 k41Var, URLSpan uRLSpan) {
        this.f22863b = k41Var;
        this.f22862a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        k41 k41Var = this.f22863b;
        Utilities.CallbackReturn callbackReturn = k41Var.N;
        URLSpan uRLSpan = this.f22862a;
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
        if (!(this.f22862a instanceof b61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19186k5, false));
        textPaint.setAlpha(min);
    }
}
