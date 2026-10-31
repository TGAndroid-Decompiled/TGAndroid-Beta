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
import org.telegram.ui.ne1;
public final class uo implements ai {
    public final bi f31001a;
    public final TL_stories.TL_premium_boostsStatus f31002b;
    public final org.telegram.ui.ActionBar.p6 f31003c;
    public final org.telegram.ui.e d;
    public final long e;
    public final org.telegram.ui.cc f31004f;
    public final org.telegram.ui.zc h;

    public uo(bi biVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.e eVar, long j10, org.telegram.ui.cc ccVar, org.telegram.ui.zc zcVar) {
        this.f31001a = biVar;
        this.f31002b = tL_premium_boostsStatus;
        this.f31003c = p6Var;
        this.d = eVar;
        this.e = j10;
        this.f31004f = ccVar;
        this.h = zcVar;
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
        bi biVar = this.f31001a;
        try {
            HashMap<Object, Object> selectedPhotos = biVar.a2.getSelectedPhotos();
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
                    to toVar = new to(new ne1(file, file, ""), K, false, 0);
                    toVar.W1 = this.f31002b;
                    toVar.f39537a.f39868a = this.f31003c;
                    toVar.f39583q1 = this.d;
                    toVar.G1 = false;
                    toVar.F1 = false;
                    toVar.f39579o1 = 0.2f;
                    toVar.g1(this.e);
                    toVar.J1 = new so(biVar, this.f31004f, 0);
                    ?? obj = new Object();
                    obj.f20389a = true;
                    obj.e = true;
                    this.h.showAsSheet(toVar, obj);
                    biVar.dismiss();
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
        to toVar = new to(obj, null, true, 1);
        toVar.W1 = this.f31002b;
        toVar.f39537a.f39868a = this.f31003c;
        toVar.f39583q1 = this.d;
        toVar.g1(this.e);
        toVar.J1 = new so(this.f31001a, this.f31004f, 1);
        ?? obj2 = new Object();
        obj2.f20389a = true;
        obj2.e = true;
        this.h.showAsSheet(toVar, obj2);
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
