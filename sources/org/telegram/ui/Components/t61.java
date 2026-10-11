package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class t61 extends URLSpan {
    public final v11 f31038a;

    public t61(String str, v11 v11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f31038a = v11Var;
    }

    @Override
    public final void onClick(View view) {
        of.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        v11 v11Var = this.f31038a;
        if (v11Var != null) {
            v11Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
