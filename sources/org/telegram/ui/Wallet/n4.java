package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.is;
public final class n4 implements ViewTreeObserver.OnPreDrawListener {
    public final int f35354a;
    public final ViewGroup f35355b;

    public n4(ViewGroup viewGroup, int i10) {
        this.f35354a = i10;
        this.f35355b = viewGroup;
    }

    @Override
    public final boolean onPreDraw() {
        f71 f71Var;
        boolean z10;
        ci.w5 w5Var;
        ci.w5 w5Var2;
        ci.w5 w5Var3;
        switch (this.f35354a) {
            case 0:
                ci.m6 m6Var = (ci.m6) this.f35355b;
                c5 c5Var = (c5) m6Var.f5600c;
                if (c5Var.F || c5Var.G) {
                    c5Var.B0();
                }
                if (c5Var.G) {
                    m6Var.invalidate();
                    return true;
                }
                return true;
            case 1:
                p4 p4Var = (p4) this.f35355b;
                c5 c5Var2 = p4Var.f35450e;
                float f7 = 0.0f;
                int i10 = 0;
                if (c5Var2.f34773a0 != null && (f71Var = c5Var2.f26675a) != null) {
                    if (c5Var2.m0 && !f71Var.canScrollVertically(1)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c5Var2.f34775c0 != z10) {
                        c5Var2.f34775c0 = z10;
                        c5Var2.f34773a0.animate().cancel();
                        if (z10) {
                            c5Var2.f34773a0.setVisibility(0);
                            c5Var2.f34773a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(is.f27501g).start();
                        } else {
                            c5Var2.f34773a0.setAlpha(0.0f);
                            c5Var2.f34773a0.setVisibility(4);
                        }
                    }
                }
                View m10 = c5Var2.f26675a.V2.m(c5Var2.f34779f);
                if (m10 != null) {
                    f7 = m10.getY();
                }
                if (m10 != null) {
                    i10 = m10.getHeight();
                }
                if (m10 != p4Var.f35447a || f7 != p4Var.f35448b || i10 != p4Var.f35449c) {
                    p4Var.f35447a = m10;
                    p4Var.f35448b = f7;
                    p4Var.f35449c = i10;
                    c5Var2.C0();
                }
                return true;
            default:
                l8 l8Var = (l8) ((ci.w5) this.f35355b).f6208c;
                ci.w5 w5Var4 = l8Var.v;
                if (w5Var4 != null && l8Var.W != null && w5Var4.getHeight() > 0 && l8Var.W.getHeight() > 0) {
                    float paddingTop = l8Var.fragmentView.getPaddingTop();
                    if (l8Var.f35285s.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (l8Var.f35285s.getScaleY() * (l8Var.f35285s.getContentBottom() - l8Var.f35285s.getPivotY())) + l8Var.f35285s.getPivotY() + l8Var.f35285s.getY());
                    }
                    float max = Math.max(0.0f, Math.min(l8Var.fragmentView.getHeight() - l8Var.fragmentView.getPaddingBottom(), l8Var.W.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(AndroidUtilities.dp(12.0f), max / 4.0f) * 2.0f)) / l8Var.v.getHeight());
                    l8Var.v.setPivotX(w5Var.getWidth() / 2.0f);
                    l8Var.v.setPivotY(w5Var2.getHeight() / 2.0f);
                    l8Var.v.setScaleX(min);
                    l8Var.v.setScaleY(min);
                    l8Var.v.setTranslationY((((max / 2.0f) + paddingTop) - w5Var3.getTop()) - (l8Var.v.getHeight() / 2.0f));
                }
                if (l8Var.X != null || l8Var.Y < 1.0f) {
                    l8Var.A0();
                    return true;
                }
                return true;
        }
    }
}
