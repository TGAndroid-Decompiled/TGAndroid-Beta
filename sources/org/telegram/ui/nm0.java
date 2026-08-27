package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class nm0 extends ClickableSpan {

    public final xm0 f40887a;

    public nm0(xm0 xm0Var) {
        this.f40887a = xm0Var;
    }

    @Override
    public final void onClick(View view) {
        xm0 xm0Var = this.f40887a;
        we.e.s(xm0Var.getParentActivity(), xm0Var.f44535y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
