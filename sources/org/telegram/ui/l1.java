package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
public final class l1 implements org.telegram.ui.Components.t71 {
    public final q1 f49403a;

    public l1(q1 q1Var) {
        this.f49403a = q1Var;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f10, int i7, boolean z11) {
        q1 q1Var = this.f49403a;
        g4 g4Var = q1Var.f50982y;
        if (z10) {
            g4Var.S.addView(g4Var.R, c8.ma.c(-1.0f, -1));
            g4Var.S.setVisibility(0);
            g4Var.S.a(f10, i7);
            g4Var.G0 = q1Var.f50973b;
            g4Var.Q.addView(view, c8.ma.c(-1.0f, -1));
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
        this.f49403a.f50982y.S.a(f10, 0);
    }

    @Override
    public final void d() {
        this.f49403a.f50972a.setVisibility(0);
        this.f49403a.f50973b.setVisibility(4);
        this.f49403a.f50973b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", org.telegram.messenger.t0.f26913b.getPackageName());
        q1 q1Var = this.f49403a;
        q1Var.f50972a.loadUrl(q1Var.f50980w.url, hashMap);
    }

    @Override
    public final void e(org.telegram.ui.Components.w71 w71Var, boolean z10) {
        g4 g4Var = this.f49403a.f50982y;
        if (z10) {
            org.telegram.ui.Components.w71 w71Var2 = g4Var.F0;
            if (w71Var2 != null && w71Var2 != w71Var) {
                w71Var2.f41592a.g0();
                w71Var2.n();
                w71Var2.f41603g0.d(true, true);
            }
            g4Var.F0 = w71Var;
            try {
                g4Var.M.getWindow().addFlags(128);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if (g4Var.F0 == w71Var) {
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
    public final void i(boolean z10, org.telegram.ui.Components.o71 o71Var, float f10, boolean z11) {
    }
}
