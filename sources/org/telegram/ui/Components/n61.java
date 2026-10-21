package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class n61 extends URLSpan {
    public final n11 f28695a;
    public boolean f28696b;

    public n61(String str, n11 n11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f28695a = n11Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f28696b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        pf.d.o(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        n11 n11Var = this.f28695a;
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
