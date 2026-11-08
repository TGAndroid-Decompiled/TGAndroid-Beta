package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class gz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46172a;
    public final Object f46173b;

    public gz0(Object obj, int i7) {
        this.f46172a = i7;
        this.f46173b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46172a) {
            case 0:
                SecretMediaViewer secretMediaViewer = ((hz0) this.f46173b).d;
                secretMediaViewer.Y.f46728k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.Y.invalidate();
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = ((hz0) this.f46173b).d;
                secretMediaViewer2.Y.f46728k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.Y.invalidate();
                return;
            case 2:
                ((SecretMediaViewer) ((org.telegram.ui.Components.nk0) this.f46173b).f36382b).Y.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                rz0 rz0Var = (rz0) this.f46173b;
                rz0Var.f49583w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (rz0Var.S) {
                    rz0Var.N.invalidate();
                    return;
                }
                return;
            case 4:
                ((h01) this.f46173b).f46181e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                i01 i01Var = (i01) this.f46173b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i01Var.f46541r = floatValue;
                View view = i01Var.f46538e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                fi.r3 r3Var = i01Var.d;
                if (r3Var != null) {
                    r3Var.invalidate();
                    return;
                }
                return;
            case 6:
                m11 m11Var = (m11) this.f46173b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m11Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m11Var.f47626w;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                c61 c61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.xq.f40367g.getInterpolation(m11Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    float s5 = org.telegram.messenger.g0.s(m11Var.L, i7, itemsCount, 4.0f);
                    c61Var.getChildAt(i7).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    c61Var.getChildAt(i7).setAlpha(s5);
                }
                return;
            case 7:
                m31 m31Var = (m31) this.f46173b;
                m31Var.getClass();
                m31Var.l0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                l41 l41Var = (l41) this.f46173b;
                l41Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l41Var.f47416e.setAlpha(1.0f - floatValue3);
                lg.g gVar = l41Var.f47414b;
                gVar.f18331z0.f20589f = floatValue3;
                l41Var.f47415c.invalidate();
                gVar.invalidate();
                return;
            case 9:
                v71 v71Var = (v71) this.f46173b;
                v71Var.getClass();
                v71Var.f50564p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v71Var.f50586y0.invalidate();
                v71Var.D0.invalidate();
                v71Var.S1.setAlpha(v71Var.f50564p1);
                v71Var.R1.invalidate();
                v71Var.a1();
                return;
            case 10:
                v71 v71Var2 = ((k71) this.f46173b).f47135a;
                v71Var2.f50564p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v71Var2.f50586y0.invalidate();
                v71Var2.D0.invalidate();
                v71Var2.S1.setAlpha(v71Var2.f50564p1);
                v71Var2.R1.invalidate();
                v71Var2.a1();
                return;
            case 11:
                n81 n81Var = (n81) this.f46173b;
                n81Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = n81Var.f47996a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    int R = RecyclerView.R(n81Var.f47996a.getChildAt(i10));
                    int i11 = n81Var.d.f47140e;
                    if (R >= i11 && i11 > 0) {
                        n81Var.f47996a.getChildAt(i10).setAlpha(n81Var.E);
                    } else {
                        n81Var.f47996a.getChildAt(i10).setAlpha(1.0f);
                    }
                }
                return;
            case 12:
                t81 t81Var = (t81) this.f46173b;
                t81Var.getClass();
                t81Var.f49978b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t81Var.invalidate();
                return;
            case 13:
                w91 w91Var = (w91) this.f46173b;
                w91Var.getClass();
                w91Var.W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 14:
                t91 t91Var = (t91) this.f46173b;
                t91Var.getClass();
                t91Var.f49993j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t91Var.n0();
                return;
            case 15:
                u91 u91Var = (u91) this.f46173b;
                u91Var.getClass();
                u91Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                fc1 fc1Var = (fc1) this.f46173b;
                fc1Var.getClass();
                fc1Var.f45582x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fc1Var.x();
                return;
        }
    }
}
