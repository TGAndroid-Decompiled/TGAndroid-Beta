package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
import android.view.View;
import java.util.Iterator;
public final class i extends AnimatorListenerAdapter {
    public final int f23515a;
    public final Object f23516b;

    public i(Object obj, int i10) {
        this.f23515a = i10;
        this.f23516b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f9;
        float f10;
        switch (this.f23515a) {
            case 0:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f23516b).view.setLayerType(0, null);
                return;
            case 1:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f23516b;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f22708n = false;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i10);
                    if (!(childAt instanceof l1)) {
                        childAt.setTranslationY(0.0f);
                        if (childAt.isEnabled()) {
                            f9 = 1.0f;
                        } else {
                            f9 = 0.5f;
                        }
                        childAt.setAlpha(f9);
                    }
                }
                return;
            case 2:
                q1 q1Var = (q1) this.f23516b;
                if (!q1Var.f23739e) {
                    q1Var.j();
                    return;
                }
                return;
            case 3:
                m3 m3Var = (m3) this.f23516b;
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
                v3 v3Var = (v3) this.f23516b;
                m3 m3Var2 = v3Var.f23873a;
                if (m3Var2 != null) {
                    m3Var2.f23678b = true;
                    m3Var2.invalidate();
                }
                if (v3Var.Q) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                v3Var.R = f10;
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
        switch (this.f23515a) {
            case 0:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f23516b).view.setLayerType(2, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
