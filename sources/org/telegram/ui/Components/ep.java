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
public final class ep implements si {
    public final ui f34946a;
    public final TL_stories.TL_premium_boostsStatus f34947b;
    public final org.telegram.ui.ActionBar.h6 f34948c;
    public final org.telegram.ui.f d;
    public final long f34949e;
    public final org.telegram.ui.vb f34950f;
    public final org.telegram.ui.qc h;

    public ep(ui uiVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.f fVar, long j3, org.telegram.ui.vb vbVar, org.telegram.ui.qc qcVar) {
        this.f34946a = uiVar;
        this.f34947b = tL_premium_boostsStatus;
        this.f34948c = h6Var;
        this.d = fVar;
        this.f34949e = j3;
        this.f34950f = vbVar;
        this.h = qcVar;
    }

    @Override
    public final void R0(Object obj) {
        dp dpVar = new dp(obj, null, true, 1);
        dpVar.X1 = this.f34947b;
        dpVar.f53711a.f52988a = this.f34948c;
        dpVar.f53761r1 = this.d;
        dpVar.h1(this.f34949e);
        dpVar.K1 = new cp(this.f34946a, this.f34950f, 1);
        ?? obj2 = new Object();
        obj2.f28902a = true;
        obj2.f28905e = true;
        this.h.showAsSheet(dpVar, obj2);
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
        ui uiVar = this.f34946a;
        try {
            HashMap<Object, Object> selectedPhotos = uiVar.f40386e2.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) selectedPhotos.values().iterator().next();
                String str = efVar.h;
                if (str == null) {
                    str = efVar.I;
                }
                if (str != null) {
                    File z14 = org.telegram.messenger.w7.z(4);
                    File file = new File(z14, Utilities.f22805b.nextInt() + ".jpg");
                    Point c12 = org.telegram.messenger.g0.c1();
                    Bitmap K = org.telegram.messenger.ec.K(str, null, (float) c12.x, (float) c12.y, true);
                    K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    dp dpVar = new dp(new sc1(file, file, ""), K, false, 0);
                    dpVar.X1 = this.f34947b;
                    dpVar.f53711a.f52988a = this.f34948c;
                    dpVar.f53761r1 = this.d;
                    dpVar.H1 = false;
                    dpVar.G1 = false;
                    dpVar.f53756p1 = 0.2f;
                    dpVar.h1(this.f34949e);
                    dpVar.K1 = new cp(uiVar, this.f34950f, 0);
                    ?? obj = new Object();
                    obj.f28902a = true;
                    obj.f28905e = true;
                    this.h.showAsSheet(dpVar, obj);
                    uiVar.dismiss();
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
