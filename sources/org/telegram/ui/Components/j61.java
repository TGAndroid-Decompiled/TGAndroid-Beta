package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class j61 extends URLSpan {
    public final n11 f27413a;

    public j61(String str, n11 n11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f27413a = n11Var;
    }

    @Override
    public final void onClick(View view) {
        pf.d.o(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        n11 n11Var = this.f27413a;
        if (n11Var != null) {
            n11Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
