package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class dg0 extends AnimatedPhoneNumberEditText {
    public final gg0 G;

    public dg0(gg0 gg0Var, Context context) {
        super(context);
        this.G = gg0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        super.onFocusChanged(z10, i10, rect);
        gg0 gg0Var = this.G;
        hg0 hg0Var = gg0Var.f37562a0;
        org.telegram.ui.Components.td0 td0Var = gg0Var.f37565f;
        if (!z10 && !gg0Var.f37561a.isFocused()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        td0Var.b(f7, f7, true);
        if (z10) {
            hg0Var.f37837c.setEditText(this);
            hg0Var.f37837c.setDispatchBackWhenEmpty(true);
            if (gg0Var.E == 2) {
                gg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        } else if (gg0Var.E == 2) {
            gg0Var.setCountryButtonText(null);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        gg0 gg0Var = this.G;
        oj0 oj0Var = gg0Var.f37561a;
        if (i10 == 67 && gg0Var.f37563b.length() == 0) {
            oj0Var.requestFocus();
            oj0Var.setSelection(oj0Var.length());
            oj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !hg0.V0(this.G.f37562a0, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
