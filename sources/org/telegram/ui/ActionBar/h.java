package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
import android.view.View;
import java.util.Iterator;
public final class h extends AnimatorListenerAdapter {
    public final int f20474a;
    public final Object f20475b;

    public h(Object obj, int i10) {
        this.f20474a = i10;
        this.f20475b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        switch (this.f20474a) {
            case 0:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f20475b).view.setLayerType(0, null);
                return;
            case 1:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f20475b;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f20192n = false;
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
                p1 p1Var = (p1) this.f20475b;
                if (!p1Var.f21279e) {
                    p1Var.j();
                    return;
                }
                return;
            case 3:
                o3 o3Var = (o3) this.f20475b;
                if (o3Var.F == animator) {
                    o3Var.G = o3Var.H;
                    Iterator it = o3Var.I.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                return;
            default:
                x3 x3Var = (x3) this.f20475b;
                o3 o3Var2 = x3Var.f21483a;
                if (o3Var2 != null) {
                    o3Var2.f21254b = true;
                    o3Var2.invalidate();
                }
                if (x3Var.U) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                x3Var.V = f10;
                x3Var.invalidate();
                if (!x3Var.U) {
                    x3Var.R.clear();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f20474a) {
            case 0:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f20475b).view.setLayerType(2, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
