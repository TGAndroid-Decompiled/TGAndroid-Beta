package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class q0 extends ClickableSpan {
    public final int f41633a;
    public final Object f41634b;
    public final Object f41635c;
    public final Object d;

    public q0(Object obj, Object obj2, Object obj3, int i9) {
        this.f41633a = i9;
        this.f41634b = obj;
        this.f41635c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41633a) {
            case 0:
                ((a70) this.f41634b).c((j4) this.f41635c, (org.telegram.ui.Components.rz0) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.c2 c2Var = ((org.telegram.ui.ActionBar.c2[]) this.f41634b)[0];
                if (c2Var != null) {
                    c2Var.dismiss();
                }
                ve.e.s((Context) this.f41635c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f41633a) {
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
