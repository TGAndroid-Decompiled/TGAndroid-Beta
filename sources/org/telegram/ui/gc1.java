package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class gc1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.q1 f47412a;
    public final org.telegram.ui.Components.ji f47413b;
    public final hc1 f47414c;

    public gc1(hc1 hc1Var, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.Components.ji jiVar) {
        this.f47414c = hc1Var;
        this.f47412a = q1Var;
        this.f47413b = jiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f47412a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ji jiVar = this.f47413b;
        hc1 hc1Var = this.f47414c;
        ((ArrayList) jiVar.f36007c).remove(hc1Var);
        jiVar.a();
        ((ViewGroup) jiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = hc1Var.f47667g;
        if (recordCircle != null) {
            recordCircle.O = false;
        }
    }
}
