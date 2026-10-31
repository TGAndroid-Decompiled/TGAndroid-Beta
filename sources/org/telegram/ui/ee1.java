package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ee1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.q1 f37040a;
    public final ih.e f37041b;
    public final fe1 f37042c;

    public ee1(fe1 fe1Var, org.telegram.ui.Cells.q1 q1Var, ih.e eVar) {
        this.f37042c = fe1Var;
        this.f37040a = q1Var;
        this.f37041b = eVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f37040a.setEnterTransitionInProgress(false);
        ih.e eVar = this.f37041b;
        fe1 fe1Var = this.f37042c;
        ((ArrayList) eVar.f8535c).remove(fe1Var);
        eVar.a();
        ((ViewGroup) eVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = fe1Var.f37251g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
