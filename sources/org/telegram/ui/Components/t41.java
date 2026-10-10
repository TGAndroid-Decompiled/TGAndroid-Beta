package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class t41 extends ClickableSpan {
    public final URLSpan f30984a;
    public final c51 f30985b;

    public t41(c51 c51Var, URLSpan uRLSpan) {
        this.f30985b = c51Var;
        this.f30984a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        c51 c51Var = this.f30985b;
        Utilities.CallbackReturn callbackReturn = c51Var.N;
        URLSpan uRLSpan = this.f30984a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                c51Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = c51Var.M;
        if (n2Var != null) {
            g5.p0(n2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f30984a instanceof u61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20928k5, false));
        textPaint.setAlpha(min);
    }
}
