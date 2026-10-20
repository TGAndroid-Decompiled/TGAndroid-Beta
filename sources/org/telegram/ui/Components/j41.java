package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class j41 extends ClickableSpan {
    public final URLSpan f27400a;
    public final t41 f27401b;

    public j41(t41 t41Var, URLSpan uRLSpan) {
        this.f27401b = t41Var;
        this.f27400a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        t41 t41Var = this.f27401b;
        Utilities.CallbackReturn callbackReturn = t41Var.N;
        URLSpan uRLSpan = this.f27400a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                t41Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = t41Var.M;
        if (n2Var != null) {
            f5.p0(n2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f27400a instanceof l61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21116k5, false));
        textPaint.setAlpha(min);
    }
}
