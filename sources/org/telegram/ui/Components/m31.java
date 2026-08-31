package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class m31 extends ClickableSpan {
    public final URLSpan f28920a;
    public final w31 f28921b;

    public m31(w31 w31Var, URLSpan uRLSpan) {
        this.f28921b = w31Var;
        this.f28920a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        w31 w31Var = this.f28921b;
        Utilities.CallbackReturn callbackReturn = w31Var.K;
        URLSpan uRLSpan = this.f28920a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                w31Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = w31Var.J;
        if (p2Var != null) {
            z4.q0(p2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f28920a instanceof n51)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21784k5, false));
        textPaint.setAlpha(min);
    }
}
