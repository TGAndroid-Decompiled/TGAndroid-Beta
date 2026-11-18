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
    public ki.f4 f28927a;
    public org.telegram.ui.web.s0 f28928b;
    public org.telegram.ui.k3 f28929c;
    public Object d;
    public boolean f28930e;
    public String f28931f;
    public int f28932g;
    public int h;
    public int f28933i;
    public boolean f28934j;
    public float f28935k = Float.MAX_VALUE;
    public boolean f28936l = true;
    public Bitmap f28937m;
    public boolean f28938n;
    public boolean f28939o;
    public int f28940p;
    public int f28941q;
    public int f28942r;
    public int f28943s;
    public boolean f28944t;
    public boolean f28945u;
    public boolean v;
    public xa f28946w;
    public String f28947x;
    public boolean f28948y;
    public boolean f28949z;

    public final void a() {
        try {
            org.telegram.ui.web.s0 s0Var = this.f28928b;
            if (s0Var != null) {
                s0Var.destroy();
                this.f28928b = null;
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
        ki.f4 f4Var = this.f28927a;
        if (f4Var == null) {
            return "";
        }
        if (f4Var.f18671g == 6) {
            return f4Var.f18669e;
        }
        return o10.q(mp.u1(f4Var.f18666a).c2(Long.valueOf(this.f28927a.f18668c)));
    }
}
