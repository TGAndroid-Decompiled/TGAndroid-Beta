package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class p0 extends ClickableSpan {
    public final int f37139a;
    public final Object f37140b;
    public final Object f37141c;
    public final Object d;

    public p0(Object obj, Object obj2, Object obj3, int i10) {
        this.f37139a = i10;
        this.f37140b = obj;
        this.f37141c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37139a) {
            case 0:
                ((n70) this.f37140b).c((j4) this.f37141c, (org.telegram.ui.Components.o01) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.d2 d2Var = ((org.telegram.ui.ActionBar.d2[]) this.f37140b)[0];
                if (d2Var != null) {
                    d2Var.dismiss();
                }
                af.g.s((Context) this.f37141c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f37139a) {
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
