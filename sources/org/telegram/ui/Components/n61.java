package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class n61 extends URLSpan {
    public final p11 f28819a;

    public n61(String str, p11 p11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f28819a = p11Var;
    }

    @Override
    public final void onClick(View view) {
        pf.d.o(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        p11 p11Var = this.f28819a;
        if (p11Var != null) {
            p11Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
