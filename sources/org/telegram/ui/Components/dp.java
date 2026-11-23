package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qc1;
public final class dp implements ri {
    public final kp f34420a;

    public dp(kp kpVar) {
        this.f34420a = kpVar;
    }

    @Override
    public final void O0(Object obj) {
        ap apVar = new ap(obj, null, true, 3);
        kp kpVar = this.f34420a;
        apVar.X1 = kpVar.Z1;
        apVar.h1(kpVar.f36838v1.a());
        apVar.K1 = new cp(this, 1);
        kp.J0(kpVar, apVar);
    }

    @Override
    public final void S(fh fhVar) {
        fhVar.run();
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final boolean V1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        kp kpVar = this.f34420a;
        try {
            HashMap<Object, Object> selectedPhotos = kpVar.S1.f39967e2.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) selectedPhotos.values().iterator().next();
                String str = efVar.h;
                if (str == null) {
                    str = efVar.I;
                }
                if (str != null) {
                    File z14 = org.telegram.messenger.w7.z(4);
                    File file = new File(z14, Utilities.f22875b.nextInt() + ".jpg");
                    Point c12 = org.telegram.messenger.g0.c1();
                    Bitmap K = org.telegram.messenger.ec.K(str, null, (float) c12.x, (float) c12.y, true);
                    K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    ap apVar = new ap(new qc1(file, file, ""), K, false, 2);
                    apVar.X1 = kpVar.Z1;
                    apVar.H1 = false;
                    apVar.G1 = false;
                    apVar.f52890p1 = 0.2f;
                    apVar.h1(kpVar.f36838v1.a());
                    apVar.K1 = new cp(this, 0);
                    kp.J0(kpVar, apVar);
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
    public final void B0() {
    }

    @Override
    public final void l0() {
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
