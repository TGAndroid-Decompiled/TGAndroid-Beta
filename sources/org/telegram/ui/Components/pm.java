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
    public long f27089i;
    public km f27091k;
    public float f27094n;
    public float f27095o;
    public float f27096p;
    public float f27097q;
    public float f27098r;
    public float f27099s;
    public f01 f27101u;
    public long v;
    public final org.telegram.ui.ActionBar.e5 f27103x;
    public final m.c3 f27104y;
    public final qm f27105z;
    public float f27084a = 0.0f;
    public int f27085b = 0;
    public long f27086c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f27087f = 0.0f;
    public float f27088g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final rr f27090j = rr.f27704j;
    public final int f27092l = AndroidUtilities.dp(4.0f);
    public final int f27093m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f27100t = new RectF();
    public final Paint f27102w = new Paint(1);

    public pm(qm qmVar) {
        Drawable drawable;
        this.f27105z = qmVar;
        org.telegram.ui.ActionBar.d6 d6Var = qmVar.P.f27670n;
        if (d6Var != null) {
            drawable = d6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f27103x = (org.telegram.ui.ActionBar.e5) (drawable == null ? org.telegram.ui.ActionBar.h6.O0("drawableMsgOutMedia") : drawable);
        this.f27104y = new m.c3();
    }

    public static void a(pm pmVar, km kmVar, boolean z10) {
        long j3;
        ArrayList arrayList = pmVar.h;
        pmVar.f27091k = kmVar;
        if (kmVar == null) {
            return;
        }
        HashMap hashMap = kmVar.f25627b;
        kmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - pmVar.f27086c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = ((float) j10) / 200.0f;
            pmVar.f27088g = AndroidUtilities.lerp(pmVar.f27088g, pmVar.e, f7);
            pmVar.f27087f = AndroidUtilities.lerp(pmVar.f27087f, pmVar.d, f7);
        } else {
            pmVar.f27088g = pmVar.e;
            pmVar.f27087f = pmVar.d;
        }
        pmVar.d = kmVar.f25628c / 1000.0f;
        pmVar.e = kmVar.f25629f;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        pmVar.f27086c = j3;
        pmVar.f27089i = 0L;
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
            pmVar.f27089i = Math.max(pmVar.f27089i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                om omVar2 = (om) arrayList.get(i12);
                if (omVar2.f26780b == photoEntry) {
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
            if (!hashMap.containsKey(omVar4.f26780b)) {
                if (omVar4.f26786k <= 0.0f && omVar4.h + j13 <= elapsedRealtime) {
                    vh.g gVar = omVar4.f26794s;
                    if (gVar != null) {
                        gVar.b(omVar4.O.f27105z);
                        omVar4.f26794s = null;
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
        pmVar.f27105z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f27105z.P.getPreviewScale() * AndroidUtilities.lerp(this.f27088g, this.e, this.f27090j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f27086c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
