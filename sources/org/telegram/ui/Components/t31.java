package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class t31 extends URLSpan {
    public final ty0 f38246a;

    public t31(String str, ty0 ty0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f38246a = ty0Var;
    }

    @Override
    public final void onClick(View view) {
        vf.c.q(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        ty0 ty0Var = this.f38246a;
        if (ty0Var != null) {
            ty0Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
