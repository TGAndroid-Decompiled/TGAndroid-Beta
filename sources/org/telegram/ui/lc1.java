package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class lc1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.q1 f47583a;
    public final org.telegram.ui.Components.bi f47584b;
    public final mc1 f47585c;

    public lc1(mc1 mc1Var, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.Components.bi biVar) {
        this.f47585c = mc1Var;
        this.f47583a = q1Var;
        this.f47584b = biVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f47583a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.bi biVar = this.f47584b;
        mc1 mc1Var = this.f47585c;
        ((ArrayList) biVar.f32272c).remove(mc1Var);
        biVar.a();
        ((ViewGroup) biVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = mc1Var.f47922g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
