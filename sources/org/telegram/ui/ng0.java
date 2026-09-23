package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class ng0 extends AnimatedPhoneNumberEditText {
    public final qg0 G;

    public ng0(qg0 qg0Var, Context context) {
        super(context);
        this.G = qg0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        super.onFocusChanged(z10, i10, rect);
        qg0 qg0Var = this.G;
        rg0 rg0Var = qg0Var.V;
        org.telegram.ui.Components.yc0 yc0Var = qg0Var.f36425f;
        if (!z10 && !qg0Var.f36422a.isFocused()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        yc0Var.b(f7, f7, true);
        if (z10) {
            rg0Var.f36822c.setEditText(this);
            rg0Var.f36822c.setDispatchBackWhenEmpty(true);
            if (qg0Var.f36430x == 2) {
                qg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        } else if (qg0Var.f36430x == 2) {
            qg0Var.setCountryButtonText(null);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        qg0 qg0Var = this.G;
        uj0 uj0Var = qg0Var.f36422a;
        if (i10 == 67 && qg0Var.f36423b.length() == 0) {
            uj0Var.requestFocus();
            uj0Var.setSelection(uj0Var.length());
            uj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !rg0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
