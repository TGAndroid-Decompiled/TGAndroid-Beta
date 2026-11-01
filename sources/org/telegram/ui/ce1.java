package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ce1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.q1 f36305a;
    public final ih.e f36306b;
    public final de1 f36307c;

    public ce1(de1 de1Var, org.telegram.ui.Cells.q1 q1Var, ih.e eVar) {
        this.f36307c = de1Var;
        this.f36305a = q1Var;
        this.f36306b = eVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f36305a.setEnterTransitionInProgress(false);
        ih.e eVar = this.f36306b;
        de1 de1Var = this.f36307c;
        ((ArrayList) eVar.f8536c).remove(de1Var);
        eVar.a();
        ((ViewGroup) eVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = de1Var.f36588g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
