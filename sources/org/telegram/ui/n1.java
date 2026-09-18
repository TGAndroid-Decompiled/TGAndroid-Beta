package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class n1 implements org.telegram.ui.Components.n91 {
    public final s1 f35795a;

    public n1(s1 s1Var) {
        this.f35795a = s1Var;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        s1 s1Var = this.f35795a;
        h4 h4Var = s1Var.f37178x;
        if (z10) {
            h4Var.R.addView(h4Var.Q, w7.y5.c(-1.0f, -1));
            h4Var.R.setVisibility(0);
            h4Var.R.a(f7, i10);
            h4Var.E0 = s1Var.f37171b;
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
        this.f35795a.f37178x.R.a(f7, 0);
    }

    @Override
    public final void d() {
        this.f35795a.f37170a.setVisibility(0);
        this.f35795a.f37171b.setVisibility(4);
        this.f35795a.f37171b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
        s1 s1Var = this.f35795a;
        s1Var.f37170a.loadUrl(s1Var.v.url, hashMap);
    }

    @Override
    public final void e(org.telegram.ui.Components.q91 q91Var, boolean z10) {
        h4 h4Var = this.f35795a.f37178x;
        if (z10) {
            org.telegram.ui.Components.q91 q91Var2 = h4Var.D0;
            if (q91Var2 != null && q91Var2 != q91Var) {
                q91Var2.f27509a.B();
                q91Var2.n();
                q91Var2.f27518f0.d(true, true);
            }
            h4Var.D0 = q91Var;
            try {
                h4Var.L.getWindow().addFlags(128);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (h4Var.D0 == q91Var) {
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
    public final void i(boolean z10, org.telegram.ui.Components.i91 i91Var, float f7, boolean z11) {
    }
}
