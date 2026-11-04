package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
public final class yl {
    public long f40767i;
    public ul f40769k;
    public float f40772n;
    public float f40773o;
    public float f40774p;
    public float f40775q;
    public float f40776r;
    public float f40777s;
    public ly0 f40779u;
    public long v;
    public final org.telegram.ui.ActionBar.t4 f40781x;
    public final m.b3 f40782y;
    public final zl f40783z;
    public float f40761a = 0.0f;
    public int f40762b = 0;
    public long f40763c = 0;
    public float d = 0.0f;
    public float f40764e = 0.0f;
    public float f40765f = 0.0f;
    public float f40766g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final xq f40768j = xq.f40455j;
    public final int f40770l = org.telegram.messenger.g0.L(4.0f);
    public final int f40771m = org.telegram.messenger.g0.L(2.0f) / 2;
    public final RectF f40778t = new RectF();
    public final Paint f40780w = new Paint(1);

    public yl(zl zlVar) {
        Drawable drawable;
        this.f40783z = zlVar;
        org.telegram.ui.ActionBar.e6 e6Var = zlVar.Q.f31895n;
        if (e6Var != null) {
            drawable = e6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f40781x = (org.telegram.ui.ActionBar.t4) (drawable == null ? org.telegram.ui.ActionBar.k6.R0("drawableMsgOutMedia") : drawable);
        this.f40782y = new m.b3();
    }

    public static void a(yl ylVar, ul ulVar, boolean z10) {
        long j10;
        ArrayList arrayList = ylVar.h;
        ylVar.f40769k = ulVar;
        if (ulVar == null) {
            return;
        }
        HashMap hashMap = (HashMap) ulVar.f38819g;
        ulVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = elapsedRealtime - ylVar.f40763c;
        long j12 = 200;
        if (j11 < 200) {
            float f10 = ((float) j11) / 200.0f;
            ylVar.f40766g = org.telegram.messenger.g0.T1(ylVar.f40766g, ylVar.f40764e, f10);
            ylVar.f40765f = org.telegram.messenger.g0.T1(ylVar.f40765f, ylVar.d, f10);
        } else {
            ylVar.f40766g = ylVar.f40764e;
            ylVar.f40765f = ylVar.d;
        }
        ylVar.d = ulVar.f38815b / 1000.0f;
        ylVar.f40764e = ulVar.f38814a;
        if (z10) {
            j10 = elapsedRealtime;
        } else {
            j10 = 0;
        }
        ylVar.f40763c = j10;
        ylVar.f40767i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i3 = 0;
        while (true) {
            xl xlVar = null;
            if (i3 >= size) {
                break;
            }
            org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) arrayList2.get(i3);
            org.telegram.messenger.ri riVar = (org.telegram.messenger.ri) hashMap.get(yeVar);
            long j13 = j12;
            int i10 = i3;
            ylVar.f40767i = Math.max(ylVar.f40767i, yeVar.N);
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                xl xlVar2 = (xl) arrayList.get(i11);
                if (xlVar2.f40390b == yeVar) {
                    xlVar = xlVar2;
                    break;
                }
                i11++;
            }
            if (xlVar == null) {
                xl xlVar3 = new xl(ylVar);
                xl.a(xlVar3, yeVar);
                xl.b(xlVar3, ulVar, riVar, z10);
                arrayList.add(xlVar3);
            } else {
                xl.b(xlVar, ulVar, riVar, z10);
            }
            i3 = i10 + 1;
            j12 = j13;
        }
        long j14 = j12;
        int size3 = arrayList.size();
        int i12 = 0;
        while (i12 < size3) {
            xl xlVar4 = (xl) arrayList.get(i12);
            if (!hashMap.containsKey(xlVar4.f40390b)) {
                if (xlVar4.f40397k <= 0.0f && xlVar4.h + j14 <= elapsedRealtime) {
                    yh.e eVar = xlVar4.f40405s;
                    if (eVar != null) {
                        eVar.b(xlVar4.O.f40783z);
                        xlVar4.f40405s = null;
                    }
                    arrayList.remove(i12);
                    i12--;
                    size3--;
                } else {
                    xl.b(xlVar4, null, null, z10);
                }
            }
            i12++;
        }
        ylVar.f40783z.invalidate();
    }

    public final float b() {
        Point point = org.telegram.messenger.g0.f22608q;
        return this.f40783z.Q.getPreviewScale() * org.telegram.messenger.g0.T1(this.f40766g, this.f40764e, this.f40768j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f40763c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
