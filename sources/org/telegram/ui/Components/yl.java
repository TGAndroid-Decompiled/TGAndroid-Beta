package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
public final class yl {
    public long f40601i;
    public ul f40603k;
    public float f40606n;
    public float f40607o;
    public float f40608p;
    public float f40609q;
    public float f40610r;
    public float f40611s;
    public my0 f40613u;
    public long v;
    public final org.telegram.ui.ActionBar.u4 f40615x;
    public final m.c3 f40616y;
    public final zl f40617z;
    public float f40595a = 0.0f;
    public int f40596b = 0;
    public long f40597c = 0;
    public float d = 0.0f;
    public float f40598e = 0.0f;
    public float f40599f = 0.0f;
    public float f40600g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final wq f40602j = wq.f40049j;
    public final int f40604l = org.telegram.messenger.g0.L(4.0f);
    public final int f40605m = org.telegram.messenger.g0.L(2.0f) / 2;
    public final RectF f40612t = new RectF();
    public final Paint f40614w = new Paint(1);

    public yl(zl zlVar) {
        Drawable drawable;
        this.f40617z = zlVar;
        org.telegram.ui.ActionBar.h6 h6Var = zlVar.P.f31879n;
        if (h6Var != null) {
            drawable = h6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f40615x = (org.telegram.ui.ActionBar.u4) (drawable == null ? org.telegram.ui.ActionBar.m6.R0("drawableMsgOutMedia") : drawable);
        this.f40616y = new m.c3();
    }

    public static void a(yl ylVar, ul ulVar, boolean z9) {
        long j3;
        ArrayList arrayList = ylVar.h;
        ylVar.f40603k = ulVar;
        if (ulVar == null) {
            return;
        }
        HashMap hashMap = (HashMap) ulVar.f38709g;
        ulVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - ylVar.f40597c;
        long j11 = 200;
        if (j10 < 200) {
            float f10 = ((float) j10) / 200.0f;
            ylVar.f40600g = org.telegram.messenger.g0.T1(ylVar.f40600g, ylVar.f40598e, f10);
            ylVar.f40599f = org.telegram.messenger.g0.T1(ylVar.f40599f, ylVar.d, f10);
        } else {
            ylVar.f40600g = ylVar.f40598e;
            ylVar.f40599f = ylVar.d;
        }
        ylVar.d = ulVar.f38705b / 1000.0f;
        ylVar.f40598e = ulVar.f38704a;
        if (z9) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        ylVar.f40597c = j3;
        ylVar.f40601i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i7 = 0;
        while (true) {
            xl xlVar = null;
            if (i7 >= size) {
                break;
            }
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) arrayList2.get(i7);
            org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) hashMap.get(gfVar);
            long j12 = j11;
            int i10 = i7;
            ylVar.f40601i = Math.max(ylVar.f40601i, gfVar.N);
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                xl xlVar2 = (xl) arrayList.get(i11);
                if (xlVar2.f40328b == gfVar) {
                    xlVar = xlVar2;
                    break;
                }
                i11++;
            }
            if (xlVar == null) {
                xl xlVar3 = new xl(ylVar);
                xl.a(xlVar3, gfVar);
                xl.b(xlVar3, ulVar, ajVar, z9);
                arrayList.add(xlVar3);
            } else {
                xl.b(xlVar, ulVar, ajVar, z9);
            }
            i7 = i10 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i12 = 0;
        while (i12 < size3) {
            xl xlVar4 = (xl) arrayList.get(i12);
            if (!hashMap.containsKey(xlVar4.f40328b)) {
                if (xlVar4.f40335k <= 0.0f && xlVar4.h + j13 <= elapsedRealtime) {
                    xh.e eVar = xlVar4.f40343s;
                    if (eVar != null) {
                        eVar.b(xlVar4.O.f40617z);
                        xlVar4.f40343s = null;
                    }
                    arrayList.remove(i12);
                    i12--;
                    size3--;
                } else {
                    xl.b(xlVar4, null, null, z9);
                }
            }
            i12++;
        }
        ylVar.f40617z.invalidate();
    }

    public final float b() {
        Point point = org.telegram.messenger.g0.f22567q;
        return this.f40617z.P.getPreviewScale() * org.telegram.messenger.g0.T1(this.f40600g, this.f40598e, this.f40602j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f40597c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
