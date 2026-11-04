package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class oj0 extends ClickableSpan {
    public final yj0 f48304a;

    public oj0(yj0 yj0Var) {
        this.f48304a = yj0Var;
    }

    @Override
    public final void onClick(View view) {
        yj0 yj0Var = this.f48304a;
        sf.c.t(yj0Var.getParentActivity(), yj0Var.E.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
    }
}
