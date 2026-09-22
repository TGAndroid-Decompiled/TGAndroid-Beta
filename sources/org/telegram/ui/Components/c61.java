package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class c61 extends URLSpan {
    public final boolean f23261a;
    public final e11 f23262b;
    public TLObject f23263c;
    public String d;

    public c61(String str) {
        this(str, (e11) null);
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
        e11 e11Var = this.f23262b;
        if (e11Var != null) {
            e11Var.a(textPaint);
        }
        if (i10 == color && !this.f23261a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public c61(String str, int i10) {
        this(str, (e11) null);
        this.f23261a = true;
    }

    public c61(String str, e11 e11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f23261a = false;
        this.f23262b = e11Var;
    }
}
