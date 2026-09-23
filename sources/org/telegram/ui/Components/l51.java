package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class l51 extends URLSpan {
    public final boolean f25819a;
    public final n01 f25820b;
    public TLObject f25821c;
    public String d;

    public l51(String str) {
        this(str, (n01) null);
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
        n01 n01Var = this.f25820b;
        if (n01Var != null) {
            n01Var.a(textPaint);
        }
        if (i10 == color && !this.f25819a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public l51(String str, int i10) {
        this(str, (n01) null);
        this.f25819a = true;
    }

    public l51(String str, n01 n01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f25819a = false;
        this.f25820b = n01Var;
    }
}
