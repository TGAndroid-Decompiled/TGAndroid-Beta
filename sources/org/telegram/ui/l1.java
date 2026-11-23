package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
public final class l1 implements org.telegram.ui.Components.x71 {
    public final q1 f49565a;

    public l1(q1 q1Var) {
        this.f49565a = q1Var;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f10, int i7, boolean z11) {
        q1 q1Var = this.f49565a;
        g4 g4Var = q1Var.f51219y;
        if (z10) {
            g4Var.S.addView(g4Var.R, c8.na.c(-1.0f, -1));
            g4Var.S.setVisibility(0);
            g4Var.S.a(f10, i7);
            g4Var.G0 = q1Var.f51210b;
            g4Var.Q.addView(view, c8.na.c(-1.0f, -1));
            g4Var.Q.setVisibility(0);
        } else {
            g4Var.S.removeView(g4Var.R);
            g4Var.G0 = null;
            g4Var.S.setVisibility(8);
            g4Var.Q.setVisibility(4);
        }
        return g4Var.R;
    }

    @Override
    public final void c(float f10) {
        this.f49565a.f51219y.S.a(f10, 0);
    }

    @Override
    public final void d() {
        this.f49565a.f51209a.setVisibility(0);
        this.f49565a.f51210b.setVisibility(4);
        this.f49565a.f51210b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", org.telegram.messenger.t0.f27013b.getPackageName());
        q1 q1Var = this.f49565a;
        q1Var.f51209a.loadUrl(q1Var.f51217w.url, hashMap);
    }

    @Override
    public final void e(org.telegram.ui.Components.a81 a81Var, boolean z10) {
        g4 g4Var = this.f49565a.f51219y;
        if (z10) {
            org.telegram.ui.Components.a81 a81Var2 = g4Var.F0;
            if (a81Var2 != null && a81Var2 != a81Var) {
                a81Var2.f33397a.g0();
                a81Var2.n();
                a81Var2.f33408g0.d(true, true);
            }
            g4Var.F0 = a81Var;
            try {
                g4Var.M.getWindow().addFlags(128);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if (g4Var.F0 == a81Var) {
            g4Var.F0 = null;
        }
        try {
            g4Var.M.getWindow().clearFlags(128);
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final TextureView f(View view, boolean z10, int i7, int i10, boolean z11) {
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
    public final void i(boolean z10, org.telegram.ui.Components.s71 s71Var, float f10, boolean z11) {
    }
}
