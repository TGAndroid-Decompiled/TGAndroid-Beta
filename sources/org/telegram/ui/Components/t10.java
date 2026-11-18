package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class t10 extends AnimatorListenerAdapter {
    public final int f39883a = 0;
    public final View f39884b;
    public final View f39885c;
    public final View d;
    public final Object f39886e;
    public final Object f39887f;

    public t10(org.telegram.ui.l51 l51Var, ri riVar, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.rj rjVar, org.telegram.ui.bn bnVar) {
        this.f39887f = l51Var;
        this.f39884b = riVar;
        this.f39885c = q1Var;
        this.d = rjVar;
        this.f39886e = bnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39883a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f39887f;
                View view = this.f39884b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f39885c;
                    view2.setVisibility(8);
                    View view3 = this.d;
                    view3.setVisibility(8);
                    windowManager.removeView(view);
                    windowManager.removeView(view2);
                    windowManager.removeView(view3);
                    windowManager.removeView((View) this.f39886e);
                    return;
                }
                return;
            default:
                org.telegram.ui.l51 l51Var = (org.telegram.ui.l51) this.f39887f;
                l51Var.E.e();
                ri riVar = (ri) this.f39884b;
                ((ArrayList) riVar.f39153c).remove(l51Var);
                riVar.a();
                ((ViewGroup) riVar.d).invalidate();
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f39885c;
                q1Var.setEnterTransitionInProgress(false);
                q1Var.getTransitionParams().E0.set(q1Var.getBackgroundDrawableLeft(), q1Var.getBackgroundDrawableTop(), q1Var.getBackgroundDrawableRight(), q1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.f39886e;
                ((qo[]) bnVar.f45961c0.f3399b)[0].f38849c.setAlpha(1.0f);
                ((qo[]) bnVar.f45961c0.f3399b)[0].d.setAlpha(1.0f);
                x5.release((View) null, l51Var.I);
                return;
        }
    }

    public t10(x10 x10Var, bi.a3 a3Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.w7 w7Var) {
        this.f39884b = x10Var;
        this.f39885c = a3Var;
        this.d = frameLayout;
        this.f39887f = windowManager;
        this.f39886e = w7Var;
    }
}
