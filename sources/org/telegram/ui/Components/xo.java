package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pc1;
public final class xo implements ii {
    public final ep f41735a;

    public xo(ep epVar) {
        this.f41735a = epVar;
    }

    @Override
    public final void R0(Object obj) {
        uo uoVar = new uo(obj, null, true, 3);
        ep epVar = this.f41735a;
        uoVar.X1 = epVar.Z1;
        uoVar.h1(epVar.f34400v1.a());
        uoVar.K1 = new wo(this, 1);
        ep.I0(epVar, uoVar);
    }

    @Override
    public final boolean V1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void d0(vg vgVar) {
        vgVar.run();
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        ep epVar = this.f41735a;
        try {
            HashMap<Object, Object> selectedPhotos = epVar.S1.f36435e2.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) selectedPhotos.values().iterator().next();
                String str = ffVar.h;
                if (str == null) {
                    str = ffVar.I;
                }
                if (str != null) {
                    File z14 = org.telegram.messenger.w7.z(4);
                    File file = new File(z14, Utilities.f22414b.nextInt() + ".jpg");
                    Point c12 = org.telegram.messenger.g0.c1();
                    Bitmap K = org.telegram.messenger.fc.K(str, null, (float) c12.x, (float) c12.y, true);
                    K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    uo uoVar = new uo(new pc1(file, file, ""), K, false, 2);
                    uoVar.X1 = epVar.Z1;
                    uoVar.H1 = false;
                    uoVar.G1 = false;
                    uoVar.f51454p1 = 0.2f;
                    uoVar.h1(epVar.f34400v1.a());
                    uoVar.K1 = new wo(this, 0);
                    ep.I0(epVar, uoVar);
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
