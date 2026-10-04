package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class m61 extends URLSpan {
    public final m11 f28536a;
    public boolean f28537b;

    public m61(String str, m11 m11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f28536a = m11Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f28537b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        nf.f.p(view.getContext(), Uri.parse(getURL()));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        m11 m11Var = this.f28536a;
        if (m11Var != null) {
            m11Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setUnderlineText(z10);
        }
    }
}
