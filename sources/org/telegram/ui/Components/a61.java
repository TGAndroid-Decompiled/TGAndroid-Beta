package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class a61 extends URLSpan {
    public final e11 f22550a;

    public a61(String str, e11 e11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f22550a = e11Var;
    }

    @Override
    public final void onClick(View view) {
        nf.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        e11 e11Var = this.f22550a;
        if (e11Var != null) {
            e11Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
