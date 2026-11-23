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
import org.telegram.ui.qc1;
public final class bp implements ri {
    public final ti f33784a;
    public final TL_stories.TL_premium_boostsStatus f33785b;
    public final org.telegram.ui.ActionBar.i6 f33786c;
    public final org.telegram.ui.f d;
    public final long f33787e;
    public final org.telegram.ui.vb f33788f;
    public final org.telegram.ui.qc h;

    public bp(ti tiVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.f fVar, long j3, org.telegram.ui.vb vbVar, org.telegram.ui.qc qcVar) {
        this.f33784a = tiVar;
        this.f33785b = tL_premium_boostsStatus;
        this.f33786c = i6Var;
        this.d = fVar;
        this.f33787e = j3;
        this.f33788f = vbVar;
        this.h = qcVar;
    }

    @Override
    public final void O0(Object obj) {
        ap apVar = new ap(obj, null, true, 1);
        apVar.X1 = this.f33785b;
        apVar.f52845a.f52554a = this.f33786c;
        apVar.f52895r1 = this.d;
        apVar.h1(this.f33787e);
        apVar.K1 = new zo(this.f33784a, this.f33788f, 1);
        ?? obj2 = new Object();
        obj2.f28948a = true;
        obj2.f28951e = true;
        this.h.showAsSheet(apVar, obj2);
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
        ti tiVar = this.f33784a;
        try {
            HashMap<Object, Object> selectedPhotos = tiVar.f39967e2.getSelectedPhotos();
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
                    ap apVar = new ap(new qc1(file, file, ""), K, false, 0);
                    apVar.X1 = this.f33785b;
                    apVar.f52845a.f52554a = this.f33786c;
                    apVar.f52895r1 = this.d;
                    apVar.H1 = false;
                    apVar.G1 = false;
                    apVar.f52890p1 = 0.2f;
                    apVar.h1(this.f33787e);
                    apVar.K1 = new zo(tiVar, this.f33788f, 0);
                    ?? obj = new Object();
                    obj.f28948a = true;
                    obj.f28951e = true;
                    this.h.showAsSheet(apVar, obj);
                    tiVar.dismiss();
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
