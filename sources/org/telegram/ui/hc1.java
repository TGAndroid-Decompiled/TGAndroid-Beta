package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class hc1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.r1 f48534a;
    public final org.telegram.ui.Components.si f48535b;
    public final ic1 f48536c;

    public hc1(ic1 ic1Var, org.telegram.ui.Cells.r1 r1Var, org.telegram.ui.Components.si siVar) {
        this.f48536c = ic1Var;
        this.f48534a = r1Var;
        this.f48535b = siVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f48534a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.si siVar = this.f48535b;
        ic1 ic1Var = this.f48536c;
        ((ArrayList) siVar.f39625c).remove(ic1Var);
        siVar.a();
        ((ViewGroup) siVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = ic1Var.f48784g;
        if (recordCircle != null) {
            recordCircle.O = false;
        }
    }
}
