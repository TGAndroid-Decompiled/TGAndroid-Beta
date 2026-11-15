package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
public final class gm {
    public long f35009i;
    public cm f35011k;
    public float f35014n;
    public float f35015o;
    public float f35016p;
    public float f35017q;
    public float f35018r;
    public float f35019s;
    public oy0 f35021u;
    public long v;
    public final org.telegram.ui.ActionBar.r4 f35023x;
    public final m.b3 f35024y;
    public final hm f35025z;
    public float f35003a = 0.0f;
    public int f35004b = 0;
    public long f35005c = 0;
    public float d = 0.0f;
    public float f35006e = 0.0f;
    public float f35007f = 0.0f;
    public float f35008g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final er f35010j = er.f34422j;
    public final int f35012l = org.telegram.messenger.g0.L(4.0f);
    public final int f35013m = org.telegram.messenger.g0.L(2.0f) / 2;
    public final RectF f35020t = new RectF();
    public final Paint f35022w = new Paint(1);

    public gm(hm hmVar) {
        Drawable drawable;
        this.f35025z = hmVar;
        org.telegram.ui.ActionBar.e6 e6Var = hmVar.Q.f35649n;
        if (e6Var != null) {
            drawable = e6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f35023x = (org.telegram.ui.ActionBar.r4) (drawable == null ? org.telegram.ui.ActionBar.j6.R0("drawableMsgOutMedia") : drawable);
        this.f35024y = new m.b3();
    }

    public static void a(gm gmVar, cm cmVar, boolean z10) {
        long j3;
        ArrayList arrayList = gmVar.h;
        gmVar.f35011k = cmVar;
        if (cmVar == null) {
            return;
        }
        HashMap hashMap = (HashMap) cmVar.f33637g;
        cmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - gmVar.f35005c;
        long j11 = 200;
        if (j10 < 200) {
            float f10 = ((float) j10) / 200.0f;
            gmVar.f35008g = org.telegram.messenger.g0.T1(gmVar.f35008g, gmVar.f35006e, f10);
            gmVar.f35007f = org.telegram.messenger.g0.T1(gmVar.f35007f, gmVar.d, f10);
        } else {
            gmVar.f35008g = gmVar.f35006e;
            gmVar.f35007f = gmVar.d;
        }
        gmVar.d = cmVar.f33633b / 1000.0f;
        gmVar.f35006e = cmVar.f33632a;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        gmVar.f35005c = j3;
        gmVar.f35009i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i7 = 0;
        while (true) {
            fm fmVar = null;
            if (i7 >= size) {
                break;
            }
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) arrayList2.get(i7);
            org.telegram.messenger.yi yiVar = (org.telegram.messenger.yi) hashMap.get(ffVar);
            long j12 = j11;
            int i10 = i7;
            gmVar.f35009i = Math.max(gmVar.f35009i, ffVar.N);
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                fm fmVar2 = (fm) arrayList.get(i11);
                if (fmVar2.f34629b == ffVar) {
                    fmVar = fmVar2;
                    break;
                }
                i11++;
            }
            if (fmVar == null) {
                fm fmVar3 = new fm(gmVar);
                fm.a(fmVar3, ffVar);
                fm.b(fmVar3, cmVar, yiVar, z10);
                arrayList.add(fmVar3);
            } else {
                fm.b(fmVar, cmVar, yiVar, z10);
            }
            i7 = i10 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i12 = 0;
        while (i12 < size3) {
            fm fmVar4 = (fm) arrayList.get(i12);
            if (!hashMap.containsKey(fmVar4.f34629b)) {
                if (fmVar4.f34636k <= 0.0f && fmVar4.h + j13 <= elapsedRealtime) {
                    xh.e eVar = fmVar4.f34644s;
                    if (eVar != null) {
                        eVar.b(fmVar4.O.f35025z);
                        fmVar4.f34644s = null;
                    }
                    arrayList.remove(i12);
                    i12--;
                    size3--;
                } else {
                    fm.b(fmVar4, null, null, z10);
                }
            }
            i12++;
        }
        gmVar.f35025z.invalidate();
    }

    public final float b() {
        Point point = org.telegram.messenger.g0.f23611q;
        return this.f35025z.Q.getPreviewScale() * org.telegram.messenger.g0.T1(this.f35008g, this.f35006e, this.f35010j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f35005c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
