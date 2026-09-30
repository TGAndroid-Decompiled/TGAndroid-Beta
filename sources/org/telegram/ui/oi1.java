package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class oi1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.u1 f36393a;
    public final org.telegram.ui.Components.wi f36394b;
    public final pi1 f36395c;

    public oi1(pi1 pi1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.wi wiVar) {
        this.f36395c = pi1Var;
        this.f36393a = u1Var;
        this.f36394b = wiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f36393a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.wi wiVar = this.f36394b;
        pi1 pi1Var = this.f36395c;
        ((ArrayList) wiVar.f29966c).remove(pi1Var);
        wiVar.a();
        ((ViewGroup) wiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = pi1Var.f36665g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
