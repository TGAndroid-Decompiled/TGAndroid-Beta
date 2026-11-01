package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i20;
import org.telegram.messenger.wp;
public class h3 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public String E;
    public Bitmap F;
    public boolean G;
    public String H;
    public float I;
    public org.telegram.ui.h4 J;
    public xh.s0 K;
    public boolean L;
    public xh.t3 f20355a;
    public org.telegram.ui.web.v0 f20356b;
    public org.telegram.ui.l3 f20357c;
    public Object d;
    public boolean e;
    public String f20358f;
    public int f20359g;
    public int h;
    public int f20360i;
    public boolean f20361j;
    public float f20362k = Float.MAX_VALUE;
    public boolean f20363l = true;
    public Bitmap f20364m;
    public boolean f20365n;
    public boolean f20366o;
    public int f20367p;
    public int f20368q;
    public int f20369r;
    public int f20370s;
    public boolean f20371t;
    public boolean f20372u;
    public boolean v;
    public a5.a f20373w;
    public String f20374x;
    public boolean f20375y;
    public boolean f20376z;

    public final void a() {
        try {
            org.telegram.ui.web.v0 v0Var = this.f20356b;
            if (v0Var != null) {
                v0Var.destroy();
                this.f20356b = null;
            }
            org.telegram.ui.h4 h4Var = this.J;
            if (h4Var != null) {
                h4Var.q();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public String b() {
        if (this.J != null) {
            if (TextUtils.isEmpty(this.E)) {
                return dd.L0(2131742952, null);
            }
            return this.E;
        }
        xh.t3 t3Var = this.f20355a;
        if (t3Var == null) {
            return "";
        }
        if (t3Var.f54074g == 6) {
            return t3Var.e;
        }
        return i20.p(wp.r1(t3Var.f54070a).Z1(Long.valueOf(this.f20355a.f54072c)));
    }
}
