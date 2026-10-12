package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class a71 extends URLSpan {
    public final z11 f24248a;
    public boolean f24249b;

    public a71(String str, z11 z11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f24248a = z11Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f24249b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        of.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        z11 z11Var = this.f24248a;
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
