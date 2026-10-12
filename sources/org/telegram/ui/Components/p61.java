package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class p61 extends URLSpan {
    public final boolean f28201a;
    public final p11 f28202b;
    public TLObject f28203c;
    public String d;

    public p61(String str) {
        this(str, (p11) null);
    }

    @Override
    public void onClick(View view) {
        String url = getURL();
        if (url.startsWith("@")) {
            pf.d.p(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)), true, true);
            return;
        }
        pf.d.s(view.getContext(), url);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int i10 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        p11 p11Var = this.f28202b;
        if (p11Var != null) {
            p11Var.a(textPaint);
        }
        if (i10 == color && !this.f28201a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public p61(String str, int i10) {
        this(str, (p11) null);
        this.f28201a = true;
    }

    public p61(String str, p11 p11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f28201a = false;
        this.f28202b = p11Var;
    }
}
