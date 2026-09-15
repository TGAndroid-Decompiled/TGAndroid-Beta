package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dn0 extends ClickableSpan {
    public final on0 f33094a;

    public dn0(on0 on0Var) {
        this.f33094a = on0Var;
    }

    @Override
    public final void onClick(View view) {
        on0 on0Var = this.f33094a;
        nf.f.s(on0Var.getParentActivity(), on0Var.f36308y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
