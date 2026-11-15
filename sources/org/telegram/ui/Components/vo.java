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
public final class vo implements ii {
    public final ki f40472a;
    public final TL_stories.TL_premium_boostsStatus f40473b;
    public final org.telegram.ui.ActionBar.e6 f40474c;
    public final org.telegram.ui.f d;
    public final long f40475e;
    public final org.telegram.ui.vb f40476f;
    public final org.telegram.ui.qc h;

    public vo(ki kiVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.f fVar, long j3, org.telegram.ui.vb vbVar, org.telegram.ui.qc qcVar) {
        this.f40472a = kiVar;
        this.f40473b = tL_premium_boostsStatus;
        this.f40474c = e6Var;
        this.d = fVar;
        this.f40475e = j3;
        this.f40476f = vbVar;
        this.h = qcVar;
    }

    @Override
    public final void R0(Object obj) {
        uo uoVar = new uo(obj, null, true, 1);
        uoVar.X1 = this.f40473b;
        uoVar.f51408a.f51123a = this.f40474c;
        uoVar.f51458r1 = this.d;
        uoVar.h1(this.f40475e);
        uoVar.K1 = new to(this.f40472a, this.f40476f, 1);
        ?? obj2 = new Object();
        obj2.f28476a = true;
        obj2.f28479e = true;
        this.h.showAsSheet(uoVar, obj2);
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
        ki kiVar = this.f40472a;
        try {
            HashMap<Object, Object> selectedPhotos = kiVar.f36447e2.getSelectedPhotos();
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
                    uo uoVar = new uo(new pc1(file, file, ""), K, false, 0);
                    uoVar.X1 = this.f40473b;
                    uoVar.f51408a.f51123a = this.f40474c;
                    uoVar.f51458r1 = this.d;
                    uoVar.H1 = false;
                    uoVar.G1 = false;
                    uoVar.f51453p1 = 0.2f;
                    uoVar.h1(this.f40475e);
                    uoVar.K1 = new to(kiVar, this.f40476f, 0);
                    ?? obj = new Object();
                    obj.f28476a = true;
                    obj.f28479e = true;
                    this.h.showAsSheet(uoVar, obj);
                    kiVar.dismiss();
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
