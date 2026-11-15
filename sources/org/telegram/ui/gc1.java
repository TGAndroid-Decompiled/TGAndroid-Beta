package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class gc1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.q1 f47422a;
    public final org.telegram.ui.Components.ji f47423b;
    public final hc1 f47424c;

    public gc1(hc1 hc1Var, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.Components.ji jiVar) {
        this.f47424c = hc1Var;
        this.f47422a = q1Var;
        this.f47423b = jiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f47422a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ji jiVar = this.f47423b;
        hc1 hc1Var = this.f47424c;
        ((ArrayList) jiVar.f36017c).remove(hc1Var);
        jiVar.a();
        ((ViewGroup) jiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = hc1Var.f47677g;
        if (recordCircle != null) {
            recordCircle.O = false;
        }
    }
}
