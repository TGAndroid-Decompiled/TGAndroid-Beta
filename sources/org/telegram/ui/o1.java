package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class o1 implements org.telegram.ui.Components.l91 {
    public final t1 f36029a;

    public o1(t1 t1Var) {
        this.f36029a = t1Var;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        t1 t1Var = this.f36029a;
        i4 i4Var = t1Var.f37917x;
        if (z10) {
            i4Var.R.addView(i4Var.Q, w7.y5.c(-1.0f, -1));
            i4Var.R.setVisibility(0);
            i4Var.R.a(f7, i10);
            i4Var.E0 = t1Var.f37910b;
            i4Var.P.addView(view, w7.y5.c(-1.0f, -1));
            i4Var.P.setVisibility(0);
        } else {
            i4Var.R.removeView(i4Var.Q);
            i4Var.E0 = null;
            i4Var.R.setVisibility(8);
            i4Var.P.setVisibility(4);
        }
        return i4Var.Q;
    }

    @Override
    public final void c(float f7) {
        this.f36029a.f37917x.R.a(f7, 0);
    }

    @Override
    public final void d() {
        this.f36029a.f37909a.setVisibility(0);
        this.f36029a.f37910b.setVisibility(4);
        this.f36029a.f37910b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
        t1 t1Var = this.f36029a;
        t1Var.f37909a.loadUrl(t1Var.v.url, hashMap);
    }

    @Override
    public final void e(org.telegram.ui.Components.o91 o91Var, boolean z10) {
        i4 i4Var = this.f36029a.f37917x;
        if (z10) {
            org.telegram.ui.Components.o91 o91Var2 = i4Var.D0;
            if (o91Var2 != null && o91Var2 != o91Var) {
                o91Var2.f26995a.B();
                o91Var2.n();
                o91Var2.f27004f0.d(true, true);
            }
            i4Var.D0 = o91Var;
            try {
                i4Var.L.getWindow().addFlags(128);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i4Var.D0 == o91Var) {
            i4Var.D0 = null;
        }
        try {
            i4Var.L.getWindow().clearFlags(128);
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
    public final void i(boolean z10, org.telegram.ui.Components.g91 g91Var, float f7, boolean z11) {
    }
}
