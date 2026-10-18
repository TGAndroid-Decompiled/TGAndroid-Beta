package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ba1;
public final class b30 extends AnimatorListenerAdapter {
    public final int f24789a = 0;
    public final View f24790b;
    public final View f24791c;
    public final View d;
    public final Object e;
    public final Object f24792f;

    public b30(ba1 ba1Var, si siVar, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.hk hkVar, org.telegram.ui.sn snVar) {
        this.f24792f = ba1Var;
        this.f24790b = siVar;
        this.f24791c = u1Var;
        this.d = hkVar;
        this.e = snVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24789a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f24792f;
                View view = this.f24790b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f24791c;
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
                ba1 ba1Var = (ba1) this.f24792f;
                ba1Var.D.unlock();
                si siVar = (si) this.f24790b;
                ((ArrayList) siVar.f30286c).remove(ba1Var);
                siVar.a();
                ((ViewGroup) siVar.d).invalidate();
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f24791c;
                u1Var.setEnterTransitionInProgress(false);
                u1Var.getTransitionParams().D0.set(u1Var.getBackgroundDrawableLeft(), u1Var.getBackgroundDrawableTop(), u1Var.getBackgroundDrawableRight(), u1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.sn snVar = (org.telegram.ui.sn) this.e;
                ((ap[]) snVar.f41165a0.f901b)[0].f24693c.setAlpha(1.0f);
                ((ap[]) snVar.f41165a0.f901b)[0].d.setAlpha(1.0f);
                a6.release((View) null, ba1Var.H);
                return;
        }
    }

    public b30(f30 f30Var, ah.x xVar, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.x7 x7Var) {
        this.f24790b = f30Var;
        this.f24791c = xVar;
        this.d = frameLayout;
        this.f24792f = windowManager;
        this.e = x7Var;
    }
}
