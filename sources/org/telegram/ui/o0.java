package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class o0 extends ClickableSpan {
    public final int f40517a;
    public final Object f40518b;
    public final Object f40519c;
    public final Object d;

    public o0(Object obj, Object obj2, Object obj3, int i10) {
        this.f40517a = i10;
        this.f40518b = obj;
        this.f40519c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40517a) {
            case 0:
                ((w70) this.f40518b).c((g4) this.f40519c, (org.telegram.ui.Components.v11) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.a2 a2Var = ((org.telegram.ui.ActionBar.a2[]) this.f40518b)[0];
                if (a2Var != null) {
                    a2Var.dismiss();
                }
                of.f.s((Context) this.f40519c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f40517a) {
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
