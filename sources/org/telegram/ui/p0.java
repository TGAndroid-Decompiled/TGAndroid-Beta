package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class p0 extends ClickableSpan {
    public final int f39841a;
    public final Object f39842b;
    public final Object f39843c;
    public final Object d;

    public p0(Object obj, Object obj2, Object obj3, int i10) {
        this.f39841a = i10;
        this.f39842b = obj;
        this.f39843c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39841a) {
            case 0:
                ((o70) this.f39842b).c((j4) this.f39843c, (org.telegram.ui.Components.o01) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.d2 d2Var = ((org.telegram.ui.ActionBar.d2[]) this.f39842b)[0];
                if (d2Var != null) {
                    d2Var.dismiss();
                }
                af.g.s((Context) this.f39843c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f39841a) {
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
