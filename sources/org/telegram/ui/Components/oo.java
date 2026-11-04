package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.lc1;
public final class oo implements zh {
    public final vo f36874a;

    public oo(vo voVar) {
        this.f36874a = voVar;
    }

    @Override
    public final void I0(Object obj) {
        lo loVar = new lo(obj, null, true, 3);
        vo voVar = this.f36874a;
        loVar.X1 = voVar.W1;
        loVar.h1(voVar.f39191s1.a());
        loVar.K1 = new no(this, 1);
        vo.I0(voVar, loVar);
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
        vo voVar = this.f36874a;
        try {
            HashMap<Object, Object> selectedPhotos = voVar.P1.f32215b2.getSelectedPhotos();
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
                    lo loVar = new lo(new lc1(file, file, ""), K, false, 2);
                    loVar.X1 = voVar.W1;
                    loVar.H1 = false;
                    loVar.G1 = false;
                    loVar.f47186p1 = 0.2f;
                    loVar.h1(voVar.f39191s1.a());
                    loVar.K1 = new no(this, 0);
                    vo.I0(voVar, loVar);
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
