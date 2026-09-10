package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class x0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18726a;
    public final Object f18727b;

    public x0(Object obj, int i10) {
        this.f18726a = i10;
        this.f18727b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18726a) {
            case 0:
                d1 d1Var = (d1) this.f18727b;
                d1Var.getClass();
                d1Var.f17594a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1Var.invalidate();
                return;
            case 1:
                g1 g1Var = (g1) this.f18727b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g1Var.setTextColor(i0.a.d(floatValue, -1, -9194260));
                g1Var.setIconColor(i0.a.d(floatValue, -1, -9194260));
                return;
            case 2:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f18727b;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                    if (!(childAt instanceof m1)) {
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
                r1 r1Var = (r1) this.f18727b;
                if (!r1Var.e) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (r1Var.f18607r) {
                        floatValue3 = 1.0f - floatValue3;
                    }
                    float z10 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, floatValue3, r1Var.f18606q, r1Var.f18605p * floatValue3);
                    if (!(r1Var instanceof yg.o)) {
                        r1Var.f18593a.setTranslationY(z10);
                    }
                    r1Var.e(-z10, floatValue3, r1Var.f18608s);
                    return;
                }
                return;
            case 4:
                q3 q3Var = (q3) this.f18727b;
                q3Var.getClass();
                q3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = q3Var.I.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                q3Var.invalidate();
                return;
            default:
                y3 y3Var = (y3) this.f18727b;
                y3Var.f18779i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3 z3Var = y3Var.f18775b;
                if (z3Var != null) {
                    z3Var.invalidate();
                    return;
                }
                return;
        }
    }
}
