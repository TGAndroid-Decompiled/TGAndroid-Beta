package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jh1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.u1 f38271a;
    public final org.telegram.ui.Components.si f38272b;
    public final kh1 f38273c;

    public jh1(kh1 kh1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.si siVar) {
        this.f38273c = kh1Var;
        this.f38271a = u1Var;
        this.f38272b = siVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f38271a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.si siVar = this.f38272b;
        kh1 kh1Var = this.f38273c;
        ((ArrayList) siVar.f30296c).remove(kh1Var);
        siVar.a();
        ((ViewGroup) siVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = kh1Var.f38622g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
