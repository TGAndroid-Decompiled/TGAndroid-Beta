package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class bh0 extends AnimatedPhoneNumberEditText {
    public final int V1;
    public final ch0 W1;

    public bh0(ch0 ch0Var, Context context, int i7) {
        super(context);
        this.V1 = i7;
        this.W1 = ch0Var;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.V1) {
            case 1:
                this.G1.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.H6, false));
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
                ch0 ch0Var = this.W1;
                org.telegram.ui.Components.mb0 mb0Var = ch0Var.f44317p1;
                if (!z9 && !ch0Var.G1.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                mb0Var.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z9, i7, rect);
                ch0 ch0Var2 = this.W1;
                org.telegram.ui.Components.mb0 mb0Var2 = ch0Var2.f44317p1;
                if (!z9 && !ch0Var2.E1.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                mb0Var2.b(f11, f11, true);
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        switch (this.V1) {
            case 1:
                if (i7 == 67) {
                    ch0 ch0Var = this.W1;
                    if (ch0Var.G1.length() == 0) {
                        ch0Var.E1.requestFocus();
                        bh0 bh0Var = ch0Var.E1;
                        bh0Var.setSelection(bh0Var.length());
                        ch0Var.E1.dispatchKeyEvent(keyEvent);
                    }
                }
                return super.onKeyDown(i7, keyEvent);
            default:
                return super.onKeyDown(i7, keyEvent);
        }
    }
}
