package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class hl0 extends ClickableSpan {
    public final kl0 f46382a;

    public hl0(kl0 kl0Var) {
        this.f46382a = kl0Var;
    }

    @Override
    public final void onClick(View view) {
        kl0 kl0Var = this.f46382a;
        kl0Var.presentFragment(new cb1(6, kl0Var.f47326a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
