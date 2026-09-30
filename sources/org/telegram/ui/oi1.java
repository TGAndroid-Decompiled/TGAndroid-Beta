package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class oi1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.u1 f36247a;
    public final org.telegram.ui.Components.vi f36248b;
    public final pi1 f36249c;

    public oi1(pi1 pi1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.vi viVar) {
        this.f36249c = pi1Var;
        this.f36247a = u1Var;
        this.f36248b = viVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f36247a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.vi viVar = this.f36248b;
        pi1 pi1Var = this.f36249c;
        ((ArrayList) viVar.f29107c).remove(pi1Var);
        viVar.a();
        ((ViewGroup) viVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = pi1Var.f36561g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
