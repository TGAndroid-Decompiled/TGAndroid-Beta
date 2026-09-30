package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class qm {
    public long f27765i;
    public lm f27767k;
    public float f27770n;
    public float f27771o;
    public float f27772p;
    public float f27773q;
    public float f27774r;
    public float f27775s;
    public v01 f27777u;
    public long v;
    public final org.telegram.ui.ActionBar.d5 f27779x;
    public final m.c3 f27780y;
    public final rm f27781z;
    public float f27760a = 0.0f;
    public int f27761b = 0;
    public long f27762c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f27763f = 0.0f;
    public float f27764g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final sr f27766j = sr.f28349j;
    public final int f27768l = AndroidUtilities.dp(4.0f);
    public final int f27769m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f27776t = new RectF();
    public final Paint f27778w = new Paint(1);

    public qm(rm rmVar) {
        Drawable drawable;
        this.f27781z = rmVar;
        org.telegram.ui.ActionBar.d6 d6Var = rmVar.P.f28311n;
        if (d6Var != null) {
            drawable = d6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f27779x = (org.telegram.ui.ActionBar.d5) (drawable == null ? org.telegram.ui.ActionBar.h6.O0("drawableMsgOutMedia") : drawable);
        this.f27780y = new m.c3();
    }

    public static void a(qm qmVar, lm lmVar, boolean z10) {
        long j3;
        ArrayList arrayList = qmVar.h;
        qmVar.f27767k = lmVar;
        if (lmVar == null) {
            return;
        }
        HashMap hashMap = lmVar.f26019b;
        lmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - qmVar.f27762c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = ((float) j10) / 200.0f;
            qmVar.f27764g = AndroidUtilities.lerp(qmVar.f27764g, qmVar.e, f7);
            qmVar.f27763f = AndroidUtilities.lerp(qmVar.f27763f, qmVar.d, f7);
        } else {
            qmVar.f27764g = qmVar.e;
            qmVar.f27763f = qmVar.d;
        }
        qmVar.d = lmVar.f26020c / 1000.0f;
        qmVar.e = lmVar.f26021f;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        qmVar.f27762c = j3;
        qmVar.f27765i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            pm pmVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j12 = j11;
            int i11 = i10;
            qmVar.f27765i = Math.max(qmVar.f27765i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                pm pmVar2 = (pm) arrayList.get(i12);
                if (pmVar2.f27370b == photoEntry) {
                    pmVar = pmVar2;
                    break;
                }
                i12++;
            }
            if (pmVar == null) {
                pm pmVar3 = new pm(qmVar);
                pm.a(pmVar3, photoEntry);
                pm.b(pmVar3, lmVar, groupedMessagePosition, z10);
                arrayList.add(pmVar3);
            } else {
                pm.b(pmVar, lmVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            pm pmVar4 = (pm) arrayList.get(i13);
            if (!hashMap.containsKey(pmVar4.f27370b)) {
                if (pmVar4.f27376k <= 0.0f && pmVar4.h + j13 <= elapsedRealtime) {
                    vh.f fVar = pmVar4.f27384s;
                    if (fVar != null) {
                        fVar.b(pmVar4.O.f27781z);
                        pmVar4.f27384s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    pm.b(pmVar4, null, null, z10);
                }
            }
            i13++;
        }
        qmVar.f27781z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f27781z.P.getPreviewScale() * AndroidUtilities.lerp(this.f27764g, this.e, this.f27766j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f27762c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
