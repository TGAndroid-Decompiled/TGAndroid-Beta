package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ca1;
public final class d20 extends AnimatorListenerAdapter {
    public final int f27636a = 0;
    public final View f27637b;
    public final View f27638c;
    public final View d;
    public final Object f27639e;
    public final Object f27640f;

    public d20(ca1 ca1Var, ji jiVar, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.ak akVar, org.telegram.ui.qn qnVar) {
        this.f27640f = ca1Var;
        this.f27637b = jiVar;
        this.f27638c = t1Var;
        this.d = akVar;
        this.f27639e = qnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27636a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f27640f;
                View view = this.f27637b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f27638c;
                    view2.setVisibility(8);
                    View view3 = this.d;
                    view3.setVisibility(8);
                    windowManager.removeView(view);
                    windowManager.removeView(view2);
                    windowManager.removeView(view3);
                    windowManager.removeView((View) this.f27639e);
                    return;
                }
                return;
            default:
                ca1 ca1Var = (ca1) this.f27640f;
                ca1Var.D.unlock();
                ji jiVar = (ji) this.f27637b;
                ((ArrayList) jiVar.f29744c).remove(ca1Var);
                jiVar.a();
                ((ViewGroup) jiVar.d).invalidate();
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f27638c;
                t1Var.setEnterTransitionInProgress(false);
                t1Var.getTransitionParams().D0.set(t1Var.getBackgroundDrawableLeft(), t1Var.getBackgroundDrawableTop(), t1Var.getBackgroundDrawableRight(), t1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) this.f27639e;
                ((go[]) qnVar.W.f6412b)[0].f28823c.setAlpha(1.0f);
                ((go[]) qnVar.W.f6412b)[0].d.setAlpha(1.0f);
                t5.release((View) null, ca1Var.H);
                return;
        }
    }

    public d20(h20 h20Var, fh.d2 d2Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.t7 t7Var) {
        this.f27637b = h20Var;
        this.f27638c = d2Var;
        this.d = frameLayout;
        this.f27640f = windowManager;
        this.f27639e = t7Var;
    }
}
