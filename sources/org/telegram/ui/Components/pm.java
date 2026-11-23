package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
public final class pm {
    public long f38620i;
    public lm f38622k;
    public float f38625n;
    public float f38626o;
    public float f38627p;
    public float f38628q;
    public float f38629r;
    public float f38630s;
    public xy0 f38632u;
    public long v;
    public final org.telegram.ui.ActionBar.u4 f38634x;
    public final m.b3 f38635y;
    public final qm f38636z;
    public float f38614a = 0.0f;
    public int f38615b = 0;
    public long f38616c = 0;
    public float d = 0.0f;
    public float f38617e = 0.0f;
    public float f38618f = 0.0f;
    public float f38619g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final nr f38621j = nr.f37963j;
    public final int f38623l = org.telegram.messenger.g0.L(4.0f);
    public final int f38624m = org.telegram.messenger.g0.L(2.0f) / 2;
    public final RectF f38631t = new RectF();
    public final Paint f38633w = new Paint(1);

    public pm(qm qmVar) {
        Drawable drawable;
        this.f38636z = qmVar;
        org.telegram.ui.ActionBar.h6 h6Var = qmVar.Q.f39279n;
        if (h6Var != null) {
            drawable = h6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f38634x = (org.telegram.ui.ActionBar.u4) (drawable == null ? org.telegram.ui.ActionBar.m6.R0("drawableMsgOutMedia") : drawable);
        this.f38635y = new m.b3();
    }

    public static void a(pm pmVar, lm lmVar, boolean z10) {
        long j3;
        ArrayList arrayList = pmVar.h;
        pmVar.f38622k = lmVar;
        if (lmVar == null) {
            return;
        }
        HashMap hashMap = (HashMap) lmVar.f37242g;
        lmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - pmVar.f38616c;
        long j11 = 200;
        if (j10 < 200) {
            float f10 = ((float) j10) / 200.0f;
            pmVar.f38619g = org.telegram.messenger.g0.T1(pmVar.f38619g, pmVar.f38617e, f10);
            pmVar.f38618f = org.telegram.messenger.g0.T1(pmVar.f38618f, pmVar.d, f10);
        } else {
            pmVar.f38619g = pmVar.f38617e;
            pmVar.f38618f = pmVar.d;
        }
        pmVar.d = lmVar.f37238b / 1000.0f;
        pmVar.f38617e = lmVar.f37237a;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        pmVar.f38616c = j3;
        pmVar.f38620i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i7 = 0;
        while (true) {
            om omVar = null;
            if (i7 >= size) {
                break;
            }
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) arrayList2.get(i7);
            org.telegram.messenger.yi yiVar = (org.telegram.messenger.yi) hashMap.get(ffVar);
            long j12 = j11;
            int i10 = i7;
            pmVar.f38620i = Math.max(pmVar.f38620i, ffVar.N);
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                om omVar2 = (om) arrayList.get(i11);
                if (omVar2.f38286b == ffVar) {
                    omVar = omVar2;
                    break;
                }
                i11++;
            }
            if (omVar == null) {
                om omVar3 = new om(pmVar);
                om.a(omVar3, ffVar);
                om.b(omVar3, lmVar, yiVar, z10);
                arrayList.add(omVar3);
            } else {
                om.b(omVar, lmVar, yiVar, z10);
            }
            i7 = i10 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i12 = 0;
        while (i12 < size3) {
            om omVar4 = (om) arrayList.get(i12);
            if (!hashMap.containsKey(omVar4.f38286b)) {
                if (omVar4.f38293k <= 0.0f && omVar4.h + j13 <= elapsedRealtime) {
                    xh.e eVar = omVar4.f38301s;
                    if (eVar != null) {
                        eVar.b(omVar4.O.f38636z);
                        omVar4.f38301s = null;
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
        pmVar.f38636z.invalidate();
    }

    public final float b() {
        Point point = org.telegram.messenger.g0.f24046q;
        return this.f38636z.Q.getPreviewScale() * org.telegram.messenger.g0.T1(this.f38619g, this.f38617e, this.f38621j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f38616c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
