package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class b61 extends URLSpan {
    public final boolean f22863a;
    public final d11 f22864b;
    public TLObject f22865c;
    public String d;

    public b61(String str) {
        this(str, (d11) null);
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
        d11 d11Var = this.f22864b;
        if (d11Var != null) {
            d11Var.a(textPaint);
        }
        if (i10 == color && !this.f22863a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public b61(String str, int i10) {
        this(str, (d11) null);
        this.f22863a = true;
    }

    public b61(String str, d11 d11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f22863a = false;
        this.f22864b = d11Var;
    }
}
