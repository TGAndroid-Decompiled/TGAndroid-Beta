package org.telegram.ui.ActionBar;

import a8.wa;
import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
public class c3 {
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
    public hi.v0 K;
    public boolean L;
    public hi.q4 f27371a;
    public org.telegram.ui.web.u0 f27372b;
    public org.telegram.ui.k3 f27373c;
    public Object d;
    public boolean f27374e;
    public String f27375f;
    public int f27376g;
    public int h;
    public int f27377i;
    public boolean f27378j;
    public float f27379k = Float.MAX_VALUE;
    public boolean f27380l = true;
    public Bitmap f27381m;
    public boolean f27382n;
    public boolean f27383o;
    public int f27384p;
    public int f27385q;
    public int f27386r;
    public int f27387s;
    public boolean f27388t;
    public boolean f27389u;
    public boolean v;
    public wa f27390w;
    public String f27391x;
    public boolean f27392y;
    public boolean f27393z;

    public final void a() {
        try {
            org.telegram.ui.web.u0 u0Var = this.f27372b;
            if (u0Var != null) {
                u0Var.destroy();
                this.f27372b = null;
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
                return hd.M0(2131742927, null);
            }
            return this.E;
        }
        hi.q4 q4Var = this.f27371a;
        if (q4Var == null) {
            return "";
        }
        if (q4Var.f14891g == 6) {
            return q4Var.f14889e;
        }
        return t10.p(qp.s1(q4Var.f14886a).a2(Long.valueOf(this.f27371a.f14888c)));
    }
}
