package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ph1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.t1 f40543a;
    public final org.telegram.ui.Components.qi f40544b;
    public final qh1 f40545c;

    public ph1(qh1 qh1Var, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Components.qi qiVar) {
        this.f40545c = qh1Var;
        this.f40543a = t1Var;
        this.f40544b = qiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f40543a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.qi qiVar = this.f40544b;
        qh1 qh1Var = this.f40545c;
        ((ArrayList) qiVar.f29932c).remove(qh1Var);
        qiVar.a();
        ((ViewGroup) qiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = qh1Var.f40836g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
