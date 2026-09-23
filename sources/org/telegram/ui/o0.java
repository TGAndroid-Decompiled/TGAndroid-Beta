package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class o0 extends ClickableSpan {
    public final int f35648a;
    public final Object f35649b;
    public final Object f35650c;
    public final Object d;

    public o0(Object obj, Object obj2, Object obj3, int i10) {
        this.f35648a = i10;
        this.f35649b = obj;
        this.f35650c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35648a) {
            case 0:
                ((r70) this.f35649b).c((g4) this.f35650c, (org.telegram.ui.Components.j01) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = ((org.telegram.ui.ActionBar.b2[]) this.f35649b)[0];
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                nf.f.s((Context) this.f35650c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f35648a) {
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
