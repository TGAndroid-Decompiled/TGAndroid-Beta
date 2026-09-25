package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class mg0 extends AnimatedPhoneNumberEditText {
    public final pg0 G;

    public mg0(pg0 pg0Var, Context context) {
        super(context);
        this.G = pg0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        super.onFocusChanged(z10, i10, rect);
        pg0 pg0Var = this.G;
        qg0 qg0Var = pg0Var.V;
        org.telegram.ui.Components.jd0 jd0Var = pg0Var.f36524f;
        if (!z10 && !pg0Var.f36521a.isFocused()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        jd0Var.b(f7, f7, true);
        if (z10) {
            qg0Var.f36890c.setEditText(this);
            qg0Var.f36890c.setDispatchBackWhenEmpty(true);
            if (pg0Var.f36529x == 2) {
                pg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        } else if (pg0Var.f36529x == 2) {
            pg0Var.setCountryButtonText(null);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        pg0 pg0Var = this.G;
        uj0 uj0Var = pg0Var.f36521a;
        if (i10 == 67 && pg0Var.f36522b.length() == 0) {
            uj0Var.requestFocus();
            uj0Var.setSelection(uj0Var.length());
            uj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !qg0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
