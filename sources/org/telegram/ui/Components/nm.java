package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
public final class nm {
    public long f37856i;
    public jm f37858k;
    public float f37861n;
    public float f37862o;
    public float f37863p;
    public float f37864q;
    public float f37865r;
    public float f37866s;
    public wy0 f37868u;
    public long v;
    public final org.telegram.ui.ActionBar.u4 f37870x;
    public final m.b3 f37871y;
    public final om f37872z;
    public float f37850a = 0.0f;
    public int f37851b = 0;
    public long f37852c = 0;
    public float d = 0.0f;
    public float f37853e = 0.0f;
    public float f37854f = 0.0f;
    public float f37855g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final kr f37857j = kr.f36861j;
    public final int f37859l = org.telegram.messenger.g0.L(4.0f);
    public final int f37860m = org.telegram.messenger.g0.L(2.0f) / 2;
    public final RectF f37867t = new RectF();
    public final Paint f37869w = new Paint(1);

    public nm(om omVar) {
        Drawable drawable;
        this.f37872z = omVar;
        org.telegram.ui.ActionBar.i6 i6Var = omVar.Q.f38509n;
        if (i6Var != null) {
            drawable = i6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f37870x = (org.telegram.ui.ActionBar.u4) (drawable == null ? org.telegram.ui.ActionBar.n6.R0("drawableMsgOutMedia") : drawable);
        this.f37871y = new m.b3();
    }

    public static void a(nm nmVar, jm jmVar, boolean z10) {
        long j3;
        ArrayList arrayList = nmVar.h;
        nmVar.f37858k = jmVar;
        if (jmVar == null) {
            return;
        }
        HashMap hashMap = (HashMap) jmVar.f36461g;
        jmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - nmVar.f37852c;
        long j11 = 200;
        if (j10 < 200) {
            float f10 = ((float) j10) / 200.0f;
            nmVar.f37855g = org.telegram.messenger.g0.T1(nmVar.f37855g, nmVar.f37853e, f10);
            nmVar.f37854f = org.telegram.messenger.g0.T1(nmVar.f37854f, nmVar.d, f10);
        } else {
            nmVar.f37855g = nmVar.f37853e;
            nmVar.f37854f = nmVar.d;
        }
        nmVar.d = jmVar.f36457b / 1000.0f;
        nmVar.f37853e = jmVar.f36456a;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        nmVar.f37852c = j3;
        nmVar.f37856i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i7 = 0;
        while (true) {
            mm mmVar = null;
            if (i7 >= size) {
                break;
            }
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) arrayList2.get(i7);
            org.telegram.messenger.xi xiVar = (org.telegram.messenger.xi) hashMap.get(efVar);
            long j12 = j11;
            int i10 = i7;
            nmVar.f37856i = Math.max(nmVar.f37856i, efVar.N);
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                mm mmVar2 = (mm) arrayList.get(i11);
                if (mmVar2.f37480b == efVar) {
                    mmVar = mmVar2;
                    break;
                }
                i11++;
            }
            if (mmVar == null) {
                mm mmVar3 = new mm(nmVar);
                mm.a(mmVar3, efVar);
                mm.b(mmVar3, jmVar, xiVar, z10);
                arrayList.add(mmVar3);
            } else {
                mm.b(mmVar, jmVar, xiVar, z10);
            }
            i7 = i10 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i12 = 0;
        while (i12 < size3) {
            mm mmVar4 = (mm) arrayList.get(i12);
            if (!hashMap.containsKey(mmVar4.f37480b)) {
                if (mmVar4.f37487k <= 0.0f && mmVar4.h + j13 <= elapsedRealtime) {
                    xh.e eVar = mmVar4.f37495s;
                    if (eVar != null) {
                        eVar.b(mmVar4.O.f37872z);
                        mmVar4.f37495s = null;
                    }
                    arrayList.remove(i12);
                    i12--;
                    size3--;
                } else {
                    mm.b(mmVar4, null, null, z10);
                }
            }
            i12++;
        }
        nmVar.f37872z.invalidate();
    }

    public final float b() {
        Point point = org.telegram.messenger.g0.f24226q;
        return this.f37872z.Q.getPreviewScale() * org.telegram.messenger.g0.T1(this.f37855g, this.f37853e, this.f37857j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f37852c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
