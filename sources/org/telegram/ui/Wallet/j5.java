package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.xq;
import org.telegram.ui.n61;
public final class j5 implements ViewTreeObserver.OnPreDrawListener {
    public final int f42703a;
    public final View f42704b;

    public j5(int i3, View view) {
        this.f42703a = i3;
        this.f42704b = view;
    }

    @Override
    public final boolean onPreDraw() {
        ai.h4 h4Var;
        boolean z10;
        gi.y4 y4Var;
        gi.y4 y4Var2;
        gi.y4 y4Var3;
        switch (this.f42703a) {
            case 0:
                w5 w5Var = (w5) ((n61) this.f42704b).f47904b;
                if (w5Var.G) {
                    w5Var.S0();
                    return true;
                }
                return true;
            case 1:
                l5 l5Var = (l5) this.f42704b;
                w5 w5Var2 = l5Var.f42785e;
                float f10 = 0.0f;
                int i3 = 0;
                if (w5Var2.f43319a0 != null && (h4Var = w5Var2.f34298a) != null) {
                    if (w5Var2.f43336p0 && !h4Var.canScrollVertically(1)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (w5Var2.f43321c0 != z10) {
                        w5Var2.f43321c0 = z10;
                        w5Var2.f43319a0.animate().cancel();
                        if (z10) {
                            w5Var2.f43319a0.setVisibility(0);
                            w5Var2.f43319a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(xq.f40453g).start();
                        } else {
                            w5Var2.f43319a0.setAlpha(0.0f);
                            w5Var2.f43319a0.setVisibility(4);
                        }
                    }
                }
                View m10 = w5Var2.f34298a.f35593f3.m(w5Var2.h);
                if (m10 != null) {
                    f10 = m10.getY();
                }
                if (m10 != null) {
                    i3 = m10.getHeight();
                }
                if (m10 != l5Var.f42782a || f10 != l5Var.f42783b || i3 != l5Var.f42784c) {
                    l5Var.f42782a = m10;
                    l5Var.f42783b = f10;
                    l5Var.f42784c = i3;
                    w5Var2.T0();
                }
                return true;
            case 2:
                b8 b8Var = (b8) this.f42704b;
                f6 f6Var = b8Var.f42294c;
                float cardRotationX = f6Var.getCardRotationX();
                float cardRotationY = f6Var.getCardRotationY();
                if (cardRotationX != b8Var.f42292b0 || cardRotationY != b8Var.f42295c0) {
                    b8Var.f42292b0 = cardRotationX;
                    b8Var.f42295c0 = cardRotationY;
                    b8Var.M.invalidate();
                    return true;
                }
                return true;
            default:
                m9 m9Var = (m9) ((gi.y4) this.f42704b).f13935c;
                gi.y4 y4Var4 = m9Var.f42897x;
                if (y4Var4 != null && m9Var.f42869a0 != null && y4Var4.getHeight() > 0 && m9Var.f42869a0.getHeight() > 0) {
                    float paddingTop = m9Var.fragmentView.getPaddingTop();
                    if (m9Var.f42895w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (m9Var.f42895w.getScaleY() * (m9Var.f42895w.getContentBottom() - m9Var.f42895w.getPivotY())) + m9Var.f42895w.getPivotY() + m9Var.f42895w.getY());
                    }
                    float max = Math.max(0.0f, Math.min(m9Var.fragmentView.getHeight() - m9Var.fragmentView.getPaddingBottom(), m9Var.f42869a0.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.g0.L(12.0f), max / 4.0f) * 2.0f)) / m9Var.f42897x.getHeight());
                    m9Var.f42897x.setPivotX(y4Var.getWidth() / 2.0f);
                    m9Var.f42897x.setPivotY(y4Var2.getHeight() / 2.0f);
                    m9Var.f42897x.setScaleX(min);
                    m9Var.f42897x.setScaleY(min);
                    m9Var.f42897x.setTranslationY((((max / 2.0f) + paddingTop) - y4Var3.getTop()) - (m9Var.f42897x.getHeight() / 2.0f));
                }
                if (m9Var.f42870b0 != null || m9Var.f42871c0 < 1.0f) {
                    m9Var.G0();
                    return true;
                }
                return true;
        }
    }
}
