package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class ij0 extends AnimatedPhoneNumberEditText {
    public final int C;
    public final Object D;

    public ij0(Object obj, Context context, int i10) {
        super(context);
        this.C = i10;
        this.D = obj;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f9;
        float f10;
        float f11;
        switch (this.C) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                kj0 kj0Var = (kj0) this.D;
                org.telegram.ui.Components.uc0 uc0Var = kj0Var.f39912s;
                if (!z10 && !kj0Var.M.isFocused()) {
                    f9 = 0.0f;
                } else {
                    f9 = 1.0f;
                }
                uc0Var.b(f9, f9, true);
                return;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                kj0 kj0Var2 = (kj0) this.D;
                org.telegram.ui.Components.uc0 uc0Var2 = kj0Var2.f39912s;
                if (!z10 && !kj0Var2.K.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                uc0Var2.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                eg0 eg0Var = (eg0) this.D;
                org.telegram.ui.Components.uc0 uc0Var3 = eg0Var.f37814f;
                if (!z10 && !eg0Var.f37811b.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                uc0Var3.b(f11, f11, true);
                if (z10) {
                    eg0Var.R.f38155c.setEditText(this);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.C) {
            case 1:
                kj0 kj0Var = (kj0) this.D;
                if (i10 == 67 && kj0Var.M.length() == 0) {
                    kj0Var.K.requestFocus();
                    ij0 ij0Var = kj0Var.K;
                    ij0Var.setSelection(ij0Var.length());
                    kj0Var.K.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
