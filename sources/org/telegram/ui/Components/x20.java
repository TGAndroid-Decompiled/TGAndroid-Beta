package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.db1;
public final class x20 extends AnimatorListenerAdapter {
    public final int f32804a = 0;
    public final View f32805b;
    public final View f32806c;
    public final View d;
    public final Object f32807e;
    public final Object f32808f;

    public x20(db1 db1Var, wi wiVar, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.jk jkVar, org.telegram.ui.yn ynVar) {
        this.f32808f = db1Var;
        this.f32805b = wiVar;
        this.f32806c = u1Var;
        this.d = jkVar;
        this.f32807e = ynVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32804a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f32808f;
                View view = this.f32805b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.f32806c;
                    view2.setVisibility(8);
                    View view3 = this.d;
                    view3.setVisibility(8);
                    windowManager.removeView(view);
                    windowManager.removeView(view2);
                    windowManager.removeView(view3);
                    windowManager.removeView((View) this.f32807e);
                    return;
                }
                return;
            default:
                db1 db1Var = (db1) this.f32808f;
                db1Var.D.unlock();
                wi wiVar = (wi) this.f32805b;
                ((ArrayList) wiVar.f32649c).remove(db1Var);
                wiVar.a();
                ((ViewGroup) wiVar.d).invalidate();
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f32806c;
                u1Var.setEnterTransitionInProgress(false);
                u1Var.getTransitionParams().D0.set(u1Var.getBackgroundDrawableLeft(), u1Var.getBackgroundDrawableTop(), u1Var.getBackgroundDrawableRight(), u1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.yn ynVar = (org.telegram.ui.yn) this.f32807e;
                ((to[]) ynVar.Y.f935b)[0].f31197c.setAlpha(1.0f);
                ((to[]) ynVar.Y.f935b)[0].d.setAlpha(1.0f);
                z5.release((View) null, db1Var.H);
                return;
        }
    }

    public x20(b30 b30Var, ai.f0 f0Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.x7 x7Var) {
        this.f32805b = b30Var;
        this.f32806c = f0Var;
        this.d = frameLayout;
        this.f32808f = windowManager;
        this.f32807e = x7Var;
    }
}
