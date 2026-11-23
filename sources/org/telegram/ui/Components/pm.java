package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
public final class pm {
    public long f38577i;
    public lm f38579k;
    public float f38582n;
    public float f38583o;
    public float f38584p;
    public float f38585q;
    public float f38586r;
    public float f38587s;
    public xy0 f38589u;
    public long v;
    public final org.telegram.ui.ActionBar.u4 f38591x;
    public final m.b3 f38592y;
    public final qm f38593z;
    public float f38571a = 0.0f;
    public int f38572b = 0;
    public long f38573c = 0;
    public float d = 0.0f;
    public float f38574e = 0.0f;
    public float f38575f = 0.0f;
    public float f38576g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final nr f38578j = nr.f37920j;
    public final int f38580l = org.telegram.messenger.g0.L(4.0f);
    public final int f38581m = org.telegram.messenger.g0.L(2.0f) / 2;
    public final RectF f38588t = new RectF();
    public final Paint f38590w = new Paint(1);

    public pm(qm qmVar) {
        Drawable drawable;
        this.f38593z = qmVar;
        org.telegram.ui.ActionBar.h6 h6Var = qmVar.Q.f39234n;
        if (h6Var != null) {
            drawable = h6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f38591x = (org.telegram.ui.ActionBar.u4) (drawable == null ? org.telegram.ui.ActionBar.m6.R0("drawableMsgOutMedia") : drawable);
        this.f38592y = new m.b3();
    }

    public static void a(pm pmVar, lm lmVar, boolean z10) {
        long j3;
        ArrayList arrayList = pmVar.h;
        pmVar.f38579k = lmVar;
        if (lmVar == null) {
            return;
        }
        HashMap hashMap = (HashMap) lmVar.f37198g;
        lmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - pmVar.f38573c;
        long j11 = 200;
        if (j10 < 200) {
            float f10 = ((float) j10) / 200.0f;
            pmVar.f38576g = org.telegram.messenger.g0.T1(pmVar.f38576g, pmVar.f38574e, f10);
            pmVar.f38575f = org.telegram.messenger.g0.T1(pmVar.f38575f, pmVar.d, f10);
        } else {
            pmVar.f38576g = pmVar.f38574e;
            pmVar.f38575f = pmVar.d;
        }
        pmVar.d = lmVar.f37194b / 1000.0f;
        pmVar.f38574e = lmVar.f37193a;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        pmVar.f38573c = j3;
        pmVar.f38577i = 0L;
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
            pmVar.f38577i = Math.max(pmVar.f38577i, ffVar.N);
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                om omVar2 = (om) arrayList.get(i11);
                if (omVar2.f38255b == ffVar) {
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
            if (!hashMap.containsKey(omVar4.f38255b)) {
                if (omVar4.f38262k <= 0.0f && omVar4.h + j13 <= elapsedRealtime) {
                    xh.e eVar = omVar4.f38270s;
                    if (eVar != null) {
                        eVar.b(omVar4.O.f38593z);
                        omVar4.f38270s = null;
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
        pmVar.f38593z.invalidate();
    }

    public final float b() {
        Point point = org.telegram.messenger.g0.f24010q;
        return this.f38593z.Q.getPreviewScale() * org.telegram.messenger.g0.T1(this.f38576g, this.f38574e, this.f38578j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f38573c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
