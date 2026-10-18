package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class h41 extends ClickableSpan {
    public final URLSpan f26767a;
    public final r41 f26768b;

    public h41(r41 r41Var, URLSpan uRLSpan) {
        this.f26768b = r41Var;
        this.f26767a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        r41 r41Var = this.f26768b;
        Utilities.CallbackReturn callbackReturn = r41Var.N;
        URLSpan uRLSpan = this.f26767a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                r41Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = r41Var.M;
        if (n2Var != null) {
            f5.p0(n2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f26767a instanceof j61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21119k5, false));
        textPaint.setAlpha(min);
    }
}
