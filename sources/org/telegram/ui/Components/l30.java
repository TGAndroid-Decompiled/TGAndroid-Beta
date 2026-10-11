package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.kb1;
public final class l30 extends AnimatorListenerAdapter {
    public final int f28143a = 0;
    public final View f28144b;
    public final View f28145c;
    public final View d;
    public final Object f28146e;
    public final Object f28147f;

    public l30(kb1 kb1Var, xi xiVar, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.ok okVar, org.telegram.ui.zn znVar) {
        this.f28147f = kb1Var;
        this.f28144b = xiVar;
        this.f28145c = u1Var;
        this.d = okVar;
        this.f28146e = znVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28143a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f28147f;
                View view = this.f28144b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f28145c;
                    view2.setVisibility(8);
                    View view3 = this.d;
                    view3.setVisibility(8);
                    windowManager.removeView(view);
                    windowManager.removeView(view2);
                    windowManager.removeView(view3);
                    windowManager.removeView((View) this.f28146e);
                    return;
                }
                return;
            default:
                kb1 kb1Var = (kb1) this.f28147f;
                kb1Var.D.unlock();
                xi xiVar = (xi) this.f28144b;
                ((ArrayList) xiVar.f32923c).remove(kb1Var);
                xiVar.a();
                ((ViewGroup) xiVar.d).invalidate();
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f28145c;
                u1Var.setEnterTransitionInProgress(false);
                u1Var.getTransitionParams().D0.set(u1Var.getBackgroundDrawableLeft(), u1Var.getBackgroundDrawableTop(), u1Var.getBackgroundDrawableRight(), u1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.f28146e;
                ((gp[]) znVar.f44700a0.f933b)[0].f26790c.setAlpha(1.0f);
                ((gp[]) znVar.f44700a0.f933b)[0].d.setAlpha(1.0f);
                b6.release((View) null, kb1Var.H);
                return;
        }
    }

    public l30(p30 p30Var, ai.f0 f0Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.s7 s7Var) {
        this.f28144b = p30Var;
        this.f28145c = f0Var;
        this.d = frameLayout;
        this.f28147f = windowManager;
        this.f28146e = s7Var;
    }
}
