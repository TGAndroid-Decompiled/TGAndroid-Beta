package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class n1 implements org.telegram.ui.Components.ja1 {
    public final s1 f41739a;

    public n1(s1 s1Var) {
        this.f41739a = s1Var;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        s1 s1Var = this.f41739a;
        j4 j4Var = s1Var.f43337x;
        if (z10) {
            j4Var.R.addView(j4Var.Q, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            j4Var.R.setVisibility(0);
            j4Var.R.a(f7, i10);
            j4Var.F0 = s1Var.f43330b;
            j4Var.P.addView(view, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            j4Var.P.setVisibility(0);
        } else {
            j4Var.R.removeView(j4Var.Q);
            j4Var.F0 = null;
            j4Var.R.setVisibility(8);
            j4Var.P.setVisibility(4);
        }
        return j4Var.Q;
    }

    @Override
    public final void c(float f7) {
        this.f41739a.f43337x.R.a(f7, 0);
    }

    @Override
    public final void d() {
        this.f41739a.f43329a.setVisibility(0);
        this.f41739a.f43330b.setVisibility(4);
        this.f41739a.f43330b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
        s1 s1Var = this.f41739a;
        s1Var.f43329a.loadUrl(s1Var.v.url, hashMap);
    }

    @Override
    public final void e(org.telegram.ui.Components.ma1 ma1Var, boolean z10) {
        j4 j4Var = this.f41739a.f43337x;
        if (z10) {
            org.telegram.ui.Components.ma1 ma1Var2 = j4Var.E0;
            if (ma1Var2 != null && ma1Var2 != ma1Var) {
                ma1Var2.f30488a.B();
                ma1Var2.n();
                ma1Var2.f30497f0.d(true, true);
            }
            j4Var.E0 = ma1Var;
            try {
                j4Var.L.getWindow().addFlags(128);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (j4Var.E0 == ma1Var) {
            j4Var.E0 = null;
        }
        try {
            j4Var.L.getWindow().clearFlags(128);
        } catch (Exception e10) {
            FileLog.e(e10);
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
    public final void i(boolean z10, org.telegram.ui.Components.ea1 ea1Var, float f7, boolean z11) {
    }
}
