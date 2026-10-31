package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class ef0 extends AnimatedPhoneNumberEditText {
    public final int V1;
    public final gf0 W1;

    public ef0(gf0 gf0Var, Context context, int i10) {
        super(context);
        this.V1 = i10;
        this.W1 = gf0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        int i11 = this.V1;
        float f7 = 1.0f;
        gf0 gf0Var = this.W1;
        switch (i11) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                org.telegram.ui.Components.ec0 ec0Var = gf0Var.f37537f;
                if (!z10 && !gf0Var.f37535b.isFocused()) {
                    f7 = 0.0f;
                }
                ec0Var.b(f7, f7, true);
                if (z10) {
                    gf0Var.f37534a0.f37922c.setEditText(this);
                    return;
                }
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                hf0 hf0Var = gf0Var.f37534a0;
                org.telegram.ui.Components.ec0 ec0Var2 = gf0Var.f37537f;
                if (!z10 && !gf0Var.f37533a.isFocused()) {
                    f7 = 0.0f;
                }
                ec0Var2.b(f7, f7, true);
                if (z10) {
                    hf0Var.f37922c.setEditText(this);
                    hf0Var.f37922c.setDispatchBackWhenEmpty(true);
                    if (gf0Var.E == 2) {
                        gf0.n(gf0Var, org.telegram.messenger.cd.L0(2131742884, null));
                        return;
                    }
                    return;
                } else if (gf0Var.E == 2) {
                    gf0.n(gf0Var, null);
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
                gf0 gf0Var = this.W1;
                ef0 ef0Var = gf0Var.f37533a;
                if (i10 == 67 && gf0Var.f37535b.length() == 0) {
                    ef0Var.requestFocus();
                    ef0Var.setSelection(ef0Var.length());
                    ef0Var.dispatchKeyEvent(keyEvent);
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
                if (motionEvent.getAction() == 0 && !hf0.Z0(this.W1.f37534a0, this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
