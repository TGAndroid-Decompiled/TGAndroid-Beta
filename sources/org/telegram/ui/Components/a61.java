package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class a61 extends URLSpan {
    public final boolean f22549a;
    public final c11 f22550b;
    public TLObject f22551c;
    public String d;

    public a61(String str) {
        this(str, (c11) null);
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
        c11 c11Var = this.f22550b;
        if (c11Var != null) {
            c11Var.a(textPaint);
        }
        if (i10 == color && !this.f22549a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public a61(String str, int i10) {
        this(str, (c11) null);
        this.f22549a = true;
    }

    public a61(String str, c11 c11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f22549a = false;
        this.f22550b = c11Var;
    }
}
