package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class p0 extends ClickableSpan {
    public final int f36282a;
    public final Object f36283b;
    public final Object f36284c;
    public final Object d;

    public p0(Object obj, Object obj2, Object obj3, int i10) {
        this.f36282a = i10;
        this.f36283b = obj;
        this.f36284c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36282a) {
            case 0:
                ((s70) this.f36283b).c((h4) this.f36284c, (org.telegram.ui.Components.z01) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.c2 c2Var = ((org.telegram.ui.ActionBar.c2[]) this.f36283b)[0];
                if (c2Var != null) {
                    c2Var.dismiss();
                }
                nf.f.s((Context) this.f36284c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f36282a) {
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
