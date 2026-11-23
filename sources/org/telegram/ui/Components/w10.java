package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class w10 extends AnimatorListenerAdapter {
    public final int f41619a = 0;
    public final View f41620b;
    public final View f41621c;
    public final View d;
    public final Object f41622e;
    public final Object f41623f;

    public w10(org.telegram.ui.l51 l51Var, ti tiVar, org.telegram.ui.Cells.r1 r1Var, org.telegram.ui.rj rjVar, org.telegram.ui.bn bnVar) {
        this.f41623f = l51Var;
        this.f41620b = tiVar;
        this.f41621c = r1Var;
        this.d = rjVar;
        this.f41622e = bnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41619a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f41623f;
                View view = this.f41620b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f41621c;
                    view2.setVisibility(8);
                    View view3 = this.d;
                    view3.setVisibility(8);
                    windowManager.removeView(view);
                    windowManager.removeView(view2);
                    windowManager.removeView(view3);
                    windowManager.removeView((View) this.f41622e);
                    return;
                }
                return;
            default:
                org.telegram.ui.l51 l51Var = (org.telegram.ui.l51) this.f41623f;
                l51Var.E.e();
                ti tiVar = (ti) this.f41620b;
                ((ArrayList) tiVar.f39919c).remove(l51Var);
                tiVar.a();
                ((ViewGroup) tiVar.d).invalidate();
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f41621c;
                r1Var.setEnterTransitionInProgress(false);
                r1Var.getTransitionParams().E0.set(r1Var.getBackgroundDrawableLeft(), r1Var.getBackgroundDrawableTop(), r1Var.getBackgroundDrawableRight(), r1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.f41622e;
                ((so[]) bnVar.f45979c0.f3595b)[0].f39637c.setAlpha(1.0f);
                ((so[]) bnVar.f45979c0.f3595b)[0].d.setAlpha(1.0f);
                y5.release((View) null, l51Var.I);
                return;
        }
    }

    public w10(a20 a20Var, bi.e3 e3Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.w7 w7Var) {
        this.f41620b = a20Var;
        this.f41621c = e3Var;
        this.d = frameLayout;
        this.f41623f = windowManager;
        this.f41622e = w7Var;
    }
}
