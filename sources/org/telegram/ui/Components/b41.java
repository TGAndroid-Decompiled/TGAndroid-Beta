package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class b41 extends URLSpan {
    public final boolean f32112a;
    public final uy0 f32113b;
    public TLObject f32114c;
    public String d;

    public b41(String str) {
        this(str, (uy0) null);
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
        boolean z9;
        int i7 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        uy0 uy0Var = this.f32113b;
        if (uy0Var != null) {
            uy0Var.a(textPaint);
        }
        if (i7 == color && !this.f32112a) {
            z9 = true;
        } else {
            z9 = false;
        }
        textPaint.setUnderlineText(z9);
    }

    public b41(String str, int i7) {
        this(str, (uy0) null);
        this.f32112a = true;
    }

    public b41(String str, uy0 uy0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f32112a = false;
        this.f32113b = uy0Var;
    }
}
