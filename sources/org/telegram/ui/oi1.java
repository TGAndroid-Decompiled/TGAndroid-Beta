package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class oi1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.t1 f35890a;
    public final org.telegram.ui.Components.vi f35891b;
    public final pi1 f35892c;

    public oi1(pi1 pi1Var, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Components.vi viVar) {
        this.f35892c = pi1Var;
        this.f35890a = t1Var;
        this.f35891b = viVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35890a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.vi viVar = this.f35891b;
        pi1 pi1Var = this.f35892c;
        ((ArrayList) viVar.f28755c).remove(pi1Var);
        viVar.a();
        ((ViewGroup) viVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = pi1Var.f36126g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
