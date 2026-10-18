package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class nm0 extends ClickableSpan {
    public final xm0 f39501a;

    public nm0(xm0 xm0Var) {
        this.f39501a = xm0Var;
    }

    @Override
    public final void onClick(View view) {
        xm0 xm0Var = this.f39501a;
        pf.d.r(xm0Var.getParentActivity(), xm0Var.f43200y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
