package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class s61 extends URLSpan {
    public final u11 f30782a;

    public s61(String str, u11 u11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f30782a = u11Var;
    }

    @Override
    public final void onClick(View view) {
        of.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        u11 u11Var = this.f30782a;
        if (u11Var != null) {
            u11Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
