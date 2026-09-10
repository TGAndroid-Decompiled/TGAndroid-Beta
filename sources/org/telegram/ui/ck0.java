package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class ck0 extends AnimatedPhoneNumberEditText {
    public final int G;
    public final Object H;

    public ck0(Object obj, Context context, int i10) {
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
                ek0 ek0Var = (ek0) this.H;
                org.telegram.ui.Components.hd0 hd0Var = ek0Var.f32236s;
                if (!z10 && !ek0Var.Q.isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                hd0Var.b(f7, f7, true);
                return;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                ek0 ek0Var2 = (ek0) this.H;
                org.telegram.ui.Components.hd0 hd0Var2 = ek0Var2.f32236s;
                if (!z10 && !ek0Var2.O.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                hd0Var2.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                wg0 wg0Var = (wg0) this.H;
                org.telegram.ui.Components.hd0 hd0Var3 = wg0Var.f38182f;
                if (!z10 && !wg0Var.f38180b.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                hd0Var3.b(f11, f11, true);
                if (z10) {
                    wg0Var.V.f38721c.setEditText(this);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.G) {
            case 1:
                ek0 ek0Var = (ek0) this.H;
                if (i10 == 67 && ek0Var.Q.length() == 0) {
                    ek0Var.O.requestFocus();
                    ck0 ck0Var = ek0Var.O;
                    ck0Var.setSelection(ck0Var.length());
                    ek0Var.O.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
