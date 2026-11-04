package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class bc1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.q1 f44021a;
    public final org.telegram.ui.Components.ai f44022b;
    public final cc1 f44023c;

    public bc1(cc1 cc1Var, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.Components.ai aiVar) {
        this.f44023c = cc1Var;
        this.f44021a = q1Var;
        this.f44022b = aiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f44021a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ai aiVar = this.f44022b;
        cc1 cc1Var = this.f44023c;
        ((ArrayList) aiVar.f31850c).remove(cc1Var);
        aiVar.a();
        ((ViewGroup) aiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = cc1Var.f44313g;
        if (recordCircle != null) {
            recordCircle.O = false;
        }
    }
}
