package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class pg0 extends AnimatedPhoneNumberEditText {
    public final sg0 G;

    public pg0(sg0 sg0Var, Context context) {
        super(context);
        this.G = sg0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        super.onFocusChanged(z10, i10, rect);
        sg0 sg0Var = this.G;
        tg0 tg0Var = sg0Var.V;
        org.telegram.ui.Components.jd0 jd0Var = sg0Var.f37451f;
        if (!z10 && !sg0Var.f37448a.isFocused()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        jd0Var.b(f7, f7, true);
        if (z10) {
            tg0Var.f37788c.setEditText(this);
            tg0Var.f37788c.setDispatchBackWhenEmpty(true);
            if (sg0Var.f37456x == 2) {
                sg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        } else if (sg0Var.f37456x == 2) {
            sg0Var.setCountryButtonText(null);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        sg0 sg0Var = this.G;
        wj0 wj0Var = sg0Var.f37448a;
        if (i10 == 67 && sg0Var.f37449b.length() == 0) {
            wj0Var.requestFocus();
            wj0Var.setSelection(wj0Var.length());
            wj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !tg0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
