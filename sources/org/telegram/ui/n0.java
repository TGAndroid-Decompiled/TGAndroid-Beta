package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class n0 extends ClickableSpan {
    public final int f38797a;
    public final Object f38798b;
    public final Object f38799c;
    public final Object d;

    public n0(Object obj, Object obj2, Object obj3, int i10) {
        this.f38797a = i10;
        this.f38798b = obj;
        this.f38799c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38797a) {
            case 0:
                ((v70) this.f38798b).c((g4) this.f38799c, (org.telegram.ui.Components.j01) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = ((org.telegram.ui.ActionBar.b2[]) this.f38798b)[0];
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                of.f.s((Context) this.f38799c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f38797a) {
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
