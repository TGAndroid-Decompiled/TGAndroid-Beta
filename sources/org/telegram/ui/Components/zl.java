package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
public final class zl {
    public long f41005i;
    public vl f41007k;
    public float f41010n;
    public float f41011o;
    public float f41012p;
    public float f41013q;
    public float f41014r;
    public float f41015s;
    public ny0 f41017u;
    public long v;
    public final org.telegram.ui.ActionBar.t4 f41019x;
    public final m.c3 f41020y;
    public final am f41021z;
    public float f40999a = 0.0f;
    public int f41000b = 0;
    public long f41001c = 0;
    public float d = 0.0f;
    public float f41002e = 0.0f;
    public float f41003f = 0.0f;
    public float f41004g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final xq f41006j = xq.f40461j;
    public final int f41008l = org.telegram.messenger.g0.L(4.0f);
    public final int f41009m = org.telegram.messenger.g0.L(2.0f) / 2;
    public final RectF f41016t = new RectF();
    public final Paint f41018w = new Paint(1);

    public zl(am amVar) {
        Drawable drawable;
        this.f41021z = amVar;
        org.telegram.ui.ActionBar.g6 g6Var = amVar.P.f32276n;
        if (g6Var != null) {
            drawable = g6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f41019x = (org.telegram.ui.ActionBar.t4) (drawable == null ? org.telegram.ui.ActionBar.l6.R0("drawableMsgOutMedia") : drawable);
        this.f41020y = new m.c3();
    }

    public static void a(zl zlVar, vl vlVar, boolean z9) {
        long j3;
        ArrayList arrayList = zlVar.h;
        zlVar.f41007k = vlVar;
        if (vlVar == null) {
            return;
        }
        HashMap hashMap = (HashMap) vlVar.f39124g;
        vlVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - zlVar.f41001c;
        long j11 = 200;
        if (j10 < 200) {
            float f10 = ((float) j10) / 200.0f;
            zlVar.f41004g = org.telegram.messenger.g0.T1(zlVar.f41004g, zlVar.f41002e, f10);
            zlVar.f41003f = org.telegram.messenger.g0.T1(zlVar.f41003f, zlVar.d, f10);
        } else {
            zlVar.f41004g = zlVar.f41002e;
            zlVar.f41003f = zlVar.d;
        }
        zlVar.d = vlVar.f39120b / 1000.0f;
        zlVar.f41002e = vlVar.f39119a;
        if (z9) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        zlVar.f41001c = j3;
        zlVar.f41005i = 0L;
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
            zlVar.f41005i = Math.max(zlVar.f41005i, gfVar.N);
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                yl ylVar2 = (yl) arrayList.get(i11);
                if (ylVar2.f40741b == gfVar) {
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
            if (!hashMap.containsKey(ylVar4.f40741b)) {
                if (ylVar4.f40748k <= 0.0f && ylVar4.h + j13 <= elapsedRealtime) {
                    xh.e eVar = ylVar4.f40756s;
                    if (eVar != null) {
                        eVar.b(ylVar4.O.f41021z);
                        ylVar4.f40756s = null;
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
        zlVar.f41021z.invalidate();
    }

    public final float b() {
        Point point = org.telegram.messenger.g0.f22563q;
        return this.f41021z.P.getPreviewScale() * org.telegram.messenger.g0.T1(this.f41004g, this.f41002e, this.f41006j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f41001c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
