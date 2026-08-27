package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

public final class s21 extends ClickableSpan {

    public final URLSpan f32322a;

    public final b31 f32323b;

    public s21(b31 b31Var, URLSpan uRLSpan) {
        this.f32323b = b31Var;
        this.f32322a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        b31 b31Var = this.f32323b;
        Utilities.CallbackReturn callbackReturn = b31Var.J;
        URLSpan uRLSpan = this.f32322a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                b31Var.dismiss();
            }
        } else {
            org.telegram.ui.ActionBar.n2 n2Var = b31Var.I;
            if (n2Var != null) {
                y4.q0(n2Var, uRLSpan.getURL(), false, false);
            }
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int iMin = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f32322a instanceof r41)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23180k5, false));
        textPaint.setAlpha(iMin);
    }
}
