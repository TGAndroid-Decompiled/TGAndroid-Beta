package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.cb1;
public final class v20 extends AnimatorListenerAdapter {
    public final int f28972a = 0;
    public final View f28973b;
    public final View f28974c;
    public final View d;
    public final Object e;
    public final Object f28975f;

    public v20(cb1 cb1Var, vi viVar, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.jk jkVar, org.telegram.ui.wn wnVar) {
        this.f28975f = cb1Var;
        this.f28973b = viVar;
        this.f28974c = u1Var;
        this.d = jkVar;
        this.e = wnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28972a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f28975f;
                View view = this.f28973b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f28974c;
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
                cb1 cb1Var = (cb1) this.f28975f;
                cb1Var.D.unlock();
                vi viVar = (vi) this.f28973b;
                ((ArrayList) viVar.f29106c).remove(cb1Var);
                viVar.a();
                ((ViewGroup) viVar.d).invalidate();
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f28974c;
                u1Var.setEnterTransitionInProgress(false);
                u1Var.getTransitionParams().D0.set(u1Var.getBackgroundDrawableLeft(), u1Var.getBackgroundDrawableTop(), u1Var.getBackgroundDrawableRight(), u1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) this.e;
                ((so[]) wnVar.f39407a0.f866b)[0].f28325c.setAlpha(1.0f);
                ((so[]) wnVar.f39407a0.f866b)[0].d.setAlpha(1.0f);
                z5.release((View) null, cb1Var.H);
                return;
        }
    }

    public v20(z20 z20Var, ai.f0 f0Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.u7 u7Var) {
        this.f28973b = z20Var;
        this.f28974c = f0Var;
        this.d = frameLayout;
        this.f28975f = windowManager;
        this.e = u7Var;
    }
}
