package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.lr;
import org.telegram.ui.y61;
public final class a6 implements ViewTreeObserver.OnPreDrawListener {
    public final int f43930a;
    public final View f43931b;

    public a6(int i7, View view) {
        this.f43930a = i7;
        this.f43931b = view;
    }

    @Override
    public final boolean onPreDraw() {
        bi.c6 c6Var;
        boolean z10;
        hi.x4 x4Var;
        hi.x4 x4Var2;
        hi.x4 x4Var3;
        switch (this.f43930a) {
            case 0:
                n6 n6Var = (n6) ((y61) this.f43931b).f54021b;
                if (n6Var.G) {
                    n6Var.X0();
                    return true;
                }
                return true;
            case 1:
                c6 c6Var2 = (c6) this.f43931b;
                n6 n6Var2 = c6Var2.f44000e;
                float f10 = 0.0f;
                int i7 = 0;
                if (n6Var2.f44621a0 != null && (c6Var = n6Var2.f33530a) != null) {
                    if (n6Var2.f44641r0 && !c6Var.canScrollVertically(1)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (n6Var2.f44623c0 != z10) {
                        n6Var2.f44623c0 = z10;
                        n6Var2.f44621a0.animate().cancel();
                        if (z10) {
                            n6Var2.f44621a0.setVisibility(0);
                            n6Var2.f44621a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(lr.f37209g).start();
                        } else {
                            n6Var2.f44621a0.setAlpha(0.0f);
                            n6Var2.f44621a0.setVisibility(4);
                        }
                    }
                }
                n6Var2.f1();
                View m10 = n6Var2.f33530a.f34606f3.m(n6Var2.h);
                if (m10 != null) {
                    f10 = m10.getY();
                }
                if (m10 != null) {
                    i7 = m10.getHeight();
                }
                if (m10 != c6Var2.f43997a || f10 != c6Var2.f43998b || i7 != c6Var2.f43999c) {
                    c6Var2.f43997a = m10;
                    c6Var2.f43998b = f10;
                    c6Var2.f43999c = i7;
                    n6Var2.Y0();
                }
                return true;
            case 2:
                r8 r8Var = (r8) this.f43931b;
                x6 x6Var = r8Var.f44889c;
                float cardRotationX = x6Var.getCardRotationX();
                float cardRotationY = x6Var.getCardRotationY();
                if (cardRotationX != r8Var.f44887b0 || cardRotationY != r8Var.f44890c0) {
                    r8Var.f44887b0 = cardRotationX;
                    r8Var.f44890c0 = cardRotationY;
                    r8Var.M.invalidate();
                    return true;
                }
                return true;
            default:
                da daVar = (da) ((hi.x4) this.f43931b).f15725c;
                hi.x4 x4Var4 = daVar.f44081x;
                if (x4Var4 != null && daVar.f44053a0 != null && x4Var4.getHeight() > 0 && daVar.f44053a0.getHeight() > 0) {
                    float paddingTop = daVar.fragmentView.getPaddingTop();
                    if (daVar.f44079w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (daVar.f44079w.getScaleY() * (daVar.f44079w.getContentBottom() - daVar.f44079w.getPivotY())) + daVar.f44079w.getPivotY() + daVar.f44079w.getY());
                    }
                    float max = Math.max(0.0f, Math.min(daVar.fragmentView.getHeight() - daVar.fragmentView.getPaddingBottom(), daVar.f44053a0.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.g0.L(12.0f), max / 4.0f) * 2.0f)) / daVar.f44081x.getHeight());
                    daVar.f44081x.setPivotX(x4Var.getWidth() / 2.0f);
                    daVar.f44081x.setPivotY(x4Var2.getHeight() / 2.0f);
                    daVar.f44081x.setScaleX(min);
                    daVar.f44081x.setScaleY(min);
                    daVar.f44081x.setTranslationY((((max / 2.0f) + paddingTop) - x4Var3.getTop()) - (daVar.f44081x.getHeight() / 2.0f));
                }
                if (daVar.f44054b0 != null || daVar.f44055c0 < 1.0f) {
                    daVar.G0();
                    return true;
                }
                return true;
        }
    }
}
