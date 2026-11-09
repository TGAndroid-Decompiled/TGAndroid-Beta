package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class a41 extends URLSpan {
    public final vy0 f31706a;

    public a41(String str, vy0 vy0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f31706a = vy0Var;
    }

    @Override
    public final void onClick(View view) {
        vf.c.q(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        vy0 vy0Var = this.f31706a;
        if (vy0Var != null) {
            vy0Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
