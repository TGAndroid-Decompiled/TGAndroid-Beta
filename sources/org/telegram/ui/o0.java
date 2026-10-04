package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class o0 extends ClickableSpan {
    public final int f39090a;
    public final Object f39091b;
    public final Object f39092c;
    public final Object d;

    public o0(Object obj, Object obj2, Object obj3, int i10) {
        this.f39090a = i10;
        this.f39091b = obj;
        this.f39092c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39090a) {
            case 0:
                ((t70) this.f39091b).c((g4) this.f39092c, (org.telegram.ui.Components.i11) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = ((org.telegram.ui.ActionBar.b2[]) this.f39091b)[0];
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                nf.f.s((Context) this.f39092c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f39090a) {
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
