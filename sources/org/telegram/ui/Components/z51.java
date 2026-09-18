package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class z51 extends URLSpan {
    public final d11 f30740a;

    public z51(String str, d11 d11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f30740a = d11Var;
    }

    @Override
    public final void onClick(View view) {
        nf.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        d11 d11Var = this.f30740a;
        if (d11Var != null) {
            d11Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
