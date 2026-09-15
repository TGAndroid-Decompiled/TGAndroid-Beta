package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class o51 extends URLSpan {
    public final o01 f26698a;
    public boolean f26699b;

    public o51(String str, o01 o01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f26698a = o01Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f26699b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        nf.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        o01 o01Var = this.f26698a;
        if (o01Var != null) {
            o01Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setUnderlineText(z10);
        }
    }
}
