package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class p0 extends ClickableSpan {
    public final int f39884a;
    public final Object f39885b;
    public final Object f39886c;
    public final Object d;

    public p0(Object obj, Object obj2, Object obj3, int i10) {
        this.f39884a = i10;
        this.f39885b = obj;
        this.f39886c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39884a) {
            case 0:
                ((o70) this.f39885b).c((j4) this.f39886c, (org.telegram.ui.Components.p01) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.d2 d2Var = ((org.telegram.ui.ActionBar.d2[]) this.f39885b)[0];
                if (d2Var != null) {
                    d2Var.dismiss();
                }
                af.g.s((Context) this.f39886c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f39884a) {
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
