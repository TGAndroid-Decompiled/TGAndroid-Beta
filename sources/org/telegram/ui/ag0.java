package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class ag0 extends AnimatedPhoneNumberEditText {
    public final dg0 G;

    public ag0(dg0 dg0Var, Context context) {
        super(context);
        this.G = dg0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        super.onFocusChanged(z10, i10, rect);
        dg0 dg0Var = this.G;
        eg0 eg0Var = dg0Var.V;
        org.telegram.ui.Components.sd0 sd0Var = dg0Var.f36190f;
        if (!z10 && !dg0Var.f36187a.isFocused()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        sd0Var.b(f7, f7, true);
        if (z10) {
            eg0Var.f36493c.setEditText(this);
            eg0Var.f36493c.setDispatchBackWhenEmpty(true);
            if (dg0Var.f36195x == 2) {
                dg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        } else if (dg0Var.f36195x == 2) {
            dg0Var.setCountryButtonText(null);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        dg0 dg0Var = this.G;
        lj0 lj0Var = dg0Var.f36187a;
        if (i10 == 67 && dg0Var.f36188b.length() == 0) {
            lj0Var.requestFocus();
            lj0Var.setSelection(lj0Var.length());
            lj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !eg0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
