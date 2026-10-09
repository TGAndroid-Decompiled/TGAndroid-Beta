package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.lb1;
public final class k30 extends AnimatorListenerAdapter {
    public final int f27829a = 0;
    public final View f27830b;
    public final View f27831c;
    public final View d;
    public final Object f27832e;
    public final Object f27833f;

    public k30(lb1 lb1Var, xi xiVar, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.ok okVar, org.telegram.ui.zn znVar) {
        this.f27833f = lb1Var;
        this.f27830b = xiVar;
        this.f27831c = u1Var;
        this.d = okVar;
        this.f27832e = znVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27829a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f27833f;
                View view = this.f27830b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f27831c;
                    view2.setVisibility(8);
                    View view3 = this.d;
                    view3.setVisibility(8);
                    windowManager.removeView(view);
                    windowManager.removeView(view2);
                    windowManager.removeView(view3);
                    windowManager.removeView((View) this.f27832e);
                    return;
                }
                return;
            default:
                lb1 lb1Var = (lb1) this.f27833f;
                lb1Var.D.unlock();
                xi xiVar = (xi) this.f27830b;
                ((ArrayList) xiVar.f32877c).remove(lb1Var);
                xiVar.a();
                ((ViewGroup) xiVar.d).invalidate();
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f27831c;
                u1Var.setEnterTransitionInProgress(false);
                u1Var.getTransitionParams().D0.set(u1Var.getBackgroundDrawableLeft(), u1Var.getBackgroundDrawableTop(), u1Var.getBackgroundDrawableRight(), u1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.f27832e;
                ((gp[]) znVar.f44699a0.f933b)[0].f26828c.setAlpha(1.0f);
                ((gp[]) znVar.f44699a0.f933b)[0].d.setAlpha(1.0f);
                b6.release((View) null, lb1Var.H);
                return;
        }
    }

    public k30(o30 o30Var, ai.f0 f0Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.t7 t7Var) {
        this.f27830b = o30Var;
        this.f27831c = f0Var;
        this.d = frameLayout;
        this.f27833f = windowManager;
        this.f27832e = t7Var;
    }
}
