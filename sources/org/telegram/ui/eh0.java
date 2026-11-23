package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class eh0 extends AnimatedPhoneNumberEditText {
    public final int f47302b2;
    public final fh0 f47303c2;

    public eh0(fh0 fh0Var, Context context, int i7) {
        super(context);
        this.f47302b2 = i7;
        this.f47303c2 = fh0Var;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f47302b2) {
            case 1:
                this.M1.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.H6, false));
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
        switch (this.f47302b2) {
            case 0:
                super.onFocusChanged(z10, i7, rect);
                fh0 fh0Var = this.f47303c2;
                org.telegram.ui.Components.yb0 yb0Var = fh0Var.f47735t1;
                if (!z10 && !fh0Var.K1.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                yb0Var.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z10, i7, rect);
                fh0 fh0Var2 = this.f47303c2;
                org.telegram.ui.Components.yb0 yb0Var2 = fh0Var2.f47735t1;
                if (!z10 && !fh0Var2.I1.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                yb0Var2.b(f11, f11, true);
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        switch (this.f47302b2) {
            case 1:
                if (i7 == 67) {
                    fh0 fh0Var = this.f47303c2;
                    if (fh0Var.K1.length() == 0) {
                        fh0Var.I1.requestFocus();
                        eh0 eh0Var = fh0Var.I1;
                        eh0Var.setSelection(eh0Var.length());
                        fh0Var.I1.dispatchKeyEvent(keyEvent);
                    }
                }
                return super.onKeyDown(i7, keyEvent);
            default:
                return super.onKeyDown(i7, keyEvent);
        }
    }
}
