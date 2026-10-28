package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class d30 extends AnimatorListenerAdapter {
    public final int f27328a = 0;
    public final View f27329b;
    public final View f27330c;
    public final View d;
    public final Object e;
    public final Object f27331f;

    public d30(org.telegram.ui.ia1 ia1Var, si siVar, org.telegram.ui.Cells.s1 s1Var, org.telegram.ui.jk jkVar, org.telegram.ui.wn wnVar) {
        this.f27331f = ia1Var;
        this.f27329b = siVar;
        this.f27330c = s1Var;
        this.d = jkVar;
        this.e = wnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27328a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f27331f;
                View view = this.f27329b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f27330c;
                    view2.setVisibility(8);
                    View view3 = this.d;
                    view3.setVisibility(8);
                    windowManager.removeView(view);
                    windowManager.removeView(view2);
                    windowManager.removeView(view3);
                    windowManager.removeView((View) this.e);
                    return;
                }
                return;
            default:
                org.telegram.ui.ia1 ia1Var = (org.telegram.ui.ia1) this.f27331f;
                ia1Var.D.unlock();
                si siVar = (si) this.f27329b;
                ((ArrayList) siVar.f32599c).remove(ia1Var);
                siVar.a();
                ((ViewGroup) siVar.d).invalidate();
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f27330c;
                s1Var.setEnterTransitionInProgress(false);
                s1Var.getTransitionParams().D0.set(s1Var.getBackgroundDrawableLeft(), s1Var.getBackgroundDrawableTop(), s1Var.getBackgroundDrawableRight(), s1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) this.e;
                ((dp[]) wnVar.f45045a0.f4113b)[0].f27512c.setAlpha(1.0f);
                ((dp[]) wnVar.f45045a0.f4113b)[0].d.setAlpha(1.0f);
                c6.release((View) null, ia1Var.H);
                return;
        }
    }

    public d30(h30 h30Var, bh.r rVar, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.a8 a8Var) {
        this.f27329b = h30Var;
        this.f27330c = rVar;
        this.d = frameLayout;
        this.f27331f = windowManager;
        this.e = a8Var;
    }
}
