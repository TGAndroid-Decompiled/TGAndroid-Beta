package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class t61 extends URLSpan {
    public final boolean f31045a;
    public final t11 f31046b;
    public TLObject f31047c;
    public String d;

    public t61(String str) {
        this(str, (t11) null);
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
        t11 t11Var = this.f31046b;
        if (t11Var != null) {
            t11Var.a(textPaint);
        }
        if (i10 == color && !this.f31045a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public t61(String str, int i10) {
        this(str, (t11) null);
        this.f31045a = true;
    }

    public t61(String str, t11 t11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f31045a = false;
        this.f31046b = t11Var;
    }
}
