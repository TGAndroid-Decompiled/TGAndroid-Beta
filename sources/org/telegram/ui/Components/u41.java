package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class u41 extends ClickableSpan {
    public final URLSpan f31228a;
    public final d51 f31229b;

    public u41(d51 d51Var, URLSpan uRLSpan) {
        this.f31229b = d51Var;
        this.f31228a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        d51 d51Var = this.f31229b;
        Utilities.CallbackReturn callbackReturn = d51Var.N;
        URLSpan uRLSpan = this.f31228a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                d51Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = d51Var.M;
        if (m2Var != null) {
            g5.p0(m2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f31228a instanceof v61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20913k5, false));
        textPaint.setAlpha(min);
    }
}
