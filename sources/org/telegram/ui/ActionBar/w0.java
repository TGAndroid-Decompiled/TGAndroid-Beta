package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class w0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21644a;
    public final Object f21645b;

    public w0(Object obj, int i10) {
        this.f21644a = i10;
        this.f21645b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21644a) {
            case 0:
                c1 c1Var = (c1) this.f21645b;
                c1Var.getClass();
                c1Var.f20490a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.invalidate();
                return;
            case 1:
                f1 f1Var = (f1) this.f21645b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f1Var.setTextColor(i0.a.d(floatValue, -1, -9194260));
                f1Var.setIconColor(i0.a.d(floatValue, -1, -9194260));
                return;
            case 2:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f21645b;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                    if (!(childAt instanceof k1)) {
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
                p1 p1Var = (p1) this.f21645b;
                if (!p1Var.f21456e) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (p1Var.f21468r) {
                        floatValue3 = 1.0f - floatValue3;
                    }
                    float z10 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, floatValue3, p1Var.f21467q, p1Var.f21466p * floatValue3);
                    if (!(p1Var instanceof zg.k)) {
                        p1Var.f21453a.setTranslationY(z10);
                    }
                    p1Var.e(-z10, floatValue3, p1Var.f21469s);
                    return;
                }
                return;
            case 4:
                n3 n3Var = (n3) this.f21645b;
                n3Var.getClass();
                n3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = n3Var.I.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                n3Var.invalidate();
                return;
            default:
                v3 v3Var = (v3) this.f21645b;
                v3Var.f21618i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3 w3Var = v3Var.f21613b;
                if (w3Var != null) {
                    w3Var.invalidate();
                    return;
                }
                return;
        }
    }
}
