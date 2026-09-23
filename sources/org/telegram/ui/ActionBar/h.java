package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
import android.view.View;
import java.util.Iterator;
public final class h extends AnimatorListenerAdapter {
    public final int f18702a;
    public final Object f18703b;

    public h(Object obj, int i10) {
        this.f18702a = i10;
        this.f18703b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        switch (this.f18702a) {
            case 0:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f18703b).view.setLayerType(0, null);
                return;
            case 1:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f18703b;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f18403n = false;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                    if (!(childAt instanceof k1)) {
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
                p1 p1Var = (p1) this.f18703b;
                if (!p1Var.e) {
                    p1Var.j();
                    return;
                }
                return;
            case 3:
                n3 n3Var = (n3) this.f18703b;
                if (n3Var.F == animator) {
                    n3Var.G = n3Var.H;
                    Iterator it = n3Var.I.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                return;
            default:
                w3 w3Var = (w3) this.f18703b;
                n3 n3Var2 = w3Var.f19626a;
                if (n3Var2 != null) {
                    n3Var2.f19413b = true;
                    n3Var2.invalidate();
                }
                if (w3Var.U) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w3Var.V = f10;
                w3Var.invalidate();
                if (!w3Var.U) {
                    w3Var.R.clear();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f18702a) {
            case 0:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f18703b).view.setLayerType(2, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
