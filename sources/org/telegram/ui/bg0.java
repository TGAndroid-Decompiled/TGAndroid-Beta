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
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f9;
        super.onFocusChanged(z10, i10, rect);
        eg0 eg0Var = this.C;
        fg0 fg0Var = eg0Var.R;
        org.telegram.ui.Components.uc0 uc0Var = eg0Var.f37814f;
        if (!z10 && !eg0Var.f37810a.isFocused()) {
            f9 = 0.0f;
        } else {
            f9 = 1.0f;
        }
        uc0Var.b(f9, f9, true);
        if (z10) {
            fg0Var.f38155c.setEditText(this);
            fg0Var.f38155c.setDispatchBackWhenEmpty(true);
            if (eg0Var.f37819x == 2) {
                eg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        } else if (eg0Var.f37819x == 2) {
            eg0Var.setCountryButtonText(null);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        eg0 eg0Var = this.C;
        ij0 ij0Var = eg0Var.f37810a;
        if (i10 == 67 && eg0Var.f37811b.length() == 0) {
            ij0Var.requestFocus();
            ij0Var.setSelection(ij0Var.length());
            ij0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
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
