package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class n51 extends URLSpan {
    public final boolean f29408a;
    public final t01 f29409b;
    public TLObject f29410c;
    public String d;

    public n51(String str) {
        this(str, (t01) null);
    }

    @Override
    public void onClick(View view) {
        String url = getURL();
        if (url.startsWith("@")) {
            af.g.p(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)), true, true);
            return;
        }
        af.g.s(view.getContext(), url);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        boolean z4;
        int i10 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        t01 t01Var = this.f29409b;
        if (t01Var != null) {
            t01Var.a(textPaint);
        }
        if (i10 == color && !this.f29408a) {
            z4 = true;
        } else {
            z4 = false;
        }
        textPaint.setUnderlineText(z4);
    }

    public n51(String str, int i10) {
        this(str, (t01) null);
        this.f29408a = true;
    }

    public n51(String str, t01 t01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f29408a = false;
        this.f29409b = t01Var;
    }
}
