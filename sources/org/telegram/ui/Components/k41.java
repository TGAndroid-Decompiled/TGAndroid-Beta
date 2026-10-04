package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class k41 extends ClickableSpan {
    public final URLSpan f27951a;
    public final t41 f27952b;

    public k41(t41 t41Var, URLSpan uRLSpan) {
        this.f27952b = t41Var;
        this.f27951a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        t41 t41Var = this.f27952b;
        Utilities.CallbackReturn callbackReturn = t41Var.N;
        URLSpan uRLSpan = this.f27951a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                t41Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = t41Var.M;
        if (n2Var != null) {
            e5.q0(n2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f27951a instanceof k61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20945k5, false));
        textPaint.setAlpha(min);
    }
}
