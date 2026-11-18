package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class p41 extends URLSpan {
    public final boolean f38269a;
    public final dz0 f38270b;
    public TLObject f38271c;
    public String d;

    public p41(String str) {
        this(str, (dz0) null);
    }

    @Override
    public void onClick(View view) {
        String url = getURL();
        if (url.startsWith("@")) {
            vf.c.q(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)), true, true);
            return;
        }
        vf.c.t(view.getContext(), url);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int i7 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        dz0 dz0Var = this.f38270b;
        if (dz0Var != null) {
            dz0Var.a(textPaint);
        }
        if (i7 == color && !this.f38269a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public p41(String str, int i7) {
        this(str, (dz0) null);
        this.f38269a = true;
    }

    public p41(String str, dz0 dz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f38269a = false;
        this.f38270b = dz0Var;
    }
}
