package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class d41 extends URLSpan {
    public final wy0 f33841a;

    public d41(String str, wy0 wy0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f33841a = wy0Var;
    }

    @Override
    public final void onClick(View view) {
        vf.c.q(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        wy0 wy0Var = this.f33841a;
        if (wy0Var != null) {
            wy0Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
