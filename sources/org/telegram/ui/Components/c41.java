package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class c41 extends ClickableSpan {
    public final URLSpan f23176a;
    public final l41 f23177b;

    public c41(l41 l41Var, URLSpan uRLSpan) {
        this.f23177b = l41Var;
        this.f23176a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        l41 l41Var = this.f23177b;
        Utilities.CallbackReturn callbackReturn = l41Var.N;
        URLSpan uRLSpan = this.f23176a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                l41Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = l41Var.M;
        if (n2Var != null) {
            d5.q0(n2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f23176a instanceof c61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19236k5, false));
        textPaint.setAlpha(min);
    }
}
