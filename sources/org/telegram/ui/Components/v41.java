package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class v41 extends ClickableSpan {
    public final URLSpan f33558a;
    public final g51 f33559b;

    public v41(g51 g51Var, URLSpan uRLSpan) {
        this.f33559b = g51Var;
        this.f33558a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        g51 g51Var = this.f33559b;
        Utilities.CallbackReturn callbackReturn = g51Var.T;
        URLSpan uRLSpan = this.f33558a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                g51Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.r2 r2Var = g51Var.S;
        if (r2Var != null) {
            g5.p0(r2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f33558a instanceof y61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23484k5, false));
        textPaint.setAlpha(min);
    }
}
