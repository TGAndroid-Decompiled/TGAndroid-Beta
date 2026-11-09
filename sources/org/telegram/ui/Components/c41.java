package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class c41 extends URLSpan {
    public final boolean f32520a;
    public final vy0 f32521b;
    public TLObject f32522c;
    public String d;

    public c41(String str) {
        this(str, (vy0) null);
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
        vy0 vy0Var = this.f32521b;
        if (vy0Var != null) {
            vy0Var.a(textPaint);
        }
        if (i7 == color && !this.f32520a) {
            z9 = true;
        } else {
            z9 = false;
        }
        textPaint.setUnderlineText(z9);
    }

    public c41(String str, int i7) {
        this(str, (vy0) null);
        this.f32520a = true;
    }

    public c41(String str, vy0 vy0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f32520a = false;
        this.f32521b = vy0Var;
    }
}
