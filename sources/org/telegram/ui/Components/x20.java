package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.cb1;
public final class x20 extends AnimatorListenerAdapter {
    public final int f30108a = 0;
    public final View f30109b;
    public final View f30110c;
    public final View d;
    public final Object e;
    public final Object f30111f;

    public x20(cb1 cb1Var, wi wiVar, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.jk jkVar, org.telegram.ui.wn wnVar) {
        this.f30111f = cb1Var;
        this.f30109b = wiVar;
        this.f30110c = u1Var;
        this.d = jkVar;
        this.e = wnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30108a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f30111f;
                View view = this.f30109b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f30110c;
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
                cb1 cb1Var = (cb1) this.f30111f;
                cb1Var.D.unlock();
                wi wiVar = (wi) this.f30109b;
                ((ArrayList) wiVar.f29966c).remove(cb1Var);
                wiVar.a();
                ((ViewGroup) wiVar.d).invalidate();
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f30110c;
                u1Var.setEnterTransitionInProgress(false);
                u1Var.getTransitionParams().D0.set(u1Var.getBackgroundDrawableLeft(), u1Var.getBackgroundDrawableTop(), u1Var.getBackgroundDrawableRight(), u1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) this.e;
                ((to[]) wnVar.f39501a0.f866b)[0].f28615c.setAlpha(1.0f);
                ((to[]) wnVar.f39501a0.f866b)[0].d.setAlpha(1.0f);
                z5.release((View) null, cb1Var.H);
                return;
        }
    }

    public x20(b30 b30Var, ai.f0 f0Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.u7 u7Var) {
        this.f30109b = b30Var;
        this.f30110c = f0Var;
        this.d = frameLayout;
        this.f30111f = windowManager;
        this.e = u7Var;
    }
}
