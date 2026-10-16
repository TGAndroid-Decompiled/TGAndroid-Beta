package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class hn0 extends ClickableSpan {
    public final sn0 f36616a;

    public hn0(sn0 sn0Var) {
        this.f36616a = sn0Var;
    }

    @Override
    public final void onClick(View view) {
        sn0 sn0Var = this.f36616a;
        pf.d.r(sn0Var.getParentActivity(), sn0Var.f39909y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
