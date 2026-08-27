package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

public final class eg0 extends AnimatedPhoneNumberEditText {
    public final hg0 C;

    public eg0(hg0 hg0Var, Context context) {
        super(context);
        this.C = hg0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        hg0 hg0Var = this.C;
        ig0 ig0Var = hg0Var.R;
        org.telegram.ui.Components.jc0 jc0Var = hg0Var.f38808f;
        float f10 = (z10 || hg0Var.f38804a.isFocused()) ? 1.0f : 0.0f;
        jc0Var.b(f10, f10, true);
        if (!z10) {
            if (hg0Var.f38813x == 2) {
                hg0Var.setCountryButtonText(null);
            }
        } else {
            ig0Var.f39083c.setEditText(this);
            ig0Var.f39083c.setDispatchBackWhenEmpty(true);
            if (hg0Var.f38813x == 2) {
                hg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        hg0 hg0Var = this.C;
        mj0 mj0Var = hg0Var.f38804a;
        if (i10 == 67 && hg0Var.f38805b.length() == 0) {
            mj0Var.requestFocus();
            mj0Var.setSelection(mj0Var.length());
            mj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !ig0.T0(this.C.R, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
