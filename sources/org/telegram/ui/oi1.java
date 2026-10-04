package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class oi1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.u1 f39200a;
    public final org.telegram.ui.Components.wi f39201b;
    public final pi1 f39202c;

    public oi1(pi1 pi1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.wi wiVar) {
        this.f39202c = pi1Var;
        this.f39200a = u1Var;
        this.f39201b = wiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f39200a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.wi wiVar = this.f39201b;
        pi1 pi1Var = this.f39202c;
        ((ArrayList) wiVar.f32560c).remove(pi1Var);
        wiVar.a();
        ((ViewGroup) wiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = pi1Var.f39503g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
