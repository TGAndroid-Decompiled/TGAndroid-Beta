package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class n0 extends ClickableSpan {
    public final int f41731a;
    public final Object f41732b;
    public final Object f41733c;
    public final Object d;

    public n0(Object obj, Object obj2, Object obj3, int i10) {
        this.f41731a = i10;
        this.f41732b = obj;
        this.f41733c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41731a) {
            case 0:
                ((h70) this.f41732b).c((h4) this.f41733c, (org.telegram.ui.Components.u11) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.e2 e2Var = ((org.telegram.ui.ActionBar.e2[]) this.f41732b)[0];
                if (e2Var != null) {
                    e2Var.dismiss();
                }
                qf.d.r((Context) this.f41733c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f41731a) {
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
