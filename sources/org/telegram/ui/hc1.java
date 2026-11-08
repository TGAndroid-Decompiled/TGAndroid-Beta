package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class hc1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.q1 f46344a;
    public final org.telegram.ui.Components.ci f46345b;
    public final ic1 f46346c;

    public hc1(ic1 ic1Var, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.Components.ci ciVar) {
        this.f46346c = ic1Var;
        this.f46344a = q1Var;
        this.f46345b = ciVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f46344a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ci ciVar = this.f46345b;
        ic1 ic1Var = this.f46346c;
        ((ArrayList) ciVar.f32599c).remove(ic1Var);
        ciVar.a();
        ((ViewGroup) ciVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = ic1Var.f46647g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
