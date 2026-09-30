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
    public long f28070i;
    public mm f28072k;
    public float f28075n;
    public float f28076o;
    public float f28077p;
    public float f28078q;
    public float f28079r;
    public float f28080s;
    public w01 f28082u;
    public long v;
    public final org.telegram.ui.ActionBar.d5 f28084x;
    public final m.c3 f28085y;
    public final sm f28086z;
    public float f28065a = 0.0f;
    public int f28066b = 0;
    public long f28067c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f28068f = 0.0f;
    public float f28069g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final tr f28071j = tr.f28639j;
    public final int f28073l = AndroidUtilities.dp(4.0f);
    public final int f28074m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f28081t = new RectF();
    public final Paint f28083w = new Paint(1);

    public rm(sm smVar) {
        Drawable drawable;
        this.f28086z = smVar;
        org.telegram.ui.ActionBar.d6 d6Var = smVar.P.f28601n;
        if (d6Var != null) {
            drawable = d6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f28084x = (org.telegram.ui.ActionBar.d5) (drawable == null ? org.telegram.ui.ActionBar.h6.O0("drawableMsgOutMedia") : drawable);
        this.f28085y = new m.c3();
    }

    public static void a(rm rmVar, mm mmVar, boolean z10) {
        long j3;
        ArrayList arrayList = rmVar.h;
        rmVar.f28072k = mmVar;
        if (mmVar == null) {
            return;
        }
        HashMap hashMap = mmVar.f26321b;
        mmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - rmVar.f28067c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = ((float) j10) / 200.0f;
            rmVar.f28069g = AndroidUtilities.lerp(rmVar.f28069g, rmVar.e, f7);
            rmVar.f28068f = AndroidUtilities.lerp(rmVar.f28068f, rmVar.d, f7);
        } else {
            rmVar.f28069g = rmVar.e;
            rmVar.f28068f = rmVar.d;
        }
        rmVar.d = mmVar.f26322c / 1000.0f;
        rmVar.e = mmVar.f26323f;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        rmVar.f28067c = j3;
        rmVar.f28070i = 0L;
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
            rmVar.f28070i = Math.max(rmVar.f28070i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                qm qmVar2 = (qm) arrayList.get(i12);
                if (qmVar2.f27674b == photoEntry) {
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
            if (!hashMap.containsKey(qmVar4.f27674b)) {
                if (qmVar4.f27680k <= 0.0f && qmVar4.h + j13 <= elapsedRealtime) {
                    vh.f fVar = qmVar4.f27688s;
                    if (fVar != null) {
                        fVar.b(qmVar4.O.f28086z);
                        qmVar4.f27688s = null;
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
        rmVar.f28086z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f28086z.P.getPreviewScale() * AndroidUtilities.lerp(this.f28069g, this.e, this.f28071j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f28067c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
