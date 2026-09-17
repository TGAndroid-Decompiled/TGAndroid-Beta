package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class n51 extends URLSpan {
    public final boolean f26338a;
    public final p01 f26339b;
    public TLObject f26340c;
    public String d;

    public n51(String str) {
        this(str, (p01) null);
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
        p01 p01Var = this.f26339b;
        if (p01Var != null) {
            p01Var.a(textPaint);
        }
        if (i10 == color && !this.f26338a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public n51(String str, int i10) {
        this(str, (p01) null);
        this.f26338a = true;
    }

    public n51(String str, p01 p01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f26338a = false;
        this.f26339b = p01Var;
    }
}
