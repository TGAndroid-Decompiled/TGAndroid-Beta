package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
import android.view.View;
import java.util.Iterator;
public final class h extends AnimatorListenerAdapter {
    public final int f21401a;
    public final Object f21402b;

    public h(Object obj, int i10) {
        this.f21401a = i10;
        this.f21402b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        switch (this.f21401a) {
            case 0:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f21402b).view.setLayerType(0, null);
                return;
            case 1:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f21402b;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f21160n = false;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i10);
                    if (!(childAt instanceof m1)) {
                        childAt.setTranslationY(0.0f);
                        if (childAt.isEnabled()) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.5f;
                        }
                        childAt.setAlpha(f10);
                    }
                }
                return;
            case 2:
                r1 r1Var = (r1) this.f21402b;
                if (!r1Var.f22253e) {
                    r1Var.j();
                    return;
                }
                return;
            case 3:
                o3 o3Var = (o3) this.f21402b;
                if (o3Var.C == animator) {
                    o3Var.D = o3Var.E;
                    Iterator it = o3Var.F.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                return;
            default:
                x3 x3Var = (x3) this.f21402b;
                o3 o3Var2 = x3Var.f22405a;
                if (o3Var2 != null) {
                    o3Var2.f22193b = true;
                    o3Var2.invalidate();
                }
                if (x3Var.R) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                x3Var.S = f11;
                x3Var.invalidate();
                if (!x3Var.R) {
                    x3Var.O.clear();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21401a) {
            case 0:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f21402b).view.setLayerType(2, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
