package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class u61 extends URLSpan {
    public final boolean f31454a;
    public final u11 f31455b;
    public TLObject f31456c;
    public String d;

    public u61(String str) {
        this(str, (u11) null);
    }

    @Override
    public void onClick(View view) {
        String url = getURL();
        if (url.startsWith("@")) {
            of.f.p(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)), true, true);
            return;
        }
        of.f.s(view.getContext(), url);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int i10 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        u11 u11Var = this.f31455b;
        if (u11Var != null) {
            u11Var.a(textPaint);
        }
        if (i10 == color && !this.f31454a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public u61(String str, int i10) {
        this(str, (u11) null);
        this.f31454a = true;
    }

    public u61(String str, u11 u11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f31454a = false;
        this.f31455b = u11Var;
    }
}
