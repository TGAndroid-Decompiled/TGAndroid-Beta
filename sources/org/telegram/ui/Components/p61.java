package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class p61 extends URLSpan {
    public final boolean f29498a;
    public final p11 f29499b;
    public TLObject f29500c;
    public String d;

    public p61(String str) {
        this(str, (p11) null);
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
        p11 p11Var = this.f29499b;
        if (p11Var != null) {
            p11Var.a(textPaint);
        }
        if (i10 == color && !this.f29498a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public p61(String str, int i10) {
        this(str, (p11) null);
        this.f29498a = true;
    }

    public p61(String str, p11 p11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f29498a = false;
        this.f29499b = p11Var;
    }
}
