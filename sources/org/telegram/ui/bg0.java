package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class bg0 extends AnimatedPhoneNumberEditText {
    public final eg0 C;

    public bg0(eg0 eg0Var, Context context) {
        super(context);
        this.C = eg0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i9, Rect rect) {
        float f10;
        super.onFocusChanged(z10, i9, rect);
        eg0 eg0Var = this.C;
        fg0 fg0Var = eg0Var.R;
        org.telegram.ui.Components.fc0 fc0Var = eg0Var.f37936f;
        if (!z10 && !eg0Var.f37932a.isFocused()) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        fc0Var.b(f10, f10, true);
        if (z10) {
            fg0Var.f38263c.setEditText(this);
            fg0Var.f38263c.setDispatchBackWhenEmpty(true);
            if (eg0Var.f37941x == 2) {
                eg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        } else if (eg0Var.f37941x == 2) {
            eg0Var.setCountryButtonText(null);
        }
    }

    @Override
    public final boolean onKeyDown(int i9, KeyEvent keyEvent) {
        eg0 eg0Var = this.C;
        kj0 kj0Var = eg0Var.f37932a;
        if (i9 == 67 && eg0Var.f37933b.length() == 0) {
            kj0Var.requestFocus();
            kj0Var.setSelection(kj0Var.length());
            kj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i9, keyEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !fg0.T0(this.C.R, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
