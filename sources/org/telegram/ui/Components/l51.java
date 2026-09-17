package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class l51 extends URLSpan {
    public final boolean f28090a;
    public final n01 f28091b;
    public TLObject f28092c;
    public String d;

    public l51(String str) {
        this(str, (n01) null);
    }

    @Override
    public void onClick(View view) {
        String url = getURL();
        if (url.startsWith("@")) {
            of.f.p(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)), true, true);
            return;
        }
        of.f.s(view.getContext(), url);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int i10 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        n01 n01Var = this.f28091b;
        if (n01Var != null) {
            n01Var.a(textPaint);
        }
        if (i10 == color && !this.f28090a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public l51(String str, int i10) {
        this(str, (n01) null);
        this.f28090a = true;
    }

    public l51(String str, n01 n01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f28090a = false;
        this.f28091b = n01Var;
    }
}
