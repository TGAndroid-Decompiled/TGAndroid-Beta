package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class n1 implements org.telegram.ui.Components.m91 {
    public final s1 f35870a;

    public n1(s1 s1Var) {
        this.f35870a = s1Var;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        s1 s1Var = this.f35870a;
        h4 h4Var = s1Var.f37273x;
        if (z10) {
            h4Var.R.addView(h4Var.Q, w7.y5.c(-1.0f, -1));
            h4Var.R.setVisibility(0);
            h4Var.R.a(f7, i10);
            h4Var.E0 = s1Var.f37266b;
            h4Var.P.addView(view, w7.y5.c(-1.0f, -1));
            h4Var.P.setVisibility(0);
        } else {
            h4Var.R.removeView(h4Var.Q);
            h4Var.E0 = null;
            h4Var.R.setVisibility(8);
            h4Var.P.setVisibility(4);
        }
        return h4Var.Q;
    }

    @Override
    public final void c(float f7) {
        this.f35870a.f37273x.R.a(f7, 0);
    }

    @Override
    public final void d() {
        this.f35870a.f37265a.setVisibility(0);
        this.f35870a.f37266b.setVisibility(4);
        this.f35870a.f37266b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
        s1 s1Var = this.f35870a;
        s1Var.f37265a.loadUrl(s1Var.v.url, hashMap);
    }

    @Override
    public final void e(org.telegram.ui.Components.p91 p91Var, boolean z10) {
        h4 h4Var = this.f35870a.f37273x;
        if (z10) {
            org.telegram.ui.Components.p91 p91Var2 = h4Var.D0;
            if (p91Var2 != null && p91Var2 != p91Var) {
                p91Var2.f27211a.B();
                p91Var2.n();
                p91Var2.f27220f0.d(true, true);
            }
            h4Var.D0 = p91Var;
            try {
                h4Var.L.getWindow().addFlags(128);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (h4Var.D0 == p91Var) {
            h4Var.D0 = null;
        }
        try {
            h4Var.L.getWindow().clearFlags(128);
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
    public final void i(boolean z10, org.telegram.ui.Components.h91 h91Var, float f7, boolean z11) {
    }
}
