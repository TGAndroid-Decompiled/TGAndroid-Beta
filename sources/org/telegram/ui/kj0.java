package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class kj0 extends AnimatedPhoneNumberEditText {
    public final int G;
    public final Object H;

    public kj0(Object obj, Context context, int i10) {
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
                mj0 mj0Var = (mj0) this.H;
                org.telegram.ui.Components.sd0 sd0Var = mj0Var.f39300s;
                if (!z10 && !mj0Var.Q.isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                sd0Var.b(f7, f7, true);
                return;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                mj0 mj0Var2 = (mj0) this.H;
                org.telegram.ui.Components.sd0 sd0Var2 = mj0Var2.f39300s;
                if (!z10 && !mj0Var2.O.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                sd0Var2.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                cg0 cg0Var = (cg0) this.H;
                org.telegram.ui.Components.sd0 sd0Var3 = cg0Var.f35965f;
                if (!z10 && !cg0Var.f35963b.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                sd0Var3.b(f11, f11, true);
                if (z10) {
                    cg0Var.V.f36370c.setEditText(this);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.G) {
            case 1:
                mj0 mj0Var = (mj0) this.H;
                if (i10 == 67 && mj0Var.Q.length() == 0) {
                    mj0Var.O.requestFocus();
                    kj0 kj0Var = mj0Var.O;
                    kj0Var.setSelection(kj0Var.length());
                    mj0Var.O.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
