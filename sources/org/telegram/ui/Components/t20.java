package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.jb1;
public final class t20 extends AnimatorListenerAdapter {
    public final int f28286a = 0;
    public final View f28287b;
    public final View f28288c;
    public final View d;
    public final Object e;
    public final Object f28289f;

    public t20(jb1 jb1Var, ui uiVar, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.lk lkVar, org.telegram.ui.zn znVar) {
        this.f28289f = jb1Var;
        this.f28287b = uiVar;
        this.f28288c = u1Var;
        this.d = lkVar;
        this.e = znVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28286a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f28289f;
                View view = this.f28287b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f28288c;
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
                jb1 jb1Var = (jb1) this.f28289f;
                jb1Var.D.unlock();
                ui uiVar = (ui) this.f28287b;
                ((ArrayList) uiVar.f28713c).remove(jb1Var);
                uiVar.a();
                ((ViewGroup) uiVar.d).invalidate();
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f28288c;
                u1Var.setEnterTransitionInProgress(false);
                u1Var.getTransitionParams().D0.set(u1Var.getBackgroundDrawableLeft(), u1Var.getBackgroundDrawableTop(), u1Var.getBackgroundDrawableRight(), u1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.e;
                ((qo[]) znVar.f40200a0.f785b)[0].f27699c.setAlpha(1.0f);
                ((qo[]) znVar.f40200a0.f785b)[0].d.setAlpha(1.0f);
                z5.release((View) null, jb1Var.H);
                return;
        }
    }

    public t20(x20 x20Var, ai.f0 f0Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.v7 v7Var) {
        this.f28287b = x20Var;
        this.f28288c = f0Var;
        this.d = frameLayout;
        this.f28289f = windowManager;
        this.e = v7Var;
    }
}
