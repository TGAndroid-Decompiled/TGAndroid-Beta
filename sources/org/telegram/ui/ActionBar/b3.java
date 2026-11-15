package org.telegram.ui.ActionBar;

import a8.xa;
import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
public class b3 {
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
    public ki.k4 f28424a;
    public org.telegram.ui.web.s0 f28425b;
    public org.telegram.ui.k3 f28426c;
    public Object d;
    public boolean f28427e;
    public String f28428f;
    public int f28429g;
    public int h;
    public int f28430i;
    public boolean f28431j;
    public float f28432k = Float.MAX_VALUE;
    public boolean f28433l = true;
    public Bitmap f28434m;
    public boolean f28435n;
    public boolean f28436o;
    public int f28437p;
    public int f28438q;
    public int f28439r;
    public int f28440s;
    public boolean f28441t;
    public boolean f28442u;
    public boolean v;
    public xa f28443w;
    public String f28444x;
    public boolean f28445y;
    public boolean f28446z;

    public final void a() {
        try {
            org.telegram.ui.web.s0 s0Var = this.f28425b;
            if (s0Var != null) {
                s0Var.destroy();
                this.f28425b = null;
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
                return hd.M0(2131742926, null);
            }
            return this.E;
        }
        ki.k4 k4Var = this.f28424a;
        if (k4Var == null) {
            return "";
        }
        if (k4Var.f18409g == 6) {
            return k4Var.f18407e;
        }
        return q10.p(np.s1(k4Var.f18404a).a2(Long.valueOf(this.f28424a.f18406c)));
    }
}
