package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
import android.view.View;
import java.util.Iterator;

public final class h extends AnimatorListenerAdapter {

    public final int f23451a;

    public final Object f23452b;

    public h(Object obj, int i10) {
        this.f23451a = i10;
        this.f23452b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23451a) {
            case 0:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f23452b).view.setLayerType(0, null);
                break;
            case 1:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f23452b;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f22696n = false;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i10);
                    if (!(childAt instanceof k1)) {
                        childAt.setTranslationY(0.0f);
                        childAt.setAlpha(childAt.isEnabled() ? 1.0f : 0.5f);
                    }
                }
                break;
            case 2:
                p1 p1Var = (p1) this.f23452b;
                if (!p1Var.f23710e) {
                    p1Var.j();
                }
                break;
            case 3:
                m3 m3Var = (m3) this.f23452b;
                if (m3Var.B == animator) {
                    m3Var.C = m3Var.D;
                    Iterator it = m3Var.E.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                break;
            default:
                v3 v3Var = (v3) this.f23452b;
                m3 m3Var2 = v3Var.f23883a;
                if (m3Var2 != null) {
                    m3Var2.f23658b = true;
                    m3Var2.invalidate();
                }
                v3Var.R = v3Var.Q ? 1.0f : 0.0f;
                v3Var.invalidate();
                if (!v3Var.Q) {
                    v3Var.N.clear();
                }
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f23451a) {
            case 0:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f23452b).view.setLayerType(2, null);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
