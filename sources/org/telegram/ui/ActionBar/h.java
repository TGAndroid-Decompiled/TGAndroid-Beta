package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
import android.view.View;
import java.util.Iterator;
public final class h extends AnimatorListenerAdapter {
    public final int f19739a;
    public final Object f19740b;

    public h(Object obj, int i10) {
        this.f19739a = i10;
        this.f19740b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        switch (this.f19739a) {
            case 0:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f19740b).view.setLayerType(0, null);
                return;
            case 1:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f19740b;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f19497n = false;
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
                r1 r1Var = (r1) this.f19740b;
                if (!r1Var.e) {
                    r1Var.j();
                    return;
                }
                return;
            case 3:
                n3 n3Var = (n3) this.f19740b;
                if (n3Var.C == animator) {
                    n3Var.D = n3Var.E;
                    Iterator it = n3Var.F.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                return;
            default:
                w3 w3Var = (w3) this.f19740b;
                n3 n3Var2 = w3Var.f20679a;
                if (n3Var2 != null) {
                    n3Var2.f20482b = true;
                    n3Var2.invalidate();
                }
                if (w3Var.R) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                w3Var.S = f11;
                w3Var.invalidate();
                if (!w3Var.R) {
                    w3Var.O.clear();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19739a) {
            case 0:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f19740b).view.setLayerType(2, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
