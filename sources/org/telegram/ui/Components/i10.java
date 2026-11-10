package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class i10 extends AnimatorListenerAdapter {
    public final int f34502a = 0;
    public final View f34503b;
    public final View f34504c;
    public final View d;
    public final Object f34505e;
    public final Object f34506f;

    public i10(org.telegram.ui.n51 n51Var, bi biVar, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.sj sjVar, org.telegram.ui.cn cnVar) {
        this.f34506f = n51Var;
        this.f34503b = biVar;
        this.f34504c = q1Var;
        this.d = sjVar;
        this.f34505e = cnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34502a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f34506f;
                View view = this.f34503b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f34504c;
                    view2.setVisibility(8);
                    View view3 = this.d;
                    view3.setVisibility(8);
                    windowManager.removeView(view);
                    windowManager.removeView(view2);
                    windowManager.removeView(view3);
                    windowManager.removeView((View) this.f34505e);
                    return;
                }
                return;
            default:
                org.telegram.ui.n51 n51Var = (org.telegram.ui.n51) this.f34506f;
                n51Var.D.e();
                bi biVar = (bi) this.f34503b;
                ((ArrayList) biVar.f32272c).remove(n51Var);
                biVar.a();
                ((ViewGroup) biVar.d).invalidate();
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f34504c;
                q1Var.setEnterTransitionInProgress(false);
                q1Var.getTransitionParams().E0.set(q1Var.getBackgroundDrawableLeft(), q1Var.getBackgroundDrawableTop(), q1Var.getBackgroundDrawableRight(), q1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.cn cnVar = (org.telegram.ui.cn) this.f34505e;
                ((yn[]) cnVar.f44433b0.f3758b)[0].f40621c.setAlpha(1.0f);
                ((yn[]) cnVar.f44433b0.f3758b)[0].d.setAlpha(1.0f);
                q5.release((View) null, n51Var.H);
                return;
        }
    }

    public i10(m10 m10Var, bi.e5 e5Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.w7 w7Var) {
        this.f34503b = m10Var;
        this.f34504c = e5Var;
        this.d = frameLayout;
        this.f34506f = windowManager;
        this.f34505e = w7Var;
    }
}
