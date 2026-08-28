package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class q1 implements org.telegram.ui.Components.d81 {
    public final v1 f41645a;

    public q1(v1 v1Var) {
        this.f41645a = v1Var;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f10, int i9, boolean z11) {
        v1 v1Var = this.f41645a;
        l4 l4Var = v1Var.f43363x;
        if (z10) {
            l4Var.N.addView(l4Var.M, g7.e6.c(-1.0f, -1));
            l4Var.N.setVisibility(0);
            l4Var.N.a(f10, i9);
            l4Var.A0 = v1Var.f43355b;
            l4Var.L.addView(view, g7.e6.c(-1.0f, -1));
            l4Var.L.setVisibility(0);
        } else {
            l4Var.N.removeView(l4Var.M);
            l4Var.A0 = null;
            l4Var.N.setVisibility(8);
            l4Var.L.setVisibility(4);
        }
        return l4Var.M;
    }

    @Override
    public final void c(float f10, int i9) {
        this.f41645a.f43363x.N.a(f10, i9);
    }

    @Override
    public final void d() {
        this.f41645a.f43354a.setVisibility(0);
        this.f41645a.f43355b.setVisibility(4);
        this.f41645a.f43355b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
        v1 v1Var = this.f41645a;
        v1Var.f43354a.loadUrl(v1Var.v.url, hashMap);
    }

    @Override
    public final void e(org.telegram.ui.Components.g81 g81Var, boolean z10) {
        l4 l4Var = this.f41645a.f43363x;
        if (z10) {
            org.telegram.ui.Components.g81 g81Var2 = l4Var.f40035z0;
            if (g81Var2 != null && g81Var2 != g81Var) {
                g81Var2.f28692a.C();
                g81Var2.n();
                g81Var2.f28695b0.d(true, true);
            }
            l4Var.f40035z0 = g81Var;
            try {
                l4Var.H.getWindow().addFlags(128);
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        if (l4Var.f40035z0 == g81Var) {
            l4Var.f40035z0 = null;
        }
        try {
            l4Var.H.getWindow().clearFlags(128);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    @Override
    public final TextureView f(View view, boolean z10, int i9, int i10, boolean z11) {
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
    public final void i(boolean z10, org.telegram.ui.Components.y71 y71Var, float f10, boolean z11) {
    }
}
