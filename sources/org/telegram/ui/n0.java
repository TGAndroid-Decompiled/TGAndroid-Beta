package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class n0 extends ClickableSpan {
    public final int f38825a;
    public final Object f38826b;
    public final Object f38827c;
    public final Object d;

    public n0(Object obj, Object obj2, Object obj3, int i10) {
        this.f38825a = i10;
        this.f38826b = obj;
        this.f38827c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38825a) {
            case 0:
                ((v70) this.f38826b).c((g4) this.f38827c, (org.telegram.ui.Components.j01) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = ((org.telegram.ui.ActionBar.b2[]) this.f38826b)[0];
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                of.f.s((Context) this.f38827c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f38825a) {
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
