package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
public final class zl {
    public long f41011i;
    public vl f41013k;
    public float f41016n;
    public float f41017o;
    public float f41018p;
    public float f41019q;
    public float f41020r;
    public float f41021s;
    public ly0 f41023u;
    public long v;
    public final org.telegram.ui.ActionBar.t4 f41025x;
    public final m.c3 f41026y;
    public final am f41027z;
    public float f41005a = 0.0f;
    public int f41006b = 0;
    public long f41007c = 0;
    public float d = 0.0f;
    public float f41008e = 0.0f;
    public float f41009f = 0.0f;
    public float f41010g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final xq f41012j = xq.f40313j;
    public final int f41014l = org.telegram.messenger.g0.L(4.0f);
    public final int f41015m = org.telegram.messenger.g0.L(2.0f) / 2;
    public final RectF f41022t = new RectF();
    public final Paint f41024w = new Paint(1);

    public zl(am amVar) {
        Drawable drawable;
        this.f41027z = amVar;
        org.telegram.ui.ActionBar.f6 f6Var = amVar.P.f32170n;
        if (f6Var != null) {
            drawable = f6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f41025x = (org.telegram.ui.ActionBar.t4) (drawable == null ? org.telegram.ui.ActionBar.k6.R0("drawableMsgOutMedia") : drawable);
        this.f41026y = new m.c3();
    }

    public static void a(zl zlVar, vl vlVar, boolean z9) {
        long j3;
        ArrayList arrayList = zlVar.h;
        zlVar.f41013k = vlVar;
        if (vlVar == null) {
            return;
        }
        HashMap hashMap = (HashMap) vlVar.f38983g;
        vlVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - zlVar.f41007c;
        long j11 = 200;
        if (j10 < 200) {
            float f10 = ((float) j10) / 200.0f;
            zlVar.f41010g = org.telegram.messenger.g0.T1(zlVar.f41010g, zlVar.f41008e, f10);
            zlVar.f41009f = org.telegram.messenger.g0.T1(zlVar.f41009f, zlVar.d, f10);
        } else {
            zlVar.f41010g = zlVar.f41008e;
            zlVar.f41009f = zlVar.d;
        }
        zlVar.d = vlVar.f38979b / 1000.0f;
        zlVar.f41008e = vlVar.f38978a;
        if (z9) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        zlVar.f41007c = j3;
        zlVar.f41011i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i7 = 0;
        while (true) {
            yl ylVar = null;
            if (i7 >= size) {
                break;
            }
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) arrayList2.get(i7);
            org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) hashMap.get(gfVar);
            long j12 = j11;
            int i10 = i7;
            zlVar.f41011i = Math.max(zlVar.f41011i, gfVar.N);
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                yl ylVar2 = (yl) arrayList.get(i11);
                if (ylVar2.f40631b == gfVar) {
                    ylVar = ylVar2;
                    break;
                }
                i11++;
            }
            if (ylVar == null) {
                yl ylVar3 = new yl(zlVar);
                yl.a(ylVar3, gfVar);
                yl.b(ylVar3, vlVar, ajVar, z9);
                arrayList.add(ylVar3);
            } else {
                yl.b(ylVar, vlVar, ajVar, z9);
            }
            i7 = i10 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i12 = 0;
        while (i12 < size3) {
            yl ylVar4 = (yl) arrayList.get(i12);
            if (!hashMap.containsKey(ylVar4.f40631b)) {
                if (ylVar4.f40638k <= 0.0f && ylVar4.h + j13 <= elapsedRealtime) {
                    xh.e eVar = ylVar4.f40646s;
                    if (eVar != null) {
                        eVar.b(ylVar4.O.f41027z);
                        ylVar4.f40646s = null;
                    }
                    arrayList.remove(i12);
                    i12--;
                    size3--;
                } else {
                    yl.b(ylVar4, null, null, z9);
                }
            }
            i12++;
        }
        zlVar.f41027z.invalidate();
    }

    public final float b() {
        Point point = org.telegram.messenger.g0.f22537q;
        return this.f41027z.P.getPreviewScale() * org.telegram.messenger.g0.T1(this.f41010g, this.f41008e, this.f41012j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f41007c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
