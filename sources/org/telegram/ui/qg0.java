package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class qg0 extends AnimatedPhoneNumberEditText {
    public final tg0 G;

    public qg0(tg0 tg0Var, Context context) {
        super(context);
        this.G = tg0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        super.onFocusChanged(z10, i10, rect);
        tg0 tg0Var = this.G;
        ug0 ug0Var = tg0Var.V;
        org.telegram.ui.Components.ld0 ld0Var = tg0Var.f40820f;
        if (!z10 && !tg0Var.f40816a.isFocused()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        ld0Var.b(f7, f7, true);
        if (z10) {
            ug0Var.f41196c.setEditText(this);
            ug0Var.f41196c.setDispatchBackWhenEmpty(true);
            if (tg0Var.f40825x == 2) {
                tg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        } else if (tg0Var.f40825x == 2) {
            tg0Var.setCountryButtonText(null);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        tg0 tg0Var = this.G;
        yj0 yj0Var = tg0Var.f40816a;
        if (i10 == 67 && tg0Var.f40817b.length() == 0) {
            yj0Var.requestFocus();
            yj0Var.setSelection(yj0Var.length());
            yj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !ug0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
