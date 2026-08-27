package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class sc0 implements Runnable {

    public final int f32398a;

    public final dd0 f32399b;

    public sc0(dd0 dd0Var, int i10) {
        this.f32398a = i10;
        this.f32399b = dd0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f32398a;
        dd0 dd0Var = this.f32399b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = dd0Var.f27723r;
                if (dd0Var.f27726x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(dd0Var.L, 0.0f);
                valueAnimatorOfFloat.addUpdateListener(new tc0(dd0Var, 0));
                valueAnimatorOfFloat.addListener(new sz(dd0Var, 8));
                valueAnimatorOfFloat.setDuration(420L);
                valueAnimatorOfFloat.setInterpolator(er.h);
                valueAnimatorOfFloat.start();
                break;
        }
    }
}
