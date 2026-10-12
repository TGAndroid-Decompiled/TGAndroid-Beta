package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.nb1;
public final class n30 extends AnimatorListenerAdapter {
    public final int f28709a = 0;
    public final View f28710b;
    public final View f28711c;
    public final View d;
    public final Object f28712e;
    public final Object f28713f;

    public n30(nb1 nb1Var, zi ziVar, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.sk skVar, org.telegram.ui.eo eoVar) {
        this.f28713f = nb1Var;
        this.f28710b = ziVar;
        this.f28711c = u1Var;
        this.d = skVar;
        this.f28712e = eoVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28709a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f28713f;
                View view = this.f28710b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f28711c;
                    view2.setVisibility(8);
                    View view3 = this.d;
                    view3.setVisibility(8);
                    windowManager.removeView(view);
                    windowManager.removeView(view2);
                    windowManager.removeView(view3);
                    windowManager.removeView((View) this.f28712e);
                    return;
                }
                return;
            default:
                nb1 nb1Var = (nb1) this.f28713f;
                nb1Var.D.unlock();
                zi ziVar = (zi) this.f28710b;
                ((ArrayList) ziVar.f33389c).remove(nb1Var);
                ziVar.a();
                ((ViewGroup) ziVar.d).invalidate();
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f28711c;
                u1Var.setEnterTransitionInProgress(false);
                u1Var.getTransitionParams().D0.set(u1Var.getBackgroundDrawableLeft(), u1Var.getBackgroundDrawableTop(), u1Var.getBackgroundDrawableRight(), u1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.eo eoVar = (org.telegram.ui.eo) this.f28712e;
                ((ip[]) eoVar.f37194a0.f931b)[0].f27248c.setAlpha(1.0f);
                ((ip[]) eoVar.f37194a0.f931b)[0].d.setAlpha(1.0f);
                b6.release((View) null, nb1Var.H);
                return;
        }
    }

    public n30(r30 r30Var, ai.f0 f0Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.w7 w7Var) {
        this.f28710b = r30Var;
        this.f28711c = f0Var;
        this.d = frameLayout;
        this.f28713f = windowManager;
        this.f28712e = w7Var;
    }
}
