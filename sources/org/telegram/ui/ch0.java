package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class ch0 extends AnimatedPhoneNumberEditText {
    public final int V1;
    public final dh0 W1;

    public ch0(dh0 dh0Var, Context context, int i7) {
        super(context);
        this.V1 = i7;
        this.W1 = dh0Var;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.V1) {
            case 1:
                this.G1.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.H6, false));
                super.onDraw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onFocusChanged(boolean z9, int i7, Rect rect) {
        float f10;
        float f11;
        switch (this.V1) {
            case 0:
                super.onFocusChanged(z9, i7, rect);
                dh0 dh0Var = this.W1;
                org.telegram.ui.Components.lb0 lb0Var = dh0Var.f44988s1;
                if (!z9 && !dh0Var.J1.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                lb0Var.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z9, i7, rect);
                dh0 dh0Var2 = this.W1;
                org.telegram.ui.Components.lb0 lb0Var2 = dh0Var2.f44988s1;
                if (!z9 && !dh0Var2.H1.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                lb0Var2.b(f11, f11, true);
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        switch (this.V1) {
            case 1:
                if (i7 == 67) {
                    dh0 dh0Var = this.W1;
                    if (dh0Var.J1.length() == 0) {
                        dh0Var.H1.requestFocus();
                        ch0 ch0Var = dh0Var.H1;
                        ch0Var.setSelection(ch0Var.length());
                        dh0Var.H1.dispatchKeyEvent(keyEvent);
                    }
                }
                return super.onKeyDown(i7, keyEvent);
            default:
                return super.onKeyDown(i7, keyEvent);
        }
    }
}
