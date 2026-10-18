package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class lj0 extends AnimatedPhoneNumberEditText {
    public final int G;
    public final Object H;

    public lj0(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        float f10;
        float f11;
        switch (this.G) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                oj0 oj0Var = (oj0) this.H;
                org.telegram.ui.Components.sd0 sd0Var = oj0Var.f39815s;
                if (!z10 && !oj0Var.Q.isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                sd0Var.b(f7, f7, true);
                return;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                oj0 oj0Var2 = (oj0) this.H;
                org.telegram.ui.Components.sd0 sd0Var2 = oj0Var2.f39815s;
                if (!z10 && !oj0Var2.O.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                sd0Var2.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                dg0 dg0Var = (dg0) this.H;
                org.telegram.ui.Components.sd0 sd0Var3 = dg0Var.f36190f;
                if (!z10 && !dg0Var.f36188b.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                sd0Var3.b(f11, f11, true);
                if (z10) {
                    dg0Var.V.f36493c.setEditText(this);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.G) {
            case 1:
                oj0 oj0Var = (oj0) this.H;
                if (i10 == 67 && oj0Var.Q.length() == 0) {
                    oj0Var.O.requestFocus();
                    lj0 lj0Var = oj0Var.O;
                    lj0Var.setSelection(lj0Var.length());
                    oj0Var.O.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
