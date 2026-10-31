package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class c51 extends URLSpan {
    public final yz0 f24988a;

    public c51(String str, yz0 yz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f24988a = yz0Var;
    }

    @Override
    public final void onClick(View view) {
        gf.f.o(view.getContext(), Uri.parse(getURL()));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        yz0 yz0Var = this.f24988a;
        if (yz0Var != null) {
            yz0Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
