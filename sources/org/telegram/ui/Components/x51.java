package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class x51 extends URLSpan {
    public final b11 f28953a;

    public x51(String str, b11 b11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f28953a = b11Var;
    }

    @Override
    public final void onClick(View view) {
        nf.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        b11 b11Var = this.f28953a;
        if (b11Var != null) {
            b11Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
