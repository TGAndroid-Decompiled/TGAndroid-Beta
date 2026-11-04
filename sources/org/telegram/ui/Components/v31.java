package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class v31 extends URLSpan {
    public final boolean f38985a;
    public final ty0 f38986b;
    public TLObject f38987c;
    public String d;

    public v31(String str) {
        this(str, (ty0) null);
    }

    @Override
    public void onClick(View view) {
        String url = getURL();
        if (url.startsWith("@")) {
            sf.c.q(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)), true, true);
            return;
        }
        sf.c.t(view.getContext(), url);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int i3 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        ty0 ty0Var = this.f38986b;
        if (ty0Var != null) {
            ty0Var.a(textPaint);
        }
        if (i3 == color && !this.f38985a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public v31(String str, int i3) {
        this(str, (ty0) null);
        this.f38985a = true;
    }

    public v31(String str, ty0 ty0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f38985a = false;
        this.f38986b = ty0Var;
    }
}
