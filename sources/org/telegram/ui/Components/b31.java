package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class b31 extends ClickableSpan {
    public final URLSpan f26970a;
    public final k31 f26971b;

    public b31(k31 k31Var, URLSpan uRLSpan) {
        this.f26971b = k31Var;
        this.f26970a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        k31 k31Var = this.f26971b;
        Utilities.CallbackReturn callbackReturn = k31Var.J;
        URLSpan uRLSpan = this.f26970a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                k31Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = k31Var.I;
        if (o2Var != null) {
            c5.q0(o2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f26970a instanceof a51)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23188k5, false));
        textPaint.setAlpha(min);
    }
}
