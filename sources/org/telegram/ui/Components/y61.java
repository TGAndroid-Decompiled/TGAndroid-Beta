package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class y61 extends URLSpan {
    public final boolean f34982a;
    public final z11 f34983b;
    public TLObject f34984c;
    public String d;

    public y61(String str) {
        this(str, (z11) null);
    }

    @Override
    public void onClick(View view) {
        String url = getURL();
        if (url.startsWith("@")) {
            qf.d.o(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)), true, true);
            return;
        }
        qf.d.r(view.getContext(), url);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int i10 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        z11 z11Var = this.f34983b;
        if (z11Var != null) {
            z11Var.a(textPaint);
        }
        if (i10 == color && !this.f34982a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public y61(String str, int i10) {
        this(str, (z11) null);
        this.f34982a = true;
    }

    public y61(String str, z11 z11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f34982a = false;
        this.f34983b = z11Var;
    }
}
