package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class x0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22401a;
    public final Object f22402b;

    public x0(Object obj, int i10) {
        this.f22401a = i10;
        this.f22402b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22401a) {
            case 0:
                d1 d1Var = (d1) this.f22402b;
                d1Var.getClass();
                d1Var.f21225a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1Var.invalidate();
                return;
            case 1:
                g1 g1Var = (g1) this.f22402b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g1Var.setTextColor(i0.a.d(floatValue, -1, -9194260));
                g1Var.setIconColor(i0.a.d(floatValue, -1, -9194260));
                return;
            case 2:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f22402b;
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
                r1 r1Var = (r1) this.f22402b;
                if (!r1Var.f22255e) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (r1Var.f22267r) {
                        floatValue3 = 1.0f - floatValue3;
                    }
                    float w10 = (int) e2.c.w(1.0f, floatValue3, r1Var.f22266q, r1Var.f22265p * floatValue3);
                    if (!(r1Var instanceof ng.o)) {
                        r1Var.f22252a.setTranslationY(w10);
                    }
                    r1Var.e(-w10, floatValue3, r1Var.f22268s);
                    return;
                }
                return;
            case 4:
                o3 o3Var = (o3) this.f22402b;
                o3Var.getClass();
                o3Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = o3Var.F.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                o3Var.invalidate();
                return;
            default:
                w3 w3Var = (w3) this.f22402b;
                w3Var.f22382i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3 x3Var = w3Var.f22377b;
                if (x3Var != null) {
                    x3Var.invalidate();
                    return;
                }
                return;
        }
    }
}
