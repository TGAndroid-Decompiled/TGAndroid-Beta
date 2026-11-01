package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
public final class ki0 implements Runnable {
    public final int f27857a;
    public final int f27858b;
    public final Object f27859c;
    public final Object d;

    public ki0(int i10, Object obj, Object obj2, int i11) {
        this.f27857a = i11;
        this.f27858b = i10;
        this.f27859c = obj;
        this.d = obj2;
    }

    private final void a() {
        org.telegram.ui.yr0 yr0Var = (org.telegram.ui.yr0) this.f27859c;
        Bitmap bitmap = (Bitmap) this.d;
        if (this.f27858b == yr0Var.f43714a) {
            yr0Var.setImageBitmap(bitmap);
            yr0Var.f43716c = true;
            yr0Var.f43715b = false;
        }
    }

    private final void b() {
        org.telegram.ui.jt0 jt0Var = (org.telegram.ui.jt0) this.f27859c;
        int i10 = this.f27858b;
        ((org.telegram.ui.ze) this.d).a(Integer.valueOf(i10));
        boolean z10 = true;
        if (i10 != 1 && i10 != 13) {
            z10 = false;
        }
        jt0Var.c(z10);
    }

    private final void c() {
        cc a02;
        int i10;
        ProfileActivity profileActivity = (ProfileActivity) this.f27859c;
        RectF rectF = ProfileActivity.S6;
        org.telegram.messenger.i0.g((String) this.d);
        if (this.f27858b == profileActivity.V2) {
            a02 = cc.a0(profileActivity);
            i10 = 2131753721;
        } else {
            a02 = cc.a0(profileActivity);
            i10 = 2131744219;
        }
        org.telegram.messenger.a30.r(null, i10, a02);
    }

    private final void d() {
        org.telegram.ui.wx0 wx0Var = (org.telegram.ui.wx0) this.f27859c;
        s4.c1 c1Var = (s4.c1) this.d;
        wx0Var.getClass();
        int b10 = c1Var.b();
        int i10 = this.f27858b;
        if (b10 == i10 && wx0Var.e.T2 == i10 && c1Var.f47912f == 2) {
            wx0Var.t(c1Var, i10);
        }
    }

    private final void f() {
        cc.a0((org.telegram.ui.ActionBar.k2) this.f27859c).c(org.telegram.messenger.dd.L0(2131754488, null)).j();
        org.telegram.messenger.wp.r1(this.f27858b).o0(false);
        org.telegram.messenger.i0.g3((hi0) this.d);
    }

    private final void g() {
        ((org.telegram.messenger.video.a) this.f27859c).run();
        ((cc) this.d).c(org.telegram.messenger.dd.L0(2131754488, null)).j();
        org.telegram.messenger.wp.r1(this.f27858b).o0(false);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ki0.run():void");
    }

    public ki0(Object obj, int i10, Object obj2, int i11) {
        this.f27857a = i11;
        this.f27859c = obj;
        this.f27858b = i10;
        this.d = obj2;
    }

    public ki0(Object obj, Object obj2, int i10, int i11) {
        this.f27857a = i11;
        this.f27859c = obj;
        this.d = obj2;
        this.f27858b = i10;
    }
}
