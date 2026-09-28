package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
import android.view.View;
import java.util.Iterator;
public final class h extends AnimatorListenerAdapter {
    public final int f18952a;
    public final Object f18953b;

    public h(Object obj, int i10) {
        this.f18952a = i10;
        this.f18953b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        switch (this.f18952a) {
            case 0:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f18953b).view.setLayerType(0, null);
                return;
            case 1:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f18953b;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f18655n = false;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                    if (!(childAt instanceof j1)) {
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
                o1 o1Var = (o1) this.f18953b;
                if (!o1Var.e) {
                    o1Var.j();
                    return;
                }
                return;
            case 3:
                m3 m3Var = (m3) this.f18953b;
                if (m3Var.F == animator) {
                    m3Var.G = m3Var.H;
                    Iterator it = m3Var.I.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                return;
            default:
                v3 v3Var = (v3) this.f18953b;
                m3 m3Var2 = v3Var.f19853a;
                if (m3Var2 != null) {
                    m3Var2.f19641b = true;
                    m3Var2.invalidate();
                }
                if (v3Var.U) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                v3Var.V = f10;
                v3Var.invalidate();
                if (!v3Var.U) {
                    v3Var.R.clear();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f18952a) {
            case 0:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f18953b).view.setLayerType(2, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
