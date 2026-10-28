package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class a71 extends URLSpan {
    public final z11 f26450a;
    public boolean f26451b;

    public a71(String str, z11 z11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f26450a = z11Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f26451b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).Y0 = true;
        }
        qf.d.o(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        z11 z11Var = this.f26450a;
        if (z11Var != null) {
            z11Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setUnderlineText(z10);
        }
    }
}
