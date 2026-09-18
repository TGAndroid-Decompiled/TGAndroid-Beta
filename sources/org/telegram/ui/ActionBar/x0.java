package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class x0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f19673a;
    public final Object f19674b;

    public x0(Object obj, int i10) {
        this.f19673a = i10;
        this.f19674b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19673a) {
            case 0:
                d1 d1Var = (d1) this.f19674b;
                d1Var.getClass();
                d1Var.f18557a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1Var.invalidate();
                return;
            case 1:
                g1 g1Var = (g1) this.f19674b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g1Var.setTextColor(i0.a.d(floatValue, -1, -9194260));
                g1Var.setIconColor(i0.a.d(floatValue, -1, -9194260));
                return;
            case 2:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f19674b;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                    if (!(childAt instanceof l1)) {
                        float cascade = AndroidUtilities.cascade(floatValue2, actionBarPopupWindow$ActionBarPopupWindowLayout.v ? (itemsCount - 1) - i10 : i10, itemsCount, 4.0f);
                        float f7 = 1.0f;
                        childAt.setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-6.0f));
                        if (!childAt.isEnabled()) {
                            f7 = 0.5f;
                        }
                        childAt.setAlpha(cascade * f7);
                    }
                }
                return;
            case 3:
                q1 q1Var = (q1) this.f19674b;
                if (!q1Var.e) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (q1Var.f19523r) {
                        floatValue3 = 1.0f - floatValue3;
                    }
                    float z10 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, floatValue3, q1Var.f19522q, q1Var.f19521p * floatValue3);
                    if (!(q1Var instanceof zg.n)) {
                        q1Var.f19509a.setTranslationY(z10);
                    }
                    q1Var.e(-z10, floatValue3, q1Var.f19524s);
                    return;
                }
                return;
            case 4:
                p3 p3Var = (p3) this.f19674b;
                p3Var.getClass();
                p3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = p3Var.I.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                p3Var.invalidate();
                return;
            default:
                x3 x3Var = (x3) this.f19674b;
                x3Var.f19682i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3 y3Var = x3Var.f19678b;
                if (y3Var != null) {
                    y3Var.invalidate();
                    return;
                }
                return;
        }
    }
}
