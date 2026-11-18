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
import org.telegram.ui.sc1;
public final class cp implements qi {
    public final si f34143a;
    public final TL_stories.TL_premium_boostsStatus f34144b;
    public final org.telegram.ui.ActionBar.i6 f34145c;
    public final org.telegram.ui.f d;
    public final long f34146e;
    public final org.telegram.ui.vb f34147f;
    public final org.telegram.ui.qc h;

    public cp(si siVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.f fVar, long j3, org.telegram.ui.vb vbVar, org.telegram.ui.qc qcVar) {
        this.f34143a = siVar;
        this.f34144b = tL_premium_boostsStatus;
        this.f34145c = i6Var;
        this.d = fVar;
        this.f34146e = j3;
        this.f34147f = vbVar;
        this.h = qcVar;
    }

    @Override
    public final void R0(Object obj) {
        bp bpVar = new bp(obj, null, true, 1);
        bpVar.X1 = this.f34144b;
        bpVar.f53670a.f52942a = this.f34145c;
        bpVar.f53720r1 = this.d;
        bpVar.h1(this.f34146e);
        bpVar.K1 = new ap(this.f34143a, this.f34147f, 1);
        ?? obj2 = new Object();
        obj2.f28921a = true;
        obj2.f28924e = true;
        this.h.showAsSheet(bpVar, obj2);
    }

    @Override
    public final boolean V1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void f0(eh ehVar) {
        ehVar.run();
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        si siVar = this.f34143a;
        try {
            HashMap<Object, Object> selectedPhotos = siVar.f39670e2.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) selectedPhotos.values().iterator().next();
                String str = efVar.h;
                if (str == null) {
                    str = efVar.I;
                }
                if (str != null) {
                    File z14 = org.telegram.messenger.w7.z(4);
                    File file = new File(z14, Utilities.f22777b.nextInt() + ".jpg");
                    Point c12 = org.telegram.messenger.g0.c1();
                    Bitmap K = org.telegram.messenger.ec.K(str, null, (float) c12.x, (float) c12.y, true);
                    K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    bp bpVar = new bp(new sc1(file, file, ""), K, false, 0);
                    bpVar.X1 = this.f34144b;
                    bpVar.f53670a.f52942a = this.f34145c;
                    bpVar.f53720r1 = this.d;
                    bpVar.H1 = false;
                    bpVar.G1 = false;
                    bpVar.f53715p1 = 0.2f;
                    bpVar.h1(this.f34146e);
                    bpVar.K1 = new ap(siVar, this.f34147f, 0);
                    ?? obj = new Object();
                    obj.f28921a = true;
                    obj.f28924e = true;
                    this.h.showAsSheet(bpVar, obj);
                    siVar.dismiss();
                }
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override
    public final void h1(TLRPC.User user) {
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void v0() {
    }

    @Override
    public final void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
