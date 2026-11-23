package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.nr;
import org.telegram.ui.y61;
public final class a6 implements ViewTreeObserver.OnPreDrawListener {
    public final int f43975a;
    public final View f43976b;

    public a6(int i7, View view) {
        this.f43975a = i7;
        this.f43976b = view;
    }

    @Override
    public final boolean onPreDraw() {
        bi.f6 f6Var;
        boolean z10;
        hi.x4 x4Var;
        hi.x4 x4Var2;
        hi.x4 x4Var3;
        switch (this.f43975a) {
            case 0:
                n6 n6Var = (n6) ((y61) this.f43976b).f54072b;
                if (n6Var.G) {
                    n6Var.X0();
                    return true;
                }
                return true;
            case 1:
                c6 c6Var = (c6) this.f43976b;
                n6 n6Var2 = c6Var.f44044e;
                float f10 = 0.0f;
                int i7 = 0;
                if (n6Var2.f44665a0 != null && (f6Var = n6Var2.f34681a) != null) {
                    if (n6Var2.f44685r0 && !f6Var.canScrollVertically(1)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (n6Var2.f44667c0 != z10) {
                        n6Var2.f44667c0 = z10;
                        n6Var2.f44665a0.animate().cancel();
                        if (z10) {
                            n6Var2.f44665a0.setVisibility(0);
                            n6Var2.f44665a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(nr.f37962g).start();
                        } else {
                            n6Var2.f44665a0.setAlpha(0.0f);
                            n6Var2.f44665a0.setVisibility(4);
                        }
                    }
                }
                n6Var2.f1();
                View m10 = n6Var2.f34681a.f35789f3.m(n6Var2.h);
                if (m10 != null) {
                    f10 = m10.getY();
                }
                if (m10 != null) {
                    i7 = m10.getHeight();
                }
                if (m10 != c6Var.f44041a || f10 != c6Var.f44042b || i7 != c6Var.f44043c) {
                    c6Var.f44041a = m10;
                    c6Var.f44042b = f10;
                    c6Var.f44043c = i7;
                    n6Var2.Y0();
                }
                return true;
            case 2:
                r8 r8Var = (r8) this.f43976b;
                x6 x6Var = r8Var.f44933c;
                float cardRotationX = x6Var.getCardRotationX();
                float cardRotationY = x6Var.getCardRotationY();
                if (cardRotationX != r8Var.f44931b0 || cardRotationY != r8Var.f44934c0) {
                    r8Var.f44931b0 = cardRotationX;
                    r8Var.f44934c0 = cardRotationY;
                    r8Var.M.invalidate();
                    return true;
                }
                return true;
            default:
                da daVar = (da) ((hi.x4) this.f43976b).f15749c;
                hi.x4 x4Var4 = daVar.f44125x;
                if (x4Var4 != null && daVar.f44097a0 != null && x4Var4.getHeight() > 0 && daVar.f44097a0.getHeight() > 0) {
                    float paddingTop = daVar.fragmentView.getPaddingTop();
                    if (daVar.f44123w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (daVar.f44123w.getScaleY() * (daVar.f44123w.getContentBottom() - daVar.f44123w.getPivotY())) + daVar.f44123w.getPivotY() + daVar.f44123w.getY());
                    }
                    float max = Math.max(0.0f, Math.min(daVar.fragmentView.getHeight() - daVar.fragmentView.getPaddingBottom(), daVar.f44097a0.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.g0.L(12.0f), max / 4.0f) * 2.0f)) / daVar.f44125x.getHeight());
                    daVar.f44125x.setPivotX(x4Var.getWidth() / 2.0f);
                    daVar.f44125x.setPivotY(x4Var2.getHeight() / 2.0f);
                    daVar.f44125x.setScaleX(min);
                    daVar.f44125x.setScaleY(min);
                    daVar.f44125x.setTranslationY((((max / 2.0f) + paddingTop) - x4Var3.getTop()) - (daVar.f44125x.getHeight() / 2.0f));
                }
                if (daVar.f44098b0 != null || daVar.f44099c0 < 1.0f) {
                    daVar.G0();
                    return true;
                }
                return true;
        }
    }
}
