package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;

public class r41 extends URLSpan {

    public final boolean f32080a;

    public final xz0 f32081b;

    public TLObject f32082c;
    public String d;

    public r41(String str) {
        this(str, (xz0) null);
    }

    @Override
    public void onClick(View view) {
        String url = getURL();
        if (!url.startsWith("@")) {
            we.e.s(view.getContext(), url);
            return;
        }
        we.e.p(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)), true, true);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        int i10 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        xz0 xz0Var = this.f32081b;
        if (xz0Var != null) {
            xz0Var.a(textPaint);
        }
        textPaint.setUnderlineText(i10 == color && !this.f32080a);
    }

    public r41(String str, int i10) {
        this(str, (xz0) null);
        this.f32080a = true;
    }

    public r41(String str, xz0 xz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f32080a = false;
        this.f32081b = xz0Var;
    }
}
