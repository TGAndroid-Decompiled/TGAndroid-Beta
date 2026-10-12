package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class r61 extends URLSpan {
    public final p11 f28770a;
    public boolean f28771b;

    public r61(String str, p11 p11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f28770a = p11Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f28771b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        pf.d.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        p11 p11Var = this.f28770a;
        if (p11Var != null) {
            p11Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setUnderlineText(z10);
        }
    }
}
