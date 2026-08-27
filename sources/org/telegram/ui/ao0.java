package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

public final class ao0 extends ClickableSpan {

    public final do0 f36581a;

    public ao0(do0 do0Var) {
        this.f36581a = do0Var;
    }

    @Override
    public final void onClick(View view) {
        do0 do0Var = this.f36581a;
        do0Var.presentFragment(new zf1(6, do0Var.W));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
