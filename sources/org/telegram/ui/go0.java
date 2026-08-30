package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class go0 extends ClickableSpan {
    public final jo0 f34649a;

    public go0(jo0 jo0Var) {
        this.f34649a = jo0Var;
    }

    @Override
    public final void onClick(View view) {
        jo0 jo0Var = this.f34649a;
        jo0Var.presentFragment(new og1(6, jo0Var.X));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
