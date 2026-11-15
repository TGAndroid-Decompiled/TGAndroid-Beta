package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.er;
import org.telegram.ui.w61;
public final class l5 implements ViewTreeObserver.OnPreDrawListener {
    public final int f44121a;
    public final View f44122b;

    public l5(int i7, View view) {
        this.f44121a = i7;
        this.f44122b = view;
    }

    @Override
    public final boolean onPreDraw() {
        bi.v3 v3Var;
        boolean z10;
        hi.y4 y4Var;
        hi.y4 y4Var2;
        hi.y4 y4Var3;
        switch (this.f44121a) {
            case 0:
                y5 y5Var = (y5) ((w61) this.f44122b).f52478c;
                if (y5Var.G) {
                    y5Var.T0();
                    return true;
                }
                return true;
            case 1:
                n5 n5Var = (n5) this.f44122b;
                y5 y5Var2 = n5Var.f44194e;
                float f10 = 0.0f;
                int i7 = 0;
                if (y5Var2.f44727a0 != null && (v3Var = y5Var2.f38880a) != null) {
                    if (y5Var2.f44744p0 && !v3Var.canScrollVertically(1)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (y5Var2.f44729c0 != z10) {
                        y5Var2.f44729c0 = z10;
                        y5Var2.f44727a0.animate().cancel();
                        if (z10) {
                            y5Var2.f44727a0.setVisibility(0);
                            y5Var2.f44727a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(er.f34420g).start();
                        } else {
                            y5Var2.f44727a0.setAlpha(0.0f);
                            y5Var2.f44727a0.setVisibility(4);
                        }
                    }
                }
                View m10 = y5Var2.f38880a.f39891f3.m(y5Var2.h);
                if (m10 != null) {
                    f10 = m10.getY();
                }
                if (m10 != null) {
                    i7 = m10.getHeight();
                }
                if (m10 != n5Var.f44191a || f10 != n5Var.f44192b || i7 != n5Var.f44193c) {
                    n5Var.f44191a = m10;
                    n5Var.f44192b = f10;
                    n5Var.f44193c = i7;
                    y5Var2.U0();
                }
                return true;
            case 2:
                c8 c8Var = (c8) this.f44122b;
                h6 h6Var = c8Var.f43651c;
                float cardRotationX = h6Var.getCardRotationX();
                float cardRotationY = h6Var.getCardRotationY();
                if (cardRotationX != c8Var.f43649b0 || cardRotationY != c8Var.f43652c0) {
                    c8Var.f43649b0 = cardRotationX;
                    c8Var.f43652c0 = cardRotationY;
                    c8Var.M.invalidate();
                    return true;
                }
                return true;
            default:
                p9 p9Var = (p9) ((hi.y4) this.f44122b).f15421c;
                hi.y4 y4Var4 = p9Var.f44361x;
                if (y4Var4 != null && p9Var.f44333a0 != null && y4Var4.getHeight() > 0 && p9Var.f44333a0.getHeight() > 0) {
                    float paddingTop = p9Var.fragmentView.getPaddingTop();
                    if (p9Var.f44359w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (p9Var.f44359w.getScaleY() * (p9Var.f44359w.getContentBottom() - p9Var.f44359w.getPivotY())) + p9Var.f44359w.getPivotY() + p9Var.f44359w.getY());
                    }
                    float max = Math.max(0.0f, Math.min(p9Var.fragmentView.getHeight() - p9Var.fragmentView.getPaddingBottom(), p9Var.f44333a0.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.g0.L(12.0f), max / 4.0f) * 2.0f)) / p9Var.f44361x.getHeight());
                    p9Var.f44361x.setPivotX(y4Var.getWidth() / 2.0f);
                    p9Var.f44361x.setPivotY(y4Var2.getHeight() / 2.0f);
                    p9Var.f44361x.setScaleX(min);
                    p9Var.f44361x.setScaleY(min);
                    p9Var.f44361x.setTranslationY((((max / 2.0f) + paddingTop) - y4Var3.getTop()) - (p9Var.f44361x.getHeight() / 2.0f));
                }
                if (p9Var.f44334b0 != null || p9Var.f44335c0 < 1.0f) {
                    p9Var.G0();
                    return true;
                }
                return true;
        }
    }
}
