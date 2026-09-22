package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class w0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f19641a;
    public final Object f19642b;

    public w0(Object obj, int i10) {
        this.f19641a = i10;
        this.f19642b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19641a) {
            case 0:
                c1 c1Var = (c1) this.f19642b;
                c1Var.getClass();
                c1Var.f18528a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.invalidate();
                return;
            case 1:
                f1 f1Var = (f1) this.f19642b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f1Var.setTextColor(i0.a.d(floatValue, -1, -9194260));
                f1Var.setIconColor(i0.a.d(floatValue, -1, -9194260));
                return;
            case 2:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f19642b;
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
                p1 p1Var = (p1) this.f19642b;
                if (!p1Var.e) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (p1Var.f19491r) {
                        floatValue3 = 1.0f - floatValue3;
                    }
                    float z10 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, floatValue3, p1Var.f19490q, p1Var.f19489p * floatValue3);
                    if (!(p1Var instanceof zg.n)) {
                        p1Var.f19477a.setTranslationY(z10);
                    }
                    p1Var.e(-z10, floatValue3, p1Var.f19492s);
                    return;
                }
                return;
            case 4:
                o3 o3Var = (o3) this.f19642b;
                o3Var.getClass();
                o3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = o3Var.I.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                o3Var.invalidate();
                return;
            default:
                w3 w3Var = (w3) this.f19642b;
                w3Var.f19650i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3 x3Var = w3Var.f19646b;
                if (x3Var != null) {
                    x3Var.invalidate();
                    return;
                }
                return;
        }
    }
}
