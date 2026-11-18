package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jc1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.q1 f48950a;
    public final org.telegram.ui.Components.ri f48951b;
    public final kc1 f48952c;

    public jc1(kc1 kc1Var, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.Components.ri riVar) {
        this.f48952c = kc1Var;
        this.f48950a = q1Var;
        this.f48951b = riVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f48950a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ri riVar = this.f48951b;
        kc1 kc1Var = this.f48952c;
        ((ArrayList) riVar.f39153c).remove(kc1Var);
        riVar.a();
        ((ViewGroup) riVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = kc1Var.f49247g;
        if (recordCircle != null) {
            recordCircle.O = false;
        }
    }
}
