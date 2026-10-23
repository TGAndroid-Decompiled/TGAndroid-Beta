package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class p0 extends ClickableSpan {
    public final int f40317a;
    public final Object f40318b;
    public final Object f40319c;
    public final Object d;

    public p0(Object obj, Object obj2, Object obj3, int i10) {
        this.f40317a = i10;
        this.f40318b = obj;
        this.f40319c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40317a) {
            case 0:
                ((f70) this.f40318b).c((i4) this.f40319c, (org.telegram.ui.Components.m11) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.c2 c2Var = ((org.telegram.ui.ActionBar.c2[]) this.f40318b)[0];
                if (c2Var != null) {
                    c2Var.dismiss();
                }
                pf.d.r((Context) this.f40319c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f40317a) {
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
