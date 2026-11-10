package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class ce0 extends AnimatedPhoneNumberEditText {
    public final int V1;
    public final ee0 W1;

    public ce0(ee0 ee0Var, Context context, int i7) {
        super(context);
        this.V1 = i7;
        this.W1 = ee0Var;
    }

    @Override
    public final void onFocusChanged(boolean z9, int i7, Rect rect) {
        int i10 = this.V1;
        float f10 = 1.0f;
        ee0 ee0Var = this.W1;
        switch (i10) {
            case 0:
                super.onFocusChanged(z9, i7, rect);
                org.telegram.ui.Components.lb0 lb0Var = ee0Var.f45253f;
                if (!z9 && !ee0Var.f45246b.isFocused()) {
                    f10 = 0.0f;
                }
                lb0Var.b(f10, f10, true);
                if (z9) {
                    ee0Var.f45255g0.f45696c.setEditText(this);
                    return;
                }
                return;
            default:
                super.onFocusChanged(z9, i7, rect);
                fe0 fe0Var = ee0Var.f45255g0;
                org.telegram.ui.Components.lb0 lb0Var2 = ee0Var.f45253f;
                if (!z9 && !ee0Var.f45244a.isFocused()) {
                    f10 = 0.0f;
                }
                lb0Var2.b(f10, f10, true);
                if (z9) {
                    fe0Var.f45696c.setEditText(this);
                    fe0Var.f45696c.setDispatchBackWhenEmpty(true);
                    if (ee0Var.E == 2) {
                        ee0.n(ee0Var, org.telegram.messenger.id.M0(2131742859, null));
                        return;
                    }
                    return;
                } else if (ee0Var.E == 2) {
                    ee0.n(ee0Var, null);
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
                ee0 ee0Var = this.W1;
                ce0 ce0Var = ee0Var.f45244a;
                if (i7 == 67 && ee0Var.f45246b.length() == 0) {
                    ce0Var.requestFocus();
                    ce0Var.setSelection(ce0Var.length());
                    ce0Var.dispatchKeyEvent(keyEvent);
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
                if (motionEvent.getAction() == 0 && !fe0.b1(this.W1.f45255g0, this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
