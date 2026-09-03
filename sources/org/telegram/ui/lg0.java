package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class lg0 extends AnimatedPhoneNumberEditText {
    public final og0 D;

    public lg0(og0 og0Var, Context context) {
        super(context);
        this.D = og0Var;
    }

    @Override
    public final void onFocusChanged(boolean z4, int i10, Rect rect) {
        float f10;
        super.onFocusChanged(z4, i10, rect);
        og0 og0Var = this.D;
        pg0 pg0Var = og0Var.S;
        org.telegram.ui.Components.bd0 bd0Var = og0Var.f36799f;
        if (!z4 && !og0Var.f36796a.isFocused()) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        bd0Var.b(f10, f10, true);
        if (z4) {
            pg0Var.f37130c.setEditText(this);
            pg0Var.f37130c.setDispatchBackWhenEmpty(true);
            if (og0Var.f36804x == 2) {
                og0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        } else if (og0Var.f36804x == 2) {
            og0Var.setCountryButtonText(null);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        og0 og0Var = this.D;
        sj0 sj0Var = og0Var.f36796a;
        if (i10 == 67 && og0Var.f36797b.length() == 0) {
            sj0Var.requestFocus();
            sj0Var.setSelection(sj0Var.length());
            sj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !pg0.T0(this.D.S, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
