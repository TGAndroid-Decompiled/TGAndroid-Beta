package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jc1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.r1 f48969a;
    public final org.telegram.ui.Components.ti f48970b;
    public final kc1 f48971c;

    public jc1(kc1 kc1Var, org.telegram.ui.Cells.r1 r1Var, org.telegram.ui.Components.ti tiVar) {
        this.f48971c = kc1Var;
        this.f48969a = r1Var;
        this.f48970b = tiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f48969a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ti tiVar = this.f48970b;
        kc1 kc1Var = this.f48971c;
        ((ArrayList) tiVar.f39920c).remove(kc1Var);
        tiVar.a();
        ((ViewGroup) tiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = kc1Var.f49286g;
        if (recordCircle != null) {
            recordCircle.O = false;
        }
    }
}
