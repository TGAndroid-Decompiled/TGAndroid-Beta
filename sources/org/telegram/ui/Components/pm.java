package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
public final class pm {
    public long f38622i;
    public lm f38624k;
    public float f38627n;
    public float f38628o;
    public float f38629p;
    public float f38630q;
    public float f38631r;
    public float f38632s;
    public xy0 f38634u;
    public long v;
    public final org.telegram.ui.ActionBar.u4 f38636x;
    public final m.b3 f38637y;
    public final qm f38638z;
    public float f38616a = 0.0f;
    public int f38617b = 0;
    public long f38618c = 0;
    public float d = 0.0f;
    public float f38619e = 0.0f;
    public float f38620f = 0.0f;
    public float f38621g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final nr f38623j = nr.f37959j;
    public final int f38625l = org.telegram.messenger.g0.L(4.0f);
    public final int f38626m = org.telegram.messenger.g0.L(2.0f) / 2;
    public final RectF f38633t = new RectF();
    public final Paint f38635w = new Paint(1);

    public pm(qm qmVar) {
        Drawable drawable;
        this.f38638z = qmVar;
        org.telegram.ui.ActionBar.h6 h6Var = qmVar.Q.f39270n;
        if (h6Var != null) {
            drawable = h6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f38636x = (org.telegram.ui.ActionBar.u4) (drawable == null ? org.telegram.ui.ActionBar.m6.R0("drawableMsgOutMedia") : drawable);
        this.f38637y = new m.b3();
    }

    public static void a(pm pmVar, lm lmVar, boolean z10) {
        long j3;
        ArrayList arrayList = pmVar.h;
        pmVar.f38624k = lmVar;
        if (lmVar == null) {
            return;
        }
        HashMap hashMap = (HashMap) lmVar.f37237g;
        lmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - pmVar.f38618c;
        long j11 = 200;
        if (j10 < 200) {
            float f10 = ((float) j10) / 200.0f;
            pmVar.f38621g = org.telegram.messenger.g0.T1(pmVar.f38621g, pmVar.f38619e, f10);
            pmVar.f38620f = org.telegram.messenger.g0.T1(pmVar.f38620f, pmVar.d, f10);
        } else {
            pmVar.f38621g = pmVar.f38619e;
            pmVar.f38620f = pmVar.d;
        }
        pmVar.d = lmVar.f37233b / 1000.0f;
        pmVar.f38619e = lmVar.f37232a;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        pmVar.f38618c = j3;
        pmVar.f38622i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i7 = 0;
        while (true) {
            om omVar = null;
            if (i7 >= size) {
                break;
            }
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) arrayList2.get(i7);
            org.telegram.messenger.xi xiVar = (org.telegram.messenger.xi) hashMap.get(efVar);
            long j12 = j11;
            int i10 = i7;
            pmVar.f38622i = Math.max(pmVar.f38622i, efVar.N);
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                om omVar2 = (om) arrayList.get(i11);
                if (omVar2.f38293b == efVar) {
                    omVar = omVar2;
                    break;
                }
                i11++;
            }
            if (omVar == null) {
                om omVar3 = new om(pmVar);
                om.a(omVar3, efVar);
                om.b(omVar3, lmVar, xiVar, z10);
                arrayList.add(omVar3);
            } else {
                om.b(omVar, lmVar, xiVar, z10);
            }
            i7 = i10 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i12 = 0;
        while (i12 < size3) {
            om omVar4 = (om) arrayList.get(i12);
            if (!hashMap.containsKey(omVar4.f38293b)) {
                if (omVar4.f38300k <= 0.0f && omVar4.h + j13 <= elapsedRealtime) {
                    xh.e eVar = omVar4.f38308s;
                    if (eVar != null) {
                        eVar.b(omVar4.O.f38638z);
                        omVar4.f38308s = null;
                    }
                    arrayList.remove(i12);
                    i12--;
                    size3--;
                } else {
                    om.b(omVar4, null, null, z10);
                }
            }
            i12++;
        }
        pmVar.f38638z.invalidate();
    }

    public final float b() {
        Point point = org.telegram.messenger.g0.f24146q;
        return this.f38638z.Q.getPreviewScale() * org.telegram.messenger.g0.T1(this.f38621g, this.f38619e, this.f38623j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f38618c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
