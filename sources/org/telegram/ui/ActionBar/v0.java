package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class v0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21923a;
    public final Object f21924b;

    public v0(Object obj, int i10) {
        this.f21923a = i10;
        this.f21924b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21923a) {
            case 0:
                b1 b1Var = (b1) this.f21924b;
                b1Var.getClass();
                b1Var.f20710a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var.invalidate();
                return;
            case 1:
                e1 e1Var = (e1) this.f21924b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e1Var.setTextColor(i0.a.f(floatValue, -1, -9194260));
                e1Var.setIconColor(i0.a.f(floatValue, -1, -9194260));
                return;
            case 2:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f21924b;
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
                o1 o1Var = (o1) this.f21924b;
                if (!o1Var.e) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (o1Var.f21733r) {
                        floatValue3 = 1.0f - floatValue3;
                    }
                    float y3 = (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, floatValue3, o1Var.f21732q, o1Var.f21731p * floatValue3);
                    if (!(o1Var instanceof ah.u)) {
                        o1Var.f21719a.setTranslationY(y3);
                    }
                    o1Var.e(-y3, floatValue3, o1Var.f21734s);
                    return;
                }
                return;
            case 4:
                q3 q3Var = (q3) this.f21924b;
                q3Var.getClass();
                q3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = q3Var.I.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                q3Var.invalidate();
                return;
            default:
                y3 y3Var = (y3) this.f21924b;
                y3Var.f21982i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3 z3Var = y3Var.f21978b;
                if (z3Var != null) {
                    z3Var.invalidate();
                    return;
                }
                return;
        }
    }
}
