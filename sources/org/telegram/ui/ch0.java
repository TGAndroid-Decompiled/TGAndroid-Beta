package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class ch0 extends AnimatedPhoneNumberEditText {
    public final int f46797b2;
    public final dh0 f46798c2;

    public ch0(dh0 dh0Var, Context context, int i7) {
        super(context);
        this.f46797b2 = i7;
        this.f46798c2 = dh0Var;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f46797b2) {
            case 1:
                this.M1.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.H6, false));
                super.onDraw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onFocusChanged(boolean z10, int i7, Rect rect) {
        float f10;
        float f11;
        switch (this.f46797b2) {
            case 0:
                super.onFocusChanged(z10, i7, rect);
                dh0 dh0Var = this.f46798c2;
                org.telegram.ui.Components.vb0 vb0Var = dh0Var.f47135t1;
                if (!z10 && !dh0Var.K1.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                vb0Var.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z10, i7, rect);
                dh0 dh0Var2 = this.f46798c2;
                org.telegram.ui.Components.vb0 vb0Var2 = dh0Var2.f47135t1;
                if (!z10 && !dh0Var2.I1.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                vb0Var2.b(f11, f11, true);
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        switch (this.f46797b2) {
            case 1:
                if (i7 == 67) {
                    dh0 dh0Var = this.f46798c2;
                    if (dh0Var.K1.length() == 0) {
                        dh0Var.I1.requestFocus();
                        ch0 ch0Var = dh0Var.I1;
                        ch0Var.setSelection(ch0Var.length());
                        dh0Var.I1.dispatchKeyEvent(keyEvent);
                    }
                }
                return super.onKeyDown(i7, keyEvent);
            default:
                return super.onKeyDown(i7, keyEvent);
        }
    }
}
