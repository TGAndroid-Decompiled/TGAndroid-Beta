package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.da1;
public final class p20 extends AnimatorListenerAdapter {
    public final int f31555a = 0;
    public final View f31556b;
    public final View f31557c;
    public final View d;
    public final Object f31558e;
    public final Object f31559f;

    public p20(da1 da1Var, mi miVar, org.telegram.ui.Cells.s1 s1Var, org.telegram.ui.dk dkVar, org.telegram.ui.tn tnVar) {
        this.f31559f = da1Var;
        this.f31556b = miVar;
        this.f31557c = s1Var;
        this.d = dkVar;
        this.f31558e = tnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31555a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f31559f;
                View view = this.f31556b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f31557c;
                    view2.setVisibility(8);
                    View view3 = this.d;
                    view3.setVisibility(8);
                    windowManager.removeView(view);
                    windowManager.removeView(view2);
                    windowManager.removeView(view3);
                    windowManager.removeView((View) this.f31558e);
                    return;
                }
                return;
            default:
                da1 da1Var = (da1) this.f31559f;
                da1Var.D.unlock();
                mi miVar = (mi) this.f31556b;
                ((ArrayList) miVar.f30705c).remove(da1Var);
                miVar.a();
                ((ViewGroup) miVar.d).invalidate();
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f31557c;
                s1Var.setEnterTransitionInProgress(false);
                s1Var.getTransitionParams().D0.set(s1Var.getBackgroundDrawableLeft(), s1Var.getBackgroundDrawableTop(), s1Var.getBackgroundDrawableRight(), s1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.tn tnVar = (org.telegram.ui.tn) this.f31558e;
                ((ko[]) tnVar.W.f2608b)[0].f30114c.setAlpha(1.0f);
                ((ko[]) tnVar.W.f2608b)[0].d.setAlpha(1.0f);
                y5.release((View) null, da1Var.H);
                return;
        }
    }

    public p20(t20 t20Var, bg.x2 x2Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.s7 s7Var) {
        this.f31556b = t20Var;
        this.f31557c = x2Var;
        this.d = frameLayout;
        this.f31559f = windowManager;
        this.f31558e = s7Var;
    }
}
