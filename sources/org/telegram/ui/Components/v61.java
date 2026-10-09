package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class v61 extends URLSpan {
    public final t11 f31699a;
    public boolean f31700b;

    public v61(String str, t11 t11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f31699a = t11Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f31700b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        of.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        t11 t11Var = this.f31699a;
        if (t11Var != null) {
            t11Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setUnderlineText(z10);
        }
    }
}
