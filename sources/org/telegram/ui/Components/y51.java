package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class y51 extends URLSpan {
    public final c11 f30460a;

    public y51(String str, c11 c11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f30460a = c11Var;
    }

    @Override
    public final void onClick(View view) {
        nf.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        c11 c11Var = this.f30460a;
        if (c11Var != null) {
            c11Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
