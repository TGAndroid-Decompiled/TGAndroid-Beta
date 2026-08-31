package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ei1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.t1 f36610a;
    public final org.telegram.ui.Components.li f36611b;
    public final fi1 f36612c;

    public ei1(fi1 fi1Var, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Components.li liVar) {
        this.f36612c = fi1Var;
        this.f36610a = t1Var;
        this.f36611b = liVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f36610a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.li liVar = this.f36611b;
        fi1 fi1Var = this.f36612c;
        ((ArrayList) liVar.f28749c).remove(fi1Var);
        liVar.a();
        ((ViewGroup) liVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = fi1Var.f36897g;
        if (recordCircle != null) {
            recordCircle.K = false;
        }
    }
}
