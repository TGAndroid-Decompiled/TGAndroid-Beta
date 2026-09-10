package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
import android.view.View;
import java.util.Iterator;
public final class h extends AnimatorListenerAdapter {
    public final int f17752a;
    public final Object f17753b;

    public h(Object obj, int i10) {
        this.f17752a = i10;
        this.f17753b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        switch (this.f17752a) {
            case 0:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f17753b).view.setLayerType(0, null);
                return;
            case 1:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f17753b;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f17522n = false;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                    if (!(childAt instanceof m1)) {
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
                r1 r1Var = (r1) this.f17753b;
                if (!r1Var.e) {
                    r1Var.j();
                    return;
                }
                return;
            case 3:
                q3 q3Var = (q3) this.f17753b;
                if (q3Var.F == animator) {
                    q3Var.G = q3Var.H;
                    Iterator it = q3Var.I.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                return;
            default:
                z3 z3Var = (z3) this.f17753b;
                q3 q3Var2 = z3Var.f18801a;
                if (q3Var2 != null) {
                    q3Var2.f18575b = true;
                    q3Var2.invalidate();
                }
                if (z3Var.U) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                z3Var.V = f10;
                z3Var.invalidate();
                if (!z3Var.U) {
                    z3Var.R.clear();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f17752a) {
            case 0:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f17753b).view.setLayerType(2, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
