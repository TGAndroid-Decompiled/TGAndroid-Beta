package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class d30 extends AnimatorListenerAdapter {
    public final int f27367a = 0;
    public final View f27368b;
    public final View f27369c;
    public final View d;
    public final Object e;
    public final Object f27370f;

    public d30(org.telegram.ui.ga1 ga1Var, si siVar, org.telegram.ui.Cells.s1 s1Var, org.telegram.ui.hk hkVar, org.telegram.ui.un unVar) {
        this.f27370f = ga1Var;
        this.f27368b = siVar;
        this.f27369c = s1Var;
        this.d = hkVar;
        this.e = unVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27367a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f27370f;
                View view = this.f27368b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f27369c;
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
                org.telegram.ui.ga1 ga1Var = (org.telegram.ui.ga1) this.f27370f;
                ga1Var.D.unlock();
                si siVar = (si) this.f27368b;
                ((ArrayList) siVar.f32570c).remove(ga1Var);
                siVar.a();
                ((ViewGroup) siVar.d).invalidate();
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f27369c;
                s1Var.setEnterTransitionInProgress(false);
                s1Var.getTransitionParams().D0.set(s1Var.getBackgroundDrawableLeft(), s1Var.getBackgroundDrawableTop(), s1Var.getBackgroundDrawableRight(), s1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.un unVar = (org.telegram.ui.un) this.e;
                ((cp[]) unVar.f44180a0.f4113b)[0].f27229c.setAlpha(1.0f);
                ((cp[]) unVar.f44180a0.f4113b)[0].d.setAlpha(1.0f);
                c6.release((View) null, ga1Var.H);
                return;
        }
    }

    public d30(h30 h30Var, bh.r rVar, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.a8 a8Var) {
        this.f27368b = h30Var;
        this.f27369c = rVar;
        this.d = frameLayout;
        this.f27370f = windowManager;
        this.e = a8Var;
    }
}
