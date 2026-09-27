package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class p1 implements org.telegram.ui.Components.n91 {
    public final u1 f36289a;

    public p1(u1 u1Var) {
        this.f36289a = u1Var;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        u1 u1Var = this.f36289a;
        j4 j4Var = u1Var.f38103x;
        if (z10) {
            j4Var.R.addView(j4Var.Q, w7.y5.c(-1.0f, -1));
            j4Var.R.setVisibility(0);
            j4Var.R.a(f7, i10);
            j4Var.E0 = u1Var.f38096b;
            j4Var.P.addView(view, w7.y5.c(-1.0f, -1));
            j4Var.P.setVisibility(0);
        } else {
            j4Var.R.removeView(j4Var.Q);
            j4Var.E0 = null;
            j4Var.R.setVisibility(8);
            j4Var.P.setVisibility(4);
        }
        return j4Var.Q;
    }

    @Override
    public final void c(float f7) {
        this.f36289a.f38103x.R.a(f7, 0);
    }

    @Override
    public final void d() {
        this.f36289a.f38095a.setVisibility(0);
        this.f36289a.f38096b.setVisibility(4);
        this.f36289a.f38096b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
        u1 u1Var = this.f36289a;
        u1Var.f38095a.loadUrl(u1Var.v.url, hashMap);
    }

    @Override
    public final void e(org.telegram.ui.Components.q91 q91Var, boolean z10) {
        j4 j4Var = this.f36289a.f38103x;
        if (z10) {
            org.telegram.ui.Components.q91 q91Var2 = j4Var.D0;
            if (q91Var2 != null && q91Var2 != q91Var) {
                q91Var2.f27651a.B();
                q91Var2.n();
                q91Var2.f27660f0.d(true, true);
            }
            j4Var.D0 = q91Var;
            try {
                j4Var.L.getWindow().addFlags(128);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (j4Var.D0 == q91Var) {
            j4Var.D0 = null;
        }
        try {
            j4Var.L.getWindow().clearFlags(128);
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
    public final void i(boolean z10, org.telegram.ui.Components.i91 i91Var, float f7, boolean z11) {
    }
}
