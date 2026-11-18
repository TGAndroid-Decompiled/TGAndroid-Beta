package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
public final class nm {
    public long f37812i;
    public jm f37814k;
    public float f37817n;
    public float f37818o;
    public float f37819p;
    public float f37820q;
    public float f37821r;
    public float f37822s;
    public vy0 f37824u;
    public long v;
    public final org.telegram.ui.ActionBar.v4 f37826x;
    public final m.b3 f37827y;
    public final om f37828z;
    public float f37806a = 0.0f;
    public int f37807b = 0;
    public long f37808c = 0;
    public float d = 0.0f;
    public float f37809e = 0.0f;
    public float f37810f = 0.0f;
    public float f37811g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final lr f37813j = lr.f37211j;
    public final int f37815l = org.telegram.messenger.g0.L(4.0f);
    public final int f37816m = org.telegram.messenger.g0.L(2.0f) / 2;
    public final RectF f37823t = new RectF();
    public final Paint f37825w = new Paint(1);

    public nm(om omVar) {
        Drawable drawable;
        this.f37828z = omVar;
        org.telegram.ui.ActionBar.i6 i6Var = omVar.Q.f38486n;
        if (i6Var != null) {
            drawable = i6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f37826x = (org.telegram.ui.ActionBar.v4) (drawable == null ? org.telegram.ui.ActionBar.n6.R0("drawableMsgOutMedia") : drawable);
        this.f37827y = new m.b3();
    }

    public static void a(nm nmVar, jm jmVar, boolean z10) {
        long j3;
        ArrayList arrayList = nmVar.h;
        nmVar.f37814k = jmVar;
        if (jmVar == null) {
            return;
        }
        HashMap hashMap = (HashMap) jmVar.f36491g;
        jmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - nmVar.f37808c;
        long j11 = 200;
        if (j10 < 200) {
            float f10 = ((float) j10) / 200.0f;
            nmVar.f37811g = org.telegram.messenger.g0.T1(nmVar.f37811g, nmVar.f37809e, f10);
            nmVar.f37810f = org.telegram.messenger.g0.T1(nmVar.f37810f, nmVar.d, f10);
        } else {
            nmVar.f37811g = nmVar.f37809e;
            nmVar.f37810f = nmVar.d;
        }
        nmVar.d = jmVar.f36487b / 1000.0f;
        nmVar.f37809e = jmVar.f36486a;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        nmVar.f37808c = j3;
        nmVar.f37812i = 0L;
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
            nmVar.f37812i = Math.max(nmVar.f37812i, efVar.N);
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                mm mmVar2 = (mm) arrayList.get(i11);
                if (mmVar2.f37562b == efVar) {
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
            if (!hashMap.containsKey(mmVar4.f37562b)) {
                if (mmVar4.f37569k <= 0.0f && mmVar4.h + j13 <= elapsedRealtime) {
                    xh.e eVar = mmVar4.f37577s;
                    if (eVar != null) {
                        eVar.b(mmVar4.O.f37828z);
                        mmVar4.f37577s = null;
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
        nmVar.f37828z.invalidate();
    }

    public final float b() {
        Point point = org.telegram.messenger.g0.f24121q;
        return this.f37828z.Q.getPreviewScale() * org.telegram.messenger.g0.T1(this.f37811g, this.f37809e, this.f37813j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f37808c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
