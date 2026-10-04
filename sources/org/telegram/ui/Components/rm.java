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
    public long f30449i;
    public mm f30451k;
    public float f30454n;
    public float f30455o;
    public float f30456p;
    public float f30457q;
    public float f30458r;
    public float f30459s;
    public e11 f30461u;
    public long v;
    public final org.telegram.ui.ActionBar.e5 f30463x;
    public final m.c3 f30464y;
    public final sm f30465z;
    public float f30443a = 0.0f;
    public int f30444b = 0;
    public long f30445c = 0;
    public float d = 0.0f;
    public float f30446e = 0.0f;
    public float f30447f = 0.0f;
    public float f30448g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final tr f30450j = tr.f31143j;
    public final int f30452l = AndroidUtilities.dp(4.0f);
    public final int f30453m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f30460t = new RectF();
    public final Paint f30462w = new Paint(1);

    public rm(sm smVar) {
        Drawable drawable;
        this.f30465z = smVar;
        org.telegram.ui.ActionBar.d6 d6Var = smVar.P.f31090n;
        if (d6Var != null) {
            drawable = d6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f30463x = (org.telegram.ui.ActionBar.e5) (drawable == null ? org.telegram.ui.ActionBar.i6.O0("drawableMsgOutMedia") : drawable);
        this.f30464y = new m.c3();
    }

    public static void a(rm rmVar, mm mmVar, boolean z10) {
        long j3;
        ArrayList arrayList = rmVar.h;
        rmVar.f30451k = mmVar;
        if (mmVar == null) {
            return;
        }
        HashMap hashMap = mmVar.f28650b;
        mmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - rmVar.f30445c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = ((float) j10) / 200.0f;
            rmVar.f30448g = AndroidUtilities.lerp(rmVar.f30448g, rmVar.f30446e, f7);
            rmVar.f30447f = AndroidUtilities.lerp(rmVar.f30447f, rmVar.d, f7);
        } else {
            rmVar.f30448g = rmVar.f30446e;
            rmVar.f30447f = rmVar.d;
        }
        rmVar.d = mmVar.f28651c / 1000.0f;
        rmVar.f30446e = mmVar.f28653f;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        rmVar.f30445c = j3;
        rmVar.f30449i = 0L;
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
            rmVar.f30449i = Math.max(rmVar.f30449i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                qm qmVar2 = (qm) arrayList.get(i12);
                if (qmVar2.f30075b == photoEntry) {
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
            if (!hashMap.containsKey(qmVar4.f30075b)) {
                if (qmVar4.f30082k <= 0.0f && qmVar4.h + j13 <= elapsedRealtime) {
                    vh.f fVar = qmVar4.f30090s;
                    if (fVar != null) {
                        fVar.b(qmVar4.O.f30465z);
                        qmVar4.f30090s = null;
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
        rmVar.f30465z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f30465z.P.getPreviewScale() * AndroidUtilities.lerp(this.f30448g, this.f30446e, this.f30450j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f30445c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
