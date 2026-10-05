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
public final class rm {
    public long f30538i;
    public mm f30540k;
    public float f30543n;
    public float f30544o;
    public float f30545p;
    public float f30546q;
    public float f30547r;
    public float f30548s;
    public f11 f30550u;
    public long v;
    public final org.telegram.ui.ActionBar.e5 f30552x;
    public final m.c3 f30553y;
    public final sm f30554z;
    public float f30532a = 0.0f;
    public int f30533b = 0;
    public long f30534c = 0;
    public float d = 0.0f;
    public float f30535e = 0.0f;
    public float f30536f = 0.0f;
    public float f30537g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final tr f30539j = tr.f31218j;
    public final int f30541l = AndroidUtilities.dp(4.0f);
    public final int f30542m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f30549t = new RectF();
    public final Paint f30551w = new Paint(1);

    public rm(sm smVar) {
        Drawable drawable;
        this.f30554z = smVar;
        org.telegram.ui.ActionBar.d6 d6Var = smVar.P.f31184n;
        if (d6Var != null) {
            drawable = d6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f30552x = (org.telegram.ui.ActionBar.e5) (drawable == null ? org.telegram.ui.ActionBar.i6.O0("drawableMsgOutMedia") : drawable);
        this.f30553y = new m.c3();
    }

    public static void a(rm rmVar, mm mmVar, boolean z10) {
        long j3;
        ArrayList arrayList = rmVar.h;
        rmVar.f30540k = mmVar;
        if (mmVar == null) {
            return;
        }
        HashMap hashMap = mmVar.f28735b;
        mmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - rmVar.f30534c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = ((float) j10) / 200.0f;
            rmVar.f30537g = AndroidUtilities.lerp(rmVar.f30537g, rmVar.f30535e, f7);
            rmVar.f30536f = AndroidUtilities.lerp(rmVar.f30536f, rmVar.d, f7);
        } else {
            rmVar.f30537g = rmVar.f30535e;
            rmVar.f30536f = rmVar.d;
        }
        rmVar.d = mmVar.f28736c / 1000.0f;
        rmVar.f30535e = mmVar.f28738f;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        rmVar.f30534c = j3;
        rmVar.f30538i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            qm qmVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j12 = j11;
            int i11 = i10;
            rmVar.f30538i = Math.max(rmVar.f30538i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                qm qmVar2 = (qm) arrayList.get(i12);
                if (qmVar2.f30103b == photoEntry) {
                    qmVar = qmVar2;
                    break;
                }
                i12++;
            }
            if (qmVar == null) {
                qm qmVar3 = new qm(rmVar);
                qm.a(qmVar3, photoEntry);
                qm.b(qmVar3, mmVar, groupedMessagePosition, z10);
                arrayList.add(qmVar3);
            } else {
                qm.b(qmVar, mmVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            qm qmVar4 = (qm) arrayList.get(i13);
            if (!hashMap.containsKey(qmVar4.f30103b)) {
                if (qmVar4.f30110k <= 0.0f && qmVar4.h + j13 <= elapsedRealtime) {
                    vh.f fVar = qmVar4.f30118s;
                    if (fVar != null) {
                        fVar.b(qmVar4.O.f30554z);
                        qmVar4.f30118s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    qm.b(qmVar4, null, null, z10);
                }
            }
            i13++;
        }
        rmVar.f30554z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f30554z.P.getPreviewScale() * AndroidUtilities.lerp(this.f30537g, this.f30535e, this.f30539j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f30534c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
