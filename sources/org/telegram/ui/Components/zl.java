package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
public final class zl {
    public long f41056i;
    public vl f41058k;
    public float f41061n;
    public float f41062o;
    public float f41063p;
    public float f41064q;
    public float f41065r;
    public float f41066s;
    public my0 f41068u;
    public long v;
    public final org.telegram.ui.ActionBar.t4 f41070x;
    public final m.c3 f41071y;
    public final am f41072z;
    public float f41050a = 0.0f;
    public int f41051b = 0;
    public long f41052c = 0;
    public float d = 0.0f;
    public float f41053e = 0.0f;
    public float f41054f = 0.0f;
    public float f41055g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final xq f41057j = xq.f40348j;
    public final int f41059l = org.telegram.messenger.g0.L(4.0f);
    public final int f41060m = org.telegram.messenger.g0.L(2.0f) / 2;
    public final RectF f41067t = new RectF();
    public final Paint f41069w = new Paint(1);

    public zl(am amVar) {
        Drawable drawable;
        this.f41072z = amVar;
        org.telegram.ui.ActionBar.f6 f6Var = amVar.P.f32198n;
        if (f6Var != null) {
            drawable = f6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f41070x = (org.telegram.ui.ActionBar.t4) (drawable == null ? org.telegram.ui.ActionBar.k6.R0("drawableMsgOutMedia") : drawable);
        this.f41071y = new m.c3();
    }

    public static void a(zl zlVar, vl vlVar, boolean z9) {
        long j3;
        ArrayList arrayList = zlVar.h;
        zlVar.f41058k = vlVar;
        if (vlVar == null) {
            return;
        }
        HashMap hashMap = (HashMap) vlVar.f39001g;
        vlVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - zlVar.f41052c;
        long j11 = 200;
        if (j10 < 200) {
            float f10 = ((float) j10) / 200.0f;
            zlVar.f41055g = org.telegram.messenger.g0.T1(zlVar.f41055g, zlVar.f41053e, f10);
            zlVar.f41054f = org.telegram.messenger.g0.T1(zlVar.f41054f, zlVar.d, f10);
        } else {
            zlVar.f41055g = zlVar.f41053e;
            zlVar.f41054f = zlVar.d;
        }
        zlVar.d = vlVar.f38997b / 1000.0f;
        zlVar.f41053e = vlVar.f38996a;
        if (z9) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        zlVar.f41052c = j3;
        zlVar.f41056i = 0L;
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
            zlVar.f41056i = Math.max(zlVar.f41056i, gfVar.N);
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                yl ylVar2 = (yl) arrayList.get(i11);
                if (ylVar2.f40662b == gfVar) {
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
            if (!hashMap.containsKey(ylVar4.f40662b)) {
                if (ylVar4.f40669k <= 0.0f && ylVar4.h + j13 <= elapsedRealtime) {
                    xh.e eVar = ylVar4.f40677s;
                    if (eVar != null) {
                        eVar.b(ylVar4.O.f41072z);
                        ylVar4.f40677s = null;
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
        zlVar.f41072z.invalidate();
    }

    public final float b() {
        Point point = org.telegram.messenger.g0.f22544q;
        return this.f41072z.P.getPreviewScale() * org.telegram.messenger.g0.T1(this.f41055g, this.f41053e, this.f41057j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f41052c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
