package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class s41 extends URLSpan {
    public final boolean f39483a;
    public final fz0 f39484b;
    public TLObject f39485c;
    public String d;

    public s41(String str) {
        this(str, (fz0) null);
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
        fz0 fz0Var = this.f39484b;
        if (fz0Var != null) {
            fz0Var.a(textPaint);
        }
        if (i7 == color && !this.f39483a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public s41(String str, int i7) {
        this(str, (fz0) null);
        this.f39483a = true;
    }

    public s41(String str, fz0 fz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f39483a = false;
        this.f39484b = fz0Var;
    }
}
