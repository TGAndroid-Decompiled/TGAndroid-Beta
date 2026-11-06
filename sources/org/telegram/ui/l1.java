package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
public final class l1 implements org.telegram.ui.Components.c71 {
    public final q1 f47353a;

    public l1(q1 q1Var) {
        this.f47353a = q1Var;
    }

    @Override
    public final TextureView a(View view, boolean z9, float f10, int i7, boolean z10) {
        q1 q1Var = this.f47353a;
        g4 g4Var = q1Var.f48982y;
        if (z9) {
            g4Var.R.addView(g4Var.Q, c8.ha.c(-1.0f, -1));
            g4Var.R.setVisibility(0);
            g4Var.R.a(f10, i7);
            g4Var.F0 = q1Var.f48973b;
            g4Var.P.addView(view, c8.ha.c(-1.0f, -1));
            g4Var.P.setVisibility(0);
        } else {
            g4Var.R.removeView(g4Var.Q);
            g4Var.F0 = null;
            g4Var.R.setVisibility(8);
            g4Var.P.setVisibility(4);
        }
        return g4Var.Q;
    }

    @Override
    public final void c(float f10) {
        this.f47353a.f48982y.R.a(f10, 0);
    }

    @Override
    public final void d() {
        this.f47353a.f48972a.setVisibility(0);
        this.f47353a.f48973b.setVisibility(4);
        this.f47353a.f48973b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", org.telegram.messenger.t0.f25555b.getPackageName());
        q1 q1Var = this.f47353a;
        q1Var.f48972a.loadUrl(q1Var.f48980w.url, hashMap);
    }

    @Override
    public final void e(org.telegram.ui.Components.f71 f71Var, boolean z9) {
        g4 g4Var = this.f47353a.f48982y;
        if (z9) {
            org.telegram.ui.Components.f71 f71Var2 = g4Var.E0;
            if (f71Var2 != null && f71Var2 != f71Var) {
                f71Var2.f33515a.g0();
                f71Var2.n();
                f71Var2.f33525f0.d(true, true);
            }
            g4Var.E0 = f71Var;
            try {
                g4Var.L.getWindow().addFlags(128);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if (g4Var.E0 == f71Var) {
            g4Var.E0 = null;
        }
        try {
            g4Var.L.getWindow().clearFlags(128);
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final TextureView f(View view, boolean z9, int i7, int i10, boolean z10) {
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
    public final void i(boolean z9, org.telegram.ui.Components.x61 x61Var, float f10, boolean z10) {
    }
}
