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
    public long f30450i;
    public mm f30452k;
    public float f30455n;
    public float f30456o;
    public float f30457p;
    public float f30458q;
    public float f30459r;
    public float f30460s;
    public e11 f30462u;
    public long v;
    public final org.telegram.ui.ActionBar.e5 f30464x;
    public final m.c3 f30465y;
    public final sm f30466z;
    public float f30444a = 0.0f;
    public int f30445b = 0;
    public long f30446c = 0;
    public float d = 0.0f;
    public float f30447e = 0.0f;
    public float f30448f = 0.0f;
    public float f30449g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final tr f30451j = tr.f31144j;
    public final int f30453l = AndroidUtilities.dp(4.0f);
    public final int f30454m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f30461t = new RectF();
    public final Paint f30463w = new Paint(1);

    public rm(sm smVar) {
        Drawable drawable;
        this.f30466z = smVar;
        org.telegram.ui.ActionBar.d6 d6Var = smVar.P.f31091n;
        if (d6Var != null) {
            drawable = d6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f30464x = (org.telegram.ui.ActionBar.e5) (drawable == null ? org.telegram.ui.ActionBar.i6.O0("drawableMsgOutMedia") : drawable);
        this.f30465y = new m.c3();
    }

    public static void a(rm rmVar, mm mmVar, boolean z10) {
        long j3;
        ArrayList arrayList = rmVar.h;
        rmVar.f30452k = mmVar;
        if (mmVar == null) {
            return;
        }
        HashMap hashMap = mmVar.f28651b;
        mmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - rmVar.f30446c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = ((float) j10) / 200.0f;
            rmVar.f30449g = AndroidUtilities.lerp(rmVar.f30449g, rmVar.f30447e, f7);
            rmVar.f30448f = AndroidUtilities.lerp(rmVar.f30448f, rmVar.d, f7);
        } else {
            rmVar.f30449g = rmVar.f30447e;
            rmVar.f30448f = rmVar.d;
        }
        rmVar.d = mmVar.f28652c / 1000.0f;
        rmVar.f30447e = mmVar.f28654f;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        rmVar.f30446c = j3;
        rmVar.f30450i = 0L;
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
            rmVar.f30450i = Math.max(rmVar.f30450i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                qm qmVar2 = (qm) arrayList.get(i12);
                if (qmVar2.f30076b == photoEntry) {
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
            if (!hashMap.containsKey(qmVar4.f30076b)) {
                if (qmVar4.f30083k <= 0.0f && qmVar4.h + j13 <= elapsedRealtime) {
                    vh.f fVar = qmVar4.f30091s;
                    if (fVar != null) {
                        fVar.b(qmVar4.O.f30466z);
                        qmVar4.f30091s = null;
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
        rmVar.f30466z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f30466z.P.getPreviewScale() * AndroidUtilities.lerp(this.f30449g, this.f30447e, this.f30451j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f30446c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
