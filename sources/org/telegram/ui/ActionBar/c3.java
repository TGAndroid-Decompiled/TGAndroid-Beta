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
    public hi.q4 f27370a;
    public org.telegram.ui.web.u0 f27371b;
    public org.telegram.ui.k3 f27372c;
    public Object d;
    public boolean f27373e;
    public String f27374f;
    public int f27375g;
    public int h;
    public int f27376i;
    public boolean f27377j;
    public float f27378k = Float.MAX_VALUE;
    public boolean f27379l = true;
    public Bitmap f27380m;
    public boolean f27381n;
    public boolean f27382o;
    public int f27383p;
    public int f27384q;
    public int f27385r;
    public int f27386s;
    public boolean f27387t;
    public boolean f27388u;
    public boolean v;
    public wa f27389w;
    public String f27390x;
    public boolean f27391y;
    public boolean f27392z;

    public final void a() {
        try {
            org.telegram.ui.web.u0 u0Var = this.f27371b;
            if (u0Var != null) {
                u0Var.destroy();
                this.f27371b = null;
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
        hi.q4 q4Var = this.f27370a;
        if (q4Var == null) {
            return "";
        }
        if (q4Var.f14891g == 6) {
            return q4Var.f14889e;
        }
        return t10.p(qp.s1(q4Var.f14886a).a2(Long.valueOf(this.f27370a.f14888c)));
    }
}
