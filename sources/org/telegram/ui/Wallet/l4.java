package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.es;
public final class l4 implements ViewTreeObserver.OnPreDrawListener {
    public final int f33432a;
    public final ViewGroup f33433b;

    public l4(ViewGroup viewGroup, int i10) {
        this.f33432a = i10;
        this.f33433b = viewGroup;
    }

    @Override
    public final boolean onPreDraw() {
        b71 b71Var;
        boolean z10;
        di.v5 v5Var;
        di.v5 v5Var2;
        di.v5 v5Var3;
        switch (this.f33432a) {
            case 0:
                ah.v vVar = (ah.v) this.f33433b;
                z4 z4Var = (z4) vVar.f891c;
                if (z4Var.F || z4Var.G) {
                    z4Var.B0();
                }
                if (z4Var.G) {
                    vVar.invalidate();
                    return true;
                }
                return true;
            case 1:
                n4 n4Var = (n4) this.f33433b;
                z4 z4Var2 = n4Var.e;
                float f7 = 0.0f;
                int i10 = 0;
                if (z4Var2.f33919a0 != null && (b71Var = z4Var2.f23964a) != null) {
                    if (z4Var2.m0 && !b71Var.canScrollVertically(1)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z4Var2.f33921c0 != z10) {
                        z4Var2.f33921c0 = z10;
                        z4Var2.f33919a0.animate().cancel();
                        if (z10) {
                            z4Var2.f33919a0.setVisibility(0);
                            z4Var2.f33919a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(es.f24772g).start();
                        } else {
                            z4Var2.f33919a0.setAlpha(0.0f);
                            z4Var2.f33919a0.setVisibility(4);
                        }
                    }
                }
                View m10 = z4Var2.f23964a.V2.m(z4Var2.f33924f);
                if (m10 != null) {
                    f7 = m10.getY();
                }
                if (m10 != null) {
                    i10 = m10.getHeight();
                }
                if (m10 != n4Var.f33511a || f7 != n4Var.f33512b || i10 != n4Var.f33513c) {
                    n4Var.f33511a = m10;
                    n4Var.f33512b = f7;
                    n4Var.f33513c = i10;
                    z4Var2.C0();
                }
                return true;
            default:
                i8 i8Var = (i8) ((di.v5) this.f33433b).f8001c;
                di.v5 v5Var4 = i8Var.v;
                if (v5Var4 != null && i8Var.W != null && v5Var4.getHeight() > 0 && i8Var.W.getHeight() > 0) {
                    float paddingTop = i8Var.fragmentView.getPaddingTop();
                    if (i8Var.f33313s.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (i8Var.f33313s.getScaleY() * (i8Var.f33313s.getContentBottom() - i8Var.f33313s.getPivotY())) + i8Var.f33313s.getPivotY() + i8Var.f33313s.getY());
                    }
                    float max = Math.max(0.0f, Math.min(i8Var.fragmentView.getHeight() - i8Var.fragmentView.getPaddingBottom(), i8Var.W.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(AndroidUtilities.dp(12.0f), max / 4.0f) * 2.0f)) / i8Var.v.getHeight());
                    i8Var.v.setPivotX(v5Var.getWidth() / 2.0f);
                    i8Var.v.setPivotY(v5Var2.getHeight() / 2.0f);
                    i8Var.v.setScaleX(min);
                    i8Var.v.setScaleY(min);
                    i8Var.v.setTranslationY((((max / 2.0f) + paddingTop) - v5Var3.getTop()) - (i8Var.v.getHeight() / 2.0f));
                }
                if (i8Var.X != null || i8Var.Y < 1.0f) {
                    i8Var.A0();
                    return true;
                }
                return true;
        }
    }
}
