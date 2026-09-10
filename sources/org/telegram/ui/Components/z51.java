package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class z51 extends URLSpan {
    public final boolean f29598a;
    public final b11 f29599b;
    public TLObject f29600c;
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
        b11 b11Var = this.f29599b;
        if (b11Var != null) {
            b11Var.a(textPaint);
        }
        if (i10 == color && !this.f29598a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public z51(String str, int i10) {
        this(str, (b11) null);
        this.f29598a = true;
    }

    public z51(String str, b11 b11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f29598a = false;
        this.f29599b = b11Var;
    }
}
