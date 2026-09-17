package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
import android.view.View;
import java.util.Iterator;
public final class h extends AnimatorListenerAdapter {
    public final int f18699a;
    public final Object f18700b;

    public h(Object obj, int i10) {
        this.f18699a = i10;
        this.f18700b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        switch (this.f18699a) {
            case 0:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f18700b).view.setLayerType(0, null);
                return;
            case 1:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f18700b;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f18440n = false;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                    if (!(childAt instanceof l1)) {
                        childAt.setTranslationY(0.0f);
                        if (childAt.isEnabled()) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.5f;
                        }
                        childAt.setAlpha(f7);
                    }
                }
                return;
            case 2:
                q1 q1Var = (q1) this.f18700b;
                if (!q1Var.e) {
                    q1Var.j();
                    return;
                }
                return;
            case 3:
                p3 p3Var = (p3) this.f18700b;
                if (p3Var.F == animator) {
                    p3Var.G = p3Var.H;
                    Iterator it = p3Var.I.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                return;
            default:
                y3 y3Var = (y3) this.f18700b;
                p3 p3Var2 = y3Var.f19704a;
                if (p3Var2 != null) {
                    p3Var2.f19488b = true;
                    p3Var2.invalidate();
                }
                if (y3Var.U) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                y3Var.V = f10;
                y3Var.invalidate();
                if (!y3Var.U) {
                    y3Var.R.clear();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f18699a) {
            case 0:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f18700b).view.setLayerType(2, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
