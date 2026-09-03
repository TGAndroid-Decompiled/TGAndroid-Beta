package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class l51 extends URLSpan {
    public final boolean f28643a;
    public final s01 f28644b;
    public TLObject f28645c;
    public String d;

    public l51(String str) {
        this(str, (s01) null);
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
        s01 s01Var = this.f28644b;
        if (s01Var != null) {
            s01Var.a(textPaint);
        }
        if (i10 == color && !this.f28643a) {
            z4 = true;
        } else {
            z4 = false;
        }
        textPaint.setUnderlineText(z4);
    }

    public l51(String str, int i10) {
        this(str, (s01) null);
        this.f28643a = true;
    }

    public l51(String str, s01 s01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f28643a = false;
        this.f28644b = s01Var;
    }
}
