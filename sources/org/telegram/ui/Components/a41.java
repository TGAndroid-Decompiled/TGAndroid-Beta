package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class a41 extends ClickableSpan {
    public final URLSpan f22518a;
    public final j41 f22519b;

    public a41(j41 j41Var, URLSpan uRLSpan) {
        this.f22519b = j41Var;
        this.f22518a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        j41 j41Var = this.f22519b;
        Utilities.CallbackReturn callbackReturn = j41Var.N;
        URLSpan uRLSpan = this.f22518a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                j41Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = j41Var.M;
        if (n2Var != null) {
            d5.q0(n2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f22518a instanceof a61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19221k5, false));
        textPaint.setAlpha(min);
    }
}
