package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ra1;
public final class v20 extends AnimatorListenerAdapter {
    public final int f31780a = 0;
    public final View f31781b;
    public final View f31782c;
    public final View d;
    public final Object f31783e;
    public final Object f31784f;

    public v20(ra1 ra1Var, li liVar, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.jk jkVar, org.telegram.ui.xn xnVar) {
        this.f31784f = ra1Var;
        this.f31781b = liVar;
        this.f31782c = t1Var;
        this.d = jkVar;
        this.f31783e = xnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31780a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f31784f;
                View view = this.f31781b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f31782c;
                    view2.setVisibility(8);
                    View view3 = this.d;
                    view3.setVisibility(8);
                    windowManager.removeView(view);
                    windowManager.removeView(view2);
                    windowManager.removeView(view3);
                    windowManager.removeView((View) this.f31783e);
                    return;
                }
                return;
            default:
                ra1 ra1Var = (ra1) this.f31784f;
                ra1Var.D.unlock();
                li liVar = (li) this.f31781b;
                ((ArrayList) liVar.f28749c).remove(ra1Var);
                liVar.a();
                ((ViewGroup) liVar.d).invalidate();
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f31782c;
                t1Var.setEnterTransitionInProgress(false);
                t1Var.getTransitionParams().D0.set(t1Var.getBackgroundDrawableLeft(), t1Var.getBackgroundDrawableTop(), t1Var.getBackgroundDrawableRight(), t1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) this.f31783e;
                ((oo[]) xnVar.X.f5475b)[0].f29831c.setAlpha(1.0f);
                ((oo[]) xnVar.X.f5475b)[0].d.setAlpha(1.0f);
                u5.release((View) null, ra1Var.H);
                return;
        }
    }

    public v20(a30 a30Var, eg.s2 s2Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.w7 w7Var) {
        this.f31781b = a30Var;
        this.f31782c = s2Var;
        this.d = frameLayout;
        this.f31784f = windowManager;
        this.f31783e = w7Var;
    }
}
