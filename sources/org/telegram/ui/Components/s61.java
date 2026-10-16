package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class s61 extends URLSpan {
    public final q11 f28756a;
    public boolean f28757b;

    public s61(String str, q11 q11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f28756a = q11Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f28757b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        pf.d.o(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        q11 q11Var = this.f28756a;
        if (q11Var != null) {
            q11Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setUnderlineText(z10);
        }
    }
}
