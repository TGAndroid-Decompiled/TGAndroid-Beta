package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class o0 extends ClickableSpan {
    public final int f40388a;
    public final Object f40389b;
    public final Object f40390c;
    public final Object d;

    public o0(Object obj, Object obj2, Object obj3, int i10) {
        this.f40388a = i10;
        this.f40389b = obj;
        this.f40390c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40388a) {
            case 0:
                ((t70) this.f40389b).c((g4) this.f40390c, (org.telegram.ui.Components.p11) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = ((org.telegram.ui.ActionBar.b2[]) this.f40389b)[0];
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                of.f.s((Context) this.f40390c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f40388a) {
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
