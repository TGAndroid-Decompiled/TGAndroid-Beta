package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class f10 extends AnimatorListenerAdapter {
    public final int f33645a = 0;
    public final View f33646b;
    public final View f33647c;
    public final View d;
    public final Object f33648e;
    public final Object f33649f;

    public f10(org.telegram.ui.a51 a51Var, ai aiVar, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.mj mjVar, org.telegram.ui.wm wmVar) {
        this.f33649f = a51Var;
        this.f33646b = aiVar;
        this.f33647c = q1Var;
        this.d = mjVar;
        this.f33648e = wmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33645a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f33649f;
                View view = this.f33646b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f33647c;
                    view2.setVisibility(8);
                    View view3 = this.d;
                    view3.setVisibility(8);
                    windowManager.removeView(view);
                    windowManager.removeView(view2);
                    windowManager.removeView(view3);
                    windowManager.removeView((View) this.f33648e);
                    return;
                }
                return;
            default:
                org.telegram.ui.a51 a51Var = (org.telegram.ui.a51) this.f33649f;
                a51Var.D.e();
                ai aiVar = (ai) this.f33646b;
                ((ArrayList) aiVar.f31850c).remove(a51Var);
                aiVar.a();
                ((ViewGroup) aiVar.d).invalidate();
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f33647c;
                q1Var.setEnterTransitionInProgress(false);
                q1Var.getTransitionParams().E0.set(q1Var.getBackgroundDrawableLeft(), q1Var.getBackgroundDrawableTop(), q1Var.getBackgroundDrawableRight(), q1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.wm wmVar = (org.telegram.ui.wm) this.f33648e;
                ((yn[]) wmVar.f51266c0.f852b)[0].f40788c.setAlpha(1.0f);
                ((yn[]) wmVar.f51266c0.f852b)[0].d.setAlpha(1.0f);
                p5.release((View) null, a51Var.H);
                return;
        }
    }

    public f10(j10 j10Var, ai.o2 o2Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.x7 x7Var) {
        this.f33646b = j10Var;
        this.f33647c = o2Var;
        this.d = frameLayout;
        this.f33649f = windowManager;
        this.f33648e = x7Var;
    }
}
