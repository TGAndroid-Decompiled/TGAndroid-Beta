package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class lh1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.u1 f38877a;
    public final org.telegram.ui.Components.si f38878b;
    public final mh1 f38879c;

    public lh1(mh1 mh1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.si siVar) {
        this.f38879c = mh1Var;
        this.f38877a = u1Var;
        this.f38878b = siVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f38877a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.si siVar = this.f38878b;
        mh1 mh1Var = this.f38879c;
        ((ArrayList) siVar.f30286c).remove(mh1Var);
        siVar.a();
        ((ViewGroup) siVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = mh1Var.f39223g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
