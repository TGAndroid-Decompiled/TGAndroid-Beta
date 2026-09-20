package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class dk0 extends AnimatedPhoneNumberEditText {
    public final int G;
    public final Object H;

    public dk0(Object obj, Context context, int i10) {
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
                fk0 fk0Var = (fk0) this.H;
                org.telegram.ui.Components.hd0 hd0Var = fk0Var.f33681s;
                if (!z10 && !fk0Var.Q.isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                hd0Var.b(f7, f7, true);
                return;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                fk0 fk0Var2 = (fk0) this.H;
                org.telegram.ui.Components.hd0 hd0Var2 = fk0Var2.f33681s;
                if (!z10 && !fk0Var2.O.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                hd0Var2.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                xg0 xg0Var = (xg0) this.H;
                org.telegram.ui.Components.hd0 hd0Var3 = xg0Var.f39563f;
                if (!z10 && !xg0Var.f39561b.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                hd0Var3.b(f11, f11, true);
                if (z10) {
                    xg0Var.V.f39913c.setEditText(this);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.G) {
            case 1:
                fk0 fk0Var = (fk0) this.H;
                if (i10 == 67 && fk0Var.Q.length() == 0) {
                    fk0Var.O.requestFocus();
                    dk0 dk0Var = fk0Var.O;
                    dk0Var.setSelection(dk0Var.length());
                    fk0Var.O.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
