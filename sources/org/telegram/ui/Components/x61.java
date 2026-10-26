package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class x61 extends URLSpan {
    public final boolean f34647a;
    public final y11 f34648b;
    public TLObject f34649c;
    public String d;

    public x61(String str) {
        this(str, (y11) null);
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
        y11 y11Var = this.f34648b;
        if (y11Var != null) {
            y11Var.a(textPaint);
        }
        if (i10 == color && !this.f34647a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public x61(String str, int i10) {
        this(str, (y11) null);
        this.f34647a = true;
    }

    public x61(String str, y11 y11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f34647a = false;
        this.f34648b = y11Var;
    }
}
