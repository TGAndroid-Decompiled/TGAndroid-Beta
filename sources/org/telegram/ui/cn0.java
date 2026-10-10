package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class cn0 extends ClickableSpan {
    public final nn0 f36753a;

    public cn0(nn0 nn0Var) {
        this.f36753a = nn0Var;
    }

    @Override
    public final void onClick(View view) {
        nn0 nn0Var = this.f36753a;
        of.f.s(nn0Var.getParentActivity(), nn0Var.f40340y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
