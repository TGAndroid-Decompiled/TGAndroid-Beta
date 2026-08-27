package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

public final class p41 extends URLSpan {

    public final xz0 f31502a;

    public p41(String str, xz0 xz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f31502a = xz0Var;
    }

    @Override
    public final void onClick(View view) {
        we.e.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        xz0 xz0Var = this.f31502a;
        if (xz0Var != null) {
            xz0Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
