package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class a51 extends URLSpan {
    public final boolean f26673a;
    public final h01 f26674b;
    public TLObject f26675c;
    public String d;

    public a51(String str) {
        this(str, (h01) null);
    }

    @Override
    public void onClick(View view) {
        String url = getURL();
        if (url.startsWith("@")) {
            ye.d.p(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)), true, true);
            return;
        }
        ye.d.s(view.getContext(), url);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int i10 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        h01 h01Var = this.f26674b;
        if (h01Var != null) {
            h01Var.a(textPaint);
        }
        if (i10 == color && !this.f26673a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public a51(String str, int i10) {
        this(str, (h01) null);
        this.f26673a = true;
    }

    public a51(String str, h01 h01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f26673a = false;
        this.f26674b = h01Var;
    }
}
