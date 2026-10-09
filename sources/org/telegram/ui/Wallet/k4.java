package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.hs;
public final class k4 implements ViewTreeObserver.OnPreDrawListener {
    public final int f35129a;
    public final ViewGroup f35130b;

    public k4(ViewGroup viewGroup, int i10) {
        this.f35129a = i10;
        this.f35130b = viewGroup;
    }

    @Override
    public final boolean onPreDraw() {
        e71 e71Var;
        boolean z10;
        ci.w5 w5Var;
        ci.w5 w5Var2;
        ci.w5 w5Var3;
        switch (this.f35129a) {
            case 0:
                ci.m6 m6Var = (ci.m6) this.f35130b;
                z4 z4Var = (z4) m6Var.f5601c;
                if (z4Var.F || z4Var.G) {
                    z4Var.B0();
                }
                if (z4Var.G) {
                    m6Var.invalidate();
                    return true;
                }
                return true;
            case 1:
                m4 m4Var = (m4) this.f35130b;
                z4 z4Var2 = m4Var.f35227e;
                float f7 = 0.0f;
                int i10 = 0;
                if (z4Var2.f35713a0 != null && (e71Var = z4Var2.f26290a) != null) {
                    if (z4Var2.m0 && !e71Var.canScrollVertically(1)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z4Var2.f35715c0 != z10) {
                        z4Var2.f35715c0 = z10;
                        z4Var2.f35713a0.animate().cancel();
                        if (z10) {
                            z4Var2.f35713a0.setVisibility(0);
                            z4Var2.f35713a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(hs.f27119g).start();
                        } else {
                            z4Var2.f35713a0.setAlpha(0.0f);
                            z4Var2.f35713a0.setVisibility(4);
                        }
                    }
                }
                View m10 = z4Var2.f26290a.V2.m(z4Var2.f35719f);
                if (m10 != null) {
                    f7 = m10.getY();
                }
                if (m10 != null) {
                    i10 = m10.getHeight();
                }
                if (m10 != m4Var.f35224a || f7 != m4Var.f35225b || i10 != m4Var.f35226c) {
                    m4Var.f35224a = m10;
                    m4Var.f35225b = f7;
                    m4Var.f35226c = i10;
                    z4Var2.C0();
                }
                return true;
            default:
                i8 i8Var = (i8) ((ci.w5) this.f35130b).f6209c;
                ci.w5 w5Var4 = i8Var.v;
                if (w5Var4 != null && i8Var.W != null && w5Var4.getHeight() > 0 && i8Var.W.getHeight() > 0) {
                    float paddingTop = i8Var.fragmentView.getPaddingTop();
                    if (i8Var.f35039s.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (i8Var.f35039s.getScaleY() * (i8Var.f35039s.getContentBottom() - i8Var.f35039s.getPivotY())) + i8Var.f35039s.getPivotY() + i8Var.f35039s.getY());
                    }
                    float max = Math.max(0.0f, Math.min(i8Var.fragmentView.getHeight() - i8Var.fragmentView.getPaddingBottom(), i8Var.W.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(AndroidUtilities.dp(12.0f), max / 4.0f) * 2.0f)) / i8Var.v.getHeight());
                    i8Var.v.setPivotX(w5Var.getWidth() / 2.0f);
                    i8Var.v.setPivotY(w5Var2.getHeight() / 2.0f);
                    i8Var.v.setScaleX(min);
                    i8Var.v.setScaleY(min);
                    i8Var.v.setTranslationY((((max / 2.0f) + paddingTop) - w5Var3.getTop()) - (i8Var.v.getHeight() / 2.0f));
                }
                if (i8Var.X != null || i8Var.Y < 1.0f) {
                    i8Var.A0();
                    return true;
                }
                return true;
        }
    }
}
