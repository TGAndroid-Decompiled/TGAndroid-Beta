package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class df0 extends AnimatedPhoneNumberEditText {
    public final int V1;
    public final ff0 W1;

    public df0(ff0 ff0Var, Context context, int i10) {
        super(context);
        this.V1 = i10;
        this.W1 = ff0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        int i11 = this.V1;
        float f7 = 1.0f;
        ff0 ff0Var = this.W1;
        switch (i11) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                org.telegram.ui.Components.ec0 ec0Var = ff0Var.f37127f;
                if (!z10 && !ff0Var.f37125b.isFocused()) {
                    f7 = 0.0f;
                }
                ec0Var.b(f7, f7, true);
                if (z10) {
                    ff0Var.f37124a0.f37475c.setEditText(this);
                    return;
                }
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                gf0 gf0Var = ff0Var.f37124a0;
                org.telegram.ui.Components.ec0 ec0Var2 = ff0Var.f37127f;
                if (!z10 && !ff0Var.f37123a.isFocused()) {
                    f7 = 0.0f;
                }
                ec0Var2.b(f7, f7, true);
                if (z10) {
                    gf0Var.f37475c.setEditText(this);
                    gf0Var.f37475c.setDispatchBackWhenEmpty(true);
                    if (ff0Var.E == 2) {
                        ff0.n(ff0Var, org.telegram.messenger.dd.L0(2131742884, null));
                        return;
                    }
                    return;
                } else if (ff0Var.E == 2) {
                    ff0.n(ff0Var, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.V1) {
            case 1:
                ff0 ff0Var = this.W1;
                df0 df0Var = ff0Var.f37123a;
                if (i10 == 67 && ff0Var.f37125b.length() == 0) {
                    df0Var.requestFocus();
                    df0Var.setSelection(df0Var.length());
                    df0Var.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.V1) {
            case 1:
                if (motionEvent.getAction() == 0 && !gf0.a1(this.W1.f37124a0, this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
