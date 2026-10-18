package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class lh1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.u1 f38835a;
    public final org.telegram.ui.Components.si f38836b;
    public final mh1 f38837c;

    public lh1(mh1 mh1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.si siVar) {
        this.f38837c = mh1Var;
        this.f38835a = u1Var;
        this.f38836b = siVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f38835a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.si siVar = this.f38836b;
        mh1 mh1Var = this.f38837c;
        ((ArrayList) siVar.f30279c).remove(mh1Var);
        siVar.a();
        ((ViewGroup) siVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = mh1Var.f39181g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
