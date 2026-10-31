package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class e51 extends URLSpan {
    public final boolean f25689a;
    public final yz0 f25690b;
    public TLObject f25691c;
    public String d;

    public e51(String str) {
        this(str, (yz0) null);
    }

    @Override
    public void onClick(View view) {
        String url = getURL();
        if (url.startsWith("@")) {
            gf.f.o(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)));
            return;
        }
        gf.f.r(view.getContext(), url);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int i10 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        yz0 yz0Var = this.f25690b;
        if (yz0Var != null) {
            yz0Var.a(textPaint);
        }
        if (i10 == color && !this.f25689a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public e51(String str, int i10) {
        this(str, (yz0) null);
        this.f25689a = true;
    }

    public e51(String str, yz0 yz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f25689a = false;
        this.f25690b = yz0Var;
    }
}
