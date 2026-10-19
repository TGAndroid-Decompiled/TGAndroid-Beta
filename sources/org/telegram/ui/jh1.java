package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jh1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.u1 f38261a;
    public final org.telegram.ui.Components.si f38262b;
    public final kh1 f38263c;

    public jh1(kh1 kh1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.si siVar) {
        this.f38263c = kh1Var;
        this.f38261a = u1Var;
        this.f38262b = siVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f38261a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.si siVar = this.f38262b;
        kh1 kh1Var = this.f38263c;
        ((ArrayList) siVar.f30273c).remove(kh1Var);
        siVar.a();
        ((ViewGroup) siVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = kh1Var.f38612g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
