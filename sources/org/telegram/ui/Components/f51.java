package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class f51 extends URLSpan {
    public final boolean f26077a;
    public final zz0 f26078b;
    public TLObject f26079c;
    public String d;

    public f51(String str) {
        this(str, (zz0) null);
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
        zz0 zz0Var = this.f26078b;
        if (zz0Var != null) {
            zz0Var.a(textPaint);
        }
        if (i10 == color && !this.f26077a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public f51(String str, int i10) {
        this(str, (zz0) null);
        this.f26077a = true;
    }

    public f51(String str, zz0 zz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f26077a = false;
        this.f26078b = zz0Var;
    }
}
