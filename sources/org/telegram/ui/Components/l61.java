package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class l61 extends URLSpan {
    public final l11 f28112a;
    public boolean f28113b;

    public l61(String str, l11 l11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f28112a = l11Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f28113b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        pf.d.o(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        l11 l11Var = this.f28112a;
        if (l11Var != null) {
            l11Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setUnderlineText(z10);
        }
    }
}
