package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class fj1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.u1 f35848a;
    public final org.telegram.ui.Components.ui f35849b;
    public final gj1 f35850c;

    public fj1(gj1 gj1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.ui uiVar) {
        this.f35850c = gj1Var;
        this.f35848a = u1Var;
        this.f35849b = uiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35848a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ui uiVar = this.f35849b;
        gj1 gj1Var = this.f35850c;
        ((ArrayList) uiVar.f29691c).remove(gj1Var);
        uiVar.a();
        ((ViewGroup) uiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = gj1Var.f36422g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
