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
public final class xm {
    public long f32642i;
    public sm f32644k;
    public float f32647n;
    public float f32648o;
    public float f32649p;
    public float f32650q;
    public float f32651r;
    public float f32652s;
    public h11 f32654u;
    public long v;
    public final org.telegram.ui.ActionBar.j5 f32656x;
    public final m.e3 f32657y;
    public final ym f32658z;
    public float f32637a = 0.0f;
    public int f32638b = 0;
    public long f32639c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f32640f = 0.0f;
    public float f32641g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final zr f32643j = zr.f33340j;
    public final int f32645l = AndroidUtilities.dp(4.0f);
    public final int f32646m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f32653t = new RectF();
    public final Paint f32655w = new Paint(1);

    public xm(ym ymVar) {
        Drawable drawable;
        this.f32658z = ymVar;
        org.telegram.ui.ActionBar.g6 g6Var = ymVar.P.f33291n;
        if (g6Var != null) {
            drawable = g6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f32656x = (org.telegram.ui.ActionBar.j5) (drawable == null ? org.telegram.ui.ActionBar.k6.Q0("drawableMsgOutMedia") : drawable);
        this.f32657y = new m.e3();
    }

    public static void a(xm xmVar, sm smVar, boolean z10) {
        long j10;
        ArrayList arrayList = xmVar.h;
        xmVar.f32644k = smVar;
        if (smVar == null) {
            return;
        }
        HashMap hashMap = smVar.f30567b;
        smVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = elapsedRealtime - xmVar.f32639c;
        long j12 = 200;
        if (j11 < 200) {
            float f7 = ((float) j11) / 200.0f;
            xmVar.f32641g = AndroidUtilities.lerp(xmVar.f32641g, xmVar.e, f7);
            xmVar.f32640f = AndroidUtilities.lerp(xmVar.f32640f, xmVar.d, f7);
        } else {
            xmVar.f32641g = xmVar.e;
            xmVar.f32640f = xmVar.d;
        }
        xmVar.d = smVar.f30568c / 1000.0f;
        xmVar.e = smVar.f30569f;
        if (z10) {
            j10 = elapsedRealtime;
        } else {
            j10 = 0;
        }
        xmVar.f32639c = j10;
        xmVar.f32642i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            wm wmVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j13 = j12;
            int i11 = i10;
            xmVar.f32642i = Math.max(xmVar.f32642i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                wm wmVar2 = (wm) arrayList.get(i12);
                if (wmVar2.f32267b == photoEntry) {
                    wmVar = wmVar2;
                    break;
                }
                i12++;
            }
            if (wmVar == null) {
                wm wmVar3 = new wm(xmVar);
                wm.a(wmVar3, photoEntry);
                wm.b(wmVar3, smVar, groupedMessagePosition, z10);
                arrayList.add(wmVar3);
            } else {
                wm.b(wmVar, smVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j12 = j13;
        }
        long j14 = j12;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            wm wmVar4 = (wm) arrayList.get(i13);
            if (!hashMap.containsKey(wmVar4.f32267b)) {
                if (wmVar4.f32273k <= 0.0f && wmVar4.h + j14 <= elapsedRealtime) {
                    wh.f fVar = wmVar4.f32281s;
                    if (fVar != null) {
                        fVar.b(wmVar4.O.f32658z);
                        wmVar4.f32281s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    wm.b(wmVar4, null, null, z10);
                }
            }
            i13++;
        }
        xmVar.f32658z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f32658z.P.getPreviewScale() * AndroidUtilities.lerp(this.f32641g, this.e, this.f32643j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f32639c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
