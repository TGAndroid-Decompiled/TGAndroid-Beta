package org.telegram.ui.ActionBar;

import a8.wa;
import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
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
    public hi.q4 f27374a;
    public org.telegram.ui.web.u0 f27375b;
    public org.telegram.ui.k3 f27376c;
    public Object d;
    public boolean f27377e;
    public String f27378f;
    public int f27379g;
    public int h;
    public int f27380i;
    public boolean f27381j;
    public float f27382k = Float.MAX_VALUE;
    public boolean f27383l = true;
    public Bitmap f27384m;
    public boolean f27385n;
    public boolean f27386o;
    public int f27387p;
    public int f27388q;
    public int f27389r;
    public int f27390s;
    public boolean f27391t;
    public boolean f27392u;
    public boolean v;
    public wa f27393w;
    public String f27394x;
    public boolean f27395y;
    public boolean f27396z;

    public final void a() {
        try {
            org.telegram.ui.web.u0 u0Var = this.f27375b;
            if (u0Var != null) {
                u0Var.destroy();
                this.f27375b = null;
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
                return id.M0(2131742929, null);
            }
            return this.E;
        }
        hi.q4 q4Var = this.f27374a;
        if (q4Var == null) {
            return "";
        }
        if (q4Var.f14894g == 6) {
            return q4Var.f14892e;
        }
        return t10.p(qp.s1(q4Var.f14889a).a2(Long.valueOf(this.f27374a.f14891c)));
    }
}
