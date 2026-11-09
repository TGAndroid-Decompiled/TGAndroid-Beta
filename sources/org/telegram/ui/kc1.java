package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class kc1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.q1 f47266a;
    public final org.telegram.ui.Components.ci f47267b;
    public final lc1 f47268c;

    public kc1(lc1 lc1Var, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.Components.ci ciVar) {
        this.f47268c = lc1Var;
        this.f47266a = q1Var;
        this.f47267b = ciVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f47266a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ci ciVar = this.f47267b;
        lc1 lc1Var = this.f47268c;
        ((ArrayList) ciVar.f32696c).remove(lc1Var);
        ciVar.a();
        ((ViewGroup) ciVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = lc1Var.f47571g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
