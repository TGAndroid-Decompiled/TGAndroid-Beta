package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class l61 extends URLSpan {
    public final boolean f28382a;
    public final n11 f28383b;
    public TLObject f28384c;
    public String d;

    public l61(String str) {
        this(str, (n11) null);
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
        n11 n11Var = this.f28383b;
        if (n11Var != null) {
            n11Var.a(textPaint);
        }
        if (i10 == color && !this.f28382a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public l61(String str, int i10) {
        this(str, (n11) null);
        this.f28382a = true;
    }

    public l61(String str, n11 n11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f28382a = false;
        this.f28383b = n11Var;
    }
}
