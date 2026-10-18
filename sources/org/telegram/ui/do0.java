package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class do0 extends ClickableSpan {
    public final go0 f36222a;

    public do0(go0 go0Var) {
        this.f36222a = go0Var;
    }

    @Override
    public final void onClick(View view) {
        go0 go0Var = this.f36222a;
        go0Var.presentFragment(new xf1(6, go0Var.f37216a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
