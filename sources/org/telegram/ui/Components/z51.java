package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class z51 extends URLSpan {
    public final boolean f30792a;
    public final b11 f30793b;
    public TLObject f30794c;
    public String d;

    public z51(String str) {
        this(str, (b11) null);
    }

    @Override
    public void onClick(View view) {
        String url = getURL();
        if (url.startsWith("@")) {
            nf.f.p(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)), true, true);
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
        b11 b11Var = this.f30793b;
        if (b11Var != null) {
            b11Var.a(textPaint);
        }
        if (i10 == color && !this.f30792a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public z51(String str, int i10) {
        this(str, (b11) null);
        this.f30792a = true;
    }

    public z51(String str, b11 b11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f30792a = false;
        this.f30793b = b11Var;
    }
}
