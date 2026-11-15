package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class m10 extends AnimatorListenerAdapter {
    public final int f37026a = 0;
    public final View f37027b;
    public final View f37028c;
    public final View d;
    public final Object f37029e;
    public final Object f37030f;

    public m10(org.telegram.ui.i51 i51Var, ji jiVar, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.qj qjVar, org.telegram.ui.an anVar) {
        this.f37030f = i51Var;
        this.f37027b = jiVar;
        this.f37028c = q1Var;
        this.d = qjVar;
        this.f37029e = anVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37026a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f37030f;
                View view = this.f37027b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f37028c;
                    view2.setVisibility(8);
                    View view3 = this.d;
                    view3.setVisibility(8);
                    windowManager.removeView(view);
                    windowManager.removeView(view2);
                    windowManager.removeView(view3);
                    windowManager.removeView((View) this.f37029e);
                    return;
                }
                return;
            default:
                org.telegram.ui.i51 i51Var = (org.telegram.ui.i51) this.f37030f;
                i51Var.D.e();
                ji jiVar = (ji) this.f37027b;
                ((ArrayList) jiVar.f36007c).remove(i51Var);
                jiVar.a();
                ((ViewGroup) jiVar.d).invalidate();
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f37028c;
                q1Var.setEnterTransitionInProgress(false);
                q1Var.getTransitionParams().E0.set(q1Var.getBackgroundDrawableLeft(), q1Var.getBackgroundDrawableTop(), q1Var.getBackgroundDrawableRight(), q1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.an anVar = (org.telegram.ui.an) this.f37029e;
                ((jo[]) anVar.f45146c0.f3548b)[0].f36114c.setAlpha(1.0f);
                ((jo[]) anVar.f45146c0.f3548b)[0].d.setAlpha(1.0f);
                p5.release((View) null, i51Var.H);
                return;
        }
    }

    public m10(q10 q10Var, bi.g2 g2Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.x7 x7Var) {
        this.f37027b = q10Var;
        this.f37028c = g2Var;
        this.d = frameLayout;
        this.f37030f = windowManager;
        this.f37029e = x7Var;
    }
}
