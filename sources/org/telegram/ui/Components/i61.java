package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class i61 extends URLSpan {
    public final m11 f27327a;

    public i61(String str, m11 m11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f27327a = m11Var;
    }

    @Override
    public final void onClick(View view) {
        nf.f.p(view.getContext(), Uri.parse(getURL()));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        m11 m11Var = this.f27327a;
        if (m11Var != null) {
            m11Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
