package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.lc1;
public final class mo implements zh {
    public final bi f36216a;
    public final TL_stories.TL_premium_boostsStatus f36217b;
    public final org.telegram.ui.ActionBar.e6 f36218c;
    public final org.telegram.ui.f d;
    public final long f36219e;
    public final org.telegram.ui.ub f36220f;
    public final org.telegram.ui.pc h;

    public mo(bi biVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.f fVar, long j10, org.telegram.ui.ub ubVar, org.telegram.ui.pc pcVar) {
        this.f36216a = biVar;
        this.f36217b = tL_premium_boostsStatus;
        this.f36218c = e6Var;
        this.d = fVar;
        this.f36219e = j10;
        this.f36220f = ubVar;
        this.h = pcVar;
    }

    @Override
    public final void I0(Object obj) {
        lo loVar = new lo(obj, null, true, 1);
        loVar.X1 = this.f36217b;
        loVar.f47141a.f47115a = this.f36218c;
        loVar.f47191r1 = this.d;
        loVar.h1(this.f36219e);
        loVar.K1 = new ko(this.f36216a, this.f36220f, 1);
        ?? obj2 = new Object();
        obj2.f27395a = true;
        obj2.f27398e = true;
        this.h.showAsSheet(loVar, obj2);
    }

    @Override
    public final boolean L1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void Y(ng ngVar) {
        ngVar.run();
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        bi biVar = this.f36216a;
        try {
            HashMap<Object, Object> selectedPhotos = biVar.f32215b2.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) selectedPhotos.values().iterator().next();
                String str = yeVar.h;
                if (str == null) {
                    str = yeVar.I;
                }
                if (str != null) {
                    File z14 = org.telegram.messenger.w7.z(4);
                    File file = new File(z14, Utilities.f21385b.nextInt() + ".jpg");
                    Point c12 = org.telegram.messenger.g0.c1();
                    Bitmap K = org.telegram.messenger.zb.K(str, null, (float) c12.x, (float) c12.y, true);
                    K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    lo loVar = new lo(new lc1(file, file, ""), K, false, 0);
                    loVar.X1 = this.f36217b;
                    loVar.f47141a.f47115a = this.f36218c;
                    loVar.f47191r1 = this.d;
                    loVar.H1 = false;
                    loVar.G1 = false;
                    loVar.f47186p1 = 0.2f;
                    loVar.h1(this.f36219e);
                    loVar.K1 = new ko(biVar, this.f36220f, 0);
                    ?? obj = new Object();
                    obj.f27395a = true;
                    obj.f27398e = true;
                    this.h.showAsSheet(loVar, obj);
                    biVar.dismiss();
                }
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override
    public final void a1(TLRPC.User user) {
    }

    @Override
    public final void r0() {
    }

    @Override
    public final void v0() {
    }

    @Override
    public final void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
    }
}
