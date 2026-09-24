package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class oi1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.u1 f36229a;
    public final org.telegram.ui.Components.vi f36230b;
    public final pi1 f36231c;

    public oi1(pi1 pi1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.vi viVar) {
        this.f36231c = pi1Var;
        this.f36229a = u1Var;
        this.f36230b = viVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f36229a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.vi viVar = this.f36230b;
        pi1 pi1Var = this.f36231c;
        ((ArrayList) viVar.f29154c).remove(pi1Var);
        viVar.a();
        ((ViewGroup) viVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = pi1Var.f36549g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
