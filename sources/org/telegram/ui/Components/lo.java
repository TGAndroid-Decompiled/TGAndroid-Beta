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
import org.telegram.ui.uc1;
public final class lo implements ai {
    public final ci f35703a;
    public final TL_stories.TL_premium_boostsStatus f35704b;
    public final org.telegram.ui.ActionBar.h6 f35705c;
    public final org.telegram.ui.f d;
    public final long f35706e;
    public final org.telegram.ui.wb f35707f;
    public final org.telegram.ui.rc h;

    public lo(ci ciVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.f fVar, long j3, org.telegram.ui.wb wbVar, org.telegram.ui.rc rcVar) {
        this.f35703a = ciVar;
        this.f35704b = tL_premium_boostsStatus;
        this.f35705c = h6Var;
        this.d = fVar;
        this.f35706e = j3;
        this.f35707f = wbVar;
        this.h = rcVar;
    }

    @Override
    public final boolean G1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void M0(Object obj) {
        ko koVar = new ko(obj, null, true, 1);
        koVar.W1 = this.f35704b;
        koVar.f51561a.f51930a = this.f35705c;
        koVar.f51607q1 = this.d;
        koVar.h1(this.f35706e);
        koVar.J1 = new jo(this.f35703a, this.f35707f, 1);
        ?? obj2 = new Object();
        obj2.f27388a = true;
        obj2.f27391e = true;
        this.h.showAsSheet(koVar, obj2);
    }

    @Override
    public final void c0(pg pgVar) {
        pgVar.run();
    }

    @Override
    public final boolean f0() {
        return false;
    }

    @Override
    public final void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        ci ciVar = this.f35703a;
        try {
            HashMap<Object, Object> selectedPhotos = ciVar.d2.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) selectedPhotos.values().iterator().next();
                String str = gfVar.h;
                if (str == null) {
                    str = gfVar.I;
                }
                if (str != null) {
                    File z13 = org.telegram.messenger.w7.z(4);
                    File file = new File(z13, Utilities.f21339b.nextInt() + ".jpg");
                    Point c12 = org.telegram.messenger.g0.c1();
                    Bitmap K = org.telegram.messenger.gc.K(str, null, (float) c12.x, (float) c12.y, true);
                    K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    ko koVar = new ko(new uc1(file, file, ""), K, false, 0);
                    koVar.W1 = this.f35704b;
                    koVar.f51561a.f51930a = this.f35705c;
                    koVar.f51607q1 = this.d;
                    koVar.G1 = false;
                    koVar.F1 = false;
                    koVar.f51603o1 = 0.2f;
                    koVar.h1(this.f35706e);
                    koVar.J1 = new jo(ciVar, this.f35707f, 0);
                    ?? obj = new Object();
                    obj.f27388a = true;
                    obj.f27391e = true;
                    this.h.showAsSheet(koVar, obj);
                    ciVar.dismiss();
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
