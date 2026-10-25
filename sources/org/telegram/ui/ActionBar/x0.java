package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class x0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23237a;
    public final Object f23238b;

    public x0(Object obj, int i10) {
        this.f23237a = i10;
        this.f23238b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23237a) {
            case 0:
                d1 d1Var = (d1) this.f23238b;
                d1Var.getClass();
                d1Var.f22520a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1Var.invalidate();
                return;
            case 1:
                g1 g1Var = (g1) this.f23238b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g1Var.setTextColor(i0.a.f(floatValue, -1, -9194260));
                g1Var.setIconColor(i0.a.f(floatValue, -1, -9194260));
                return;
            case 2:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f23238b;
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
                q1 q1Var = (q1) this.f23238b;
                if (!q1Var.e) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (q1Var.f22976r) {
                        floatValue3 = 1.0f - floatValue3;
                    }
                    float z10 = (int) c3.h0.z(1.0f, floatValue3, q1Var.f22975q, q1Var.f22974p * floatValue3);
                    if (!(q1Var instanceof bh.o)) {
                        q1Var.f22962a.setTranslationY(z10);
                    }
                    q1Var.e(-z10, floatValue3, q1Var.f22977s);
                    return;
                }
                return;
            case 4:
                s3 s3Var = (s3) this.f23238b;
                s3Var.getClass();
                s3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = s3Var.I.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                s3Var.invalidate();
                return;
            default:
                a4 a4Var = (a4) this.f23238b;
                a4Var.f22385i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4 b4Var = a4Var.f22381b;
                if (b4Var != null) {
                    b4Var.invalidate();
                    return;
                }
                return;
        }
    }
}
