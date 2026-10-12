package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class p0 extends ClickableSpan {
    public final int f39077a;
    public final Object f39078b;
    public final Object f39079c;
    public final Object d;

    public p0(Object obj, Object obj2, Object obj3, int i10) {
        this.f39077a = i10;
        this.f39078b = obj;
        this.f39079c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39077a) {
            case 0:
                ((z70) this.f39078b).c((i4) this.f39079c, (org.telegram.ui.Components.l11) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.a2 a2Var = ((org.telegram.ui.ActionBar.a2[]) this.f39078b)[0];
                if (a2Var != null) {
                    a2Var.dismiss();
                }
                pf.d.s((Context) this.f39079c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f39077a) {
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
