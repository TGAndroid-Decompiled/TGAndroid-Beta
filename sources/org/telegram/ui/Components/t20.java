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
    public final int f30541a = 0;
    public final View f30542b;
    public final View f30543c;
    public final View d;
    public final Object f30544e;
    public final Object f30545f;

    public t20(lb1 lb1Var, ui uiVar, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.mk mkVar, org.telegram.ui.co coVar) {
        this.f30545f = lb1Var;
        this.f30542b = uiVar;
        this.f30543c = t1Var;
        this.d = mkVar;
        this.f30544e = coVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30541a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f30545f;
                View view = this.f30542b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f30543c;
                    view2.setVisibility(8);
                    View view3 = this.d;
                    view3.setVisibility(8);
                    windowManager.removeView(view);
                    windowManager.removeView(view2);
                    windowManager.removeView(view3);
                    windowManager.removeView((View) this.f30544e);
                    return;
                }
                return;
            default:
                lb1 lb1Var = (lb1) this.f30545f;
                lb1Var.D.unlock();
                ui uiVar = (ui) this.f30542b;
                ((ArrayList) uiVar.f30931c).remove(lb1Var);
                uiVar.a();
                ((ViewGroup) uiVar.d).invalidate();
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f30543c;
                t1Var.setEnterTransitionInProgress(false);
                t1Var.getTransitionParams().D0.set(t1Var.getBackgroundDrawableLeft(), t1Var.getBackgroundDrawableTop(), t1Var.getBackgroundDrawableRight(), t1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.co coVar = (org.telegram.ui.co) this.f30544e;
                ((po[]) coVar.f35212a0.f730b)[0].f29473c.setAlpha(1.0f);
                ((po[]) coVar.f35212a0.f730b)[0].d.setAlpha(1.0f);
                z5.release((View) null, lb1Var.H);
                return;
        }
    }

    public t20(x20 x20Var, ah.y yVar, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.u7 u7Var) {
        this.f30542b = x20Var;
        this.f30543c = yVar;
        this.d = frameLayout;
        this.f30545f = windowManager;
        this.f30544e = u7Var;
    }
}
