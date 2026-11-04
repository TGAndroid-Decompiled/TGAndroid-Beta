package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
public final class m1 implements org.telegram.ui.Components.a71 {
    public final r1 f47482a;

    public m1(r1 r1Var) {
        this.f47482a = r1Var;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f10, int i3, boolean z11) {
        r1 r1Var = this.f47482a;
        i4 i4Var = r1Var.f48999y;
        if (z10) {
            i4Var.S.addView(i4Var.R, b8.mf.c(-1.0f, -1));
            i4Var.S.setVisibility(0);
            i4Var.S.a(f10, i3);
            i4Var.G0 = r1Var.f48990b;
            i4Var.Q.addView(view, b8.mf.c(-1.0f, -1));
            i4Var.Q.setVisibility(0);
        } else {
            i4Var.S.removeView(i4Var.R);
            i4Var.G0 = null;
            i4Var.S.setVisibility(8);
            i4Var.Q.setVisibility(4);
        }
        return i4Var.R;
    }

    @Override
    public final void c(float f10) {
        this.f47482a.f48999y.S.a(f10, 0);
    }

    @Override
    public final void d() {
        this.f47482a.f48989a.setVisibility(0);
        this.f47482a.f48990b.setVisibility(4);
        this.f47482a.f48990b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", org.telegram.messenger.t0.f25457b.getPackageName());
        r1 r1Var = this.f47482a;
        r1Var.f48989a.loadUrl(r1Var.f48997w.url, hashMap);
    }

    @Override
    public final void e(org.telegram.ui.Components.d71 d71Var, boolean z10) {
        i4 i4Var = this.f47482a.f48999y;
        if (z10) {
            org.telegram.ui.Components.d71 d71Var2 = i4Var.F0;
            if (d71Var2 != null && d71Var2 != d71Var) {
                d71Var2.f32996a.g0();
                d71Var2.n();
                d71Var2.f33007g0.d(true, true);
            }
            i4Var.F0 = d71Var;
            try {
                i4Var.M.getWindow().addFlags(128);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if (i4Var.F0 == d71Var) {
            i4Var.F0 = null;
        }
        try {
            i4Var.M.getWindow().clearFlags(128);
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final TextureView f(View view, boolean z10, int i3, int i10, boolean z11) {
        return null;
    }

    @Override
    public final ViewGroup g() {
        return null;
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final void b() {
    }

    @Override
    public final void i(boolean z10, org.telegram.ui.Components.v61 v61Var, float f10, boolean z11) {
    }
}
