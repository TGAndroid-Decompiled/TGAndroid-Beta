package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class w61 extends URLSpan {
    public final z11 f32330a;

    public w61(String str, z11 z11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f32330a = z11Var;
    }

    @Override
    public final void onClick(View view) {
        of.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        z11 z11Var = this.f32330a;
        if (z11Var != null) {
            z11Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
