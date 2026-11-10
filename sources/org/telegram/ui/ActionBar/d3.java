package org.telegram.ui.ActionBar;

import a8.wa;
import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
public class d3 {
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
    public hi.q4 f27392a;
    public org.telegram.ui.web.u0 f27393b;
    public org.telegram.ui.k3 f27394c;
    public Object d;
    public boolean f27395e;
    public String f27396f;
    public int f27397g;
    public int h;
    public int f27398i;
    public boolean f27399j;
    public float f27400k = Float.MAX_VALUE;
    public boolean f27401l = true;
    public Bitmap f27402m;
    public boolean f27403n;
    public boolean f27404o;
    public int f27405p;
    public int f27406q;
    public int f27407r;
    public int f27408s;
    public boolean f27409t;
    public boolean f27410u;
    public boolean v;
    public wa f27411w;
    public String f27412x;
    public boolean f27413y;
    public boolean f27414z;

    public final void a() {
        try {
            org.telegram.ui.web.u0 u0Var = this.f27393b;
            if (u0Var != null) {
                u0Var.destroy();
                this.f27393b = null;
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
                return id.M0(2131742926, null);
            }
            return this.E;
        }
        hi.q4 q4Var = this.f27392a;
        if (q4Var == null) {
            return "";
        }
        if (q4Var.f14896g == 6) {
            return q4Var.f14894e;
        }
        return t10.p(qp.s1(q4Var.f14891a).a2(Long.valueOf(this.f27392a.f14893c)));
    }
}
