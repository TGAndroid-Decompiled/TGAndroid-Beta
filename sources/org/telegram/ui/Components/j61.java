package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class j61 extends URLSpan {
    public final boolean f27428a;
    public final l11 f27429b;
    public TLObject f27430c;
    public String d;

    public j61(String str) {
        this(str, (l11) null);
    }

    @Override
    public void onClick(View view) {
        String url = getURL();
        if (url.startsWith("@")) {
            pf.d.o(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)), true, true);
            return;
        }
        pf.d.r(view.getContext(), url);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int i10 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        l11 l11Var = this.f27429b;
        if (l11Var != null) {
            l11Var.a(textPaint);
        }
        if (i10 == color && !this.f27428a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public j61(String str, int i10) {
        this(str, (l11) null);
        this.f27428a = true;
    }

    public j61(String str, l11 l11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f27428a = false;
        this.f27429b = l11Var;
    }
}
