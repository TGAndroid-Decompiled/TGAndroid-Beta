package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class oh1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.t1 f41165a;
    public final org.telegram.ui.Components.ji f41166b;
    public final ph1 f41167c;

    public oh1(ph1 ph1Var, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Components.ji jiVar) {
        this.f41167c = ph1Var;
        this.f41165a = t1Var;
        this.f41166b = jiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f41165a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ji jiVar = this.f41166b;
        ph1 ph1Var = this.f41167c;
        ((ArrayList) jiVar.f29744c).remove(ph1Var);
        jiVar.a();
        ((ViewGroup) jiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = ph1Var.f41537g;
        if (recordCircle != null) {
            recordCircle.J = false;
        }
    }
}
