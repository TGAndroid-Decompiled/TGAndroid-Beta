package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class z20 extends AnimatorListenerAdapter {
    public final int f33131a = 0;
    public final View f33132b;
    public final View f33133c;
    public final View d;
    public final Object e;
    public final Object f33134f;

    public z20(org.telegram.ui.da1 da1Var, qi qiVar, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.gk gkVar, org.telegram.ui.sn snVar) {
        this.f33134f = da1Var;
        this.f33132b = qiVar;
        this.f33133c = t1Var;
        this.d = gkVar;
        this.e = snVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33131a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f33134f;
                View view = this.f33132b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f33133c;
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
                org.telegram.ui.da1 da1Var = (org.telegram.ui.da1) this.f33134f;
                da1Var.D.unlock();
                qi qiVar = (qi) this.f33132b;
                ((ArrayList) qiVar.f29932c).remove(da1Var);
                qiVar.a();
                ((ViewGroup) qiVar.d).invalidate();
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f33133c;
                t1Var.setEnterTransitionInProgress(false);
                t1Var.getTransitionParams().D0.set(t1Var.getBackgroundDrawableLeft(), t1Var.getBackgroundDrawableTop(), t1Var.getBackgroundDrawableRight(), t1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.sn snVar = (org.telegram.ui.sn) this.e;
                ((yo[]) snVar.f41445a0.f900b)[0].f33013c.setAlpha(1.0f);
                ((yo[]) snVar.f41445a0.f900b)[0].d.setAlpha(1.0f);
                y5.release((View) null, da1Var.H);
                return;
        }
    }

    public z20(d30 d30Var, ah.x xVar, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.x7 x7Var) {
        this.f33132b = d30Var;
        this.f33133c = xVar;
        this.d = frameLayout;
        this.f33134f = windowManager;
        this.e = x7Var;
    }
}
