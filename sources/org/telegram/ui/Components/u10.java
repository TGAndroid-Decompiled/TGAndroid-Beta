package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class u10 extends AnimatorListenerAdapter {
    public final int f40218a = 0;
    public final View f40219b;
    public final View f40220c;
    public final View d;
    public final Object f40221e;
    public final Object f40222f;

    public u10(org.telegram.ui.k51 k51Var, si siVar, org.telegram.ui.Cells.r1 r1Var, org.telegram.ui.rj rjVar, org.telegram.ui.bn bnVar) {
        this.f40222f = k51Var;
        this.f40219b = siVar;
        this.f40220c = r1Var;
        this.d = rjVar;
        this.f40221e = bnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40218a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f40222f;
                View view = this.f40219b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f40220c;
                    view2.setVisibility(8);
                    View view3 = this.d;
                    view3.setVisibility(8);
                    windowManager.removeView(view);
                    windowManager.removeView(view2);
                    windowManager.removeView(view3);
                    windowManager.removeView((View) this.f40221e);
                    return;
                }
                return;
            default:
                org.telegram.ui.k51 k51Var = (org.telegram.ui.k51) this.f40222f;
                k51Var.E.e();
                si siVar = (si) this.f40219b;
                ((ArrayList) siVar.f39625c).remove(k51Var);
                siVar.a();
                ((ViewGroup) siVar.d).invalidate();
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f40220c;
                r1Var.setEnterTransitionInProgress(false);
                r1Var.getTransitionParams().E0.set(r1Var.getBackgroundDrawableLeft(), r1Var.getBackgroundDrawableTop(), r1Var.getBackgroundDrawableRight(), r1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.f40221e;
                ((po[]) bnVar.f46147c0.f3604b)[0].f38528c.setAlpha(1.0f);
                ((po[]) bnVar.f46147c0.f3604b)[0].d.setAlpha(1.0f);
                x5.release((View) null, k51Var.I);
                return;
        }
    }

    public u10(y10 y10Var, bi.g3 g3Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.x7 x7Var) {
        this.f40219b = y10Var;
        this.f40220c = g3Var;
        this.d = frameLayout;
        this.f40222f = windowManager;
        this.f40221e = x7Var;
    }
}
