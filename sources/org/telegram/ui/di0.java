package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class di0 extends AnimatedPhoneNumberEditText {
    public final int V1;
    public final ei0 W1;

    public di0(ei0 ei0Var, Context context, int i10) {
        super(context);
        this.V1 = i10;
        this.W1 = ei0Var;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.V1) {
            case 1:
                this.G1.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.H6, false));
                super.onDraw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        float f10;
        switch (this.V1) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                ei0 ei0Var = this.W1;
                org.telegram.ui.Components.ec0 ec0Var = ei0Var.f36842p1;
                if (!z10 && !ei0Var.G1.isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                ec0Var.b(f7, f7, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                ei0 ei0Var2 = this.W1;
                org.telegram.ui.Components.ec0 ec0Var2 = ei0Var2.f36842p1;
                if (!z10 && !ei0Var2.E1.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                ec0Var2.b(f10, f10, true);
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.V1) {
            case 1:
                if (i10 == 67) {
                    ei0 ei0Var = this.W1;
                    if (ei0Var.G1.length() == 0) {
                        ei0Var.E1.requestFocus();
                        di0 di0Var = ei0Var.E1;
                        di0Var.setSelection(di0Var.length());
                        ei0Var.E1.dispatchKeyEvent(keyEvent);
                    }
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
