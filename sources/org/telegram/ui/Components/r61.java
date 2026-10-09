package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class r61 extends URLSpan {
    public final t11 f30373a;

    public r61(String str, t11 t11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f30373a = t11Var;
    }

    @Override
    public final void onClick(View view) {
        of.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        t11 t11Var = this.f30373a;
        if (t11Var != null) {
            t11Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
