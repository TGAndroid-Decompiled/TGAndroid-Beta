package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class n51 extends URLSpan {
    public final n01 f28624a;
    public boolean f28625b;

    public n51(String str, n01 n01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f28624a = n01Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f28625b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        of.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        n01 n01Var = this.f28624a;
        if (n01Var != null) {
            n01Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setUnderlineText(z10);
        }
    }
}
