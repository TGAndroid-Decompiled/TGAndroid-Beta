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
public final class mm {
    public long f27058i;
    public gm f27060k;
    public float f27063n;
    public float f27064o;
    public float f27065p;
    public float f27066q;
    public float f27067r;
    public float f27068s;
    public k01 f27070u;
    public long v;
    public final org.telegram.ui.ActionBar.g5 f27072x;
    public final m.f3 f27073y;
    public final nm f27074z;
    public float f27053a = 0.0f;
    public int f27054b = 0;
    public long f27055c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f27056f = 0.0f;
    public float f27057g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final nr f27059j = nr.f27349j;
    public final int f27061l = AndroidUtilities.dp(4.0f);
    public final int f27062m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f27069t = new RectF();
    public final Paint f27071w = new Paint(1);

    public mm(nm nmVar) {
        Drawable drawable;
        this.f27074z = nmVar;
        org.telegram.ui.ActionBar.f6 f6Var = nmVar.M.f27590n;
        if (f6Var != null) {
            drawable = f6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f27072x = (org.telegram.ui.ActionBar.g5) (drawable == null ? org.telegram.ui.ActionBar.j6.O0("drawableMsgOutMedia") : drawable);
        this.f27073y = new m.f3();
    }

    public static void a(mm mmVar, gm gmVar, boolean z4) {
        long j10;
        ArrayList arrayList = mmVar.h;
        mmVar.f27060k = gmVar;
        if (gmVar == null) {
            return;
        }
        HashMap hashMap = gmVar.f25194b;
        gmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = elapsedRealtime - mmVar.f27055c;
        long j12 = 200;
        if (j11 < 200) {
            float f10 = ((float) j11) / 200.0f;
            mmVar.f27057g = AndroidUtilities.lerp(mmVar.f27057g, mmVar.e, f10);
            mmVar.f27056f = AndroidUtilities.lerp(mmVar.f27056f, mmVar.d, f10);
        } else {
            mmVar.f27057g = mmVar.e;
            mmVar.f27056f = mmVar.d;
        }
        mmVar.d = gmVar.f25195c / 1000.0f;
        mmVar.e = gmVar.f25196f;
        if (z4) {
            j10 = elapsedRealtime;
        } else {
            j10 = 0;
        }
        mmVar.f27055c = j10;
        mmVar.f27058i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            lm lmVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j13 = j12;
            int i11 = i10;
            mmVar.f27058i = Math.max(mmVar.f27058i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                lm lmVar2 = (lm) arrayList.get(i12);
                if (lmVar2.f26791b == photoEntry) {
                    lmVar = lmVar2;
                    break;
                }
                i12++;
            }
            if (lmVar == null) {
                lm lmVar3 = new lm(mmVar);
                lm.a(lmVar3, photoEntry);
                lm.b(lmVar3, gmVar, groupedMessagePosition, z4);
                arrayList.add(lmVar3);
            } else {
                lm.b(lmVar, gmVar, groupedMessagePosition, z4);
            }
            i10 = i11 + 1;
            j12 = j13;
        }
        long j14 = j12;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            lm lmVar4 = (lm) arrayList.get(i13);
            if (!hashMap.containsKey(lmVar4.f26791b)) {
                if (lmVar4.f26797k <= 0.0f && lmVar4.h + j14 <= elapsedRealtime) {
                    ih.j jVar = lmVar4.f26805s;
                    if (jVar != null) {
                        jVar.b(lmVar4.O.f27074z);
                        lmVar4.f26805s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    lm.b(lmVar4, null, null, z4);
                }
            }
            i13++;
        }
        mmVar.f27074z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f27074z.M.getPreviewScale() * AndroidUtilities.lerp(this.f27057g, this.e, this.f27059j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f27055c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
