package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class h51 extends URLSpan {
    public final zz0 f26682a;
    public boolean f26683b;

    public h51(String str, zz0 zz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f26682a = zz0Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f26683b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).Y0 = true;
        }
        gf.f.o(view.getContext(), Uri.parse(getURL()));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        zz0 zz0Var = this.f26682a;
        if (zz0Var != null) {
            zz0Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setUnderlineText(z10);
        }
    }
}
