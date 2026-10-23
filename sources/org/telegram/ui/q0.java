package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class q0 extends ClickableSpan {
    public final int f40332a;
    public final Object f40333b;
    public final Object f40334c;
    public final Object d;

    public q0(Object obj, Object obj2, Object obj3, int i10) {
        this.f40332a = i10;
        this.f40333b = obj;
        this.f40334c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40332a) {
            case 0:
                ((b70) this.f40333b).c((j4) this.f40334c, (org.telegram.ui.Components.j11) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = ((org.telegram.ui.ActionBar.b2[]) this.f40333b)[0];
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                pf.d.r((Context) this.f40334c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f40332a) {
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
