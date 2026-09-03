package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class l31 extends ClickableSpan {
    public final URLSpan f26559a;
    public final v31 f26560b;

    public l31(v31 v31Var, URLSpan uRLSpan) {
        this.f26560b = v31Var;
        this.f26559a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        v31 v31Var = this.f26560b;
        Utilities.CallbackReturn callbackReturn = v31Var.K;
        URLSpan uRLSpan = this.f26559a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                v31Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = v31Var.J;
        if (p2Var != null) {
            z4.q0(p2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f26559a instanceof m51)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20005k5, false));
        textPaint.setAlpha(min);
    }
}
