package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
public final class zl {
    public long f41075i;
    public vl f41077k;
    public float f41080n;
    public float f41081o;
    public float f41082p;
    public float f41083q;
    public float f41084r;
    public float f41085s;
    public my0 f41087u;
    public long v;
    public final org.telegram.ui.ActionBar.t4 f41089x;
    public final m.c3 f41090y;
    public final am f41091z;
    public float f41069a = 0.0f;
    public int f41070b = 0;
    public long f41071c = 0;
    public float d = 0.0f;
    public float f41072e = 0.0f;
    public float f41073f = 0.0f;
    public float f41074g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final xq f41076j = xq.f40369j;
    public final int f41078l = org.telegram.messenger.g0.L(4.0f);
    public final int f41079m = org.telegram.messenger.g0.L(2.0f) / 2;
    public final RectF f41086t = new RectF();
    public final Paint f41088w = new Paint(1);

    public zl(am amVar) {
        Drawable drawable;
        this.f41091z = amVar;
        org.telegram.ui.ActionBar.f6 f6Var = amVar.P.f32219n;
        if (f6Var != null) {
            drawable = f6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f41089x = (org.telegram.ui.ActionBar.t4) (drawable == null ? org.telegram.ui.ActionBar.k6.R0("drawableMsgOutMedia") : drawable);
        this.f41090y = new m.c3();
    }

    public static void a(zl zlVar, vl vlVar, boolean z9) {
        long j3;
        ArrayList arrayList = zlVar.h;
        zlVar.f41077k = vlVar;
        if (vlVar == null) {
            return;
        }
        HashMap hashMap = (HashMap) vlVar.f39036g;
        vlVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - zlVar.f41071c;
        long j11 = 200;
        if (j10 < 200) {
            float f10 = ((float) j10) / 200.0f;
            zlVar.f41074g = org.telegram.messenger.g0.T1(zlVar.f41074g, zlVar.f41072e, f10);
            zlVar.f41073f = org.telegram.messenger.g0.T1(zlVar.f41073f, zlVar.d, f10);
        } else {
            zlVar.f41074g = zlVar.f41072e;
            zlVar.f41073f = zlVar.d;
        }
        zlVar.d = vlVar.f39032b / 1000.0f;
        zlVar.f41072e = vlVar.f39031a;
        if (z9) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        zlVar.f41071c = j3;
        zlVar.f41075i = 0L;
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
            zlVar.f41075i = Math.max(zlVar.f41075i, gfVar.N);
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                yl ylVar2 = (yl) arrayList.get(i11);
                if (ylVar2.f40688b == gfVar) {
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
            if (!hashMap.containsKey(ylVar4.f40688b)) {
                if (ylVar4.f40695k <= 0.0f && ylVar4.h + j13 <= elapsedRealtime) {
                    xh.e eVar = ylVar4.f40703s;
                    if (eVar != null) {
                        eVar.b(ylVar4.O.f41091z);
                        ylVar4.f40703s = null;
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
        zlVar.f41091z.invalidate();
    }

    public final float b() {
        Point point = org.telegram.messenger.g0.f22563q;
        return this.f41091z.P.getPreviewScale() * org.telegram.messenger.g0.T1(this.f41074g, this.f41072e, this.f41076j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f41071c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
