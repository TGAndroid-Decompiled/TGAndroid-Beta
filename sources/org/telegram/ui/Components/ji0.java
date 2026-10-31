package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
public final class ji0 implements Runnable {
    public final int f27388a;
    public final int f27389b;
    public final Object f27390c;
    public final Object d;

    public ji0(int i10, Object obj, Object obj2, int i11) {
        this.f27388a = i11;
        this.f27389b = i10;
        this.f27390c = obj;
        this.d = obj2;
    }

    private final void a() {
        org.telegram.ui.zr0 zr0Var = (org.telegram.ui.zr0) this.f27390c;
        Bitmap bitmap = (Bitmap) this.d;
        if (this.f27389b == zr0Var.f44220a) {
            zr0Var.setImageBitmap(bitmap);
            zr0Var.f44222c = true;
            zr0Var.f44221b = false;
        }
    }

    private final void b() {
        org.telegram.ui.kt0 kt0Var = (org.telegram.ui.kt0) this.f27390c;
        int i10 = this.f27389b;
        ((org.telegram.ui.ze) this.d).a(Integer.valueOf(i10));
        boolean z10 = true;
        if (i10 != 1 && i10 != 13) {
            z10 = false;
        }
        kt0Var.c(z10);
    }

    private final void c() {
        cc a02;
        int i10;
        ProfileActivity profileActivity = (ProfileActivity) this.f27390c;
        RectF rectF = ProfileActivity.R6;
        org.telegram.messenger.i0.g((String) this.d);
        if (this.f27389b == profileActivity.V2) {
            a02 = cc.a0(profileActivity);
            i10 = 2131753721;
        } else {
            a02 = cc.a0(profileActivity);
            i10 = 2131744219;
        }
        org.telegram.messenger.z20.r(null, i10, a02);
    }

    private final void d() {
        org.telegram.ui.xx0 xx0Var = (org.telegram.ui.xx0) this.f27390c;
        s4.c1 c1Var = (s4.c1) this.d;
        xx0Var.getClass();
        int b10 = c1Var.b();
        int i10 = this.f27389b;
        if (b10 == i10 && xx0Var.e.T2 == i10 && c1Var.f47901f == 2) {
            xx0Var.t(c1Var, i10);
        }
    }

    private final void f() {
        cc.a0((org.telegram.ui.ActionBar.k2) this.f27390c).c(org.telegram.messenger.cd.L0(2131754488, null)).j();
        org.telegram.messenger.vp.r1(this.f27389b).o0(false);
        org.telegram.messenger.i0.g3((gi0) this.d);
    }

    private final void g() {
        ((org.telegram.messenger.video.a) this.f27390c).run();
        ((cc) this.d).c(org.telegram.messenger.cd.L0(2131754488, null)).j();
        org.telegram.messenger.vp.r1(this.f27389b).o0(false);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ji0.run():void");
    }

    public ji0(Object obj, int i10, Object obj2, int i11) {
        this.f27388a = i11;
        this.f27390c = obj;
        this.f27389b = i10;
        this.d = obj2;
    }

    public ji0(Object obj, Object obj2, int i10, int i11) {
        this.f27388a = i11;
        this.f27390c = obj;
        this.d = obj2;
        this.f27389b = i10;
    }
}
