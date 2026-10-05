package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class l41 extends ClickableSpan {
    public final URLSpan f28361a;
    public final u41 f28362b;

    public l41(u41 u41Var, URLSpan uRLSpan) {
        this.f28362b = u41Var;
        this.f28361a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        u41 u41Var = this.f28362b;
        Utilities.CallbackReturn callbackReturn = u41Var.N;
        URLSpan uRLSpan = this.f28361a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                u41Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = u41Var.M;
        if (n2Var != null) {
            e5.q0(n2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f28361a instanceof l61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20955k5, false));
        textPaint.setAlpha(min);
    }
}
