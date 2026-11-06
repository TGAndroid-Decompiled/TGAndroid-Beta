package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.xq;
public final class l5 implements ViewTreeObserver.OnPreDrawListener {
    public final int f42737a;
    public final View f42738b;

    public l5(int i7, View view) {
        this.f42737a = i7;
        this.f42738b = view;
    }

    @Override
    public final boolean onPreDraw() {
        fi.w3 w3Var;
        boolean z9;
        fi.a5 a5Var;
        fi.a5 a5Var2;
        fi.a5 a5Var3;
        switch (this.f42737a) {
            case 0:
                y5 y5Var = (y5) ((bi.x5) this.f42738b).f5027c;
                if (y5Var.F) {
                    y5Var.S0();
                    return true;
                }
                return true;
            case 1:
                n5 n5Var = (n5) this.f42738b;
                y5 y5Var2 = n5Var.f42836e;
                float f10 = 0.0f;
                int i7 = 0;
                if (y5Var2.Z != null && (w3Var = y5Var2.f36227a) != null) {
                    if (y5Var2.f43381o0 && !w3Var.canScrollVertically(1)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (y5Var2.f43366b0 != z9) {
                        y5Var2.f43366b0 = z9;
                        y5Var2.Z.animate().cancel();
                        if (z9) {
                            y5Var2.Z.setVisibility(0);
                            y5Var2.Z.animate().alpha(1.0f).setDuration(180L).setInterpolator(xq.f40346g).start();
                        } else {
                            y5Var2.Z.setAlpha(0.0f);
                            y5Var2.Z.setVisibility(4);
                        }
                    }
                }
                View m10 = y5Var2.f36227a.f37159e3.m(y5Var2.h);
                if (m10 != null) {
                    f10 = m10.getY();
                }
                if (m10 != null) {
                    i7 = m10.getHeight();
                }
                if (m10 != n5Var.f42833a || f10 != n5Var.f42834b || i7 != n5Var.f42835c) {
                    n5Var.f42833a = m10;
                    n5Var.f42834b = f10;
                    n5Var.f42835c = i7;
                    y5Var2.T0();
                }
                return true;
            case 2:
                c8 c8Var = (c8) this.f42738b;
                h6 h6Var = c8Var.f42256c;
                float cardRotationX = h6Var.getCardRotationX();
                float cardRotationY = h6Var.getCardRotationY();
                if (cardRotationX != c8Var.f42251a0 || cardRotationY != c8Var.f42254b0) {
                    c8Var.f42251a0 = cardRotationX;
                    c8Var.f42254b0 = cardRotationY;
                    c8Var.L.invalidate();
                    return true;
                }
                return true;
            default:
                n9 n9Var = (n9) ((fi.a5) this.f42738b).f11605c;
                fi.a5 a5Var4 = n9Var.f42872x;
                if (a5Var4 != null && n9Var.Z != null && a5Var4.getHeight() > 0 && n9Var.Z.getHeight() > 0) {
                    float paddingTop = n9Var.fragmentView.getPaddingTop();
                    if (n9Var.f42870w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (n9Var.f42870w.getScaleY() * (n9Var.f42870w.getContentBottom() - n9Var.f42870w.getPivotY())) + n9Var.f42870w.getPivotY() + n9Var.f42870w.getY());
                    }
                    float max = Math.max(0.0f, Math.min(n9Var.fragmentView.getHeight() - n9Var.fragmentView.getPaddingBottom(), n9Var.Z.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.g0.L(12.0f), max / 4.0f) * 2.0f)) / n9Var.f42872x.getHeight());
                    n9Var.f42872x.setPivotX(a5Var.getWidth() / 2.0f);
                    n9Var.f42872x.setPivotY(a5Var2.getHeight() / 2.0f);
                    n9Var.f42872x.setScaleX(min);
                    n9Var.f42872x.setScaleY(min);
                    n9Var.f42872x.setTranslationY((((max / 2.0f) + paddingTop) - a5Var3.getTop()) - (n9Var.f42872x.getHeight() / 2.0f));
                }
                if (n9Var.f42844a0 != null || n9Var.f42845b0 < 1.0f) {
                    n9Var.G0();
                    return true;
                }
                return true;
        }
    }
}
