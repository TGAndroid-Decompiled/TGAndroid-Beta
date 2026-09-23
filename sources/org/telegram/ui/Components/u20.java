package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.bb1;
public final class u20 extends AnimatorListenerAdapter {
    public final int f28394a = 0;
    public final View f28395b;
    public final View f28396c;
    public final View d;
    public final Object e;
    public final Object f28397f;

    public u20(bb1 bb1Var, vi viVar, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.jk jkVar, org.telegram.ui.xn xnVar) {
        this.f28397f = bb1Var;
        this.f28395b = viVar;
        this.f28396c = t1Var;
        this.d = jkVar;
        this.e = xnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28394a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f28397f;
                View view = this.f28395b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f28396c;
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
                bb1 bb1Var = (bb1) this.f28397f;
                bb1Var.D.unlock();
                vi viVar = (vi) this.f28395b;
                ((ArrayList) viVar.f28755c).remove(bb1Var);
                viVar.a();
                ((ViewGroup) viVar.d).invalidate();
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f28396c;
                t1Var.setEnterTransitionInProgress(false);
                t1Var.getTransitionParams().D0.set(t1Var.getBackgroundDrawableLeft(), t1Var.getBackgroundDrawableTop(), t1Var.getBackgroundDrawableRight(), t1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) this.e;
                ((ro[]) xnVar.f39309a0.f866b)[0].f27688c.setAlpha(1.0f);
                ((ro[]) xnVar.f39309a0.f866b)[0].d.setAlpha(1.0f);
                z5.release((View) null, bb1Var.H);
                return;
        }
    }

    public u20(y20 y20Var, ai.f0 f0Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.u7 u7Var) {
        this.f28395b = y20Var;
        this.f28396c = f0Var;
        this.d = frameLayout;
        this.f28397f = windowManager;
        this.e = u7Var;
    }
}
