package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class km0 extends ClickableSpan {
    public final vm0 f39934a;

    public km0(vm0 vm0Var) {
        this.f39934a = vm0Var;
    }

    @Override
    public final void onClick(View view) {
        vm0 vm0Var = this.f39934a;
        ye.d.s(vm0Var.getParentActivity(), vm0Var.f43678y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
