package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class z31 extends ClickableSpan {
    public final URLSpan f30780a;
    public final i41 f30781b;

    public z31(i41 i41Var, URLSpan uRLSpan) {
        this.f30781b = i41Var;
        this.f30780a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        i41 i41Var = this.f30781b;
        Utilities.CallbackReturn callbackReturn = i41Var.N;
        URLSpan uRLSpan = this.f30780a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                i41Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = i41Var.M;
        if (m2Var != null) {
            e5.q0(m2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f30780a instanceof z51)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19186k5, false));
        textPaint.setAlpha(min);
    }
}
