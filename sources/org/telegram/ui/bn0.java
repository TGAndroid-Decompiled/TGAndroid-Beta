package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class bn0 extends ClickableSpan {
    public final mn0 f36418a;

    public bn0(mn0 mn0Var) {
        this.f36418a = mn0Var;
    }

    @Override
    public final void onClick(View view) {
        mn0 mn0Var = this.f36418a;
        of.f.s(mn0Var.getParentActivity(), mn0Var.f40038y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
