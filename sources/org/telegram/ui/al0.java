package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class al0 extends ClickableSpan {
    public final ll0 f35670a;

    public al0(ll0 ll0Var) {
        this.f35670a = ll0Var;
    }

    @Override
    public final void onClick(View view) {
        ll0 ll0Var = this.f35670a;
        gf.f.r(ll0Var.getParentActivity(), ll0Var.D.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
    }
}
