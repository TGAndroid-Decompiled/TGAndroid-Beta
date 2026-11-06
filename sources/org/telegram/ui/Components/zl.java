package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
public final class zl {
    public long f41036i;
    public vl f41038k;
    public float f41041n;
    public float f41042o;
    public float f41043p;
    public float f41044q;
    public float f41045r;
    public float f41046s;
    public ly0 f41048u;
    public long v;
    public final org.telegram.ui.ActionBar.t4 f41050x;
    public final m.c3 f41051y;
    public final am f41052z;
    public float f41030a = 0.0f;
    public int f41031b = 0;
    public long f41032c = 0;
    public float d = 0.0f;
    public float f41033e = 0.0f;
    public float f41034f = 0.0f;
    public float f41035g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final xq f41037j = xq.f40332j;
    public final int f41039l = org.telegram.messenger.g0.L(4.0f);
    public final int f41040m = org.telegram.messenger.g0.L(2.0f) / 2;
    public final RectF f41047t = new RectF();
    public final Paint f41049w = new Paint(1);

    public zl(am amVar) {
        Drawable drawable;
        this.f41052z = amVar;
        org.telegram.ui.ActionBar.f6 f6Var = amVar.P.f32164n;
        if (f6Var != null) {
            drawable = f6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f41050x = (org.telegram.ui.ActionBar.t4) (drawable == null ? org.telegram.ui.ActionBar.k6.R0("drawableMsgOutMedia") : drawable);
        this.f41051y = new m.c3();
    }

    public static void a(zl zlVar, vl vlVar, boolean z9) {
        long j3;
        ArrayList arrayList = zlVar.h;
        zlVar.f41038k = vlVar;
        if (vlVar == null) {
            return;
        }
        HashMap hashMap = (HashMap) vlVar.f38980g;
        vlVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - zlVar.f41032c;
        long j11 = 200;
        if (j10 < 200) {
            float f10 = ((float) j10) / 200.0f;
            zlVar.f41035g = org.telegram.messenger.g0.T1(zlVar.f41035g, zlVar.f41033e, f10);
            zlVar.f41034f = org.telegram.messenger.g0.T1(zlVar.f41034f, zlVar.d, f10);
        } else {
            zlVar.f41035g = zlVar.f41033e;
            zlVar.f41034f = zlVar.d;
        }
        zlVar.d = vlVar.f38976b / 1000.0f;
        zlVar.f41033e = vlVar.f38975a;
        if (z9) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        zlVar.f41032c = j3;
        zlVar.f41036i = 0L;
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
            zlVar.f41036i = Math.max(zlVar.f41036i, gfVar.N);
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                yl ylVar2 = (yl) arrayList.get(i11);
                if (ylVar2.f40650b == gfVar) {
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
            if (!hashMap.containsKey(ylVar4.f40650b)) {
                if (ylVar4.f40657k <= 0.0f && ylVar4.h + j13 <= elapsedRealtime) {
                    xh.e eVar = ylVar4.f40665s;
                    if (eVar != null) {
                        eVar.b(ylVar4.O.f41052z);
                        ylVar4.f40665s = null;
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
        zlVar.f41052z.invalidate();
    }

    public final float b() {
        Point point = org.telegram.messenger.g0.f22537q;
        return this.f41052z.P.getPreviewScale() * org.telegram.messenger.g0.T1(this.f41035g, this.f41033e, this.f41037j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f41032c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
