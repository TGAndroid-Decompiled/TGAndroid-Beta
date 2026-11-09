package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class be0 extends AnimatedPhoneNumberEditText {
    public final int V1;
    public final de0 W1;

    public be0(de0 de0Var, Context context, int i7) {
        super(context);
        this.V1 = i7;
        this.W1 = de0Var;
    }

    @Override
    public final void onFocusChanged(boolean z9, int i7, Rect rect) {
        int i10 = this.V1;
        float f10 = 1.0f;
        de0 de0Var = this.W1;
        switch (i10) {
            case 0:
                super.onFocusChanged(z9, i7, rect);
                org.telegram.ui.Components.mb0 mb0Var = de0Var.f44933f;
                if (!z9 && !de0Var.f44926b.isFocused()) {
                    f10 = 0.0f;
                }
                mb0Var.b(f10, f10, true);
                if (z9) {
                    de0Var.f44935g0.f45372c.setEditText(this);
                    return;
                }
                return;
            default:
                super.onFocusChanged(z9, i7, rect);
                ee0 ee0Var = de0Var.f44935g0;
                org.telegram.ui.Components.mb0 mb0Var2 = de0Var.f44933f;
                if (!z9 && !de0Var.f44924a.isFocused()) {
                    f10 = 0.0f;
                }
                mb0Var2.b(f10, f10, true);
                if (z9) {
                    ee0Var.f45372c.setEditText(this);
                    ee0Var.f45372c.setDispatchBackWhenEmpty(true);
                    if (de0Var.E == 2) {
                        de0.n(de0Var, org.telegram.messenger.id.M0(2131742859, null));
                        return;
                    }
                    return;
                } else if (de0Var.E == 2) {
                    de0.n(de0Var, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        switch (this.V1) {
            case 1:
                de0 de0Var = this.W1;
                be0 be0Var = de0Var.f44924a;
                if (i7 == 67 && de0Var.f44926b.length() == 0) {
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
        switch (this.V1) {
            case 1:
                if (motionEvent.getAction() == 0 && !ee0.b1(this.W1.f44935g0, this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
