package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class n0 extends ClickableSpan {
    public final int f35913a;
    public final Object f35914b;
    public final Object f35915c;
    public final Object d;

    public n0(Object obj, Object obj2, Object obj3, int i10) {
        this.f35913a = i10;
        this.f35914b = obj;
        this.f35915c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35913a) {
            case 0:
                ((w70) this.f35914b).c((f4) this.f35915c, (org.telegram.ui.Components.l01) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.c2 c2Var = ((org.telegram.ui.ActionBar.c2[]) this.f35914b)[0];
                if (c2Var != null) {
                    c2Var.dismiss();
                }
                nf.f.s((Context) this.f35915c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f35913a) {
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
