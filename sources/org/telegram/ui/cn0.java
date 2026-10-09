package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class cn0 extends ClickableSpan {
    public final nn0 f36709a;

    public cn0(nn0 nn0Var) {
        this.f36709a = nn0Var;
    }

    @Override
    public final void onClick(View view) {
        nn0 nn0Var = this.f36709a;
        of.f.s(nn0Var.getParentActivity(), nn0Var.f40296y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
