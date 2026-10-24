package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class eo0 extends ClickableSpan {
    public final ho0 f36962a;

    public eo0(ho0 ho0Var) {
        this.f36962a = ho0Var;
    }

    @Override
    public final void onClick(View view) {
        ho0 ho0Var = this.f36962a;
        ho0Var.presentFragment(new ag1(6, ho0Var.f37915a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
