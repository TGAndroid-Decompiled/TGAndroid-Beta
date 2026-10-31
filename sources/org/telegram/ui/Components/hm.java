package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
public final class hm {
    public long f26763i;
    public dm f26765k;
    public float f26768n;
    public float f26769o;
    public float f26770p;
    public float f26771q;
    public float f26772r;
    public float f26773s;
    public qz0 f26775u;
    public long v;
    public final org.telegram.ui.ActionBar.c5 f26777x;
    public final m.c3 f26778y;
    public final im f26779z;
    public float f26758a = 0.0f;
    public int f26759b = 0;
    public long f26760c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f26761f = 0.0f;
    public float f26762g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final gr f26764j = gr.f26498j;
    public final int f26766l = org.telegram.messenger.i0.L(4.0f);
    public final int f26767m = org.telegram.messenger.i0.L(2.0f) / 2;
    public final RectF f26774t = new RectF();
    public final Paint f26776w = new Paint(1);

    public hm(im imVar) {
        Drawable drawable;
        this.f26779z = imVar;
        org.telegram.ui.ActionBar.p6 p6Var = imVar.P.f27401n;
        if (p6Var != null) {
            drawable = p6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f26777x = (org.telegram.ui.ActionBar.c5) (drawable == null ? org.telegram.ui.ActionBar.t6.R0("drawableMsgOutMedia") : drawable);
        this.f26778y = new m.c3();
    }

    public static void a(hm hmVar, dm dmVar, boolean z10) {
        long j10;
        ArrayList arrayList = hmVar.h;
        hmVar.f26765k = dmVar;
        if (dmVar == null) {
            return;
        }
        HashMap hashMap = (HashMap) dmVar.f25467g;
        dmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = elapsedRealtime - hmVar.f26760c;
        long j12 = 200;
        if (j11 < 200) {
            float f7 = ((float) j11) / 200.0f;
            hmVar.f26762g = org.telegram.messenger.i0.T1(hmVar.f26762g, hmVar.e, f7);
            hmVar.f26761f = org.telegram.messenger.i0.T1(hmVar.f26761f, hmVar.d, f7);
        } else {
            hmVar.f26762g = hmVar.e;
            hmVar.f26761f = hmVar.d;
        }
        hmVar.d = dmVar.f25464b / 1000.0f;
        hmVar.e = dmVar.f25463a;
        if (z10) {
            j10 = elapsedRealtime;
        } else {
            j10 = 0;
        }
        hmVar.f26760c = j10;
        hmVar.f26763i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            gm gmVar = null;
            if (i10 >= size) {
                break;
            }
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) arrayList2.get(i10);
            org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) hashMap.get(efVar);
            long j13 = j12;
            int i11 = i10;
            hmVar.f26763i = Math.max(hmVar.f26763i, efVar.N);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                gm gmVar2 = (gm) arrayList.get(i12);
                if (gmVar2.f26416b == efVar) {
                    gmVar = gmVar2;
                    break;
                }
                i12++;
            }
            if (gmVar == null) {
                gm gmVar3 = new gm(hmVar);
                gm.a(gmVar3, efVar);
                gm.b(gmVar3, dmVar, bjVar, z10);
                arrayList.add(gmVar3);
            } else {
                gm.b(gmVar, dmVar, bjVar, z10);
            }
            i10 = i11 + 1;
            j12 = j13;
        }
        long j14 = j12;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            gm gmVar4 = (gm) arrayList.get(i13);
            if (!hashMap.containsKey(gmVar4.f26416b)) {
                if (gmVar4.f26422k <= 0.0f && gmVar4.h + j14 <= elapsedRealtime) {
                    nh.h hVar = gmVar4.f26430s;
                    if (hVar != null) {
                        hVar.b(gmVar4.O.f26779z);
                        gmVar4.f26430s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    gm.b(gmVar4, null, null, z10);
                }
            }
            i13++;
        }
        hmVar.f26779z.invalidate();
    }

    public final float b() {
        Point point = org.telegram.messenger.i0.f16026q;
        return this.f26779z.P.getPreviewScale() * org.telegram.messenger.i0.T1(this.f26762g, this.e, this.f26764j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f26760c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
