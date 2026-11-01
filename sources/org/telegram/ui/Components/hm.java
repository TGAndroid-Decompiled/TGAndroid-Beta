package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
public final class hm {
    public long f26841i;
    public dm f26843k;
    public float f26846n;
    public float f26847o;
    public float f26848p;
    public float f26849q;
    public float f26850r;
    public float f26851s;
    public rz0 f26853u;
    public long v;
    public final org.telegram.ui.ActionBar.c5 f26855x;
    public final m.c3 f26856y;
    public final im f26857z;
    public float f26836a = 0.0f;
    public int f26837b = 0;
    public long f26838c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f26839f = 0.0f;
    public float f26840g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final gr f26842j = gr.f26526j;
    public final int f26844l = org.telegram.messenger.i0.L(4.0f);
    public final int f26845m = org.telegram.messenger.i0.L(2.0f) / 2;
    public final RectF f26852t = new RectF();
    public final Paint f26854w = new Paint(1);

    public hm(im imVar) {
        Drawable drawable;
        this.f26857z = imVar;
        org.telegram.ui.ActionBar.p6 p6Var = imVar.P.f27454n;
        if (p6Var != null) {
            drawable = p6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f26855x = (org.telegram.ui.ActionBar.c5) (drawable == null ? org.telegram.ui.ActionBar.t6.R0("drawableMsgOutMedia") : drawable);
        this.f26856y = new m.c3();
    }

    public static void a(hm hmVar, dm dmVar, boolean z10) {
        long j10;
        ArrayList arrayList = hmVar.h;
        hmVar.f26843k = dmVar;
        if (dmVar == null) {
            return;
        }
        HashMap hashMap = (HashMap) dmVar.f25516g;
        dmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = elapsedRealtime - hmVar.f26838c;
        long j12 = 200;
        if (j11 < 200) {
            float f7 = ((float) j11) / 200.0f;
            hmVar.f26840g = org.telegram.messenger.i0.T1(hmVar.f26840g, hmVar.e, f7);
            hmVar.f26839f = org.telegram.messenger.i0.T1(hmVar.f26839f, hmVar.d, f7);
        } else {
            hmVar.f26840g = hmVar.e;
            hmVar.f26839f = hmVar.d;
        }
        hmVar.d = dmVar.f25513b / 1000.0f;
        hmVar.e = dmVar.f25512a;
        if (z10) {
            j10 = elapsedRealtime;
        } else {
            j10 = 0;
        }
        hmVar.f26838c = j10;
        hmVar.f26841i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            gm gmVar = null;
            if (i10 >= size) {
                break;
            }
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) arrayList2.get(i10);
            org.telegram.messenger.cj cjVar = (org.telegram.messenger.cj) hashMap.get(ffVar);
            long j13 = j12;
            int i11 = i10;
            hmVar.f26841i = Math.max(hmVar.f26841i, ffVar.N);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                gm gmVar2 = (gm) arrayList.get(i12);
                if (gmVar2.f26477b == ffVar) {
                    gmVar = gmVar2;
                    break;
                }
                i12++;
            }
            if (gmVar == null) {
                gm gmVar3 = new gm(hmVar);
                gm.a(gmVar3, ffVar);
                gm.b(gmVar3, dmVar, cjVar, z10);
                arrayList.add(gmVar3);
            } else {
                gm.b(gmVar, dmVar, cjVar, z10);
            }
            i10 = i11 + 1;
            j12 = j13;
        }
        long j14 = j12;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            gm gmVar4 = (gm) arrayList.get(i13);
            if (!hashMap.containsKey(gmVar4.f26477b)) {
                if (gmVar4.f26483k <= 0.0f && gmVar4.h + j14 <= elapsedRealtime) {
                    nh.h hVar = gmVar4.f26491s;
                    if (hVar != null) {
                        hVar.b(gmVar4.O.f26857z);
                        gmVar4.f26491s = null;
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
        hmVar.f26857z.invalidate();
    }

    public final float b() {
        Point point = org.telegram.messenger.i0.f16172q;
        return this.f26857z.P.getPreviewScale() * org.telegram.messenger.i0.T1(this.f26840g, this.e, this.f26842j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f26838c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
