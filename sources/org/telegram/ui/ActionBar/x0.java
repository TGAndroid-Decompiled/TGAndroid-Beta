package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class x0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f19899a;
    public final Object f19900b;

    public x0(Object obj, int i10) {
        this.f19899a = i10;
        this.f19900b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19899a) {
            case 0:
                d1 d1Var = (d1) this.f19900b;
                d1Var.getClass();
                d1Var.f18782a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1Var.invalidate();
                return;
            case 1:
                g1 g1Var = (g1) this.f19900b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g1Var.setTextColor(i0.a.d(floatValue, -1, -9194260));
                g1Var.setIconColor(i0.a.d(floatValue, -1, -9194260));
                return;
            case 2:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f19900b;
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
                q1 q1Var = (q1) this.f19900b;
                if (!q1Var.e) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (q1Var.f19733r) {
                        floatValue3 = 1.0f - floatValue3;
                    }
                    float z10 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, floatValue3, q1Var.f19732q, q1Var.f19731p * floatValue3);
                    if (!(q1Var instanceof zg.o)) {
                        q1Var.f19719a.setTranslationY(z10);
                    }
                    q1Var.e(-z10, floatValue3, q1Var.f19734s);
                    return;
                }
                return;
            case 4:
                o3 o3Var = (o3) this.f19900b;
                o3Var.getClass();
                o3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = o3Var.I.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                o3Var.invalidate();
                return;
            default:
                w3 w3Var = (w3) this.f19900b;
                w3Var.f19875i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3 x3Var = w3Var.f19871b;
                if (x3Var != null) {
                    x3Var.invalidate();
                    return;
                }
                return;
        }
    }
}
