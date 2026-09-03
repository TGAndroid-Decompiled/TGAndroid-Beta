package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class io0 extends ClickableSpan {
    public final lo0 f35006a;

    public io0(lo0 lo0Var) {
        this.f35006a = lo0Var;
    }

    @Override
    public final void onClick(View view) {
        lo0 lo0Var = this.f35006a;
        lo0Var.presentFragment(new wg1(6, lo0Var.X));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
