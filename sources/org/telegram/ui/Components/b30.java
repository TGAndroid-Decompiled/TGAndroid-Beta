package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class b30 extends AnimatorListenerAdapter {
    public final int f24943a = 0;
    public final View f24944b;
    public final View f24945c;
    public final View d;
    public final Object e;
    public final Object f24946f;

    public b30(org.telegram.ui.ea1 ea1Var, si siVar, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.gk gkVar, org.telegram.ui.sn snVar) {
        this.f24946f = ea1Var;
        this.f24944b = siVar;
        this.f24945c = t1Var;
        this.d = gkVar;
        this.e = snVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24943a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f24946f;
                View view = this.f24944b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f24945c;
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
                org.telegram.ui.ea1 ea1Var = (org.telegram.ui.ea1) this.f24946f;
                ea1Var.D.unlock();
                si siVar = (si) this.f24944b;
                ((ArrayList) siVar.f30498c).remove(ea1Var);
                siVar.a();
                ((ViewGroup) siVar.d).invalidate();
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f24945c;
                t1Var.setEnterTransitionInProgress(false);
                t1Var.getTransitionParams().D0.set(t1Var.getBackgroundDrawableLeft(), t1Var.getBackgroundDrawableTop(), t1Var.getBackgroundDrawableRight(), t1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.sn snVar = (org.telegram.ui.sn) this.e;
                ((ap[]) snVar.f41448a0.f900b)[0].f24795c.setAlpha(1.0f);
                ((ap[]) snVar.f41448a0.f900b)[0].d.setAlpha(1.0f);
                a6.release((View) null, ea1Var.H);
                return;
        }
    }

    public b30(f30 f30Var, ah.x xVar, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.x7 x7Var) {
        this.f24944b = f30Var;
        this.f24945c = xVar;
        this.d = frameLayout;
        this.f24946f = windowManager;
        this.e = x7Var;
    }
}
