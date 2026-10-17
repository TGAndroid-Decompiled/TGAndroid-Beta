package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class lh1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.u1 f38886a;
    public final org.telegram.ui.Components.si f38887b;
    public final mh1 f38888c;

    public lh1(mh1 mh1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.si siVar) {
        this.f38888c = mh1Var;
        this.f38886a = u1Var;
        this.f38887b = siVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f38886a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.si siVar = this.f38887b;
        mh1 mh1Var = this.f38888c;
        ((ArrayList) siVar.f30279c).remove(mh1Var);
        siVar.a();
        ((ViewGroup) siVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = mh1Var.f39198g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
