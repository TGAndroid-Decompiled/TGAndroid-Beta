package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ii;
public final class n5 implements ViewTreeObserver.OnPreDrawListener {
    public final int f34936a;
    public final View f34937b;

    public n5(int i10, View view) {
        this.f34936a = i10;
        this.f34937b = view;
    }

    @Override
    public final boolean onPreDraw() {
        ii iiVar;
        boolean z10;
        jg.d0 d0Var;
        jg.d0 d0Var2;
        jg.d0 d0Var3;
        switch (this.f34936a) {
            case 0:
                b6 b6Var = (b6) ((fg.i) this.f34937b).f7079c;
                if (b6Var.F) {
                    b6Var.S0();
                    return true;
                }
                return true;
            case 1:
                p5 p5Var = (p5) this.f34937b;
                b6 b6Var2 = p5Var.e;
                float f7 = 0.0f;
                int i10 = 0;
                if (b6Var2.Z != null && (iiVar = b6Var2.f30217a) != null) {
                    if (b6Var2.f34258o0 && !iiVar.canScrollVertically(1)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (b6Var2.f34244b0 != z10) {
                        b6Var2.f34244b0 = z10;
                        b6Var2.Z.animate().cancel();
                        if (z10) {
                            b6Var2.Z.setVisibility(0);
                            b6Var2.Z.animate().alpha(1.0f).setDuration(180L).setInterpolator(gr.f26524g).start();
                        } else {
                            b6Var2.Z.setAlpha(0.0f);
                            b6Var2.Z.setVisibility(4);
                        }
                    }
                }
                View m10 = b6Var2.f30217a.f31182e3.m(b6Var2.h);
                if (m10 != null) {
                    f7 = m10.getY();
                }
                if (m10 != null) {
                    i10 = m10.getHeight();
                }
                if (m10 != p5Var.f35034a || f7 != p5Var.f35035b || i10 != p5Var.f35036c) {
                    p5Var.f35034a = m10;
                    p5Var.f35035b = f7;
                    p5Var.f35036c = i10;
                    b6Var2.T0();
                }
                return true;
            case 2:
                h8 h8Var = (h8) this.f34937b;
                l6 l6Var = h8Var.f34639c;
                float cardRotationX = l6Var.getCardRotationX();
                float cardRotationY = l6Var.getCardRotationY();
                if (cardRotationX != h8Var.f34634a0 || cardRotationY != h8Var.f34637b0) {
                    h8Var.f34634a0 = cardRotationX;
                    h8Var.f34637b0 = cardRotationY;
                    h8Var.L.invalidate();
                    return true;
                }
                return true;
            default:
                r9 r9Var = (r9) ((jg.d0) this.f34937b).f9918c;
                jg.d0 d0Var4 = r9Var.f35157x;
                if (d0Var4 != null && r9Var.Z != null && d0Var4.getHeight() > 0 && r9Var.Z.getHeight() > 0) {
                    float paddingTop = r9Var.fragmentView.getPaddingTop();
                    if (r9Var.f35155w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (r9Var.f35155w.getScaleY() * (r9Var.f35155w.getContentBottom() - r9Var.f35155w.getPivotY())) + r9Var.f35155w.getPivotY() + r9Var.f35155w.getY());
                    }
                    float max = Math.max(0.0f, Math.min(r9Var.fragmentView.getHeight() - r9Var.fragmentView.getPaddingBottom(), r9Var.Z.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.i0.L(12.0f), max / 4.0f) * 2.0f)) / r9Var.f35157x.getHeight());
                    r9Var.f35157x.setPivotX(d0Var.getWidth() / 2.0f);
                    r9Var.f35157x.setPivotY(d0Var2.getHeight() / 2.0f);
                    r9Var.f35157x.setScaleX(min);
                    r9Var.f35157x.setScaleY(min);
                    r9Var.f35157x.setTranslationY((((max / 2.0f) + paddingTop) - d0Var3.getTop()) - (r9Var.f35157x.getHeight() / 2.0f));
                }
                if (r9Var.f35130a0 != null || r9Var.f35131b0 < 1.0f) {
                    r9Var.G0();
                    return true;
                }
                return true;
        }
    }
}
