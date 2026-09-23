package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class no0 extends ClickableSpan {
    public final qo0 f35571a;

    public no0(qo0 qo0Var) {
        this.f35571a = qo0Var;
    }

    @Override
    public final void onClick(View view) {
        qo0 qo0Var = this.f35571a;
        qo0Var.presentFragment(new zg1(6, qo0Var.f36484a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
