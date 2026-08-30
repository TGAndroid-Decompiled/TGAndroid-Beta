package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.qa1;
public final class u20 extends AnimatorListenerAdapter {
    public final int f29093a = 0;
    public final View f29094b;
    public final View f29095c;
    public final View d;
    public final Object e;
    public final Object f29096f;

    public u20(qa1 qa1Var, ki kiVar, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.jk jkVar, org.telegram.ui.xn xnVar) {
        this.f29096f = qa1Var;
        this.f29094b = kiVar;
        this.f29095c = t1Var;
        this.d = jkVar;
        this.e = xnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29093a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f29096f;
                View view = this.f29094b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f29095c;
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
                qa1 qa1Var = (qa1) this.f29096f;
                qa1Var.D.unlock();
                ki kiVar = (ki) this.f29094b;
                ((ArrayList) kiVar.f26277c).remove(qa1Var);
                kiVar.a();
                ((ViewGroup) kiVar.d).invalidate();
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f29095c;
                t1Var.setEnterTransitionInProgress(false);
                t1Var.getTransitionParams().D0.set(t1Var.getBackgroundDrawableLeft(), t1Var.getBackgroundDrawableTop(), t1Var.getBackgroundDrawableRight(), t1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) this.e;
                ((mo[]) xnVar.X.f4811b)[0].f27080c.setAlpha(1.0f);
                ((mo[]) xnVar.X.f4811b)[0].d.setAlpha(1.0f);
                u5.release((View) null, qa1Var.H);
                return;
        }
    }

    public u20(y20 y20Var, dg.u2 u2Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.w7 w7Var) {
        this.f29094b = y20Var;
        this.f29095c = u2Var;
        this.d = frameLayout;
        this.f29096f = windowManager;
        this.e = w7Var;
    }
}
