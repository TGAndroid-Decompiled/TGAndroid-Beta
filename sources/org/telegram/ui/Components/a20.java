package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class a20 extends AnimatorListenerAdapter {
    public final int f24271a = 0;
    public final View f24272b;
    public final View f24273c;
    public final View d;
    public final Object e;
    public final Object f24274f;

    public a20(org.telegram.ui.b71 b71Var, ih.e eVar, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.mk mkVar, org.telegram.ui.un unVar) {
        this.f24274f = b71Var;
        this.f24272b = eVar;
        this.f24273c = q1Var;
        this.d = mkVar;
        this.e = unVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24271a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f24274f;
                View view = this.f24272b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f24273c;
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
                org.telegram.ui.b71 b71Var = (org.telegram.ui.b71) this.f24274f;
                b71Var.D.e();
                ih.e eVar = (ih.e) this.f24272b;
                ((ArrayList) eVar.f8536c).remove(b71Var);
                eVar.a();
                ((ViewGroup) eVar.d).invalidate();
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f24273c;
                q1Var.setEnterTransitionInProgress(false);
                q1Var.getTransitionParams().E0.set(q1Var.getBackgroundDrawableLeft(), q1Var.getBackgroundDrawableTop(), q1Var.getBackgroundDrawableRight(), q1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.un unVar = (org.telegram.ui.un) this.e;
                ((io[]) unVar.f42003b0.f10085b)[0].f27131c.setAlpha(1.0f);
                ((io[]) unVar.f42003b0.f10085b)[0].d.setAlpha(1.0f);
                o5.release((View) null, b71Var.H);
                return;
        }
    }

    public a20(e20 e20Var, jg.l0 l0Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.w7 w7Var) {
        this.f24272b = e20Var;
        this.f24273c = l0Var;
        this.d = frameLayout;
        this.f24274f = windowManager;
        this.e = w7Var;
    }
}
