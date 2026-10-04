package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class oi1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.u1 f39201a;
    public final org.telegram.ui.Components.wi f39202b;
    public final pi1 f39203c;

    public oi1(pi1 pi1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.wi wiVar) {
        this.f39203c = pi1Var;
        this.f39201a = u1Var;
        this.f39202b = wiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f39201a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.wi wiVar = this.f39202b;
        pi1 pi1Var = this.f39203c;
        ((ArrayList) wiVar.f32561c).remove(pi1Var);
        wiVar.a();
        ((ViewGroup) wiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = pi1Var.f39504g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
