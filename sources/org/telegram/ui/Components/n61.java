package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class n61 extends URLSpan {
    public final n11 f28987a;
    public boolean f28988b;

    public n61(String str, n11 n11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f28987a = n11Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f28988b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        nf.f.p(view.getContext(), Uri.parse(getURL()));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        n11 n11Var = this.f28987a;
        if (n11Var != null) {
            n11Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setUnderlineText(z10);
        }
    }
}
