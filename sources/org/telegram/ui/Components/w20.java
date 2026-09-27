package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.bb1;
public final class w20 extends AnimatorListenerAdapter {
    public final int f29834a = 0;
    public final View f29835b;
    public final View f29836c;
    public final View d;
    public final Object e;
    public final Object f29837f;

    public w20(bb1 bb1Var, vi viVar, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.lk lkVar, org.telegram.ui.xn xnVar) {
        this.f29837f = bb1Var;
        this.f29835b = viVar;
        this.f29836c = u1Var;
        this.d = lkVar;
        this.e = xnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29834a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f29837f;
                View view = this.f29835b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f29836c;
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
                bb1 bb1Var = (bb1) this.f29837f;
                bb1Var.D.unlock();
                vi viVar = (vi) this.f29835b;
                ((ArrayList) viVar.f29138c).remove(bb1Var);
                viVar.a();
                ((ViewGroup) viVar.d).invalidate();
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f29836c;
                u1Var.setEnterTransitionInProgress(false);
                u1Var.getTransitionParams().D0.set(u1Var.getBackgroundDrawableLeft(), u1Var.getBackgroundDrawableTop(), u1Var.getBackgroundDrawableRight(), u1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) this.e;
                ((so[]) xnVar.f39689a0.f869b)[0].f28345c.setAlpha(1.0f);
                ((so[]) xnVar.f39689a0.f869b)[0].d.setAlpha(1.0f);
                z5.release((View) null, bb1Var.H);
                return;
        }
    }

    public w20(a30 a30Var, ai.f0 f0Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.x7 x7Var) {
        this.f29835b = a30Var;
        this.f29836c = f0Var;
        this.d = frameLayout;
        this.f29837f = windowManager;
        this.e = x7Var;
    }
}
