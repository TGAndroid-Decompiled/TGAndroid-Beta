package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
import android.view.View;
import java.util.Iterator;
public final class h extends AnimatorListenerAdapter {
    public final int f22668a;
    public final Object f22669b;

    public h(Object obj, int i10) {
        this.f22668a = i10;
        this.f22669b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        switch (this.f22668a) {
            case 0:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f22669b).view.setLayerType(0, null);
                return;
            case 1:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f22669b;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f22363n = false;
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
                q1 q1Var = (q1) this.f22669b;
                if (!q1Var.e) {
                    q1Var.j();
                    return;
                }
                return;
            case 3:
                s3 s3Var = (s3) this.f22669b;
                if (s3Var.F == animator) {
                    s3Var.G = s3Var.H;
                    Iterator it = s3Var.I.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                return;
            default:
                b4 b4Var = (b4) this.f22669b;
                s3 s3Var2 = b4Var.f22431a;
                if (s3Var2 != null) {
                    s3Var2.f23074b = true;
                    s3Var2.invalidate();
                }
                if (b4Var.U) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                b4Var.V = f10;
                b4Var.invalidate();
                if (!b4Var.U) {
                    b4Var.R.clear();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f22668a) {
            case 0:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f22669b).view.setLayerType(2, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
