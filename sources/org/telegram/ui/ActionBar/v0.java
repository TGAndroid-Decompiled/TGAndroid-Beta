package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class v0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21600a;
    public final Object f21601b;

    public v0(Object obj, int i10) {
        this.f21600a = i10;
        this.f21601b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21600a) {
            case 0:
                b1 b1Var = (b1) this.f21601b;
                b1Var.getClass();
                b1Var.f20448a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var.invalidate();
                return;
            case 1:
                e1 e1Var = (e1) this.f21601b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e1Var.setTextColor(i0.a.d(floatValue, -1, -9194260));
                e1Var.setIconColor(i0.a.d(floatValue, -1, -9194260));
                return;
            case 2:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f21601b;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                    if (!(childAt instanceof j1)) {
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
                o1 o1Var = (o1) this.f21601b;
                if (!o1Var.f21411e) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (o1Var.f21423r) {
                        floatValue3 = 1.0f - floatValue3;
                    }
                    float y3 = (int) com.google.android.gms.internal.vision.e2.y(1.0f, floatValue3, o1Var.f21422q, o1Var.f21421p * floatValue3);
                    if (!(o1Var instanceof zg.n)) {
                        o1Var.f21408a.setTranslationY(y3);
                    }
                    o1Var.e(-y3, floatValue3, o1Var.f21424s);
                    return;
                }
                return;
            case 4:
                m3 m3Var = (m3) this.f21601b;
                m3Var.getClass();
                m3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = m3Var.I.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                m3Var.invalidate();
                return;
            default:
                u3 u3Var = (u3) this.f21601b;
                u3Var.f21574i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3 v3Var = u3Var.f21569b;
                if (v3Var != null) {
                    v3Var.invalidate();
                    return;
                }
                return;
        }
    }
}
