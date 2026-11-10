package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.uc1;
public final class no implements ai {
    public final vo f36346a;

    public no(vo voVar) {
        this.f36346a = voVar;
    }

    @Override
    public final boolean G1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void M0(Object obj) {
        ko koVar = new ko(obj, null, true, 3);
        vo voVar = this.f36346a;
        koVar.W1 = voVar.Y1;
        koVar.h1(voVar.f39071u1.a());
        koVar.J1 = new mo(this, 1);
        vo.I0(voVar, koVar);
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
        vo voVar = this.f36346a;
        try {
            HashMap<Object, Object> selectedPhotos = voVar.R1.d2.getSelectedPhotos();
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
                    ko koVar = new ko(new uc1(file, file, ""), K, false, 2);
                    koVar.W1 = voVar.Y1;
                    koVar.G1 = false;
                    koVar.F1 = false;
                    koVar.f51603o1 = 0.2f;
                    koVar.h1(voVar.f39071u1.a());
                    koVar.J1 = new mo(this, 0);
                    vo.I0(voVar, koVar);
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
