package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class ko0 extends ClickableSpan {
    public final no0 f35204a;

    public ko0(no0 no0Var) {
        this.f35204a = no0Var;
    }

    @Override
    public final void onClick(View view) {
        no0 no0Var = this.f35204a;
        no0Var.presentFragment(new zg1(6, no0Var.f36050a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
