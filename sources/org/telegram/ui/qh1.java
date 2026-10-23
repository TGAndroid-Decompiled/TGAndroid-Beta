package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qh1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.t1 f40813a;
    public final org.telegram.ui.Components.si f40814b;
    public final rh1 f40815c;

    public qh1(rh1 rh1Var, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Components.si siVar) {
        this.f40815c = rh1Var;
        this.f40813a = t1Var;
        this.f40814b = siVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f40813a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.si siVar = this.f40814b;
        rh1 rh1Var = this.f40815c;
        ((ArrayList) siVar.f30498c).remove(rh1Var);
        siVar.a();
        ((ViewGroup) siVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = rh1Var.f41147g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
