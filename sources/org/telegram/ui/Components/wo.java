package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ne1;
public final class wo implements ai {
    public final dp f32222a;

    public wo(dp dpVar) {
        this.f32222a = dpVar;
    }

    @Override
    public final void C(mg mgVar) {
        mgVar.run();
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        dp dpVar = this.f32222a;
        try {
            HashMap<Object, Object> selectedPhotos = dpVar.O1.a2.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) selectedPhotos.values().iterator().next();
                String str = efVar.h;
                if (str == null) {
                    str = efVar.I;
                }
                if (str != null) {
                    File z14 = org.telegram.messenger.b8.z(4);
                    File file = new File(z14, Utilities.f14519b.nextInt() + ".jpg");
                    Point c12 = org.telegram.messenger.i0.c1();
                    Bitmap K = org.telegram.messenger.hc.K(str, null, (float) c12.x, (float) c12.y, true);
                    K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    to toVar = new to(new ne1(file, file, ""), K, false, 2);
                    toVar.W1 = dpVar.V1;
                    toVar.G1 = false;
                    toVar.F1 = false;
                    toVar.f39579o1 = 0.2f;
                    toVar.g1(dpVar.f25491r1.a());
                    toVar.J1 = new vo(this, 0);
                    dp.I0(dpVar, toVar);
                }
            }
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
        }
    }

    @Override
    public final boolean a1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void n0(Object obj) {
        to toVar = new to(obj, null, true, 3);
        dp dpVar = this.f32222a;
        toVar.W1 = dpVar.V1;
        toVar.g1(dpVar.f25491r1.a());
        toVar.J1 = new vo(this, 1);
        dp.I0(dpVar, toVar);
    }

    @Override
    public final void v0(TLRPC.User user) {
    }

    @Override
    public final void N() {
    }

    @Override
    public final void j0() {
    }

    @Override
    public final void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
