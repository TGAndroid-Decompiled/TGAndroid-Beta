package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class v0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21776a;
    public final Object f21777b;

    public v0(Object obj, int i10) {
        this.f21776a = i10;
        this.f21777b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21776a) {
            case 0:
                b1 b1Var = (b1) this.f21777b;
                b1Var.getClass();
                b1Var.f20634a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var.invalidate();
                return;
            case 1:
                e1 e1Var = (e1) this.f21777b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e1Var.setTextColor(i0.b.f(floatValue, -1, -9194260));
                e1Var.setIconColor(i0.b.f(floatValue, -1, -9194260));
                return;
            case 2:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f21777b;
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
                o1 o1Var = (o1) this.f21777b;
                if (!o1Var.e) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (o1Var.f21643r) {
                        floatValue3 = 1.0f - floatValue3;
                    }
                    float x10 = (int) com.google.android.gms.internal.cast.a6.x(1.0f, floatValue3, o1Var.f21642q, o1Var.f21641p * floatValue3);
                    if (!(o1Var instanceof ah.u)) {
                        o1Var.f21629a.setTranslationY(x10);
                    }
                    o1Var.e(-x10, floatValue3, o1Var.f21644s);
                    return;
                }
                return;
            case 4:
                n3 n3Var = (n3) this.f21777b;
                n3Var.getClass();
                n3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = n3Var.I.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                n3Var.invalidate();
                return;
            default:
                v3 v3Var = (v3) this.f21777b;
                v3Var.f21787i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3 w3Var = v3Var.f21783b;
                if (w3Var != null) {
                    w3Var.invalidate();
                    return;
                }
                return;
        }
    }
}
