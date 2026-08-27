package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

public final class nh1 extends AnimatorListenerAdapter {

    public final org.telegram.ui.Cells.s1 f40835a;

    public final org.telegram.ui.Components.fi f40836b;

    public final oh1 f40837c;

    public nh1(oh1 oh1Var, org.telegram.ui.Cells.s1 s1Var, org.telegram.ui.Components.fi fiVar) {
        this.f40837c = oh1Var;
        this.f40835a = s1Var;
        this.f40836b = fiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f40835a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.fi fiVar = this.f40836b;
        ArrayList arrayList = (ArrayList) fiVar.f28391c;
        oh1 oh1Var = this.f40837c;
        arrayList.remove(oh1Var);
        fiVar.a();
        ((ViewGroup) fiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = oh1Var.f41108g;
        if (recordCircle != null) {
            recordCircle.J = false;
        }
    }
}
