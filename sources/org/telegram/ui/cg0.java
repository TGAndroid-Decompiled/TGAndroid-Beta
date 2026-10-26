package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class cg0 extends AnimatedPhoneNumberEditText {
    public final fg0 G;

    public cg0(fg0 fg0Var, Context context) {
        super(context);
        this.G = fg0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        super.onFocusChanged(z10, i10, rect);
        fg0 fg0Var = this.G;
        gg0 gg0Var = fg0Var.f39362a0;
        org.telegram.ui.Components.rd0 rd0Var = fg0Var.f39365f;
        if (!z10 && !fg0Var.f39361a.isFocused()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        rd0Var.b(f7, f7, true);
        if (z10) {
            gg0Var.f39655c.setEditText(this);
            gg0Var.f39655c.setDispatchBackWhenEmpty(true);
            if (fg0Var.E == 2) {
                fg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        } else if (fg0Var.E == 2) {
            fg0Var.setCountryButtonText(null);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        fg0 fg0Var = this.G;
        mj0 mj0Var = fg0Var.f39361a;
        if (i10 == 67 && fg0Var.f39363b.length() == 0) {
            mj0Var.requestFocus();
            mj0Var.setSelection(mj0Var.length());
            mj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !gg0.W0(this.G.f39362a0, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
