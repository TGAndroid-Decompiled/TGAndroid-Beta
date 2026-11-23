package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
public final class pm {
    public long f38621i;
    public lm f38623k;
    public float f38626n;
    public float f38627o;
    public float f38628p;
    public float f38629q;
    public float f38630r;
    public float f38631s;
    public xy0 f38633u;
    public long v;
    public final org.telegram.ui.ActionBar.u4 f38635x;
    public final m.b3 f38636y;
    public final qm f38637z;
    public float f38615a = 0.0f;
    public int f38616b = 0;
    public long f38617c = 0;
    public float d = 0.0f;
    public float f38618e = 0.0f;
    public float f38619f = 0.0f;
    public float f38620g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final nr f38622j = nr.f37964j;
    public final int f38624l = org.telegram.messenger.g0.L(4.0f);
    public final int f38625m = org.telegram.messenger.g0.L(2.0f) / 2;
    public final RectF f38632t = new RectF();
    public final Paint f38634w = new Paint(1);

    public pm(qm qmVar) {
        Drawable drawable;
        this.f38637z = qmVar;
        org.telegram.ui.ActionBar.h6 h6Var = qmVar.Q.f39280n;
        if (h6Var != null) {
            drawable = h6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f38635x = (org.telegram.ui.ActionBar.u4) (drawable == null ? org.telegram.ui.ActionBar.m6.R0("drawableMsgOutMedia") : drawable);
        this.f38636y = new m.b3();
    }

    public static void a(pm pmVar, lm lmVar, boolean z10) {
        long j3;
        ArrayList arrayList = pmVar.h;
        pmVar.f38623k = lmVar;
        if (lmVar == null) {
            return;
        }
        HashMap hashMap = (HashMap) lmVar.f37243g;
        lmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - pmVar.f38617c;
        long j11 = 200;
        if (j10 < 200) {
            float f10 = ((float) j10) / 200.0f;
            pmVar.f38620g = org.telegram.messenger.g0.T1(pmVar.f38620g, pmVar.f38618e, f10);
            pmVar.f38619f = org.telegram.messenger.g0.T1(pmVar.f38619f, pmVar.d, f10);
        } else {
            pmVar.f38620g = pmVar.f38618e;
            pmVar.f38619f = pmVar.d;
        }
        pmVar.d = lmVar.f37239b / 1000.0f;
        pmVar.f38618e = lmVar.f37238a;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        pmVar.f38617c = j3;
        pmVar.f38621i = 0L;
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
            pmVar.f38621i = Math.max(pmVar.f38621i, ffVar.N);
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                om omVar2 = (om) arrayList.get(i11);
                if (omVar2.f38287b == ffVar) {
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
            if (!hashMap.containsKey(omVar4.f38287b)) {
                if (omVar4.f38294k <= 0.0f && omVar4.h + j13 <= elapsedRealtime) {
                    xh.e eVar = omVar4.f38302s;
                    if (eVar != null) {
                        eVar.b(omVar4.O.f38637z);
                        omVar4.f38302s = null;
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
        pmVar.f38637z.invalidate();
    }

    public final float b() {
        Point point = org.telegram.messenger.g0.f24046q;
        return this.f38637z.Q.getPreviewScale() * org.telegram.messenger.g0.T1(this.f38620g, this.f38618e, this.f38622j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f38617c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
