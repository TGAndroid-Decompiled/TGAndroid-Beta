package org.telegram.ui.ActionBar;

import a8.xa;
import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
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
    public ki.e4 f28906a;
    public org.telegram.ui.web.s0 f28907b;
    public org.telegram.ui.k3 f28908c;
    public Object d;
    public boolean f28909e;
    public String f28910f;
    public int f28911g;
    public int h;
    public int f28912i;
    public boolean f28913j;
    public float f28914k = Float.MAX_VALUE;
    public boolean f28915l = true;
    public Bitmap f28916m;
    public boolean f28917n;
    public boolean f28918o;
    public int f28919p;
    public int f28920q;
    public int f28921r;
    public int f28922s;
    public boolean f28923t;
    public boolean f28924u;
    public boolean v;
    public xa f28925w;
    public String f28926x;
    public boolean f28927y;
    public boolean f28928z;

    public final void a() {
        try {
            org.telegram.ui.web.s0 s0Var = this.f28907b;
            if (s0Var != null) {
                s0Var.destroy();
                this.f28907b = null;
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
                return gd.N0(2131742662, null);
            }
            return this.E;
        }
        ki.e4 e4Var = this.f28906a;
        if (e4Var == null) {
            return "";
        }
        if (e4Var.f18678g == 6) {
            return e4Var.f18676e;
        }
        return o10.q(mp.u1(e4Var.f18673a).c2(Long.valueOf(this.f28906a.f18675c)));
    }
}
