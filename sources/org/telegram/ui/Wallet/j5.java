package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.xq;
public final class j5 implements ViewTreeObserver.OnPreDrawListener {
    public final int f42627a;
    public final View f42628b;

    public j5(int i7, View view) {
        this.f42627a = i7;
        this.f42628b = view;
    }

    @Override
    public final boolean onPreDraw() {
        fi.w3 w3Var;
        boolean z9;
        fi.a5 a5Var;
        fi.a5 a5Var2;
        fi.a5 a5Var3;
        switch (this.f42627a) {
            case 0:
                w5 w5Var = (w5) ((bi.x5) this.f42628b).f5025c;
                if (w5Var.F) {
                    w5Var.S0();
                    return true;
                }
                return true;
            case 1:
                l5 l5Var = (l5) this.f42628b;
                w5 w5Var2 = l5Var.f42724e;
                float f10 = 0.0f;
                int i7 = 0;
                if (w5Var2.Z != null && (w3Var = w5Var2.f36649a) != null) {
                    if (w5Var2.f43265o0 && !w3Var.canScrollVertically(1)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (w5Var2.f43250b0 != z9) {
                        w5Var2.f43250b0 = z9;
                        w5Var2.Z.animate().cancel();
                        if (z9) {
                            w5Var2.Z.setVisibility(0);
                            w5Var2.Z.animate().alpha(1.0f).setDuration(180L).setInterpolator(xq.f40459g).start();
                        } else {
                            w5Var2.Z.setAlpha(0.0f);
                            w5Var2.Z.setVisibility(4);
                        }
                    }
                }
                View m10 = w5Var2.f36649a.f37555e3.m(w5Var2.h);
                if (m10 != null) {
                    f10 = m10.getY();
                }
                if (m10 != null) {
                    i7 = m10.getHeight();
                }
                if (m10 != l5Var.f42721a || f10 != l5Var.f42722b || i7 != l5Var.f42723c) {
                    l5Var.f42721a = m10;
                    l5Var.f42722b = f10;
                    l5Var.f42723c = i7;
                    w5Var2.T0();
                }
                return true;
            case 2:
                a8 a8Var = (a8) this.f42628b;
                f6 f6Var = a8Var.f42142c;
                float cardRotationX = f6Var.getCardRotationX();
                float cardRotationY = f6Var.getCardRotationY();
                if (cardRotationX != a8Var.f42137a0 || cardRotationY != a8Var.f42140b0) {
                    a8Var.f42137a0 = cardRotationX;
                    a8Var.f42140b0 = cardRotationY;
                    a8Var.L.invalidate();
                    return true;
                }
                return true;
            default:
                l9 l9Var = (l9) ((fi.a5) this.f42628b).f11605c;
                fi.a5 a5Var4 = l9Var.f42760x;
                if (a5Var4 != null && l9Var.Z != null && a5Var4.getHeight() > 0 && l9Var.Z.getHeight() > 0) {
                    float paddingTop = l9Var.fragmentView.getPaddingTop();
                    if (l9Var.f42758w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (l9Var.f42758w.getScaleY() * (l9Var.f42758w.getContentBottom() - l9Var.f42758w.getPivotY())) + l9Var.f42758w.getPivotY() + l9Var.f42758w.getY());
                    }
                    float max = Math.max(0.0f, Math.min(l9Var.fragmentView.getHeight() - l9Var.fragmentView.getPaddingBottom(), l9Var.Z.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.g0.L(12.0f), max / 4.0f) * 2.0f)) / l9Var.f42760x.getHeight());
                    l9Var.f42760x.setPivotX(a5Var.getWidth() / 2.0f);
                    l9Var.f42760x.setPivotY(a5Var2.getHeight() / 2.0f);
                    l9Var.f42760x.setScaleX(min);
                    l9Var.f42760x.setScaleY(min);
                    l9Var.f42760x.setTranslationY((((max / 2.0f) + paddingTop) - a5Var3.getTop()) - (l9Var.f42760x.getHeight() / 2.0f));
                }
                if (l9Var.f42732a0 != null || l9Var.f42733b0 < 1.0f) {
                    l9Var.G0();
                    return true;
                }
                return true;
        }
    }
}
