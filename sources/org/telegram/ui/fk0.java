package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class fk0 extends AnimatedPhoneNumberEditText {
    public final int G;
    public final Object H;

    public fk0(Object obj, Context context, int i10) {
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
                hk0 hk0Var = (hk0) this.H;
                org.telegram.ui.Components.yd0 yd0Var = hk0Var.f36601s;
                if (!z10 && !hk0Var.Q.isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                yd0Var.b(f7, f7, true);
                return;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                hk0 hk0Var2 = (hk0) this.H;
                org.telegram.ui.Components.yd0 yd0Var2 = hk0Var2.f36601s;
                if (!z10 && !hk0Var2.O.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                yd0Var2.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                zg0 zg0Var = (zg0) this.H;
                org.telegram.ui.Components.yd0 yd0Var3 = zg0Var.f42312f;
                if (!z10 && !zg0Var.f42310b.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                yd0Var3.b(f11, f11, true);
                if (z10) {
                    zg0Var.V.f33909c.setEditText(this);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.G) {
            case 1:
                hk0 hk0Var = (hk0) this.H;
                if (i10 == 67 && hk0Var.Q.length() == 0) {
                    hk0Var.O.requestFocus();
                    fk0 fk0Var = hk0Var.O;
                    fk0Var.setSelection(fk0Var.length());
                    hk0Var.O.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
