package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class l31 extends ClickableSpan {
    public final URLSpan f28067a;
    public final u31 f28068b;

    public l31(u31 u31Var, URLSpan uRLSpan) {
        this.f28068b = u31Var;
        this.f28067a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        u31 u31Var = this.f28068b;
        Utilities.CallbackReturn callbackReturn = u31Var.N;
        URLSpan uRLSpan = this.f28067a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                u31Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = u31Var.M;
        if (n2Var != null) {
            e5.q0(n2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f28067a instanceof l51)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20817k5, false));
        textPaint.setAlpha(min);
    }
}
