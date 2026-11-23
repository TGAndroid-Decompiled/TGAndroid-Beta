package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class w10 extends AnimatorListenerAdapter {
    public final int f41620a = 0;
    public final View f41621b;
    public final View f41622c;
    public final View d;
    public final Object f41623e;
    public final Object f41624f;

    public w10(org.telegram.ui.l51 l51Var, ti tiVar, org.telegram.ui.Cells.r1 r1Var, org.telegram.ui.rj rjVar, org.telegram.ui.bn bnVar) {
        this.f41624f = l51Var;
        this.f41621b = tiVar;
        this.f41622c = r1Var;
        this.d = rjVar;
        this.f41623e = bnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41620a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f41624f;
                View view = this.f41621b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f41622c;
                    view2.setVisibility(8);
                    View view3 = this.d;
                    view3.setVisibility(8);
                    windowManager.removeView(view);
                    windowManager.removeView(view2);
                    windowManager.removeView(view3);
                    windowManager.removeView((View) this.f41623e);
                    return;
                }
                return;
            default:
                org.telegram.ui.l51 l51Var = (org.telegram.ui.l51) this.f41624f;
                l51Var.E.e();
                ti tiVar = (ti) this.f41621b;
                ((ArrayList) tiVar.f39920c).remove(l51Var);
                tiVar.a();
                ((ViewGroup) tiVar.d).invalidate();
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f41622c;
                r1Var.setEnterTransitionInProgress(false);
                r1Var.getTransitionParams().E0.set(r1Var.getBackgroundDrawableLeft(), r1Var.getBackgroundDrawableTop(), r1Var.getBackgroundDrawableRight(), r1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.f41623e;
                ((so[]) bnVar.f45979c0.f3595b)[0].f39638c.setAlpha(1.0f);
                ((so[]) bnVar.f45979c0.f3595b)[0].d.setAlpha(1.0f);
                y5.release((View) null, l51Var.I);
                return;
        }
    }

    public w10(a20 a20Var, bi.e3 e3Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.w7 w7Var) {
        this.f41621b = a20Var;
        this.f41622c = e3Var;
        this.d = frameLayout;
        this.f41624f = windowManager;
        this.f41623e = w7Var;
    }
}
