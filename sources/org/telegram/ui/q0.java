package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class q0 extends ClickableSpan {
    public final int f40245a;
    public final Object f40246b;
    public final Object f40247c;
    public final Object d;

    public q0(Object obj, Object obj2, Object obj3, int i10) {
        this.f40245a = i10;
        this.f40246b = obj;
        this.f40247c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40245a) {
            case 0:
                ((d70) this.f40246b).c((j4) this.f40247c, (org.telegram.ui.Components.h11) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = ((org.telegram.ui.ActionBar.b2[]) this.f40246b)[0];
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                pf.d.r((Context) this.f40247c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f40245a) {
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
