package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class q1 implements org.telegram.ui.Components.s91 {
    public final v1 f40346a;

    public q1(v1 v1Var) {
        this.f40346a = v1Var;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        v1 v1Var = this.f40346a;
        l4 l4Var = v1Var.f42088x;
        if (z10) {
            l4Var.R.addView(l4Var.Q, w7.z5.c(-1.0f, -1));
            l4Var.R.setVisibility(0);
            l4Var.R.a(f7, i10);
            l4Var.E0 = v1Var.f42081b;
            l4Var.P.addView(view, w7.z5.c(-1.0f, -1));
            l4Var.P.setVisibility(0);
        } else {
            l4Var.R.removeView(l4Var.Q);
            l4Var.E0 = null;
            l4Var.R.setVisibility(8);
            l4Var.P.setVisibility(4);
        }
        return l4Var.Q;
    }

    @Override
    public final void c(float f7) {
        this.f40346a.f42088x.R.a(f7, 0);
    }

    @Override
    public final void d() {
        this.f40346a.f42080a.setVisibility(0);
        this.f40346a.f42081b.setVisibility(4);
        this.f40346a.f42081b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
        v1 v1Var = this.f40346a;
        v1Var.f42080a.loadUrl(v1Var.v.url, hashMap);
    }

    @Override
    public final void e(org.telegram.ui.Components.v91 v91Var, boolean z10) {
        l4 l4Var = this.f40346a.f42088x;
        if (z10) {
            org.telegram.ui.Components.v91 v91Var2 = l4Var.D0;
            if (v91Var2 != null && v91Var2 != v91Var) {
                v91Var2.f31221a.B();
                v91Var2.n();
                v91Var2.f31230f0.d(true, true);
            }
            l4Var.D0 = v91Var;
            try {
                l4Var.L.getWindow().addFlags(128);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (l4Var.D0 == v91Var) {
            l4Var.D0 = null;
        }
        try {
            l4Var.L.getWindow().clearFlags(128);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
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
    public final void i(boolean z10, org.telegram.ui.Components.n91 n91Var, float f7, boolean z11) {
    }
}
