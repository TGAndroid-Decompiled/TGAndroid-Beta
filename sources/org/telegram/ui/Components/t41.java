package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class t41 extends ClickableSpan {
    public final URLSpan f31064a;
    public final c51 f31065b;

    public t41(c51 c51Var, URLSpan uRLSpan) {
        this.f31065b = c51Var;
        this.f31064a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        c51 c51Var = this.f31065b;
        Utilities.CallbackReturn callbackReturn = c51Var.N;
        URLSpan uRLSpan = this.f31064a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                c51Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = c51Var.M;
        if (m2Var != null) {
            g5.p0(m2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f31064a instanceof u61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20949k5, false));
        textPaint.setAlpha(min);
    }
}
