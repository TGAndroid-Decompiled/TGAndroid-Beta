package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class a41 extends ClickableSpan {
    public final URLSpan f22532a;
    public final j41 f22533b;

    public a41(j41 j41Var, URLSpan uRLSpan) {
        this.f22533b = j41Var;
        this.f22532a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        j41 j41Var = this.f22533b;
        Utilities.CallbackReturn callbackReturn = j41Var.N;
        URLSpan uRLSpan = this.f22532a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                j41Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = j41Var.M;
        if (m2Var != null) {
            e5.q0(m2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f22532a instanceof a61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19185k5, false));
        textPaint.setAlpha(min);
    }
}
