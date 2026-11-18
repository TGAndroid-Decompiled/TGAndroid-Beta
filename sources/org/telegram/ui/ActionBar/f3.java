package org.telegram.ui.ActionBar;

import a8.xa;
import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
public class f3 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public String E;
    public Bitmap F;
    public boolean G;
    public String H;
    public float I;
    public org.telegram.ui.g4 J;
    public ki.w0 K;
    public boolean L;
    public ki.f4 f28925a;
    public org.telegram.ui.web.s0 f28926b;
    public org.telegram.ui.k3 f28927c;
    public Object d;
    public boolean f28928e;
    public String f28929f;
    public int f28930g;
    public int h;
    public int f28931i;
    public boolean f28932j;
    public float f28933k = Float.MAX_VALUE;
    public boolean f28934l = true;
    public Bitmap f28935m;
    public boolean f28936n;
    public boolean f28937o;
    public int f28938p;
    public int f28939q;
    public int f28940r;
    public int f28941s;
    public boolean f28942t;
    public boolean f28943u;
    public boolean v;
    public xa f28944w;
    public String f28945x;
    public boolean f28946y;
    public boolean f28947z;

    public final void a() {
        try {
            org.telegram.ui.web.s0 s0Var = this.f28926b;
            if (s0Var != null) {
                s0Var.destroy();
                this.f28926b = null;
            }
            org.telegram.ui.g4 g4Var = this.J;
            if (g4Var != null) {
                g4Var.q();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public String b() {
        if (this.J != null) {
            if (TextUtils.isEmpty(this.E)) {
                return gd.M0(2131742668, null);
            }
            return this.E;
        }
        ki.f4 f4Var = this.f28925a;
        if (f4Var == null) {
            return "";
        }
        if (f4Var.f18668g == 6) {
            return f4Var.f18666e;
        }
        return o10.q(mp.u1(f4Var.f18663a).c2(Long.valueOf(this.f28925a.f18665c)));
    }
}
