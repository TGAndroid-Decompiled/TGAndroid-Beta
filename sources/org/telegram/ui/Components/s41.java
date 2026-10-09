package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class s41 extends ClickableSpan {
    public final URLSpan f30638a;
    public final b51 f30639b;

    public s41(b51 b51Var, URLSpan uRLSpan) {
        this.f30639b = b51Var;
        this.f30638a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        b51 b51Var = this.f30639b;
        Utilities.CallbackReturn callbackReturn = b51Var.N;
        URLSpan uRLSpan = this.f30638a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                b51Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = b51Var.M;
        if (n2Var != null) {
            g5.p0(n2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f30638a instanceof t61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20924k5, false));
        textPaint.setAlpha(min);
    }
}
