package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class p1 implements org.telegram.ui.Components.b91 {
    public final u1 f37149a;

    public p1(u1 u1Var) {
        this.f37149a = u1Var;
    }

    @Override
    public final TextureView a(View view, boolean z4, float f10, int i10, boolean z10) {
        u1 u1Var = this.f37149a;
        l4 l4Var = u1Var.f38817x;
        if (z4) {
            l4Var.O.addView(l4Var.N, k7.b6.c(-1.0f, -1));
            l4Var.O.setVisibility(0);
            l4Var.O.a(f10, i10);
            l4Var.B0 = u1Var.f38810b;
            l4Var.M.addView(view, k7.b6.c(-1.0f, -1));
            l4Var.M.setVisibility(0);
        } else {
            l4Var.O.removeView(l4Var.N);
            l4Var.B0 = null;
            l4Var.O.setVisibility(8);
            l4Var.M.setVisibility(4);
        }
        return l4Var.N;
    }

    @Override
    public final void c(float f10, int i10) {
        this.f37149a.f38817x.O.a(f10, i10);
    }

    @Override
    public final void d() {
        this.f37149a.f38809a.setVisibility(0);
        this.f37149a.f38810b.setVisibility(4);
        this.f37149a.f38810b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
        u1 u1Var = this.f37149a;
        u1Var.f38809a.loadUrl(u1Var.v.url, hashMap);
    }

    @Override
    public final void e(org.telegram.ui.Components.e91 e91Var, boolean z4) {
        l4 l4Var = this.f37149a.f38817x;
        if (z4) {
            org.telegram.ui.Components.e91 e91Var2 = l4Var.A0;
            if (e91Var2 != null && e91Var2 != e91Var) {
                e91Var2.f24524a.B();
                e91Var2.n();
                e91Var2.f24529c0.d(true, true);
            }
            l4Var.A0 = e91Var;
            try {
                l4Var.I.getWindow().addFlags(128);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (l4Var.A0 == e91Var) {
            l4Var.A0 = null;
        }
        try {
            l4Var.I.getWindow().clearFlags(128);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final TextureView f(View view, boolean z4, int i10, int i11, boolean z10) {
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
    public final void i(boolean z4, org.telegram.ui.Components.w81 w81Var, float f10, boolean z10) {
    }
}
