package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.u61;
public final class x4 implements ViewTreeObserver.OnPreDrawListener {
    public final int f35129a;
    public final View f35130b;

    public x4(int i10, View view) {
        this.f35129a = i10;
        this.f35130b = view;
    }

    @Override
    public final boolean onPreDraw() {
        u61 u61Var;
        boolean z10;
        ei.m5 m5Var;
        ei.m5 m5Var2;
        ei.m5 m5Var3;
        switch (this.f35129a) {
            case 0:
                ah.v vVar = (ah.v) this.f35130b;
                l5 l5Var = (l5) vVar.f897c;
                if (l5Var.F || l5Var.G) {
                    l5Var.L0();
                }
                if (l5Var.G) {
                    vVar.invalidate();
                    return true;
                }
                return true;
            case 1:
                z4 z4Var = (z4) this.f35130b;
                l5 l5Var2 = z4Var.e;
                float f7 = 0.0f;
                int i10 = 0;
                if (l5Var2.f34480a0 != null && (u61Var = l5Var2.f31190a) != null) {
                    if (l5Var2.f34496p0 && !u61Var.canScrollVertically(1)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (l5Var2.f34482c0 != z10) {
                        l5Var2.f34482c0 = z10;
                        l5Var2.f34480a0.animate().cancel();
                        if (z10) {
                            l5Var2.f34480a0.setVisibility(0);
                            l5Var2.f34480a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(bs.f25031g).start();
                        } else {
                            l5Var2.f34480a0.setAlpha(0.0f);
                            l5Var2.f34480a0.setVisibility(4);
                        }
                    }
                }
                View m10 = l5Var2.f31190a.V2.m(l5Var2.f34485f);
                if (m10 != null) {
                    f7 = m10.getY();
                }
                if (m10 != null) {
                    i10 = m10.getHeight();
                }
                if (m10 != z4Var.f35195a || f7 != z4Var.f35196b || i10 != z4Var.f35197c) {
                    z4Var.f35195a = m10;
                    z4Var.f35196b = f7;
                    z4Var.f35197c = i10;
                    l5Var2.M0();
                }
                return true;
            case 2:
                w7 w7Var = (w7) this.f35130b;
                v5 v5Var = w7Var.f35048c;
                float cardRotationX = v5Var.getCardRotationX();
                float cardRotationY = v5Var.getCardRotationY();
                if (cardRotationX != w7Var.f35043a0 || cardRotationY != w7Var.f35046b0) {
                    w7Var.f35043a0 = cardRotationX;
                    w7Var.f35046b0 = cardRotationY;
                    w7Var.L.invalidate();
                    return true;
                }
                return true;
            default:
                l9 l9Var = (l9) ((ei.m5) this.f35130b).f9469c;
                ei.m5 m5Var4 = l9Var.v;
                if (m5Var4 != null && l9Var.W != null && m5Var4.getHeight() > 0 && l9Var.W.getHeight() > 0) {
                    float paddingTop = l9Var.fragmentView.getPaddingTop();
                    if (l9Var.f34544s.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (l9Var.f34544s.getScaleY() * (l9Var.f34544s.getContentBottom() - l9Var.f34544s.getPivotY())) + l9Var.f34544s.getPivotY() + l9Var.f34544s.getY());
                    }
                    float max = Math.max(0.0f, Math.min(l9Var.fragmentView.getHeight() - l9Var.fragmentView.getPaddingBottom(), l9Var.W.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(AndroidUtilities.dp(12.0f), max / 4.0f) * 2.0f)) / l9Var.v.getHeight());
                    l9Var.v.setPivotX(m5Var.getWidth() / 2.0f);
                    l9Var.v.setPivotY(m5Var2.getHeight() / 2.0f);
                    l9Var.v.setScaleX(min);
                    l9Var.v.setScaleY(min);
                    l9Var.v.setTranslationY((((max / 2.0f) + paddingTop) - m5Var3.getTop()) - (l9Var.v.getHeight() / 2.0f));
                }
                if (l9Var.X != null || l9Var.Y < 1.0f) {
                    l9Var.A0();
                    return true;
                }
                return true;
        }
    }
}
