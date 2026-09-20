package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ud0 extends AnimatorListenerAdapter {
    public final int f28647a;
    public final vd0 f28648b;

    public ud0(vd0 vd0Var, int i10) {
        this.f28647a = i10;
        this.f28648b = vd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f28647a) {
            case 0:
                ae0 ae0Var = this.f28648b.d;
                ae0Var.P = 1.0f;
                ae0Var.f(1.0f);
                return;
            default:
                vd0 vd0Var = this.f28648b;
                Runnable runnable = vd0Var.f29064c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && vd0Var.d.f22664x.getVisibility() != 0 && (editTextBoldCursor = vd0Var.d.f22661r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(vd0Var.d.f22661r);
                    return;
                }
                return;
        }
    }
}
