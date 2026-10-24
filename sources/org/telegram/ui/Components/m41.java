package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class m41 extends ClickableSpan {
    public final URLSpan f28511a;
    public final x41 f28512b;

    public m41(x41 x41Var, URLSpan uRLSpan) {
        this.f28512b = x41Var;
        this.f28511a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        x41 x41Var = this.f28512b;
        Utilities.CallbackReturn callbackReturn = x41Var.T;
        URLSpan uRLSpan = this.f28511a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                x41Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = x41Var.S;
        if (o2Var != null) {
            d5.p0(o2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f28511a instanceof p61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21310k5, false));
        textPaint.setAlpha(min);
    }
}
