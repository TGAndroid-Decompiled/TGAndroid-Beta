package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class n1 implements org.telegram.ui.Components.ka1 {
    public final s1 f41597a;

    public n1(s1 s1Var) {
        this.f41597a = s1Var;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        s1 s1Var = this.f41597a;
        j4 j4Var = s1Var.f43217x;
        if (z10) {
            j4Var.R.addView(j4Var.Q, org.telegram.ui.Components.kb1.g(-1.0f, -1));
            j4Var.R.setVisibility(0);
            j4Var.R.a(f7, i10);
            j4Var.F0 = s1Var.f43210b;
            j4Var.P.addView(view, org.telegram.ui.Components.kb1.g(-1.0f, -1));
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
        this.f41597a.f43217x.R.a(f7, 0);
    }

    @Override
    public final void d() {
        this.f41597a.f43209a.setVisibility(0);
        this.f41597a.f43210b.setVisibility(4);
        this.f41597a.f43210b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
        s1 s1Var = this.f41597a;
        s1Var.f43209a.loadUrl(s1Var.v.url, hashMap);
    }

    @Override
    public final void e(org.telegram.ui.Components.na1 na1Var, boolean z10) {
        j4 j4Var = this.f41597a.f43217x;
        if (z10) {
            org.telegram.ui.Components.na1 na1Var2 = j4Var.E0;
            if (na1Var2 != null && na1Var2 != na1Var) {
                na1Var2.f30807a.B();
                na1Var2.n();
                na1Var2.f30816f0.d(true, true);
            }
            j4Var.E0 = na1Var;
            try {
                j4Var.L.getWindow().addFlags(128);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (j4Var.E0 == na1Var) {
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
    public final void i(boolean z10, org.telegram.ui.Components.fa1 fa1Var, float f7, boolean z11) {
    }
}
