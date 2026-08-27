package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;

public final class w0 implements ValueAnimator.AnimatorUpdateListener {

    public final int f23930a;

    public final Object f23931b;

    public w0(Object obj, int i10) {
        this.f23930a = i10;
        this.f23931b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23930a) {
            case 0:
                c1 c1Var = (c1) this.f23931b;
                c1Var.getClass();
                c1Var.f22794a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.invalidate();
                break;
            case 1:
                f1 f1Var = (f1) this.f23931b;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f1Var.setTextColor(i0.b.d(fFloatValue, -1, -9194260));
                f1Var.setIconColor(i0.b.d(fFloatValue, -1, -9194260));
                break;
            case 2:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f23931b;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i10);
                    if (!(childAt instanceof k1)) {
                        float fCascade = AndroidUtilities.cascade(fFloatValue2, actionBarPopupWindow$ActionBarPopupWindowLayout.v ? (itemsCount - 1) - i10 : i10, itemsCount, 4.0f);
                        childAt.setTranslationY((1.0f - fCascade) * AndroidUtilities.dp(-6.0f));
                        childAt.setAlpha(fCascade * (childAt.isEnabled() ? 1.0f : 0.5f));
                    }
                }
                break;
            case 3:
                p1 p1Var = (p1) this.f23931b;
                if (!p1Var.f23710e) {
                    float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (p1Var.f23722r) {
                        fFloatValue3 = 1.0f - fFloatValue3;
                    }
                    float fZ = (int) com.google.android.recaptcha.internal.a.z(1.0f, fFloatValue3, p1Var.f23721q, p1Var.f23720p * fFloatValue3);
                    if (!(p1Var instanceof ig.o)) {
                        p1Var.f23707a.setTranslationY(fZ);
                    }
                    p1Var.e(-fZ, fFloatValue3, p1Var.f23723s);
                }
                break;
            case 4:
                m3 m3Var = (m3) this.f23931b;
                m3Var.getClass();
                m3Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = m3Var.E.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                m3Var.invalidate();
                break;
            default:
                u3 u3Var = (u3) this.f23931b;
                u3Var.f23833i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3 v3Var = u3Var.f23828b;
                if (v3Var != null) {
                    v3Var.invalidate();
                }
                break;
        }
    }
}
