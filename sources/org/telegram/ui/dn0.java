package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dn0 extends ClickableSpan {
    public final on0 f31951a;

    public dn0(on0 on0Var) {
        this.f31951a = on0Var;
    }

    @Override
    public final void onClick(View view) {
        on0 on0Var = this.f31951a;
        nf.f.s(on0Var.getParentActivity(), on0Var.f35572y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
