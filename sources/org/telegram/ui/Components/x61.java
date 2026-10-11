package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class x61 extends URLSpan {
    public final v11 f32838a;
    public boolean f32839b;

    public x61(String str, v11 v11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f32838a = v11Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f32839b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        of.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        v11 v11Var = this.f32838a;
        if (v11Var != null) {
            v11Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setUnderlineText(z10);
        }
    }
}
