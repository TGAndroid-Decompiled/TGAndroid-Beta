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
    public long f27787i;
    public lm f27789k;
    public float f27792n;
    public float f27793o;
    public float f27794p;
    public float f27795q;
    public float f27796r;
    public float f27797s;
    public v01 f27799u;
    public long v;
    public final org.telegram.ui.ActionBar.f5 f27801x;
    public final m.c3 f27802y;
    public final rm f27803z;
    public float f27782a = 0.0f;
    public int f27783b = 0;
    public long f27784c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f27785f = 0.0f;
    public float f27786g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final sr f27788j = sr.f28362j;
    public final int f27790l = AndroidUtilities.dp(4.0f);
    public final int f27791m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f27798t = new RectF();
    public final Paint f27800w = new Paint(1);

    public qm(rm rmVar) {
        Drawable drawable;
        this.f27803z = rmVar;
        org.telegram.ui.ActionBar.e6 e6Var = rmVar.P.f28331n;
        if (e6Var != null) {
            drawable = e6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f27801x = (org.telegram.ui.ActionBar.f5) (drawable == null ? org.telegram.ui.ActionBar.i6.O0("drawableMsgOutMedia") : drawable);
        this.f27802y = new m.c3();
    }

    public static void a(qm qmVar, lm lmVar, boolean z10) {
        long j3;
        ArrayList arrayList = qmVar.h;
        qmVar.f27789k = lmVar;
        if (lmVar == null) {
            return;
        }
        HashMap hashMap = lmVar.f26083b;
        lmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - qmVar.f27784c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = ((float) j10) / 200.0f;
            qmVar.f27786g = AndroidUtilities.lerp(qmVar.f27786g, qmVar.e, f7);
            qmVar.f27785f = AndroidUtilities.lerp(qmVar.f27785f, qmVar.d, f7);
        } else {
            qmVar.f27786g = qmVar.e;
            qmVar.f27785f = qmVar.d;
        }
        qmVar.d = lmVar.f26084c / 1000.0f;
        qmVar.e = lmVar.f26085f;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        qmVar.f27784c = j3;
        qmVar.f27787i = 0L;
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
            qmVar.f27787i = Math.max(qmVar.f27787i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                pm pmVar2 = (pm) arrayList.get(i12);
                if (pmVar2.f27392b == photoEntry) {
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
            if (!hashMap.containsKey(pmVar4.f27392b)) {
                if (pmVar4.f27398k <= 0.0f && pmVar4.h + j13 <= elapsedRealtime) {
                    vh.f fVar = pmVar4.f27406s;
                    if (fVar != null) {
                        fVar.b(pmVar4.O.f27803z);
                        pmVar4.f27406s = null;
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
        qmVar.f27803z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f27803z.P.getPreviewScale() * AndroidUtilities.lerp(this.f27786g, this.e, this.f27788j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f27784c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
