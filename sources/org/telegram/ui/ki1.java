package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ki1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.t1 f38324a;
    public final org.telegram.ui.Components.li f38325b;
    public final li1 f38326c;

    public ki1(li1 li1Var, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Components.li liVar) {
        this.f38326c = li1Var;
        this.f38324a = t1Var;
        this.f38325b = liVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f38324a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.li liVar = this.f38325b;
        li1 li1Var = this.f38326c;
        ((ArrayList) liVar.f28772c).remove(li1Var);
        liVar.a();
        ((ViewGroup) liVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = li1Var.f38669g;
        if (recordCircle != null) {
            recordCircle.K = false;
        }
    }
}
