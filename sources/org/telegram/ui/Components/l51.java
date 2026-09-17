package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class l51 extends URLSpan {
    public final p01 f25828a;

    public l51(String str, p01 p01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f25828a = p01Var;
    }

    @Override
    public final void onClick(View view) {
        nf.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        p01 p01Var = this.f25828a;
        if (p01Var != null) {
            p01Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
