package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ci1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.t1 f33382a;
    public final org.telegram.ui.Components.ki f33383b;
    public final di1 f33384c;

    public ci1(di1 di1Var, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Components.ki kiVar) {
        this.f33384c = di1Var;
        this.f33382a = t1Var;
        this.f33383b = kiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f33382a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ki kiVar = this.f33383b;
        di1 di1Var = this.f33384c;
        ((ArrayList) kiVar.f26277c).remove(di1Var);
        kiVar.a();
        ((ViewGroup) kiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = di1Var.f33665g;
        if (recordCircle != null) {
            recordCircle.K = false;
        }
    }
}
