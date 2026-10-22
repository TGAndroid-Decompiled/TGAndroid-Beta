package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.z91;
public final class b30 extends AnimatorListenerAdapter {
    public final int f24792a = 0;
    public final View f24793b;
    public final View f24794c;
    public final View d;
    public final Object e;
    public final Object f24795f;

    public b30(z91 z91Var, si siVar, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.fk fkVar, org.telegram.ui.qn qnVar) {
        this.f24795f = z91Var;
        this.f24793b = siVar;
        this.f24794c = u1Var;
        this.d = fkVar;
        this.e = qnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24792a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f24795f;
                View view = this.f24793b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f24794c;
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
                z91 z91Var = (z91) this.f24795f;
                z91Var.D.unlock();
                si siVar = (si) this.f24793b;
                ((ArrayList) siVar.f30295c).remove(z91Var);
                siVar.a();
                ((ViewGroup) siVar.d).invalidate();
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f24794c;
                u1Var.setEnterTransitionInProgress(false);
                u1Var.getTransitionParams().D0.set(u1Var.getBackgroundDrawableLeft(), u1Var.getBackgroundDrawableTop(), u1Var.getBackgroundDrawableRight(), u1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) this.e;
                ((ap[]) qnVar.f40615a0.f899b)[0].f24692c.setAlpha(1.0f);
                ((ap[]) qnVar.f40615a0.f899b)[0].d.setAlpha(1.0f);
                a6.release((View) null, z91Var.H);
                return;
        }
    }

    public b30(f30 f30Var, ah.x xVar, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.x7 x7Var) {
        this.f24793b = f30Var;
        this.f24794c = xVar;
        this.d = frameLayout;
        this.f24795f = windowManager;
        this.e = x7Var;
    }
}
