package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class mm0 extends ClickableSpan {
    public final wm0 f40494a;

    public mm0(wm0 wm0Var) {
        this.f40494a = wm0Var;
    }

    @Override
    public final void onClick(View view) {
        wm0 wm0Var = this.f40494a;
        ve.e.s(wm0Var.getParentActivity(), wm0Var.f44204y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
