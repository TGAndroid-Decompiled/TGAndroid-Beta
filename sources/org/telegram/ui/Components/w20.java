package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.cb1;
public final class w20 extends AnimatorListenerAdapter {
    public final int f29797a = 0;
    public final View f29798b;
    public final View f29799c;
    public final View d;
    public final Object e;
    public final Object f29800f;

    public w20(cb1 cb1Var, vi viVar, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.jk jkVar, org.telegram.ui.wn wnVar) {
        this.f29800f = cb1Var;
        this.f29798b = viVar;
        this.f29799c = u1Var;
        this.d = jkVar;
        this.e = wnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29797a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f29800f;
                View view = this.f29798b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f29799c;
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
                cb1 cb1Var = (cb1) this.f29800f;
                cb1Var.D.unlock();
                vi viVar = (vi) this.f29798b;
                ((ArrayList) viVar.f29117c).remove(cb1Var);
                viVar.a();
                ((ViewGroup) viVar.d).invalidate();
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f29799c;
                u1Var.setEnterTransitionInProgress(false);
                u1Var.getTransitionParams().D0.set(u1Var.getBackgroundDrawableLeft(), u1Var.getBackgroundDrawableTop(), u1Var.getBackgroundDrawableRight(), u1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) this.e;
                ((so[]) wnVar.f39409a0.f866b)[0].f28328c.setAlpha(1.0f);
                ((so[]) wnVar.f39409a0.f866b)[0].d.setAlpha(1.0f);
                z5.release((View) null, cb1Var.H);
                return;
        }
    }

    public w20(a30 a30Var, ai.f0 f0Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.u7 u7Var) {
        this.f29798b = a30Var;
        this.f29799c = f0Var;
        this.d = frameLayout;
        this.f29800f = windowManager;
        this.e = u7Var;
    }
}
