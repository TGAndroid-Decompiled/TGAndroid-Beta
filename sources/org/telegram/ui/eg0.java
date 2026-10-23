package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class eg0 extends AnimatedPhoneNumberEditText {
    public final hg0 G;

    public eg0(hg0 hg0Var, Context context) {
        super(context);
        this.G = hg0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        super.onFocusChanged(z10, i10, rect);
        hg0 hg0Var = this.G;
        ig0 ig0Var = hg0Var.f37846a0;
        org.telegram.ui.Components.vd0 vd0Var = hg0Var.f37849f;
        if (!z10 && !hg0Var.f37845a.isFocused()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        vd0Var.b(f7, f7, true);
        if (z10) {
            ig0Var.f38196c.setEditText(this);
            ig0Var.f38196c.setDispatchBackWhenEmpty(true);
            if (hg0Var.E == 2) {
                hg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        } else if (hg0Var.E == 2) {
            hg0Var.setCountryButtonText(null);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        hg0 hg0Var = this.G;
        pj0 pj0Var = hg0Var.f37845a;
        if (i10 == 67 && hg0Var.f37847b.length() == 0) {
            pj0Var.requestFocus();
            pj0Var.setSelection(pj0Var.length());
            pj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !ig0.V0(this.G.f37846a0, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
