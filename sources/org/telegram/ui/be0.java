package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class be0 extends AnimatedPhoneNumberEditText {
    public final int f45840b2;
    public final de0 f45841c2;

    public be0(de0 de0Var, Context context, int i7) {
        super(context);
        this.f45840b2 = i7;
        this.f45841c2 = de0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i7, Rect rect) {
        int i10 = this.f45840b2;
        float f10 = 1.0f;
        de0 de0Var = this.f45841c2;
        switch (i10) {
            case 0:
                super.onFocusChanged(z10, i7, rect);
                org.telegram.ui.Components.xb0 xb0Var = de0Var.f46875f;
                if (!z10 && !de0Var.f46868b.isFocused()) {
                    f10 = 0.0f;
                }
                xb0Var.b(f10, f10, true);
                if (z10) {
                    de0Var.f46878h0.f47181c.setEditText(this);
                    return;
                }
                return;
            default:
                super.onFocusChanged(z10, i7, rect);
                ee0 ee0Var = de0Var.f46878h0;
                org.telegram.ui.Components.xb0 xb0Var2 = de0Var.f46875f;
                if (!z10 && !de0Var.f46866a.isFocused()) {
                    f10 = 0.0f;
                }
                xb0Var2.b(f10, f10, true);
                if (z10) {
                    ee0Var.f47181c.setEditText(this);
                    ee0Var.f47181c.setDispatchBackWhenEmpty(true);
                    if (de0Var.F == 2) {
                        de0.n(de0Var, org.telegram.messenger.gd.M0(2131742601, null));
                        return;
                    }
                    return;
                } else if (de0Var.F == 2) {
                    de0.n(de0Var, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        switch (this.f45840b2) {
            case 1:
                de0 de0Var = this.f45841c2;
                be0 be0Var = de0Var.f46866a;
                if (i7 == 67 && de0Var.f46868b.length() == 0) {
                    be0Var.requestFocus();
                    be0Var.setSelection(be0Var.length());
                    be0Var.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i7, keyEvent);
            default:
                return super.onKeyDown(i7, keyEvent);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f45840b2) {
            case 1:
                if (motionEvent.getAction() == 0 && !ee0.b1(this.f45841c2.f46878h0, this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
