package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class r41 extends URLSpan {
    public final boolean f39216a;
    public final ez0 f39217b;
    public TLObject f39218c;
    public String d;

    public r41(String str) {
        this(str, (ez0) null);
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
        ez0 ez0Var = this.f39217b;
        if (ez0Var != null) {
            ez0Var.a(textPaint);
        }
        if (i7 == color && !this.f39216a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public r41(String str, int i7) {
        this(str, (ez0) null);
        this.f39216a = true;
    }

    public r41(String str, ez0 ez0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f39216a = false;
        this.f39217b = ez0Var;
    }
}
