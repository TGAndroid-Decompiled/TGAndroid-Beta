package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class o1 implements org.telegram.ui.Components.ja1 {
    public final t1 f40529a;

    public o1(t1 t1Var) {
        this.f40529a = t1Var;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        t1 t1Var = this.f40529a;
        i4 i4Var = t1Var.f42047x;
        if (z10) {
            i4Var.R.addView(i4Var.Q, w7.w5.d(-1.0f, -1));
            i4Var.R.setVisibility(0);
            i4Var.R.a(f7, i10);
            i4Var.E0 = t1Var.f42039b;
            i4Var.P.addView(view, w7.w5.d(-1.0f, -1));
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
        this.f40529a.f42047x.R.a(f7, 0);
    }

    @Override
    public final void d() {
        this.f40529a.f42038a.setVisibility(0);
        this.f40529a.f42039b.setVisibility(4);
        this.f40529a.f42039b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
        t1 t1Var = this.f40529a;
        t1Var.f42038a.loadUrl(t1Var.v.url, hashMap);
    }

    @Override
    public final void e(org.telegram.ui.Components.ma1 ma1Var, boolean z10) {
        i4 i4Var = this.f40529a.f42047x;
        if (z10) {
            org.telegram.ui.Components.ma1 ma1Var2 = i4Var.D0;
            if (ma1Var2 != null && ma1Var2 != ma1Var) {
                ma1Var2.f28503a.B();
                ma1Var2.n();
                ma1Var2.f28513f0.d(true, true);
            }
            i4Var.D0 = ma1Var;
            try {
                i4Var.L.getWindow().addFlags(128);
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        if (i4Var.D0 == ma1Var) {
            i4Var.D0 = null;
        }
        try {
            i4Var.L.getWindow().clearFlags(128);
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
