package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class q61 extends URLSpan {
    public final boolean f29778a;
    public final q11 f29779b;
    public TLObject f29780c;
    public String d;

    public q61(String str) {
        this(str, (q11) null);
    }

    @Override
    public void onClick(View view) {
        String url = getURL();
        if (url.startsWith("@")) {
            pf.d.o(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)), true, true);
            return;
        }
        pf.d.r(view.getContext(), url);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int i10 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        q11 q11Var = this.f29779b;
        if (q11Var != null) {
            q11Var.a(textPaint);
        }
        if (i10 == color && !this.f29778a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public q61(String str, int i10) {
        this(str, (q11) null);
        this.f29778a = true;
    }

    public q61(String str, q11 q11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f29778a = false;
        this.f29779b = q11Var;
    }
}
