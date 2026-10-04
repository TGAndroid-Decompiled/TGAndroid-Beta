package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class oi1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.u1 f39206a;
    public final org.telegram.ui.Components.wi f39207b;
    public final pi1 f39208c;

    public oi1(pi1 pi1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.wi wiVar) {
        this.f39208c = pi1Var;
        this.f39206a = u1Var;
        this.f39207b = wiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f39206a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.wi wiVar = this.f39207b;
        pi1 pi1Var = this.f39208c;
        ((ArrayList) wiVar.f32567c).remove(pi1Var);
        wiVar.a();
        ((ViewGroup) wiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = pi1Var.f39509g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
