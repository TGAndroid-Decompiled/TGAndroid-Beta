package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class j10 extends AnimatorListenerAdapter {
    public final int f34863a = 0;
    public final View f34864b;
    public final View f34865c;
    public final View d;
    public final Object f34866e;
    public final Object f34867f;

    public j10(org.telegram.ui.l51 l51Var, ci ciVar, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.qj qjVar, org.telegram.ui.an anVar) {
        this.f34867f = l51Var;
        this.f34864b = ciVar;
        this.f34865c = q1Var;
        this.d = qjVar;
        this.f34866e = anVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34863a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f34867f;
                View view = this.f34864b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f34865c;
                    view2.setVisibility(8);
                    View view3 = this.d;
                    view3.setVisibility(8);
                    windowManager.removeView(view);
                    windowManager.removeView(view2);
                    windowManager.removeView(view3);
                    windowManager.removeView((View) this.f34866e);
                    return;
                }
                return;
            default:
                org.telegram.ui.l51 l51Var = (org.telegram.ui.l51) this.f34867f;
                l51Var.D.e();
                ci ciVar = (ci) this.f34864b;
                ((ArrayList) ciVar.f32599c).remove(l51Var);
                ciVar.a();
                ((ViewGroup) ciVar.d).invalidate();
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f34865c;
                q1Var.setEnterTransitionInProgress(false);
                q1Var.getTransitionParams().E0.set(q1Var.getBackgroundDrawableLeft(), q1Var.getBackgroundDrawableTop(), q1Var.getBackgroundDrawableRight(), q1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.an anVar = (org.telegram.ui.an) this.f34866e;
                ((zn[]) anVar.f43737b0.f3761b)[0].f41096c.setAlpha(1.0f);
                ((zn[]) anVar.f43737b0.f3761b)[0].d.setAlpha(1.0f);
                r5.release((View) null, l51Var.H);
                return;
        }
    }

    public j10(n10 n10Var, bi.e5 e5Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.w7 w7Var) {
        this.f34864b = n10Var;
        this.f34865c = e5Var;
        this.d = frameLayout;
        this.f34867f = windowManager;
        this.f34866e = w7Var;
    }
}
