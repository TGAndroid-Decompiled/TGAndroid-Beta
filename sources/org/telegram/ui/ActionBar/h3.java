package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;
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
    public xh.s3 f20354a;
    public org.telegram.ui.web.v0 f20355b;
    public org.telegram.ui.l3 f20356c;
    public Object d;
    public boolean e;
    public String f20357f;
    public int f20358g;
    public int h;
    public int f20359i;
    public boolean f20360j;
    public float f20361k = Float.MAX_VALUE;
    public boolean f20362l = true;
    public Bitmap f20363m;
    public boolean f20364n;
    public boolean f20365o;
    public int f20366p;
    public int f20367q;
    public int f20368r;
    public int f20369s;
    public boolean f20370t;
    public boolean f20371u;
    public boolean v;
    public a5.a f20372w;
    public String f20373x;
    public boolean f20374y;
    public boolean f20375z;

    public final void a() {
        try {
            org.telegram.ui.web.v0 v0Var = this.f20355b;
            if (v0Var != null) {
                v0Var.destroy();
                this.f20355b = null;
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
                return cd.L0(2131742952, null);
            }
            return this.E;
        }
        xh.s3 s3Var = this.f20354a;
        if (s3Var == null) {
            return "";
        }
        if (s3Var.f54044g == 6) {
            return s3Var.e;
        }
        return h20.p(vp.r1(s3Var.f54040a).Z1(Long.valueOf(this.f20354a.f54042c)));
    }
}
