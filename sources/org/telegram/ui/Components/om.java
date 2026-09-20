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
public final class om {
    public long f26980i;
    public jm f26982k;
    public float f26985n;
    public float f26986o;
    public float f26987p;
    public float f26988q;
    public float f26989r;
    public float f26990s;
    public u01 f26992u;
    public long v;
    public final org.telegram.ui.ActionBar.f5 f26994x;
    public final m.c3 f26995y;
    public final pm f26996z;
    public float f26975a = 0.0f;
    public int f26976b = 0;
    public long f26977c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f26978f = 0.0f;
    public float f26979g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final qr f26981j = qr.f27645j;
    public final int f26983l = AndroidUtilities.dp(4.0f);
    public final int f26984m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f26991t = new RectF();
    public final Paint f26993w = new Paint(1);

    public om(pm pmVar) {
        Drawable drawable;
        this.f26996z = pmVar;
        org.telegram.ui.ActionBar.f6 f6Var = pmVar.P.f27607n;
        if (f6Var != null) {
            drawable = f6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f26994x = (org.telegram.ui.ActionBar.f5) (drawable == null ? org.telegram.ui.ActionBar.j6.O0("drawableMsgOutMedia") : drawable);
        this.f26995y = new m.c3();
    }

    public static void a(om omVar, jm jmVar, boolean z10) {
        long j3;
        ArrayList arrayList = omVar.h;
        omVar.f26982k = jmVar;
        if (jmVar == null) {
            return;
        }
        HashMap hashMap = jmVar.f25393b;
        jmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - omVar.f26977c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = ((float) j10) / 200.0f;
            omVar.f26979g = AndroidUtilities.lerp(omVar.f26979g, omVar.e, f7);
            omVar.f26978f = AndroidUtilities.lerp(omVar.f26978f, omVar.d, f7);
        } else {
            omVar.f26979g = omVar.e;
            omVar.f26978f = omVar.d;
        }
        omVar.d = jmVar.f25394c / 1000.0f;
        omVar.e = jmVar.f25395f;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        omVar.f26977c = j3;
        omVar.f26980i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            nm nmVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j12 = j11;
            int i11 = i10;
            omVar.f26980i = Math.max(omVar.f26980i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                nm nmVar2 = (nm) arrayList.get(i12);
                if (nmVar2.f26687b == photoEntry) {
                    nmVar = nmVar2;
                    break;
                }
                i12++;
            }
            if (nmVar == null) {
                nm nmVar3 = new nm(omVar);
                nm.a(nmVar3, photoEntry);
                nm.b(nmVar3, jmVar, groupedMessagePosition, z10);
                arrayList.add(nmVar3);
            } else {
                nm.b(nmVar, jmVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            nm nmVar4 = (nm) arrayList.get(i13);
            if (!hashMap.containsKey(nmVar4.f26687b)) {
                if (nmVar4.f26693k <= 0.0f && nmVar4.h + j13 <= elapsedRealtime) {
                    vh.g gVar = nmVar4.f26701s;
                    if (gVar != null) {
                        gVar.b(nmVar4.O.f26996z);
                        nmVar4.f26701s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    nm.b(nmVar4, null, null, z10);
                }
            }
            i13++;
        }
        omVar.f26996z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f26996z.P.getPreviewScale() * AndroidUtilities.lerp(this.f26979g, this.e, this.f26981j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f26977c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
