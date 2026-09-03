package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ki1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.s1 f35546a;
    public final org.telegram.ui.Components.ki f35547b;
    public final li1 f35548c;

    public ki1(li1 li1Var, org.telegram.ui.Cells.s1 s1Var, org.telegram.ui.Components.ki kiVar) {
        this.f35548c = li1Var;
        this.f35546a = s1Var;
        this.f35547b = kiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35546a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ki kiVar = this.f35547b;
        li1 li1Var = this.f35548c;
        ((ArrayList) kiVar.f26297c).remove(li1Var);
        kiVar.a();
        ((ViewGroup) kiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = li1Var.f35784g;
        if (recordCircle != null) {
            recordCircle.K = false;
        }
    }
}
