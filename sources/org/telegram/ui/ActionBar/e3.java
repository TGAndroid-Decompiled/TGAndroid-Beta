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
    public ki.e4 f28875a;
    public org.telegram.ui.web.s0 f28876b;
    public org.telegram.ui.k3 f28877c;
    public Object d;
    public boolean f28878e;
    public String f28879f;
    public int f28880g;
    public int h;
    public int f28881i;
    public boolean f28882j;
    public float f28883k = Float.MAX_VALUE;
    public boolean f28884l = true;
    public Bitmap f28885m;
    public boolean f28886n;
    public boolean f28887o;
    public int f28888p;
    public int f28889q;
    public int f28890r;
    public int f28891s;
    public boolean f28892t;
    public boolean f28893u;
    public boolean v;
    public xa f28894w;
    public String f28895x;
    public boolean f28896y;
    public boolean f28897z;

    public final void a() {
        try {
            org.telegram.ui.web.s0 s0Var = this.f28876b;
            if (s0Var != null) {
                s0Var.destroy();
                this.f28876b = null;
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
                return hd.N0(2131742662, null);
            }
            return this.E;
        }
        ki.e4 e4Var = this.f28875a;
        if (e4Var == null) {
            return "";
        }
        if (e4Var.f18647g == 6) {
            return e4Var.f18645e;
        }
        return p10.q(np.u1(e4Var.f18642a).c2(Long.valueOf(this.f28875a.f18644c)));
    }
}
