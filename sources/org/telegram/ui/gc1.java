package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class gc1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.q1 f45948a;
    public final org.telegram.ui.Components.ci f45949b;
    public final hc1 f45950c;

    public gc1(hc1 hc1Var, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.Components.ci ciVar) {
        this.f45950c = hc1Var;
        this.f45948a = q1Var;
        this.f45949b = ciVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f45948a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ci ciVar = this.f45949b;
        hc1 hc1Var = this.f45950c;
        ((ArrayList) ciVar.f32581c).remove(hc1Var);
        ciVar.a();
        ((ViewGroup) ciVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = hc1Var.f46344g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
