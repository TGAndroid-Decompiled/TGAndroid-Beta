package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class mi1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.u1 f38640a;
    public final org.telegram.ui.Components.wi f38641b;
    public final ni1 f38642c;

    public mi1(ni1 ni1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.wi wiVar) {
        this.f38642c = ni1Var;
        this.f38640a = u1Var;
        this.f38641b = wiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f38640a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.wi wiVar = this.f38641b;
        ni1 ni1Var = this.f38642c;
        ((ArrayList) wiVar.f32649c).remove(ni1Var);
        wiVar.a();
        ((ViewGroup) wiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = ni1Var.f38989g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
