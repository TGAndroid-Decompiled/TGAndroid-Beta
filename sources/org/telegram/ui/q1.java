package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class q1 implements org.telegram.ui.Components.z91 {
    public final v1 f39323a;

    public q1(v1 v1Var) {
        this.f39323a = v1Var;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        v1 v1Var = this.f39323a;
        k4 k4Var = v1Var.f40855x;
        if (z10) {
            k4Var.R.addView(k4Var.Q, w7.a6.d(-1.0f, -1));
            k4Var.R.setVisibility(0);
            k4Var.R.a(f7, i10);
            k4Var.E0 = v1Var.f40848b;
            k4Var.P.addView(view, w7.a6.d(-1.0f, -1));
            k4Var.P.setVisibility(0);
        } else {
            k4Var.R.removeView(k4Var.Q);
            k4Var.E0 = null;
            k4Var.R.setVisibility(8);
            k4Var.P.setVisibility(4);
        }
        return k4Var.Q;
    }

    @Override
    public final void c(float f7) {
        this.f39323a.f40855x.R.a(f7, 0);
    }

    @Override
    public final void d() {
        this.f39323a.f40847a.setVisibility(0);
        this.f39323a.f40848b.setVisibility(4);
        this.f39323a.f40848b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
        v1 v1Var = this.f39323a;
        v1Var.f40847a.loadUrl(v1Var.v.url, hashMap);
    }

    @Override
    public final void e(org.telegram.ui.Components.ca1 ca1Var, boolean z10) {
        k4 k4Var = this.f39323a.f40855x;
        if (z10) {
            org.telegram.ui.Components.ca1 ca1Var2 = k4Var.D0;
            if (ca1Var2 != null && ca1Var2 != ca1Var) {
                ca1Var2.f23990a.B();
                ca1Var2.n();
                ca1Var2.f23999f0.d(true, true);
            }
            k4Var.D0 = ca1Var;
            try {
                k4Var.L.getWindow().addFlags(128);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (k4Var.D0 == ca1Var) {
            k4Var.D0 = null;
        }
        try {
            k4Var.L.getWindow().clearFlags(128);
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
    public final void i(boolean z10, org.telegram.ui.Components.u91 u91Var, float f7, boolean z11) {
    }
}
