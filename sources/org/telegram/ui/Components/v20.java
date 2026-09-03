package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ya1;
public final class v20 extends AnimatorListenerAdapter {
    public final int f29352a = 0;
    public final View f29353b;
    public final View f29354c;
    public final View d;
    public final Object e;
    public final Object f29355f;

    public v20(ya1 ya1Var, ki kiVar, org.telegram.ui.Cells.s1 s1Var, org.telegram.ui.lk lkVar, org.telegram.ui.zn znVar) {
        this.f29355f = ya1Var;
        this.f29353b = kiVar;
        this.f29354c = s1Var;
        this.d = lkVar;
        this.e = znVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29352a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f29355f;
                View view = this.f29353b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f29354c;
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
                ya1 ya1Var = (ya1) this.f29355f;
                ya1Var.D.unlock();
                ki kiVar = (ki) this.f29353b;
                ((ArrayList) kiVar.f26297c).remove(ya1Var);
                kiVar.a();
                ((ViewGroup) kiVar.d).invalidate();
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f29354c;
                s1Var.setEnterTransitionInProgress(false);
                s1Var.getTransitionParams().D0.set(s1Var.getBackgroundDrawableLeft(), s1Var.getBackgroundDrawableTop(), s1Var.getBackgroundDrawableRight(), s1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.e;
                ((lo[]) znVar.X.f4817b)[0].f26807c.setAlpha(1.0f);
                ((lo[]) znVar.X.f4817b)[0].d.setAlpha(1.0f);
                u5.release((View) null, ya1Var.H);
                return;
        }
    }

    public v20(z20 z20Var, dg.u2 u2Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.y7 y7Var) {
        this.f29353b = z20Var;
        this.f29354c = u2Var;
        this.d = frameLayout;
        this.f29355f = windowManager;
        this.e = y7Var;
    }
}
