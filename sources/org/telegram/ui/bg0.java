package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class bg0 extends AnimatedPhoneNumberEditText {
    public final eg0 G;

    public bg0(eg0 eg0Var, Context context) {
        super(context);
        this.G = eg0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        super.onFocusChanged(z10, i10, rect);
        eg0 eg0Var = this.G;
        fg0 fg0Var = eg0Var.V;
        org.telegram.ui.Components.sd0 sd0Var = eg0Var.f36524f;
        if (!z10 && !eg0Var.f36521a.isFocused()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        sd0Var.b(f7, f7, true);
        if (z10) {
            fg0Var.f36907c.setEditText(this);
            fg0Var.f36907c.setDispatchBackWhenEmpty(true);
            if (eg0Var.f36529x == 2) {
                eg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        } else if (eg0Var.f36529x == 2) {
            eg0Var.setCountryButtonText(null);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        eg0 eg0Var = this.G;
        mj0 mj0Var = eg0Var.f36521a;
        if (i10 == 67 && eg0Var.f36522b.length() == 0) {
            mj0Var.requestFocus();
            mj0Var.setSelection(mj0Var.length());
            mj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !fg0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
