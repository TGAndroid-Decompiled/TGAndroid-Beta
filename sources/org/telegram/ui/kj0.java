package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class kj0 extends AnimatedPhoneNumberEditText {
    public final int C;
    public final Object D;

    public kj0(Object obj, Context context, int i9) {
        super(context);
        this.C = i9;
        this.D = obj;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i9, Rect rect) {
        float f10;
        float f11;
        float f12;
        switch (this.C) {
            case 0:
                super.onFocusChanged(z10, i9, rect);
                nj0 nj0Var = (nj0) this.D;
                org.telegram.ui.Components.fc0 fc0Var = nj0Var.f40753s;
                if (!z10 && !nj0Var.M.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                fc0Var.b(f10, f10, true);
                return;
            case 1:
                super.onFocusChanged(z10, i9, rect);
                nj0 nj0Var2 = (nj0) this.D;
                org.telegram.ui.Components.fc0 fc0Var2 = nj0Var2.f40753s;
                if (!z10 && !nj0Var2.K.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                fc0Var2.b(f11, f11, true);
                return;
            default:
                super.onFocusChanged(z10, i9, rect);
                eg0 eg0Var = (eg0) this.D;
                org.telegram.ui.Components.fc0 fc0Var3 = eg0Var.f37936f;
                if (!z10 && !eg0Var.f37933b.isFocused()) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                fc0Var3.b(f12, f12, true);
                if (z10) {
                    eg0Var.R.f38263c.setEditText(this);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        switch (this.C) {
            case 1:
                nj0 nj0Var = (nj0) this.D;
                if (i9 == 67 && nj0Var.M.length() == 0) {
                    nj0Var.K.requestFocus();
                    kj0 kj0Var = nj0Var.K;
                    kj0Var.setSelection(kj0Var.length());
                    nj0Var.K.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i9, keyEvent);
            default:
                return super.onKeyDown(i9, keyEvent);
        }
    }
}
