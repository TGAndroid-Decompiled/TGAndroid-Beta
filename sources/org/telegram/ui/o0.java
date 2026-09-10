package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class o0 extends ClickableSpan {
    public final int f35371a;
    public final Object f35372b;
    public final Object f35373c;
    public final Object d;

    public o0(Object obj, Object obj2, Object obj3, int i10) {
        this.f35371a = i10;
        this.f35372b = obj;
        this.f35373c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35371a) {
            case 0:
                ((t70) this.f35372b).c((h4) this.f35373c, (org.telegram.ui.Components.x01) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.d2 d2Var = ((org.telegram.ui.ActionBar.d2[]) this.f35372b)[0];
                if (d2Var != null) {
                    d2Var.dismiss();
                }
                nf.f.s((Context) this.f35373c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f35371a) {
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
