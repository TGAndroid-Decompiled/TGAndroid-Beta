package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jc1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.r1 f48965a;
    public final org.telegram.ui.Components.ti f48966b;
    public final kc1 f48967c;

    public jc1(kc1 kc1Var, org.telegram.ui.Cells.r1 r1Var, org.telegram.ui.Components.ti tiVar) {
        this.f48967c = kc1Var;
        this.f48965a = r1Var;
        this.f48966b = tiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f48965a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ti tiVar = this.f48966b;
        kc1 kc1Var = this.f48967c;
        ((ArrayList) tiVar.f39927c).remove(kc1Var);
        tiVar.a();
        ((ViewGroup) tiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = kc1Var.f49282g;
        if (recordCircle != null) {
            recordCircle.O = false;
        }
    }
}
