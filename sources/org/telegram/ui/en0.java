package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class en0 extends ClickableSpan {
    public final pn0 f37192a;

    public en0(pn0 pn0Var) {
        this.f37192a = pn0Var;
    }

    @Override
    public final void onClick(View view) {
        pn0 pn0Var = this.f37192a;
        of.f.s(pn0Var.getParentActivity(), pn0Var.f41057y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
