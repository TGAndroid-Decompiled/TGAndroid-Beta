package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.xq;
public final class k5 implements ViewTreeObserver.OnPreDrawListener {
    public final int f42708a;
    public final View f42709b;

    public k5(int i7, View view) {
        this.f42708a = i7;
        this.f42709b = view;
    }

    @Override
    public final boolean onPreDraw() {
        fi.w3 w3Var;
        boolean z9;
        fi.a5 a5Var;
        fi.a5 a5Var2;
        fi.a5 a5Var3;
        switch (this.f42708a) {
            case 0:
                x5 x5Var = (x5) ((bi.x5) this.f42709b).f5027c;
                if (x5Var.F) {
                    x5Var.S0();
                    return true;
                }
                return true;
            case 1:
                m5 m5Var = (m5) this.f42709b;
                x5 x5Var2 = m5Var.f42806e;
                float f10 = 0.0f;
                int i7 = 0;
                if (x5Var2.Z != null && (w3Var = x5Var2.f36243a) != null) {
                    if (x5Var2.f43347o0 && !w3Var.canScrollVertically(1)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (x5Var2.f43332b0 != z9) {
                        x5Var2.f43332b0 = z9;
                        x5Var2.Z.animate().cancel();
                        if (z9) {
                            x5Var2.Z.setVisibility(0);
                            x5Var2.Z.animate().alpha(1.0f).setDuration(180L).setInterpolator(xq.f40367g).start();
                        } else {
                            x5Var2.Z.setAlpha(0.0f);
                            x5Var2.Z.setVisibility(4);
                        }
                    }
                }
                View m10 = x5Var2.f36243a.f37189e3.m(x5Var2.h);
                if (m10 != null) {
                    f10 = m10.getY();
                }
                if (m10 != null) {
                    i7 = m10.getHeight();
                }
                if (m10 != m5Var.f42803a || f10 != m5Var.f42804b || i7 != m5Var.f42805c) {
                    m5Var.f42803a = m10;
                    m5Var.f42804b = f10;
                    m5Var.f42805c = i7;
                    x5Var2.T0();
                }
                return true;
            case 2:
                b8 b8Var = (b8) this.f42709b;
                g6 g6Var = b8Var.f42222c;
                float cardRotationX = g6Var.getCardRotationX();
                float cardRotationY = g6Var.getCardRotationY();
                if (cardRotationX != b8Var.f42217a0 || cardRotationY != b8Var.f42220b0) {
                    b8Var.f42217a0 = cardRotationX;
                    b8Var.f42220b0 = cardRotationY;
                    b8Var.L.invalidate();
                    return true;
                }
                return true;
            default:
                m9 m9Var = (m9) ((fi.a5) this.f42709b).f11605c;
                fi.a5 a5Var4 = m9Var.f42842x;
                if (a5Var4 != null && m9Var.Z != null && a5Var4.getHeight() > 0 && m9Var.Z.getHeight() > 0) {
                    float paddingTop = m9Var.fragmentView.getPaddingTop();
                    if (m9Var.f42840w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (m9Var.f42840w.getScaleY() * (m9Var.f42840w.getContentBottom() - m9Var.f42840w.getPivotY())) + m9Var.f42840w.getPivotY() + m9Var.f42840w.getY());
                    }
                    float max = Math.max(0.0f, Math.min(m9Var.fragmentView.getHeight() - m9Var.fragmentView.getPaddingBottom(), m9Var.Z.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.g0.L(12.0f), max / 4.0f) * 2.0f)) / m9Var.f42842x.getHeight());
                    m9Var.f42842x.setPivotX(a5Var.getWidth() / 2.0f);
                    m9Var.f42842x.setPivotY(a5Var2.getHeight() / 2.0f);
                    m9Var.f42842x.setScaleX(min);
                    m9Var.f42842x.setScaleY(min);
                    m9Var.f42842x.setTranslationY((((max / 2.0f) + paddingTop) - a5Var3.getTop()) - (m9Var.f42842x.getHeight() / 2.0f));
                }
                if (m9Var.f42814a0 != null || m9Var.f42815b0 < 1.0f) {
                    m9Var.G0();
                    return true;
                }
                return true;
        }
    }
}
