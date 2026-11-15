package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class hl0 extends ClickableSpan {
    public final kl0 f47729a;

    public hl0(kl0 kl0Var) {
        this.f47729a = kl0Var;
    }

    @Override
    public final void onClick(View view) {
        kl0 kl0Var = this.f47729a;
        kl0Var.presentFragment(new xa1(6, kl0Var.f48678b0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
