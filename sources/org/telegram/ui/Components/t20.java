package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.lb1;
public final class t20 extends AnimatorListenerAdapter {
    public final int f30514a = 0;
    public final View f30515b;
    public final View f30516c;
    public final View d;
    public final Object f30517e;
    public final Object f30518f;

    public t20(lb1 lb1Var, ui uiVar, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.mk mkVar, org.telegram.ui.co coVar) {
        this.f30518f = lb1Var;
        this.f30515b = uiVar;
        this.f30516c = t1Var;
        this.d = mkVar;
        this.f30517e = coVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30514a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f30518f;
                View view = this.f30515b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f30516c;
                    view2.setVisibility(8);
                    View view3 = this.d;
                    view3.setVisibility(8);
                    windowManager.removeView(view);
                    windowManager.removeView(view2);
                    windowManager.removeView(view3);
                    windowManager.removeView((View) this.f30517e);
                    return;
                }
                return;
            default:
                lb1 lb1Var = (lb1) this.f30518f;
                lb1Var.D.unlock();
                ui uiVar = (ui) this.f30515b;
                ((ArrayList) uiVar.f30904c).remove(lb1Var);
                uiVar.a();
                ((ViewGroup) uiVar.d).invalidate();
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f30516c;
                t1Var.setEnterTransitionInProgress(false);
                t1Var.getTransitionParams().D0.set(t1Var.getBackgroundDrawableLeft(), t1Var.getBackgroundDrawableTop(), t1Var.getBackgroundDrawableRight(), t1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.co coVar = (org.telegram.ui.co) this.f30517e;
                ((po[]) coVar.f35185a0.f718b)[0].f29446c.setAlpha(1.0f);
                ((po[]) coVar.f35185a0.f718b)[0].d.setAlpha(1.0f);
                z5.release((View) null, lb1Var.H);
                return;
        }
    }

    public t20(x20 x20Var, ah.y yVar, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.u7 u7Var) {
        this.f30515b = x20Var;
        this.f30516c = yVar;
        this.d = frameLayout;
        this.f30518f = windowManager;
        this.f30517e = u7Var;
    }
}
