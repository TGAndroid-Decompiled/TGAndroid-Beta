package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ej1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.u1 f35316a;
    public final org.telegram.ui.Components.ui f35317b;
    public final fj1 f35318c;

    public ej1(fj1 fj1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.ui uiVar) {
        this.f35318c = fj1Var;
        this.f35316a = u1Var;
        this.f35317b = uiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35316a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ui uiVar = this.f35317b;
        fj1 fj1Var = this.f35318c;
        ((ArrayList) uiVar.f29385c).remove(fj1Var);
        uiVar.a();
        ((ViewGroup) uiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = fj1Var.f35553g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
