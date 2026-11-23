package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.kr;
import org.telegram.ui.w61;
public final class b6 implements ViewTreeObserver.OnPreDrawListener {
    public final int f44101a;
    public final View f44102b;

    public b6(int i7, View view) {
        this.f44101a = i7;
        this.f44102b = view;
    }

    @Override
    public final boolean onPreDraw() {
        bi.i6 i6Var;
        boolean z10;
        hi.i5 i5Var;
        hi.i5 i5Var2;
        hi.i5 i5Var3;
        switch (this.f44101a) {
            case 0:
                o6 o6Var = (o6) ((w61) this.f44102b).f53181b;
                if (o6Var.G) {
                    o6Var.X0();
                    return true;
                }
                return true;
            case 1:
                d6 d6Var = (d6) this.f44102b;
                o6 o6Var2 = d6Var.f44170e;
                float f10 = 0.0f;
                int i7 = 0;
                if (o6Var2.f44793a0 != null && (i6Var = o6Var2.f34213a) != null) {
                    if (o6Var2.f44813r0 && !i6Var.canScrollVertically(1)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (o6Var2.f44795c0 != z10) {
                        o6Var2.f44795c0 = z10;
                        o6Var2.f44793a0.animate().cancel();
                        if (z10) {
                            o6Var2.f44793a0.setVisibility(0);
                            o6Var2.f44793a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(kr.f36859g).start();
                        } else {
                            o6Var2.f44793a0.setAlpha(0.0f);
                            o6Var2.f44793a0.setVisibility(4);
                        }
                    }
                }
                o6Var2.f1();
                View m10 = o6Var2.f34213a.f35322f3.m(o6Var2.h);
                if (m10 != null) {
                    f10 = m10.getY();
                }
                if (m10 != null) {
                    i7 = m10.getHeight();
                }
                if (m10 != d6Var.f44167a || f10 != d6Var.f44168b || i7 != d6Var.f44169c) {
                    d6Var.f44167a = m10;
                    d6Var.f44168b = f10;
                    d6Var.f44169c = i7;
                    o6Var2.Y0();
                }
                return true;
            case 2:
                s8 s8Var = (s8) this.f44102b;
                y6 y6Var = s8Var.f45061c;
                float cardRotationX = y6Var.getCardRotationX();
                float cardRotationY = y6Var.getCardRotationY();
                if (cardRotationX != s8Var.f45059b0 || cardRotationY != s8Var.f45062c0) {
                    s8Var.f45059b0 = cardRotationX;
                    s8Var.f45062c0 = cardRotationY;
                    s8Var.M.invalidate();
                    return true;
                }
                return true;
            default:
                ea eaVar = (ea) ((hi.i5) this.f44102b).f14675c;
                hi.i5 i5Var4 = eaVar.f44253x;
                if (i5Var4 != null && eaVar.f44225a0 != null && i5Var4.getHeight() > 0 && eaVar.f44225a0.getHeight() > 0) {
                    float paddingTop = eaVar.fragmentView.getPaddingTop();
                    if (eaVar.f44251w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (eaVar.f44251w.getScaleY() * (eaVar.f44251w.getContentBottom() - eaVar.f44251w.getPivotY())) + eaVar.f44251w.getPivotY() + eaVar.f44251w.getY());
                    }
                    float max = Math.max(0.0f, Math.min(eaVar.fragmentView.getHeight() - eaVar.fragmentView.getPaddingBottom(), eaVar.f44225a0.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.g0.L(12.0f), max / 4.0f) * 2.0f)) / eaVar.f44253x.getHeight());
                    eaVar.f44253x.setPivotX(i5Var.getWidth() / 2.0f);
                    eaVar.f44253x.setPivotY(i5Var2.getHeight() / 2.0f);
                    eaVar.f44253x.setScaleX(min);
                    eaVar.f44253x.setScaleY(min);
                    eaVar.f44253x.setTranslationY((((max / 2.0f) + paddingTop) - i5Var3.getTop()) - (eaVar.f44253x.getHeight() / 2.0f));
                }
                if (eaVar.f44226b0 != null || eaVar.f44227c0 < 1.0f) {
                    eaVar.G0();
                    return true;
                }
                return true;
        }
    }
}
