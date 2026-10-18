package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.u61;
public final class z4 implements ViewTreeObserver.OnPreDrawListener {
    public final int f35176a;
    public final View f35177b;

    public z4(int i10, View view) {
        this.f35176a = i10;
        this.f35177b = view;
    }

    @Override
    public final boolean onPreDraw() {
        u61 u61Var;
        boolean z10;
        ei.m5 m5Var;
        ei.m5 m5Var2;
        ei.m5 m5Var3;
        switch (this.f35176a) {
            case 0:
                n5 n5Var = (n5) ((ah.v) this.f35177b).f897c;
                if (n5Var.E) {
                    n5Var.L0();
                    return true;
                }
                return true;
            case 1:
                b5 b5Var = (b5) this.f35177b;
                n5 n5Var2 = b5Var.e;
                float f7 = 0.0f;
                int i10 = 0;
                if (n5Var2.Y != null && (u61Var = n5Var2.f31190a) != null) {
                    if (n5Var2.f34593n0 && !u61Var.canScrollVertically(1)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (n5Var2.f34579a0 != z10) {
                        n5Var2.f34579a0 = z10;
                        n5Var2.Y.animate().cancel();
                        if (z10) {
                            n5Var2.Y.setVisibility(0);
                            n5Var2.Y.animate().alpha(1.0f).setDuration(180L).setInterpolator(bs.f25031g).start();
                        } else {
                            n5Var2.Y.setAlpha(0.0f);
                            n5Var2.Y.setVisibility(4);
                        }
                    }
                }
                View m10 = n5Var2.f31190a.V2.m(n5Var2.f34584f);
                if (m10 != null) {
                    f7 = m10.getY();
                }
                if (m10 != null) {
                    i10 = m10.getHeight();
                }
                if (m10 != b5Var.f34015a || f7 != b5Var.f34016b || i10 != b5Var.f34017c) {
                    b5Var.f34015a = m10;
                    b5Var.f34016b = f7;
                    b5Var.f34017c = i10;
                    n5Var2.M0();
                }
                return true;
            case 2:
                t7 t7Var = (t7) this.f35177b;
                x5 x5Var = t7Var.f34898c;
                float cardRotationX = x5Var.getCardRotationX();
                float cardRotationY = x5Var.getCardRotationY();
                if (cardRotationX != t7Var.f34893a0 || cardRotationY != t7Var.f34896b0) {
                    t7Var.f34893a0 = cardRotationX;
                    t7Var.f34896b0 = cardRotationY;
                    t7Var.L.invalidate();
                    return true;
                }
                return true;
            default:
                i9 i9Var = (i9) ((ei.m5) this.f35177b).f9468c;
                ei.m5 m5Var4 = i9Var.v;
                if (m5Var4 != null && i9Var.W != null && m5Var4.getHeight() > 0 && i9Var.W.getHeight() > 0) {
                    float paddingTop = i9Var.fragmentView.getPaddingTop();
                    if (i9Var.f34337s.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (i9Var.f34337s.getScaleY() * (i9Var.f34337s.getContentBottom() - i9Var.f34337s.getPivotY())) + i9Var.f34337s.getPivotY() + i9Var.f34337s.getY());
                    }
                    float max = Math.max(0.0f, Math.min(i9Var.fragmentView.getHeight() - i9Var.fragmentView.getPaddingBottom(), i9Var.W.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(AndroidUtilities.dp(12.0f), max / 4.0f) * 2.0f)) / i9Var.v.getHeight());
                    i9Var.v.setPivotX(m5Var.getWidth() / 2.0f);
                    i9Var.v.setPivotY(m5Var2.getHeight() / 2.0f);
                    i9Var.v.setScaleX(min);
                    i9Var.v.setScaleY(min);
                    i9Var.v.setTranslationY((((max / 2.0f) + paddingTop) - m5Var3.getTop()) - (i9Var.v.getHeight() / 2.0f));
                }
                if (i9Var.X != null || i9Var.Y < 1.0f) {
                    i9Var.A0();
                    return true;
                }
                return true;
        }
    }
}
