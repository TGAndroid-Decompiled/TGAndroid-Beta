package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jc1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.r1 f48940a;
    public final org.telegram.ui.Components.ri f48941b;
    public final kc1 f48942c;

    public jc1(kc1 kc1Var, org.telegram.ui.Cells.r1 r1Var, org.telegram.ui.Components.ri riVar) {
        this.f48942c = kc1Var;
        this.f48940a = r1Var;
        this.f48941b = riVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f48940a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ri riVar = this.f48941b;
        kc1 kc1Var = this.f48942c;
        ((ArrayList) riVar.f39153c).remove(kc1Var);
        riVar.a();
        ((ViewGroup) riVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = kc1Var.f49243g;
        if (recordCircle != null) {
            recordCircle.O = false;
        }
    }
}
