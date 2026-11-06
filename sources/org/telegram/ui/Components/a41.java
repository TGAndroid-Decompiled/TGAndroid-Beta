package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class a41 extends URLSpan {
    public final boolean f31676a;
    public final ty0 f31677b;
    public TLObject f31678c;
    public String d;

    public a41(String str) {
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
        ty0 ty0Var = this.f31677b;
        if (ty0Var != null) {
            ty0Var.a(textPaint);
        }
        if (i7 == color && !this.f31676a) {
            z9 = true;
        } else {
            z9 = false;
        }
        textPaint.setUnderlineText(z9);
    }

    public a41(String str, int i7) {
        this(str, (ty0) null);
        this.f31676a = true;
    }

    public a41(String str, ty0 ty0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f31676a = false;
        this.f31677b = ty0Var;
    }
}
