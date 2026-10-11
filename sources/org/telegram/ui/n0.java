package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class n0 extends ClickableSpan {
    public final int f40135a;
    public final Object f40136b;
    public final Object f40137c;
    public final Object d;

    public n0(Object obj, Object obj2, Object obj3, int i10) {
        this.f40135a = i10;
        this.f40136b = obj;
        this.f40137c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40135a) {
            case 0:
                ((t70) this.f40136b).c((f4) this.f40137c, (org.telegram.ui.Components.q11) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.a2 a2Var = ((org.telegram.ui.ActionBar.a2[]) this.f40136b)[0];
                if (a2Var != null) {
                    a2Var.dismiss();
                }
                of.f.s((Context) this.f40137c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f40135a) {
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
