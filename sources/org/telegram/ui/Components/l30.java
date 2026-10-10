package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.lb1;
public final class l30 extends AnimatorListenerAdapter {
    public final int f28144a = 0;
    public final View f28145b;
    public final View f28146c;
    public final View d;
    public final Object f28147e;
    public final Object f28148f;

    public l30(lb1 lb1Var, xi xiVar, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.ok okVar, org.telegram.ui.zn znVar) {
        this.f28148f = lb1Var;
        this.f28145b = xiVar;
        this.f28146c = u1Var;
        this.d = okVar;
        this.f28147e = znVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28144a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f28148f;
                View view = this.f28145b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f28146c;
                    view2.setVisibility(8);
                    View view3 = this.d;
                    view3.setVisibility(8);
                    windowManager.removeView(view);
                    windowManager.removeView(view2);
                    windowManager.removeView(view3);
                    windowManager.removeView((View) this.f28147e);
                    return;
                }
                return;
            default:
                lb1 lb1Var = (lb1) this.f28148f;
                lb1Var.D.unlock();
                xi xiVar = (xi) this.f28145b;
                ((ArrayList) xiVar.f32947c).remove(lb1Var);
                xiVar.a();
                ((ViewGroup) xiVar.d).invalidate();
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f28146c;
                u1Var.setEnterTransitionInProgress(false);
                u1Var.getTransitionParams().D0.set(u1Var.getBackgroundDrawableLeft(), u1Var.getBackgroundDrawableTop(), u1Var.getBackgroundDrawableRight(), u1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.f28147e;
                ((gp[]) znVar.f44745a0.f933b)[0].f26818c.setAlpha(1.0f);
                ((gp[]) znVar.f44745a0.f933b)[0].d.setAlpha(1.0f);
                b6.release((View) null, lb1Var.H);
                return;
        }
    }

    public l30(p30 p30Var, ai.f0 f0Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.t7 t7Var) {
        this.f28145b = p30Var;
        this.f28146c = f0Var;
        this.d = frameLayout;
        this.f28148f = windowManager;
        this.f28147e = t7Var;
    }
}
