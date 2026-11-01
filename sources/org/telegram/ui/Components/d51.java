package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class d51 extends URLSpan {
    public final zz0 f25411a;

    public d51(String str, zz0 zz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f25411a = zz0Var;
    }

    @Override
    public final void onClick(View view) {
        gf.f.o(view.getContext(), Uri.parse(getURL()));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        zz0 zz0Var = this.f25411a;
        if (zz0Var != null) {
            zz0Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
