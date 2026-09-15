package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class m51 extends URLSpan {
    public final boolean f26082a;
    public final o01 f26083b;
    public TLObject f26084c;
    public String d;

    public m51(String str) {
        this(str, (o01) null);
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
        o01 o01Var = this.f26083b;
        if (o01Var != null) {
            o01Var.a(textPaint);
        }
        if (i10 == color && !this.f26082a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public m51(String str, int i10) {
        this(str, (o01) null);
        this.f26082a = true;
    }

    public m51(String str, o01 o01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f26082a = false;
        this.f26083b = o01Var;
    }
}
