package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class u41 extends ClickableSpan {
    public final URLSpan f33252a;
    public final f51 f33253b;

    public u41(f51 f51Var, URLSpan uRLSpan) {
        this.f33253b = f51Var;
        this.f33252a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        f51 f51Var = this.f33253b;
        Utilities.CallbackReturn callbackReturn = f51Var.T;
        URLSpan uRLSpan = this.f33252a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                f51Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.r2 r2Var = f51Var.S;
        if (r2Var != null) {
            g5.p0(r2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f33252a instanceof x61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23483k5, false));
        textPaint.setAlpha(min);
    }
}
