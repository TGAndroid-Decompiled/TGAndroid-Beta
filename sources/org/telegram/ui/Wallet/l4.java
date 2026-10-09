package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.hs;
public final class l4 implements ViewTreeObserver.OnPreDrawListener {
    public final int f35194a;
    public final ViewGroup f35195b;

    public l4(ViewGroup viewGroup, int i10) {
        this.f35194a = i10;
        this.f35195b = viewGroup;
    }

    @Override
    public final boolean onPreDraw() {
        e71 e71Var;
        boolean z10;
        ci.w5 w5Var;
        ci.w5 w5Var2;
        ci.w5 w5Var3;
        switch (this.f35194a) {
            case 0:
                ci.m6 m6Var = (ci.m6) this.f35195b;
                a5 a5Var = (a5) m6Var.f5601c;
                if (a5Var.F || a5Var.G) {
                    a5Var.B0();
                }
                if (a5Var.G) {
                    m6Var.invalidate();
                    return true;
                }
                return true;
            case 1:
                n4 n4Var = (n4) this.f35195b;
                a5 a5Var2 = n4Var.f35298e;
                float f7 = 0.0f;
                int i10 = 0;
                if (a5Var2.f34617a0 != null && (e71Var = a5Var2.f26290a) != null) {
                    if (a5Var2.m0 && !e71Var.canScrollVertically(1)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (a5Var2.f34619c0 != z10) {
                        a5Var2.f34619c0 = z10;
                        a5Var2.f34617a0.animate().cancel();
                        if (z10) {
                            a5Var2.f34617a0.setVisibility(0);
                            a5Var2.f34617a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(hs.f27119g).start();
                        } else {
                            a5Var2.f34617a0.setAlpha(0.0f);
                            a5Var2.f34617a0.setVisibility(4);
                        }
                    }
                }
                View m10 = a5Var2.f26290a.V2.m(a5Var2.f34623f);
                if (m10 != null) {
                    f7 = m10.getY();
                }
                if (m10 != null) {
                    i10 = m10.getHeight();
                }
                if (m10 != n4Var.f35295a || f7 != n4Var.f35296b || i10 != n4Var.f35297c) {
                    n4Var.f35295a = m10;
                    n4Var.f35296b = f7;
                    n4Var.f35297c = i10;
                    a5Var2.C0();
                }
                return true;
            default:
                j8 j8Var = (j8) ((ci.w5) this.f35195b).f6209c;
                ci.w5 w5Var4 = j8Var.v;
                if (w5Var4 != null && j8Var.W != null && w5Var4.getHeight() > 0 && j8Var.W.getHeight() > 0) {
                    float paddingTop = j8Var.fragmentView.getPaddingTop();
                    if (j8Var.f35110s.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (j8Var.f35110s.getScaleY() * (j8Var.f35110s.getContentBottom() - j8Var.f35110s.getPivotY())) + j8Var.f35110s.getPivotY() + j8Var.f35110s.getY());
                    }
                    float max = Math.max(0.0f, Math.min(j8Var.fragmentView.getHeight() - j8Var.fragmentView.getPaddingBottom(), j8Var.W.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(AndroidUtilities.dp(12.0f), max / 4.0f) * 2.0f)) / j8Var.v.getHeight());
                    j8Var.v.setPivotX(w5Var.getWidth() / 2.0f);
                    j8Var.v.setPivotY(w5Var2.getHeight() / 2.0f);
                    j8Var.v.setScaleX(min);
                    j8Var.v.setScaleY(min);
                    j8Var.v.setTranslationY((((max / 2.0f) + paddingTop) - w5Var3.getTop()) - (j8Var.v.getHeight() / 2.0f));
                }
                if (j8Var.X != null || j8Var.Y < 1.0f) {
                    j8Var.A0();
                    return true;
                }
                return true;
        }
    }
}
