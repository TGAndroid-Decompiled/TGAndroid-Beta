package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.is;
public final class m4 implements ViewTreeObserver.OnPreDrawListener {
    public final int f35290a;
    public final ViewGroup f35291b;

    public m4(ViewGroup viewGroup, int i10) {
        this.f35290a = i10;
        this.f35291b = viewGroup;
    }

    @Override
    public final boolean onPreDraw() {
        f71 f71Var;
        boolean z10;
        ci.w5 w5Var;
        ci.w5 w5Var2;
        ci.w5 w5Var3;
        switch (this.f35290a) {
            case 0:
                ci.m6 m6Var = (ci.m6) this.f35291b;
                b5 b5Var = (b5) m6Var.f5601c;
                if (b5Var.F || b5Var.G) {
                    b5Var.B0();
                }
                if (b5Var.G) {
                    m6Var.invalidate();
                    return true;
                }
                return true;
            case 1:
                o4 o4Var = (o4) this.f35291b;
                b5 b5Var2 = o4Var.f35386e;
                float f7 = 0.0f;
                int i10 = 0;
                if (b5Var2.f34708a0 != null && (f71Var = b5Var2.f26629a) != null) {
                    if (b5Var2.m0 && !f71Var.canScrollVertically(1)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (b5Var2.f34710c0 != z10) {
                        b5Var2.f34710c0 = z10;
                        b5Var2.f34708a0.animate().cancel();
                        if (z10) {
                            b5Var2.f34708a0.setVisibility(0);
                            b5Var2.f34708a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(is.f27444g).start();
                        } else {
                            b5Var2.f34708a0.setAlpha(0.0f);
                            b5Var2.f34708a0.setVisibility(4);
                        }
                    }
                }
                View m10 = b5Var2.f26629a.V2.m(b5Var2.f34714f);
                if (m10 != null) {
                    f7 = m10.getY();
                }
                if (m10 != null) {
                    i10 = m10.getHeight();
                }
                if (m10 != o4Var.f35383a || f7 != o4Var.f35384b || i10 != o4Var.f35385c) {
                    o4Var.f35383a = m10;
                    o4Var.f35384b = f7;
                    o4Var.f35385c = i10;
                    b5Var2.C0();
                }
                return true;
            default:
                k8 k8Var = (k8) ((ci.w5) this.f35291b).f6209c;
                ci.w5 w5Var4 = k8Var.v;
                if (w5Var4 != null && k8Var.W != null && w5Var4.getHeight() > 0 && k8Var.W.getHeight() > 0) {
                    float paddingTop = k8Var.fragmentView.getPaddingTop();
                    if (k8Var.f35221s.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (k8Var.f35221s.getScaleY() * (k8Var.f35221s.getContentBottom() - k8Var.f35221s.getPivotY())) + k8Var.f35221s.getPivotY() + k8Var.f35221s.getY());
                    }
                    float max = Math.max(0.0f, Math.min(k8Var.fragmentView.getHeight() - k8Var.fragmentView.getPaddingBottom(), k8Var.W.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(AndroidUtilities.dp(12.0f), max / 4.0f) * 2.0f)) / k8Var.v.getHeight());
                    k8Var.v.setPivotX(w5Var.getWidth() / 2.0f);
                    k8Var.v.setPivotY(w5Var2.getHeight() / 2.0f);
                    k8Var.v.setScaleX(min);
                    k8Var.v.setScaleY(min);
                    k8Var.v.setTranslationY((((max / 2.0f) + paddingTop) - w5Var3.getTop()) - (k8Var.v.getHeight() / 2.0f));
                }
                if (k8Var.X != null || k8Var.Y < 1.0f) {
                    k8Var.A0();
                    return true;
                }
                return true;
        }
    }
}
