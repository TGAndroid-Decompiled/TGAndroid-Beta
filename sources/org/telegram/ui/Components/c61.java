package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class c61 extends URLSpan {
    public final c11 f23250a;
    public boolean f23251b;

    public c61(String str, c11 c11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f23250a = c11Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f23251b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        nf.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        c11 c11Var = this.f23250a;
        if (c11Var != null) {
            c11Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setUnderlineText(z10);
        }
    }
}
