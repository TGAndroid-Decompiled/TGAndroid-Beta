package org.telegram.ui.ActionBar;

import a8.xa;
import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
public class e3 {
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
    public ki.v0 K;
    public boolean L;
    public ki.f4 f28952a;
    public org.telegram.ui.web.s0 f28953b;
    public org.telegram.ui.k3 f28954c;
    public Object d;
    public boolean f28955e;
    public String f28956f;
    public int f28957g;
    public int h;
    public int f28958i;
    public boolean f28959j;
    public float f28960k = Float.MAX_VALUE;
    public boolean f28961l = true;
    public Bitmap f28962m;
    public boolean f28963n;
    public boolean f28964o;
    public int f28965p;
    public int f28966q;
    public int f28967r;
    public int f28968s;
    public boolean f28969t;
    public boolean f28970u;
    public boolean v;
    public xa f28971w;
    public String f28972x;
    public boolean f28973y;
    public boolean f28974z;

    public final void a() {
        try {
            org.telegram.ui.web.s0 s0Var = this.f28953b;
            if (s0Var != null) {
                s0Var.destroy();
                this.f28953b = null;
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
                return gd.N0(2131742655, null);
            }
            return this.E;
        }
        ki.f4 f4Var = this.f28952a;
        if (f4Var == null) {
            return "";
        }
        if (f4Var.f18772g == 6) {
            return f4Var.f18770e;
        }
        return n10.q(mp.u1(f4Var.f18767a).c2(Long.valueOf(this.f28952a.f18769c)));
    }
}
