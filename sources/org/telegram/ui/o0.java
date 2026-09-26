package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class o0 extends ClickableSpan {
    public final int f36024a;
    public final Object f36025b;
    public final Object f36026c;
    public final Object d;

    public o0(Object obj, Object obj2, Object obj3, int i10) {
        this.f36024a = i10;
        this.f36025b = obj;
        this.f36026c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36024a) {
            case 0:
                ((p70) this.f36025b).c((g4) this.f36026c, (org.telegram.ui.Components.x01) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.a2 a2Var = ((org.telegram.ui.ActionBar.a2[]) this.f36025b)[0];
                if (a2Var != null) {
                    a2Var.dismiss();
                }
                nf.f.s((Context) this.f36026c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f36024a) {
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
