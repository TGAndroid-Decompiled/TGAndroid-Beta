package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class pm0 extends ClickableSpan {
    public final an0 f40509a;

    public pm0(an0 an0Var) {
        this.f40509a = an0Var;
    }

    @Override
    public final void onClick(View view) {
        an0 an0Var = this.f40509a;
        pf.d.r(an0Var.getParentActivity(), an0Var.f35756y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
