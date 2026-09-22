package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class k51 extends URLSpan {
    public final o01 f25549a;

    public k51(String str, o01 o01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f25549a = o01Var;
    }

    @Override
    public final void onClick(View view) {
        nf.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        o01 o01Var = this.f25549a;
        if (o01Var != null) {
            o01Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
