package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class v61 extends URLSpan {
    public final boolean f31684a;
    public final v11 f31685b;
    public TLObject f31686c;
    public String d;

    public v61(String str) {
        this(str, (v11) null);
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
        v11 v11Var = this.f31685b;
        if (v11Var != null) {
            v11Var.a(textPaint);
        }
        if (i10 == color && !this.f31684a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public v61(String str, int i10) {
        this(str, (v11) null);
        this.f31684a = true;
    }

    public v61(String str, v11 v11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f31684a = false;
        this.f31685b = v11Var;
    }
}
