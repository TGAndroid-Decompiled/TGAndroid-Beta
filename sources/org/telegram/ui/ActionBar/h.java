package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
import android.view.View;
import java.util.Iterator;
public final class h extends AnimatorListenerAdapter {
    public final int f23442a;
    public final Object f23443b;

    public h(Object obj, int i9) {
        this.f23442a = i9;
        this.f23443b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        switch (this.f23442a) {
            case 0:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f23443b).view.setLayerType(0, null);
                return;
            case 1:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f23443b;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f22696n = false;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i9 = 0; i9 < itemsCount; i9++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i9);
                    if (!(childAt instanceof l1)) {
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
                q1 q1Var = (q1) this.f23443b;
                if (!q1Var.f23717e) {
                    q1Var.j();
                    return;
                }
                return;
            case 3:
                m3 m3Var = (m3) this.f23443b;
                if (m3Var.B == animator) {
                    m3Var.C = m3Var.D;
                    Iterator it = m3Var.E.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                return;
            default:
                v3 v3Var = (v3) this.f23443b;
                m3 m3Var2 = v3Var.f23853a;
                if (m3Var2 != null) {
                    m3Var2.f23658b = true;
                    m3Var2.invalidate();
                }
                if (v3Var.Q) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                v3Var.R = f11;
                v3Var.invalidate();
                if (!v3Var.Q) {
                    v3Var.N.clear();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f23442a) {
            case 0:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f23443b).view.setLayerType(2, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
