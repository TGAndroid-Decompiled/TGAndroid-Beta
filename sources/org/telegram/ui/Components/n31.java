package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class n31 extends ClickableSpan {
    public final URLSpan f26314a;
    public final w31 f26315b;

    public n31(w31 w31Var, URLSpan uRLSpan) {
        this.f26315b = w31Var;
        this.f26314a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        w31 w31Var = this.f26315b;
        Utilities.CallbackReturn callbackReturn = w31Var.N;
        URLSpan uRLSpan = this.f26314a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                w31Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = w31Var.M;
        if (o2Var != null) {
            c5.q0(o2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f26314a instanceof n51)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18989k5, false));
        textPaint.setAlpha(min);
    }
}
