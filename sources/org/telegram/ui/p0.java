package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class p0 extends ClickableSpan {
    public final int f38782a;
    public final Object f38783b;
    public final Object f38784c;
    public final Object d;

    public p0(Object obj, Object obj2, Object obj3, int i10) {
        this.f38782a = i10;
        this.f38783b = obj;
        this.f38784c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38782a) {
            case 0:
                ((z70) this.f38783b).c((i4) this.f38784c, (org.telegram.ui.Components.m11) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.a2 a2Var = ((org.telegram.ui.ActionBar.a2[]) this.f38783b)[0];
                if (a2Var != null) {
                    a2Var.dismiss();
                }
                pf.d.r((Context) this.f38784c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f38782a) {
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }
}
