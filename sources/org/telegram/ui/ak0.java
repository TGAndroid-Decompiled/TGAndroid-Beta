package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class ak0 extends AnimatedPhoneNumberEditText {
    public final int G;
    public final Object H;

    public ak0(Object obj, Context context, int i10) {
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
                ck0 ck0Var = (ck0) this.H;
                org.telegram.ui.Components.yc0 yc0Var = ck0Var.f32824s;
                if (!z10 && !ck0Var.Q.isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                yc0Var.b(f7, f7, true);
                return;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                ck0 ck0Var2 = (ck0) this.H;
                org.telegram.ui.Components.yc0 yc0Var2 = ck0Var2.f32824s;
                if (!z10 && !ck0Var2.O.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                yc0Var2.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                vg0 vg0Var = (vg0) this.H;
                org.telegram.ui.Components.yc0 yc0Var3 = vg0Var.f38534f;
                if (!z10 && !vg0Var.f38532b.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                yc0Var3.b(f11, f11, true);
                if (z10) {
                    vg0Var.V.f39201c.setEditText(this);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.G) {
            case 1:
                ck0 ck0Var = (ck0) this.H;
                if (i10 == 67 && ck0Var.Q.length() == 0) {
                    ck0Var.O.requestFocus();
                    ak0 ak0Var = ck0Var.O;
                    ak0Var.setSelection(ak0Var.length());
                    ck0Var.O.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
