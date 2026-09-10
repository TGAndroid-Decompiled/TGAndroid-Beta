package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.pb1;
public final class d30 extends AnimatorListenerAdapter {
    public final int f22279a = 0;
    public final View f22280b;
    public final View f22281c;
    public final View d;
    public final Object e;
    public final Object f22282f;

    public d30(pb1 pb1Var, xi xiVar, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.ok okVar, org.telegram.ui.eo eoVar) {
        this.f22282f = pb1Var;
        this.f22280b = xiVar;
        this.f22281c = t1Var;
        this.d = okVar;
        this.e = eoVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22279a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f22282f;
                View view = this.f22280b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f22281c;
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
                pb1 pb1Var = (pb1) this.f22282f;
                pb1Var.D.unlock();
                xi xiVar = (xi) this.f22280b;
                ((ArrayList) xiVar.f29049c).remove(pb1Var);
                xiVar.a();
                ((ViewGroup) xiVar.d).invalidate();
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f22281c;
                t1Var.setEnterTransitionInProgress(false);
                t1Var.getTransitionParams().D0.set(t1Var.getBackgroundDrawableLeft(), t1Var.getBackgroundDrawableTop(), t1Var.getBackgroundDrawableRight(), t1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.eo eoVar = (org.telegram.ui.eo) this.e;
                ((vo[]) eoVar.f32255a0.f3058b)[0].f28035c.setAlpha(1.0f);
                ((vo[]) eoVar.f32255a0.f3058b)[0].d.setAlpha(1.0f);
                y5.release((View) null, pb1Var.H);
                return;
        }
    }

    public d30(h30 h30Var, bi.ld ldVar, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.t7 t7Var) {
        this.f22280b = h30Var;
        this.f22281c = ldVar;
        this.d = frameLayout;
        this.f22282f = windowManager;
        this.e = t7Var;
    }
}
