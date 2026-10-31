package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class g51 extends URLSpan {
    public final yz0 f26260a;
    public boolean f26261b;

    public g51(String str, yz0 yz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f26260a = yz0Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f26261b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).Y0 = true;
        }
        gf.f.o(view.getContext(), Uri.parse(getURL()));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        yz0 yz0Var = this.f26260a;
        if (yz0Var != null) {
            yz0Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setUnderlineText(z10);
        }
    }
}
