package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class kg0 extends AnimatedPhoneNumberEditText {
    public final ng0 D;

    public kg0(ng0 ng0Var, Context context) {
        super(context);
        this.D = ng0Var;
    }

    @Override
    public final void onFocusChanged(boolean z4, int i10, Rect rect) {
        float f10;
        super.onFocusChanged(z4, i10, rect);
        ng0 ng0Var = this.D;
        og0 og0Var = ng0Var.S;
        org.telegram.ui.Components.cd0 cd0Var = ng0Var.f39347f;
        if (!z4 && !ng0Var.f39343a.isFocused()) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        cd0Var.b(f10, f10, true);
        if (z4) {
            og0Var.f39714c.setEditText(this);
            og0Var.f39714c.setDispatchBackWhenEmpty(true);
            if (ng0Var.f39352x == 2) {
                ng0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        } else if (ng0Var.f39352x == 2) {
            ng0Var.setCountryButtonText(null);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        ng0 ng0Var = this.D;
        rj0 rj0Var = ng0Var.f39343a;
        if (i10 == 67 && ng0Var.f39344b.length() == 0) {
            rj0Var.requestFocus();
            rj0Var.setSelection(rj0Var.length());
            rj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !og0.T0(this.D.S, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
