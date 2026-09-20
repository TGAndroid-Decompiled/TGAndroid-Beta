package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class n0 extends ClickableSpan {
    public final int f35860a;
    public final Object f35861b;
    public final Object f35862c;
    public final Object d;

    public n0(Object obj, Object obj2, Object obj3, int i10) {
        this.f35860a = i10;
        this.f35861b = obj;
        this.f35862c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35860a) {
            case 0:
                ((u70) this.f35861b).c((f4) this.f35862c, (org.telegram.ui.Components.y01) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = ((org.telegram.ui.ActionBar.b2[]) this.f35861b)[0];
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                nf.f.s((Context) this.f35862c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f35860a) {
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
