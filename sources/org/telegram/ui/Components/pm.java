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
    public long f27389i;
    public km f27391k;
    public float f27394n;
    public float f27395o;
    public float f27396p;
    public float f27397q;
    public float f27398r;
    public float f27399s;
    public t01 f27401u;
    public long v;
    public final org.telegram.ui.ActionBar.d5 f27403x;
    public final m.c3 f27404y;
    public final qm f27405z;
    public float f27384a = 0.0f;
    public int f27385b = 0;
    public long f27386c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f27387f = 0.0f;
    public float f27388g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final rr f27390j = rr.f28034j;
    public final int f27392l = AndroidUtilities.dp(4.0f);
    public final int f27393m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f27400t = new RectF();
    public final Paint f27402w = new Paint(1);

    public pm(qm qmVar) {
        Drawable drawable;
        this.f27405z = qmVar;
        org.telegram.ui.ActionBar.d6 d6Var = qmVar.P.f28000n;
        if (d6Var != null) {
            drawable = d6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f27403x = (org.telegram.ui.ActionBar.d5) (drawable == null ? org.telegram.ui.ActionBar.h6.O0("drawableMsgOutMedia") : drawable);
        this.f27404y = new m.c3();
    }

    public static void a(pm pmVar, km kmVar, boolean z10) {
        long j3;
        ArrayList arrayList = pmVar.h;
        pmVar.f27391k = kmVar;
        if (kmVar == null) {
            return;
        }
        HashMap hashMap = kmVar.f25816b;
        kmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - pmVar.f27386c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = ((float) j10) / 200.0f;
            pmVar.f27388g = AndroidUtilities.lerp(pmVar.f27388g, pmVar.e, f7);
            pmVar.f27387f = AndroidUtilities.lerp(pmVar.f27387f, pmVar.d, f7);
        } else {
            pmVar.f27388g = pmVar.e;
            pmVar.f27387f = pmVar.d;
        }
        pmVar.d = kmVar.f25817c / 1000.0f;
        pmVar.e = kmVar.f25818f;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        pmVar.f27386c = j3;
        pmVar.f27389i = 0L;
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
            pmVar.f27389i = Math.max(pmVar.f27389i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                om omVar2 = (om) arrayList.get(i12);
                if (omVar2.f27120b == photoEntry) {
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
            if (!hashMap.containsKey(omVar4.f27120b)) {
                if (omVar4.f27126k <= 0.0f && omVar4.h + j13 <= elapsedRealtime) {
                    vh.f fVar = omVar4.f27134s;
                    if (fVar != null) {
                        fVar.b(omVar4.O.f27405z);
                        omVar4.f27134s = null;
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
        pmVar.f27405z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f27405z.P.getPreviewScale() * AndroidUtilities.lerp(this.f27388g, this.e, this.f27390j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f27386c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
