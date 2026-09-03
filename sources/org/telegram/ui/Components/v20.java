package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.xa1;
public final class v20 extends AnimatorListenerAdapter {
    public final int f31748a = 0;
    public final View f31749b;
    public final View f31750c;
    public final View d;
    public final Object f31751e;
    public final Object f31752f;

    public v20(xa1 xa1Var, li liVar, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.jk jkVar, org.telegram.ui.xn xnVar) {
        this.f31752f = xa1Var;
        this.f31749b = liVar;
        this.f31750c = t1Var;
        this.d = jkVar;
        this.f31751e = xnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31748a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f31752f;
                View view = this.f31749b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f31750c;
                    view2.setVisibility(8);
                    View view3 = this.d;
                    view3.setVisibility(8);
                    windowManager.removeView(view);
                    windowManager.removeView(view2);
                    windowManager.removeView(view3);
                    windowManager.removeView((View) this.f31751e);
                    return;
                }
                return;
            default:
                xa1 xa1Var = (xa1) this.f31752f;
                xa1Var.D.unlock();
                li liVar = (li) this.f31749b;
                ((ArrayList) liVar.f28772c).remove(xa1Var);
                liVar.a();
                ((ViewGroup) liVar.d).invalidate();
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f31750c;
                t1Var.setEnterTransitionInProgress(false);
                t1Var.getTransitionParams().D0.set(t1Var.getBackgroundDrawableLeft(), t1Var.getBackgroundDrawableTop(), t1Var.getBackgroundDrawableRight(), t1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) this.f31751e;
                ((oo[]) xnVar.X.f5475b)[0].f29837c.setAlpha(1.0f);
                ((oo[]) xnVar.X.f5475b)[0].d.setAlpha(1.0f);
                u5.release((View) null, xa1Var.H);
                return;
        }
    }

    public v20(a30 a30Var, eg.s2 s2Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.w7 w7Var) {
        this.f31749b = a30Var;
        this.f31750c = s2Var;
        this.d = frameLayout;
        this.f31752f = windowManager;
        this.f31751e = w7Var;
    }
}
