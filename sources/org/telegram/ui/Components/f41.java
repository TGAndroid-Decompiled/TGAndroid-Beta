package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class f41 extends URLSpan {
    public final boolean f34517a;
    public final wy0 f34518b;
    public TLObject f34519c;
    public String d;

    public f41(String str) {
        this(str, (wy0) null);
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
        wy0 wy0Var = this.f34518b;
        if (wy0Var != null) {
            wy0Var.a(textPaint);
        }
        if (i7 == color && !this.f34517a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public f41(String str, int i7) {
        this(str, (wy0) null);
        this.f34517a = true;
    }

    public f41(String str, wy0 wy0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f34517a = false;
        this.f34518b = wy0Var;
    }
}
