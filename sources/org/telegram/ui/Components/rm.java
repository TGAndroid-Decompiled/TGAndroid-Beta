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
    public long f30456i;
    public mm f30458k;
    public float f30461n;
    public float f30462o;
    public float f30463p;
    public float f30464q;
    public float f30465r;
    public float f30466s;
    public e11 f30468u;
    public long v;
    public final org.telegram.ui.ActionBar.e5 f30470x;
    public final m.c3 f30471y;
    public final sm f30472z;
    public float f30450a = 0.0f;
    public int f30451b = 0;
    public long f30452c = 0;
    public float d = 0.0f;
    public float f30453e = 0.0f;
    public float f30454f = 0.0f;
    public float f30455g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final tr f30457j = tr.f31150j;
    public final int f30459l = AndroidUtilities.dp(4.0f);
    public final int f30460m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f30467t = new RectF();
    public final Paint f30469w = new Paint(1);

    public rm(sm smVar) {
        Drawable drawable;
        this.f30472z = smVar;
        org.telegram.ui.ActionBar.d6 d6Var = smVar.P.f31097n;
        if (d6Var != null) {
            drawable = d6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f30470x = (org.telegram.ui.ActionBar.e5) (drawable == null ? org.telegram.ui.ActionBar.i6.O0("drawableMsgOutMedia") : drawable);
        this.f30471y = new m.c3();
    }

    public static void a(rm rmVar, mm mmVar, boolean z10) {
        long j3;
        ArrayList arrayList = rmVar.h;
        rmVar.f30458k = mmVar;
        if (mmVar == null) {
            return;
        }
        HashMap hashMap = mmVar.f28656b;
        mmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - rmVar.f30452c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = ((float) j10) / 200.0f;
            rmVar.f30455g = AndroidUtilities.lerp(rmVar.f30455g, rmVar.f30453e, f7);
            rmVar.f30454f = AndroidUtilities.lerp(rmVar.f30454f, rmVar.d, f7);
        } else {
            rmVar.f30455g = rmVar.f30453e;
            rmVar.f30454f = rmVar.d;
        }
        rmVar.d = mmVar.f28657c / 1000.0f;
        rmVar.f30453e = mmVar.f28659f;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        rmVar.f30452c = j3;
        rmVar.f30456i = 0L;
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
            rmVar.f30456i = Math.max(rmVar.f30456i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                qm qmVar2 = (qm) arrayList.get(i12);
                if (qmVar2.f30081b == photoEntry) {
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
            if (!hashMap.containsKey(qmVar4.f30081b)) {
                if (qmVar4.f30088k <= 0.0f && qmVar4.h + j13 <= elapsedRealtime) {
                    vh.f fVar = qmVar4.f30096s;
                    if (fVar != null) {
                        fVar.b(qmVar4.O.f30472z);
                        qmVar4.f30096s = null;
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
        rmVar.f30472z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f30472z.P.getPreviewScale() * AndroidUtilities.lerp(this.f30455g, this.f30453e, this.f30457j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f30452c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
