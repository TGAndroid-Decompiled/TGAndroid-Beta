package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.nr;
import org.telegram.ui.y61;
public final class a6 implements ViewTreeObserver.OnPreDrawListener {
    public final int f43940a;
    public final View f43941b;

    public a6(int i7, View view) {
        this.f43940a = i7;
        this.f43941b = view;
    }

    @Override
    public final boolean onPreDraw() {
        bi.i6 i6Var;
        boolean z10;
        hi.y4 y4Var;
        hi.y4 y4Var2;
        hi.y4 y4Var3;
        switch (this.f43940a) {
            case 0:
                n6 n6Var = (n6) ((y61) this.f43941b).f54046b;
                if (n6Var.G) {
                    n6Var.X0();
                    return true;
                }
                return true;
            case 1:
                c6 c6Var = (c6) this.f43941b;
                n6 n6Var2 = c6Var.f44010e;
                float f10 = 0.0f;
                int i7 = 0;
                if (n6Var2.f44631a0 != null && (i6Var = n6Var2.f34671a) != null) {
                    if (n6Var2.f44651r0 && !i6Var.canScrollVertically(1)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (n6Var2.f44633c0 != z10) {
                        n6Var2.f44633c0 = z10;
                        n6Var2.f44631a0.animate().cancel();
                        if (z10) {
                            n6Var2.f44631a0.setVisibility(0);
                            n6Var2.f44631a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(nr.f37918g).start();
                        } else {
                            n6Var2.f44631a0.setAlpha(0.0f);
                            n6Var2.f44631a0.setVisibility(4);
                        }
                    }
                }
                n6Var2.f1();
                View m10 = n6Var2.f34671a.f35741f3.m(n6Var2.h);
                if (m10 != null) {
                    f10 = m10.getY();
                }
                if (m10 != null) {
                    i7 = m10.getHeight();
                }
                if (m10 != c6Var.f44007a || f10 != c6Var.f44008b || i7 != c6Var.f44009c) {
                    c6Var.f44007a = m10;
                    c6Var.f44008b = f10;
                    c6Var.f44009c = i7;
                    n6Var2.Y0();
                }
                return true;
            case 2:
                r8 r8Var = (r8) this.f43941b;
                x6 x6Var = r8Var.f44899c;
                float cardRotationX = x6Var.getCardRotationX();
                float cardRotationY = x6Var.getCardRotationY();
                if (cardRotationX != r8Var.f44897b0 || cardRotationY != r8Var.f44900c0) {
                    r8Var.f44897b0 = cardRotationX;
                    r8Var.f44900c0 = cardRotationY;
                    r8Var.M.invalidate();
                    return true;
                }
                return true;
            default:
                da daVar = (da) ((hi.y4) this.f43941b).f15722c;
                hi.y4 y4Var4 = daVar.f44091x;
                if (y4Var4 != null && daVar.f44063a0 != null && y4Var4.getHeight() > 0 && daVar.f44063a0.getHeight() > 0) {
                    float paddingTop = daVar.fragmentView.getPaddingTop();
                    if (daVar.f44089w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (daVar.f44089w.getScaleY() * (daVar.f44089w.getContentBottom() - daVar.f44089w.getPivotY())) + daVar.f44089w.getPivotY() + daVar.f44089w.getY());
                    }
                    float max = Math.max(0.0f, Math.min(daVar.fragmentView.getHeight() - daVar.fragmentView.getPaddingBottom(), daVar.f44063a0.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.g0.L(12.0f), max / 4.0f) * 2.0f)) / daVar.f44091x.getHeight());
                    daVar.f44091x.setPivotX(y4Var.getWidth() / 2.0f);
                    daVar.f44091x.setPivotY(y4Var2.getHeight() / 2.0f);
                    daVar.f44091x.setScaleX(min);
                    daVar.f44091x.setScaleY(min);
                    daVar.f44091x.setTranslationY((((max / 2.0f) + paddingTop) - y4Var3.getTop()) - (daVar.f44091x.getHeight() / 2.0f));
                }
                if (daVar.f44064b0 != null || daVar.f44065c0 < 1.0f) {
                    daVar.G0();
                    return true;
                }
                return true;
        }
    }
}
