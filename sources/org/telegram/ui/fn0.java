package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class fn0 extends ClickableSpan {
    public final qn0 f33724a;

    public fn0(qn0 qn0Var) {
        this.f33724a = qn0Var;
    }

    @Override
    public final void onClick(View view) {
        qn0 qn0Var = this.f33724a;
        nf.f.s(qn0Var.getParentActivity(), qn0Var.f36997y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
