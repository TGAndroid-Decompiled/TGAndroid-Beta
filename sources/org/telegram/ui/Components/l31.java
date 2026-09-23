package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class l31 extends ClickableSpan {
    public final URLSpan f25802a;
    public final u31 f25803b;

    public l31(u31 u31Var, URLSpan uRLSpan) {
        this.f25803b = u31Var;
        this.f25802a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        u31 u31Var = this.f25803b;
        Utilities.CallbackReturn callbackReturn = u31Var.N;
        URLSpan uRLSpan = this.f25802a;
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
        if (!(this.f25802a instanceof l51)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18915k5, false));
        textPaint.setAlpha(min);
    }
}
