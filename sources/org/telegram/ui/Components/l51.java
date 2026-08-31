package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class l51 extends URLSpan {
    public final t01 f28610a;

    public l51(String str, t01 t01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f28610a = t01Var;
    }

    @Override
    public final void onClick(View view) {
        af.g.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        t01 t01Var = this.f28610a;
        if (t01Var != null) {
            t01Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
