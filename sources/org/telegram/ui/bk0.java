package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class bk0 extends AnimatedPhoneNumberEditText {
    public final int G;
    public final Object H;

    public bk0(Object obj, Context context, int i10) {
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
                dk0 dk0Var = (dk0) this.H;
                org.telegram.ui.Components.zd0 zd0Var = dk0Var.f37040s;
                if (!z10 && !dk0Var.Q.isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                zd0Var.b(f7, f7, true);
                return;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                dk0 dk0Var2 = (dk0) this.H;
                org.telegram.ui.Components.zd0 zd0Var2 = dk0Var2.f37040s;
                if (!z10 && !dk0Var2.O.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                zd0Var2.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                vg0 vg0Var = (vg0) this.H;
                org.telegram.ui.Components.zd0 zd0Var3 = vg0Var.f42855f;
                if (!z10 && !vg0Var.f42852b.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                zd0Var3.b(f11, f11, true);
                if (z10) {
                    vg0Var.V.f43578c.setEditText(this);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.G) {
            case 1:
                dk0 dk0Var = (dk0) this.H;
                if (i10 == 67 && dk0Var.Q.length() == 0) {
                    dk0Var.O.requestFocus();
                    bk0 bk0Var = dk0Var.O;
                    bk0Var.setSelection(bk0Var.length());
                    dk0Var.O.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
