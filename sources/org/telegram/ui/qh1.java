package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qh1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.s1 f41731a;
    public final org.telegram.ui.Components.mi f41732b;
    public final rh1 f41733c;

    public qh1(rh1 rh1Var, org.telegram.ui.Cells.s1 s1Var, org.telegram.ui.Components.mi miVar) {
        this.f41733c = rh1Var;
        this.f41731a = s1Var;
        this.f41732b = miVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f41731a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.mi miVar = this.f41732b;
        rh1 rh1Var = this.f41733c;
        ((ArrayList) miVar.f30705c).remove(rh1Var);
        miVar.a();
        ((ViewGroup) miVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = rh1Var.f42112g;
        if (recordCircle != null) {
            recordCircle.J = false;
        }
    }
}
