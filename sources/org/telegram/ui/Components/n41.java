package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class n41 extends URLSpan {
    public final dz0 f37726a;

    public n41(String str, dz0 dz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f37726a = dz0Var;
    }

    @Override
    public final void onClick(View view) {
        vf.c.q(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        dz0 dz0Var = this.f37726a;
        if (dz0Var != null) {
            dz0Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
