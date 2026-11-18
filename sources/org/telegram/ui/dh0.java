package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class dh0 extends AnimatedPhoneNumberEditText {
    public final int f46978b2;
    public final eh0 f46979c2;

    public dh0(eh0 eh0Var, Context context, int i7) {
        super(context);
        this.f46978b2 = i7;
        this.f46979c2 = eh0Var;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f46978b2) {
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
        switch (this.f46978b2) {
            case 0:
                super.onFocusChanged(z10, i7, rect);
                eh0 eh0Var = this.f46979c2;
                org.telegram.ui.Components.xb0 xb0Var = eh0Var.f47268t1;
                if (!z10 && !eh0Var.K1.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                xb0Var.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z10, i7, rect);
                eh0 eh0Var2 = this.f46979c2;
                org.telegram.ui.Components.xb0 xb0Var2 = eh0Var2.f47268t1;
                if (!z10 && !eh0Var2.I1.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                xb0Var2.b(f11, f11, true);
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        switch (this.f46978b2) {
            case 1:
                if (i7 == 67) {
                    eh0 eh0Var = this.f46979c2;
                    if (eh0Var.K1.length() == 0) {
                        eh0Var.I1.requestFocus();
                        dh0 dh0Var = eh0Var.I1;
                        dh0Var.setSelection(dh0Var.length());
                        eh0Var.I1.dispatchKeyEvent(keyEvent);
                    }
                }
                return super.onKeyDown(i7, keyEvent);
            default:
                return super.onKeyDown(i7, keyEvent);
        }
    }
}
