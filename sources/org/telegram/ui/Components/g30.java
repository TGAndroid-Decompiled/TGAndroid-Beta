package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.rb1;
public final class g30 extends AnimatorListenerAdapter {
    public final int f25171a = 0;
    public final View f25172b;
    public final View f25173c;
    public final View d;
    public final Object e;
    public final Object f25174f;

    public g30(rb1 rb1Var, ui uiVar, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.sk skVar, org.telegram.ui.fo foVar) {
        this.f25174f = rb1Var;
        this.f25172b = uiVar;
        this.f25173c = u1Var;
        this.d = skVar;
        this.e = foVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25171a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f25174f;
                View view = this.f25172b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f25173c;
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
                rb1 rb1Var = (rb1) this.f25174f;
                rb1Var.D.unlock();
                ui uiVar = (ui) this.f25172b;
                ((ArrayList) uiVar.f29691c).remove(rb1Var);
                uiVar.a();
                ((ViewGroup) uiVar.d).invalidate();
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f25173c;
                u1Var.setEnterTransitionInProgress(false);
                u1Var.getTransitionParams().D0.set(u1Var.getBackgroundDrawableLeft(), u1Var.getBackgroundDrawableTop(), u1Var.getBackgroundDrawableRight(), u1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.fo foVar = (org.telegram.ui.fo) this.e;
                ((dp[]) foVar.f35871a0.f895b)[0].f24463c.setAlpha(1.0f);
                ((dp[]) foVar.f35871a0.f895b)[0].d.setAlpha(1.0f);
                b6.release((View) null, rb1Var.H);
                return;
        }
    }

    public g30(k30 k30Var, ah.x xVar, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.y7 y7Var) {
        this.f25172b = k30Var;
        this.f25173c = xVar;
        this.d = frameLayout;
        this.f25174f = windowManager;
        this.e = y7Var;
    }
}
