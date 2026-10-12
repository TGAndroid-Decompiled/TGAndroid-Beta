package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class in0 extends ClickableSpan {
    public final un0 f37173a;

    public in0(un0 un0Var) {
        this.f37173a = un0Var;
    }

    @Override
    public final void onClick(View view) {
        un0 un0Var = this.f37173a;
        pf.d.s(un0Var.getParentActivity(), un0Var.f40774y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
