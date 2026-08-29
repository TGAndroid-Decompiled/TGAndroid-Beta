package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class c51 extends URLSpan {
    public final h01 f27311a;
    public boolean f27312b;

    public c51(String str, h01 h01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f27311a = h01Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f27312b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).T0 = true;
        }
        ye.d.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        h01 h01Var = this.f27311a;
        if (h01Var != null) {
            h01Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setUnderlineText(z10);
        }
    }
}
