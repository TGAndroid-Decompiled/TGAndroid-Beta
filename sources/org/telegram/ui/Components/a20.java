package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class a20 extends AnimatorListenerAdapter {
    public final int f24265a = 0;
    public final View f24266b;
    public final View f24267c;
    public final View d;
    public final Object e;
    public final Object f24268f;

    public a20(org.telegram.ui.d71 d71Var, ih.e eVar, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.mk mkVar, org.telegram.ui.un unVar) {
        this.f24268f = d71Var;
        this.f24266b = eVar;
        this.f24267c = q1Var;
        this.d = mkVar;
        this.e = unVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24265a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f24268f;
                View view = this.f24266b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f24267c;
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
                org.telegram.ui.d71 d71Var = (org.telegram.ui.d71) this.f24268f;
                d71Var.D.e();
                ih.e eVar = (ih.e) this.f24266b;
                ((ArrayList) eVar.f8535c).remove(d71Var);
                eVar.a();
                ((ViewGroup) eVar.d).invalidate();
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f24267c;
                q1Var.setEnterTransitionInProgress(false);
                q1Var.getTransitionParams().E0.set(q1Var.getBackgroundDrawableLeft(), q1Var.getBackgroundDrawableTop(), q1Var.getBackgroundDrawableRight(), q1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.un unVar = (org.telegram.ui.un) this.e;
                ((io[]) unVar.f42192b0.f10084b)[0].f27045c.setAlpha(1.0f);
                ((io[]) unVar.f42192b0.f10084b)[0].d.setAlpha(1.0f);
                o5.release((View) null, d71Var.H);
                return;
        }
    }

    public a20(e20 e20Var, jg.l0 l0Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.w7 w7Var) {
        this.f24266b = e20Var;
        this.f24267c = l0Var;
        this.d = frameLayout;
        this.f24268f = windowManager;
        this.e = w7Var;
    }
}
