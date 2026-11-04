package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.text.TextUtils;
import b8.kg;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
public class a3 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public String E;
    public Bitmap F;
    public boolean G;
    public String H;
    public float I;
    public org.telegram.ui.i4 J;
    public ii.w0 K;
    public boolean L;
    public ii.q4 f27351a;
    public org.telegram.ui.web.t0 f27352b;
    public org.telegram.ui.l3 f27353c;
    public Object d;
    public boolean f27354e;
    public String f27355f;
    public int f27356g;
    public int h;
    public int f27357i;
    public boolean f27358j;
    public float f27359k = Float.MAX_VALUE;
    public boolean f27360l = true;
    public Bitmap f27361m;
    public boolean f27362n;
    public boolean f27363o;
    public int f27364p;
    public int f27365q;
    public int f27366r;
    public int f27367s;
    public boolean f27368t;
    public boolean f27369u;
    public boolean v;
    public kg f27370w;
    public String f27371x;
    public boolean f27372y;
    public boolean f27373z;

    public final void a() {
        try {
            org.telegram.ui.web.t0 t0Var = this.f27352b;
            if (t0Var != null) {
                t0Var.destroy();
                this.f27352b = null;
            }
            org.telegram.ui.i4 i4Var = this.J;
            if (i4Var != null) {
                i4Var.q();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public String b() {
        if (this.J != null) {
            if (TextUtils.isEmpty(this.E)) {
                return bd.M0(2131742936, null);
            }
            return this.E;
        }
        ii.q4 q4Var = this.f27351a;
        if (q4Var == null) {
            return "";
        }
        if (q4Var.f15169g == 6) {
            return q4Var.f15167e;
        }
        return l10.p(hp.s1(q4Var.f15164a).a2(Long.valueOf(this.f27351a.f15166c)));
    }
}
