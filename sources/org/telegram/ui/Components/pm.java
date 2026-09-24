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
public final class pm {
    public long f27374i;
    public km f27376k;
    public float f27379n;
    public float f27380o;
    public float f27381p;
    public float f27382q;
    public float f27383r;
    public float f27384s;
    public t01 f27386u;
    public long v;
    public final org.telegram.ui.ActionBar.d5 f27388x;
    public final m.c3 f27389y;
    public final qm f27390z;
    public float f27369a = 0.0f;
    public int f27370b = 0;
    public long f27371c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f27372f = 0.0f;
    public float f27373g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final rr f27375j = rr.f28025j;
    public final int f27377l = AndroidUtilities.dp(4.0f);
    public final int f27378m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f27385t = new RectF();
    public final Paint f27387w = new Paint(1);

    public pm(qm qmVar) {
        Drawable drawable;
        this.f27390z = qmVar;
        org.telegram.ui.ActionBar.d6 d6Var = qmVar.P.f27991n;
        if (d6Var != null) {
            drawable = d6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f27388x = (org.telegram.ui.ActionBar.d5) (drawable == null ? org.telegram.ui.ActionBar.h6.O0("drawableMsgOutMedia") : drawable);
        this.f27389y = new m.c3();
    }

    public static void a(pm pmVar, km kmVar, boolean z10) {
        long j3;
        ArrayList arrayList = pmVar.h;
        pmVar.f27376k = kmVar;
        if (kmVar == null) {
            return;
        }
        HashMap hashMap = kmVar.f25797b;
        kmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - pmVar.f27371c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = ((float) j10) / 200.0f;
            pmVar.f27373g = AndroidUtilities.lerp(pmVar.f27373g, pmVar.e, f7);
            pmVar.f27372f = AndroidUtilities.lerp(pmVar.f27372f, pmVar.d, f7);
        } else {
            pmVar.f27373g = pmVar.e;
            pmVar.f27372f = pmVar.d;
        }
        pmVar.d = kmVar.f25798c / 1000.0f;
        pmVar.e = kmVar.f25799f;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        pmVar.f27371c = j3;
        pmVar.f27374i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            om omVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j12 = j11;
            int i11 = i10;
            pmVar.f27374i = Math.max(pmVar.f27374i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                om omVar2 = (om) arrayList.get(i12);
                if (omVar2.f27115b == photoEntry) {
                    omVar = omVar2;
                    break;
                }
                i12++;
            }
            if (omVar == null) {
                om omVar3 = new om(pmVar);
                om.a(omVar3, photoEntry);
                om.b(omVar3, kmVar, groupedMessagePosition, z10);
                arrayList.add(omVar3);
            } else {
                om.b(omVar, kmVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            om omVar4 = (om) arrayList.get(i13);
            if (!hashMap.containsKey(omVar4.f27115b)) {
                if (omVar4.f27121k <= 0.0f && omVar4.h + j13 <= elapsedRealtime) {
                    vh.f fVar = omVar4.f27129s;
                    if (fVar != null) {
                        fVar.b(omVar4.O.f27390z);
                        omVar4.f27129s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    om.b(omVar4, null, null, z10);
                }
            }
            i13++;
        }
        pmVar.f27390z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f27390z.P.getPreviewScale() * AndroidUtilities.lerp(this.f27373g, this.e, this.f27375j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f27371c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
