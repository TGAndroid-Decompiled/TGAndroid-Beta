package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class v31 extends URLSpan {
    public final boolean f38820a;
    public final ty0 f38821b;
    public TLObject f38822c;
    public String d;

    public v31(String str) {
        this(str, (ty0) null);
    }

    @Override
    public void onClick(View view) {
        String url = getURL();
        if (url.startsWith("@")) {
            vf.c.q(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)), true, true);
            return;
        }
        vf.c.t(view.getContext(), url);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        boolean z9;
        int i7 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        ty0 ty0Var = this.f38821b;
        if (ty0Var != null) {
            ty0Var.a(textPaint);
        }
        if (i7 == color && !this.f38820a) {
            z9 = true;
        } else {
            z9 = false;
        }
        textPaint.setUnderlineText(z9);
    }

    public v31(String str, int i7) {
        this(str, (ty0) null);
        this.f38820a = true;
    }

    public v31(String str, ty0 ty0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f38820a = false;
        this.f38821b = ty0Var;
    }
}
