package org.telegram.ui.ActionBar;

import a8.xa;
import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
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
    public ki.e4 f28909a;
    public org.telegram.ui.web.s0 f28910b;
    public org.telegram.ui.k3 f28911c;
    public Object d;
    public boolean f28912e;
    public String f28913f;
    public int f28914g;
    public int h;
    public int f28915i;
    public boolean f28916j;
    public float f28917k = Float.MAX_VALUE;
    public boolean f28918l = true;
    public Bitmap f28919m;
    public boolean f28920n;
    public boolean f28921o;
    public int f28922p;
    public int f28923q;
    public int f28924r;
    public int f28925s;
    public boolean f28926t;
    public boolean f28927u;
    public boolean v;
    public xa f28928w;
    public String f28929x;
    public boolean f28930y;
    public boolean f28931z;

    public final void a() {
        try {
            org.telegram.ui.web.s0 s0Var = this.f28910b;
            if (s0Var != null) {
                s0Var.destroy();
                this.f28910b = null;
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
                return hd.N0(2131742660, null);
            }
            return this.E;
        }
        ki.e4 e4Var = this.f28909a;
        if (e4Var == null) {
            return "";
        }
        if (e4Var.f18681g == 6) {
            return e4Var.f18679e;
        }
        return p10.q(np.u1(e4Var.f18676a).c2(Long.valueOf(this.f28909a.f18678c)));
    }
}
