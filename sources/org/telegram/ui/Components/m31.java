package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class m31 extends ClickableSpan {
    public final URLSpan f26056a;
    public final v31 f26057b;

    public m31(v31 v31Var, URLSpan uRLSpan) {
        this.f26057b = v31Var;
        this.f26056a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        v31 v31Var = this.f26057b;
        Utilities.CallbackReturn callbackReturn = v31Var.N;
        URLSpan uRLSpan = this.f26056a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                v31Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = v31Var.M;
        if (n2Var != null) {
            c5.q0(n2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f26056a instanceof m51)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18963k5, false));
        textPaint.setAlpha(min);
    }
}
