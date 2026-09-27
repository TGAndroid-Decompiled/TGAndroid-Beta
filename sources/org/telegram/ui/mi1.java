package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class mi1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.u1 f35710a;
    public final org.telegram.ui.Components.vi f35711b;
    public final ni1 f35712c;

    public mi1(ni1 ni1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.vi viVar) {
        this.f35712c = ni1Var;
        this.f35710a = u1Var;
        this.f35711b = viVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35710a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.vi viVar = this.f35711b;
        ni1 ni1Var = this.f35712c;
        ((ArrayList) viVar.f29138c).remove(ni1Var);
        viVar.a();
        ((ViewGroup) viVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = ni1Var.f36009g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
