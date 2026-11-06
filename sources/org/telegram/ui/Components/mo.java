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
import org.telegram.ui.pc1;
public final class mo implements bi {
    public final di f36049a;
    public final TL_stories.TL_premium_boostsStatus f36050b;
    public final org.telegram.ui.ActionBar.f6 f36051c;
    public final org.telegram.ui.f d;
    public final long f36052e;
    public final org.telegram.ui.wb f36053f;
    public final org.telegram.ui.rc h;

    public mo(di diVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.f fVar, long j3, org.telegram.ui.wb wbVar, org.telegram.ui.rc rcVar) {
        this.f36049a = diVar;
        this.f36050b = tL_premium_boostsStatus;
        this.f36051c = f6Var;
        this.d = fVar;
        this.f36052e = j3;
        this.f36053f = wbVar;
        this.h = rcVar;
    }

    @Override
    public final boolean G1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void M0(Object obj) {
        lo loVar = new lo(obj, null, true, 1);
        loVar.W1 = this.f36050b;
        loVar.f50244a.f50574a = this.f36051c;
        loVar.f50290q1 = this.d;
        loVar.h1(this.f36052e);
        loVar.J1 = new ko(this.f36049a, this.f36053f, 1);
        ?? obj2 = new Object();
        obj2.f27420a = true;
        obj2.f27423e = true;
        this.h.showAsSheet(loVar, obj2);
    }

    @Override
    public final void c0(qg qgVar) {
        qgVar.run();
    }

    @Override
    public final boolean f0() {
        return false;
    }

    @Override
    public final void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        di diVar = this.f36049a;
        try {
            HashMap<Object, Object> selectedPhotos = diVar.f32882a2.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) selectedPhotos.values().iterator().next();
                String str = gfVar.h;
                if (str == null) {
                    str = gfVar.I;
                }
                if (str != null) {
                    File z13 = org.telegram.messenger.w7.z(4);
                    File file = new File(z13, Utilities.f21331b.nextInt() + ".jpg");
                    Point c12 = org.telegram.messenger.g0.c1();
                    Bitmap K = org.telegram.messenger.gc.K(str, null, (float) c12.x, (float) c12.y, true);
                    K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    lo loVar = new lo(new pc1(file, file, ""), K, false, 0);
                    loVar.W1 = this.f36050b;
                    loVar.f50244a.f50574a = this.f36051c;
                    loVar.f50290q1 = this.d;
                    loVar.G1 = false;
                    loVar.F1 = false;
                    loVar.f50286o1 = 0.2f;
                    loVar.h1(this.f36052e);
                    loVar.J1 = new ko(diVar, this.f36053f, 0);
                    ?? obj = new Object();
                    obj.f27420a = true;
                    obj.f27423e = true;
                    this.h.showAsSheet(loVar, obj);
                    diVar.dismiss();
                }
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override
    public final void Y0(TLRPC.User user) {
    }

    @Override
    public final void F0() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
    }
}
