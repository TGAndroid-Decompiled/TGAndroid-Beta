package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class x0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23958a;
    public final Object f23959b;

    public x0(Object obj, int i10) {
        this.f23958a = i10;
        this.f23959b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23958a) {
            case 0:
                d1 d1Var = (d1) this.f23959b;
                d1Var.getClass();
                d1Var.f22835a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1Var.invalidate();
                return;
            case 1:
                g1 g1Var = (g1) this.f23959b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g1Var.setTextColor(i0.a.d(floatValue, -1, -9194260));
                g1Var.setIconColor(i0.a.d(floatValue, -1, -9194260));
                return;
            case 2:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f23959b;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i10);
                    if (!(childAt instanceof l1)) {
                        float cascade = AndroidUtilities.cascade(floatValue2, actionBarPopupWindow$ActionBarPopupWindowLayout.v ? (itemsCount - 1) - i10 : i10, itemsCount, 4.0f);
                        float f9 = 1.0f;
                        childAt.setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-6.0f));
                        if (!childAt.isEnabled()) {
                            f9 = 0.5f;
                        }
                        childAt.setAlpha(cascade * f9);
                    }
                }
                return;
            case 3:
                q1 q1Var = (q1) this.f23959b;
                if (!q1Var.f23739e) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (q1Var.f23751r) {
                        floatValue3 = 1.0f - floatValue3;
                    }
                    float z10 = (int) com.google.android.recaptcha.internal.a.z(1.0f, floatValue3, q1Var.f23750q, q1Var.f23749p * floatValue3);
                    if (!(q1Var instanceof kg.o)) {
                        q1Var.f23736a.setTranslationY(z10);
                    }
                    q1Var.e(-z10, floatValue3, q1Var.f23752s);
                    return;
                }
                return;
            case 4:
                m3 m3Var = (m3) this.f23959b;
                m3Var.getClass();
                m3Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = m3Var.E.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                m3Var.invalidate();
                return;
            default:
                u3 u3Var = (u3) this.f23959b;
                u3Var.f23840i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3 v3Var = u3Var.f23835b;
                if (v3Var != null) {
                    v3Var.invalidate();
                    return;
                }
                return;
        }
    }
}
