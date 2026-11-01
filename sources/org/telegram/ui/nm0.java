package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class nm0 extends ClickableSpan {
    public final qm0 f39932a;

    public nm0(qm0 qm0Var) {
        this.f39932a = qm0Var;
    }

    @Override
    public final void onClick(View view) {
        qm0 qm0Var = this.f39932a;
        qm0Var.presentFragment(new rc1(6, qm0Var.f40813a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
