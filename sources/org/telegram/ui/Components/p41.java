package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class p41 extends URLSpan {
    public final boolean f31541a;
    public final vz0 f31542b;
    public TLObject f31543c;
    public String d;

    public p41(String str) {
        this(str, (vz0) null);
    }

    @Override
    public void onClick(View view) {
        String url = getURL();
        if (url.startsWith("@")) {
            ve.e.p(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)), true, true);
            return;
        }
        ve.e.s(view.getContext(), url);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int i9 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        vz0 vz0Var = this.f31542b;
        if (vz0Var != null) {
            vz0Var.a(textPaint);
        }
        if (i9 == color && !this.f31541a) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public p41(String str, int i9) {
        this(str, (vz0) null);
        this.f31541a = true;
    }

    public p41(String str, vz0 vz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f31541a = false;
        this.f31542b = vz0Var;
    }
}
