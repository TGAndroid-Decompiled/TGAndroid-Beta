package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class v61 extends URLSpan {
    public final y11 f33583a;

    public v61(String str, y11 y11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f33583a = y11Var;
    }

    @Override
    public final void onClick(View view) {
        qf.d.o(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        y11 y11Var = this.f33583a;
        if (y11Var != null) {
            y11Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
