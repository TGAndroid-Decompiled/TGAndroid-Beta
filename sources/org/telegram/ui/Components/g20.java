package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.aa1;

public final class g20 extends AnimatorListenerAdapter {

    public final int f28505a = 0;

    public final View f28506b;

    public final View f28507c;
    public final View d;

    public final Object f28508e;

    public final Object f28509f;

    public g20(aa1 aa1Var, fi fiVar, org.telegram.ui.Cells.s1 s1Var, org.telegram.ui.ck ckVar, org.telegram.ui.rn rnVar) {
        this.f28509f = aa1Var;
        this.f28506b = fiVar;
        this.f28507c = s1Var;
        this.d = ckVar;
        this.f28508e = rnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28505a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f28509f;
                View view = this.f28506b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f28507c;
                    view2.setVisibility(8);
                    View view3 = this.d;
                    view3.setVisibility(8);
                    windowManager.removeView(view);
                    windowManager.removeView(view2);
                    windowManager.removeView(view3);
                    windowManager.removeView((View) this.f28508e);
                }
                break;
            default:
                aa1 aa1Var = (aa1) this.f28509f;
                aa1Var.D.unlock();
                fi fiVar = (fi) this.f28506b;
                ((ArrayList) fiVar.f28391c).remove(aa1Var);
                fiVar.a();
                ((ViewGroup) fiVar.d).invalidate();
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f28507c;
                s1Var.setEnterTransitionInProgress(false);
                s1Var.getTransitionParams().D0.set(s1Var.getBackgroundDrawableLeft(), s1Var.getBackgroundDrawableTop(), s1Var.getBackgroundDrawableRight(), s1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) this.f28508e;
                ((eo[]) rnVar.W.f594b)[0].f28103c.setAlpha(1.0f);
                ((eo[]) rnVar.W.f594b)[0].d.setAlpha(1.0f);
                t5.release((View) null, aa1Var.H);
                break;
        }
    }

    public g20(k20 k20Var, ag.p1 p1Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.u7 u7Var) {
        this.f28506b = k20Var;
        this.f28507c = p1Var;
        this.d = frameLayout;
        this.f28509f = windowManager;
        this.f28508e = u7Var;
    }
}
