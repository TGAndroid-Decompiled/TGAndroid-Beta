package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class x0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f20698a;
    public final Object f20699b;

    public x0(Object obj, int i10) {
        this.f20698a = i10;
        this.f20699b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f20698a) {
            case 0:
                d1 d1Var = (d1) this.f20699b;
                d1Var.getClass();
                d1Var.f19548a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1Var.invalidate();
                return;
            case 1:
                g1 g1Var = (g1) this.f20699b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g1Var.setTextColor(i0.a.d(floatValue, -1, -9194260));
                g1Var.setIconColor(i0.a.d(floatValue, -1, -9194260));
                return;
            case 2:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f20699b;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i10);
                    if (!(childAt instanceof m1)) {
                        float cascade = AndroidUtilities.cascade(floatValue2, actionBarPopupWindow$ActionBarPopupWindowLayout.v ? (itemsCount - 1) - i10 : i10, itemsCount, 4.0f);
                        float f10 = 1.0f;
                        childAt.setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-6.0f));
                        if (!childAt.isEnabled()) {
                            f10 = 0.5f;
                        }
                        childAt.setAlpha(cascade * f10);
                    }
                }
                return;
            case 3:
                r1 r1Var = (r1) this.f20699b;
                if (!r1Var.e) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (r1Var.f20533r) {
                        floatValue3 = 1.0f - floatValue3;
                    }
                    float w10 = (int) e2.c.w(1.0f, floatValue3, r1Var.f20532q, r1Var.f20531p * floatValue3);
                    if (!(r1Var instanceof mg.o)) {
                        r1Var.f20519a.setTranslationY(w10);
                    }
                    r1Var.e(-w10, floatValue3, r1Var.f20534s);
                    return;
                }
                return;
            case 4:
                n3 n3Var = (n3) this.f20699b;
                n3Var.getClass();
                n3Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = n3Var.F.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                n3Var.invalidate();
                return;
            default:
                v3 v3Var = (v3) this.f20699b;
                v3Var.f20596i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3 w3Var = v3Var.f20592b;
                if (w3Var != null) {
                    w3Var.invalidate();
                    return;
                }
                return;
        }
    }
}
