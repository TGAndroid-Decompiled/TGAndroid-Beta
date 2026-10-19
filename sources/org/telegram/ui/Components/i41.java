package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class i41 extends ClickableSpan {
    public final URLSpan f27070a;
    public final s41 f27071b;

    public i41(s41 s41Var, URLSpan uRLSpan) {
        this.f27071b = s41Var;
        this.f27070a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        s41 s41Var = this.f27071b;
        Utilities.CallbackReturn callbackReturn = s41Var.N;
        URLSpan uRLSpan = this.f27070a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                s41Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = s41Var.M;
        if (n2Var != null) {
            f5.p0(n2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f27070a instanceof k61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21115k5, false));
        textPaint.setAlpha(min);
    }
}
