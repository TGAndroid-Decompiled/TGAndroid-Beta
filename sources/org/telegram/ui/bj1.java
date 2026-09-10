package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class bj1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.t1 f31278a;
    public final org.telegram.ui.Components.xi f31279b;
    public final cj1 f31280c;

    public bj1(cj1 cj1Var, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Components.xi xiVar) {
        this.f31280c = cj1Var;
        this.f31278a = t1Var;
        this.f31279b = xiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f31278a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.xi xiVar = this.f31279b;
        cj1 cj1Var = this.f31280c;
        ((ArrayList) xiVar.f29049c).remove(cj1Var);
        xiVar.a();
        ((ViewGroup) xiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = cj1Var.f31721g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
