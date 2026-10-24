package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class p0 extends ClickableSpan {
    public final int f40296a;
    public final Object f40297b;
    public final Object f40298c;
    public final Object d;

    public p0(Object obj, Object obj2, Object obj3, int i10) {
        this.f40296a = i10;
        this.f40297b = obj;
        this.f40298c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40296a) {
            case 0:
                ((f70) this.f40297b).c((i4) this.f40298c, (org.telegram.ui.Components.l11) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.c2 c2Var = ((org.telegram.ui.ActionBar.c2[]) this.f40297b)[0];
                if (c2Var != null) {
                    c2Var.dismiss();
                }
                pf.d.r((Context) this.f40298c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f40296a) {
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
