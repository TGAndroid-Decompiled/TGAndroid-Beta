package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class lm0 extends ClickableSpan {
    public final vm0 f38954a;

    public lm0(vm0 vm0Var) {
        this.f38954a = vm0Var;
    }

    @Override
    public final void onClick(View view) {
        vm0 vm0Var = this.f38954a;
        pf.d.r(vm0Var.getParentActivity(), vm0Var.f42336y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
