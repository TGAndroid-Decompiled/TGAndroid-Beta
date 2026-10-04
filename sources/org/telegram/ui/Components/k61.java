package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class k61 extends URLSpan {
    public final boolean f27969a;
    public final m11 f27970b;
    public TLObject f27971c;
    public String d;

    public k61(String str) {
        this(str, (m11) null);
    }

    @Override
    public void onClick(View view) {
        String url = getURL();
        if (url.startsWith("@")) {
            nf.f.p(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)));
            return;
        }
        nf.f.s(view.getContext(), url);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int i10 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        m11 m11Var = this.f27970b;
        if (m11Var != null) {
            m11Var.a(textPaint);
        }
        if (i10 == color && !this.f27969a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public k61(String str, int i10) {
        this(str, (m11) null);
        this.f27969a = true;
    }

    public k61(String str, m11 m11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f27969a = false;
        this.f27970b = m11Var;
    }
}
