package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class bo0 extends ClickableSpan {
    public final eo0 f35680a;

    public bo0(eo0 eo0Var) {
        this.f35680a = eo0Var;
    }

    @Override
    public final void onClick(View view) {
        eo0 eo0Var = this.f35680a;
        eo0Var.presentFragment(new vf1(6, eo0Var.f36703a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
