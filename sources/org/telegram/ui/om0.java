package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class om0 extends ClickableSpan {
    public final zm0 f40219a;

    public om0(zm0 zm0Var) {
        this.f40219a = zm0Var;
    }

    @Override
    public final void onClick(View view) {
        zm0 zm0Var = this.f40219a;
        pf.d.r(zm0Var.getParentActivity(), zm0Var.f44179y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
