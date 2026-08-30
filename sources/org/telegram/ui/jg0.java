package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class jg0 extends AnimatedPhoneNumberEditText {
    public final mg0 D;

    public jg0(mg0 mg0Var, Context context) {
        super(context);
        this.D = mg0Var;
    }

    @Override
    public final void onFocusChanged(boolean z4, int i10, Rect rect) {
        float f10;
        super.onFocusChanged(z4, i10, rect);
        mg0 mg0Var = this.D;
        ng0 ng0Var = mg0Var.S;
        org.telegram.ui.Components.ad0 ad0Var = mg0Var.f36296f;
        if (!z4 && !mg0Var.f36293a.isFocused()) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        ad0Var.b(f10, f10, true);
        if (z4) {
            ng0Var.f36626c.setEditText(this);
            ng0Var.f36626c.setDispatchBackWhenEmpty(true);
            if (mg0Var.f36301x == 2) {
                mg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        } else if (mg0Var.f36301x == 2) {
            mg0Var.setCountryButtonText(null);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        mg0 mg0Var = this.D;
        qj0 qj0Var = mg0Var.f36293a;
        if (i10 == 67 && mg0Var.f36294b.length() == 0) {
            qj0Var.requestFocus();
            qj0Var.setSelection(qj0Var.length());
            qj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !ng0.T0(this.D.S, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
