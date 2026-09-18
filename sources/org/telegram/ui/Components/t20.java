package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.kb1;
public final class t20 extends AnimatorListenerAdapter {
    public final int f27998a = 0;
    public final View f27999b;
    public final View f28000c;
    public final View d;
    public final Object e;
    public final Object f28001f;

    public t20(kb1 kb1Var, ui uiVar, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.nk nkVar, org.telegram.ui.bo boVar) {
        this.f28001f = kb1Var;
        this.f27999b = uiVar;
        this.f28000c = t1Var;
        this.d = nkVar;
        this.e = boVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27998a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f28001f;
                View view = this.f27999b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f28000c;
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
                kb1 kb1Var = (kb1) this.f28001f;
                kb1Var.D.unlock();
                ui uiVar = (ui) this.f27999b;
                ((ArrayList) uiVar.f28396c).remove(kb1Var);
                uiVar.a();
                ((ViewGroup) uiVar.d).invalidate();
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f28000c;
                t1Var.setEnterTransitionInProgress(false);
                t1Var.getTransitionParams().D0.set(t1Var.getBackgroundDrawableLeft(), t1Var.getBackgroundDrawableTop(), t1Var.getBackgroundDrawableRight(), t1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.bo boVar = (org.telegram.ui.bo) this.e;
                ((qo[]) boVar.f32218a0.f785b)[0].f27365c.setAlpha(1.0f);
                ((qo[]) boVar.f32218a0.f785b)[0].d.setAlpha(1.0f);
                x5.release((View) null, kb1Var.H);
                return;
        }
    }

    public t20(x20 x20Var, ai.f0 f0Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.w7 w7Var) {
        this.f27999b = x20Var;
        this.f28000c = f0Var;
        this.d = frameLayout;
        this.f28001f = windowManager;
        this.e = w7Var;
    }
}
