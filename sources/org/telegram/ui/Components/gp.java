package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sc1;
public final class gp implements si {
    public final np f35649a;

    public gp(np npVar) {
        this.f35649a = npVar;
    }

    @Override
    public final void R0(Object obj) {
        dp dpVar = new dp(obj, null, true, 3);
        np npVar = this.f35649a;
        dpVar.X1 = npVar.Z1;
        dpVar.h1(npVar.f37934v1.a());
        dpVar.K1 = new fp(this, 1);
        np.J0(npVar, dpVar);
    }

    @Override
    public final boolean V1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void f0(gh ghVar) {
        ghVar.run();
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        np npVar = this.f35649a;
        try {
            HashMap<Object, Object> selectedPhotos = npVar.S1.f40378e2.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) selectedPhotos.values().iterator().next();
                String str = ffVar.h;
                if (str == null) {
                    str = ffVar.I;
                }
                if (str != null) {
                    File z14 = org.telegram.messenger.w7.z(4);
                    File file = new File(z14, Utilities.f22808b.nextInt() + ".jpg");
                    Point c12 = org.telegram.messenger.g0.c1();
                    Bitmap K = org.telegram.messenger.fc.K(str, null, (float) c12.x, (float) c12.y, true);
                    K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    dp dpVar = new dp(new sc1(file, file, ""), K, false, 2);
                    dpVar.X1 = npVar.Z1;
                    dpVar.H1 = false;
                    dpVar.G1 = false;
                    dpVar.f53760p1 = 0.2f;
                    dpVar.h1(npVar.f37934v1.a());
                    dpVar.K1 = new fp(this, 0);
                    np.J0(npVar, dpVar);
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
