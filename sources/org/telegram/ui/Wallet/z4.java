package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.d71;
public final class z4 implements ViewTreeObserver.OnPreDrawListener {
    public final int f35495a;
    public final View f35496b;

    public z4(int i10, View view) {
        this.f35495a = i10;
        this.f35496b = view;
    }

    @Override
    public final boolean onPreDraw() {
        d71 d71Var;
        boolean z10;
        ei.m5 m5Var;
        ei.m5 m5Var2;
        ei.m5 m5Var3;
        switch (this.f35495a) {
            case 0:
                o5 o5Var = (o5) ((ah.v) this.f35496b).f896c;
                if (o5Var.E) {
                    o5Var.N0();
                    return true;
                }
                return true;
            case 1:
                b5 b5Var = (b5) this.f35496b;
                o5 o5Var2 = b5Var.e;
                float f7 = 0.0f;
                int i10 = 0;
                if (o5Var2.Y != null && (d71Var = o5Var2.f25907a) != null) {
                    if (o5Var2.f34947n0 && !d71Var.canScrollVertically(1)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (o5Var2.f34933a0 != z10) {
                        o5Var2.f34933a0 = z10;
                        o5Var2.Y.animate().cancel();
                        if (z10) {
                            o5Var2.Y.setVisibility(0);
                            o5Var2.Y.animate().alpha(1.0f).setDuration(180L).setInterpolator(bs.f25134g).start();
                        } else {
                            o5Var2.Y.setAlpha(0.0f);
                            o5Var2.Y.setVisibility(4);
                        }
                    }
                }
                View m10 = o5Var2.f25907a.Y2.m(o5Var2.f34938f);
                if (m10 != null) {
                    f7 = m10.getY();
                }
                if (m10 != null) {
                    i10 = m10.getHeight();
                }
                if (m10 != b5Var.f34331a || f7 != b5Var.f34332b || i10 != b5Var.f34333c) {
                    b5Var.f34331a = m10;
                    b5Var.f34332b = f7;
                    b5Var.f34333c = i10;
                    o5Var2.O0();
                }
                return true;
            case 2:
                t7 t7Var = (t7) this.f35496b;
                x5 x5Var = t7Var.f35224c;
                float cardRotationX = x5Var.getCardRotationX();
                float cardRotationY = x5Var.getCardRotationY();
                if (cardRotationX != t7Var.f35219a0 || cardRotationY != t7Var.f35222b0) {
                    t7Var.f35219a0 = cardRotationX;
                    t7Var.f35222b0 = cardRotationY;
                    t7Var.L.invalidate();
                    return true;
                }
                return true;
            default:
                j9 j9Var = (j9) ((ei.m5) this.f35496b).f9478c;
                ei.m5 m5Var4 = j9Var.v;
                if (m5Var4 != null && j9Var.Y != null && m5Var4.getHeight() > 0 && j9Var.Y.getHeight() > 0) {
                    float paddingTop = j9Var.fragmentView.getPaddingTop();
                    if (j9Var.f34677s.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (j9Var.f34677s.getScaleY() * (j9Var.f34677s.getContentBottom() - j9Var.f34677s.getPivotY())) + j9Var.f34677s.getPivotY() + j9Var.f34677s.getY());
                    }
                    float max = Math.max(0.0f, Math.min(j9Var.fragmentView.getHeight() - j9Var.fragmentView.getPaddingBottom(), j9Var.Y.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(AndroidUtilities.dp(12.0f), max / 4.0f) * 2.0f)) / j9Var.v.getHeight());
                    j9Var.v.setPivotX(m5Var.getWidth() / 2.0f);
                    j9Var.v.setPivotY(m5Var2.getHeight() / 2.0f);
                    j9Var.v.setScaleX(min);
                    j9Var.v.setScaleY(min);
                    j9Var.v.setTranslationY((((max / 2.0f) + paddingTop) - m5Var3.getTop()) - (j9Var.v.getHeight() / 2.0f));
                }
                if (j9Var.Z != null || j9Var.f34657a0 < 1.0f) {
                    j9Var.B0();
                    return true;
                }
                return true;
        }
    }
}
