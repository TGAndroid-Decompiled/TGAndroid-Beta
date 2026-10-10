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
public final class fn {
    public long f26447i;
    public an f26449k;
    public float f26452n;
    public float f26453o;
    public float f26454p;
    public float f26455q;
    public float f26456r;
    public float f26457s;
    public m11 f26459u;
    public long v;
    public final org.telegram.ui.ActionBar.f5 f26461x;
    public final m.c3 f26462y;
    public final gn f26463z;
    public float f26441a = 0.0f;
    public int f26442b = 0;
    public long f26443c = 0;
    public float d = 0.0f;
    public float f26444e = 0.0f;
    public float f26445f = 0.0f;
    public float f26446g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final is f26448j = is.f27446j;
    public final int f26450l = AndroidUtilities.dp(4.0f);
    public final int f26451m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f26458t = new RectF();
    public final Paint f26460w = new Paint(1);

    public fn(gn gnVar) {
        Drawable drawable;
        this.f26463z = gnVar;
        org.telegram.ui.ActionBar.e6 e6Var = gnVar.P.f27079n;
        if (e6Var != null) {
            drawable = e6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f26461x = (org.telegram.ui.ActionBar.f5) (drawable == null ? org.telegram.ui.ActionBar.i6.P0("drawableMsgOutMedia") : drawable);
        this.f26462y = new m.c3();
    }

    public static void a(fn fnVar, an anVar, boolean z10) {
        long j3;
        ArrayList arrayList = fnVar.h;
        fnVar.f26449k = anVar;
        if (anVar == null) {
            return;
        }
        HashMap hashMap = anVar.f24588b;
        anVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - fnVar.f26443c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = ((float) j10) / 200.0f;
            fnVar.f26446g = AndroidUtilities.lerp(fnVar.f26446g, fnVar.f26444e, f7);
            fnVar.f26445f = AndroidUtilities.lerp(fnVar.f26445f, fnVar.d, f7);
        } else {
            fnVar.f26446g = fnVar.f26444e;
            fnVar.f26445f = fnVar.d;
        }
        fnVar.d = anVar.f24589c / 1000.0f;
        fnVar.f26444e = anVar.f24591f;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        fnVar.f26443c = j3;
        fnVar.f26447i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            en enVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j12 = j11;
            int i11 = i10;
            fnVar.f26447i = Math.max(fnVar.f26447i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                en enVar2 = (en) arrayList.get(i12);
                if (enVar2.f26082b == photoEntry) {
                    enVar = enVar2;
                    break;
                }
                i12++;
            }
            if (enVar == null) {
                en enVar3 = new en(fnVar);
                en.a(enVar3, photoEntry);
                en.b(enVar3, anVar, groupedMessagePosition, z10);
                arrayList.add(enVar3);
            } else {
                en.b(enVar, anVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            en enVar4 = (en) arrayList.get(i13);
            if (!hashMap.containsKey(enVar4.f26082b)) {
                if (enVar4.f26089k <= 0.0f && enVar4.h + j13 <= elapsedRealtime) {
                    vh.f fVar = enVar4.f26097s;
                    if (fVar != null) {
                        fVar.b(enVar4.O.f26463z);
                        enVar4.f26097s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    en.b(enVar4, null, null, z10);
                }
            }
            i13++;
        }
        fnVar.f26463z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f26463z.P.getPreviewScale() * AndroidUtilities.lerp(this.f26446g, this.f26444e, this.f26448j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f26443c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
