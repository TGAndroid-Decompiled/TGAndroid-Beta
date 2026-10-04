package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.fb1;
public final class x20 extends AnimatorListenerAdapter {
    public final int f32708a = 0;
    public final View f32709b;
    public final View f32710c;
    public final View d;
    public final Object f32711e;
    public final Object f32712f;

    public x20(fb1 fb1Var, wi wiVar, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.jk jkVar, org.telegram.ui.yn ynVar) {
        this.f32712f = fb1Var;
        this.f32709b = wiVar;
        this.f32710c = u1Var;
        this.d = jkVar;
        this.f32711e = ynVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32708a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f32712f;
                View view = this.f32709b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f32710c;
                    view2.setVisibility(8);
                    View view3 = this.d;
                    view3.setVisibility(8);
                    windowManager.removeView(view);
                    windowManager.removeView(view2);
                    windowManager.removeView(view3);
                    windowManager.removeView((View) this.f32711e);
                    return;
                }
                return;
            default:
                fb1 fb1Var = (fb1) this.f32712f;
                fb1Var.D.unlock();
                wi wiVar = (wi) this.f32709b;
                ((ArrayList) wiVar.f32567c).remove(fb1Var);
                wiVar.a();
                ((ViewGroup) wiVar.d).invalidate();
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f32710c;
                u1Var.setEnterTransitionInProgress(false);
                u1Var.getTransitionParams().D0.set(u1Var.getBackgroundDrawableLeft(), u1Var.getBackgroundDrawableTop(), u1Var.getBackgroundDrawableRight(), u1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.yn ynVar = (org.telegram.ui.yn) this.f32711e;
                ((to[]) ynVar.Y.f935b)[0].f31110c.setAlpha(1.0f);
                ((to[]) ynVar.Y.f935b)[0].d.setAlpha(1.0f);
                z5.release((View) null, fb1Var.H);
                return;
        }
    }

    public x20(b30 b30Var, ai.f0 f0Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.x7 x7Var) {
        this.f32709b = b30Var;
        this.f32710c = f0Var;
        this.d = frameLayout;
        this.f32712f = windowManager;
        this.f32711e = x7Var;
    }
}
