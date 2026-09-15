package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ib1;
public final class t20 extends AnimatorListenerAdapter {
    public final int f28038a = 0;
    public final View f28039b;
    public final View f28040c;
    public final View d;
    public final Object e;
    public final Object f28041f;

    public t20(ib1 ib1Var, ui uiVar, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.mk mkVar, org.telegram.ui.bo boVar) {
        this.f28041f = ib1Var;
        this.f28039b = uiVar;
        this.f28040c = t1Var;
        this.d = mkVar;
        this.e = boVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28038a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f28041f;
                View view = this.f28039b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f28040c;
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
                ib1 ib1Var = (ib1) this.f28041f;
                ib1Var.D.unlock();
                ui uiVar = (ui) this.f28039b;
                ((ArrayList) uiVar.f28413c).remove(ib1Var);
                uiVar.a();
                ((ViewGroup) uiVar.d).invalidate();
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f28040c;
                t1Var.setEnterTransitionInProgress(false);
                t1Var.getTransitionParams().D0.set(t1Var.getBackgroundDrawableLeft(), t1Var.getBackgroundDrawableTop(), t1Var.getBackgroundDrawableRight(), t1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.bo boVar = (org.telegram.ui.bo) this.e;
                ((qo[]) boVar.f32236a0.f780b)[0].f27406c.setAlpha(1.0f);
                ((qo[]) boVar.f32236a0.f780b)[0].d.setAlpha(1.0f);
                x5.release((View) null, ib1Var.H);
                return;
        }
    }

    public t20(x20 x20Var, ai.f0 f0Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.u7 u7Var) {
        this.f28039b = x20Var;
        this.f28040c = f0Var;
        this.d = frameLayout;
        this.f28041f = windowManager;
        this.e = u7Var;
    }
}
