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
public final class cn {
    public long f23810i;
    public xm f23812k;
    public float f23815n;
    public float f23816o;
    public float f23817p;
    public float f23818q;
    public float f23819r;
    public float f23820s;
    public i11 f23822u;
    public long v;
    public final org.telegram.ui.ActionBar.d5 f23824x;
    public final m.f3 f23825y;
    public final dn f23826z;
    public float f23805a = 0.0f;
    public int f23806b = 0;
    public long f23807c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f23808f = 0.0f;
    public float f23809g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final es f23811j = es.f24468j;
    public final int f23813l = AndroidUtilities.dp(4.0f);
    public final int f23814m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f23821t = new RectF();
    public final Paint f23823w = new Paint(1);

    public cn(dn dnVar) {
        Drawable drawable;
        this.f23826z = dnVar;
        org.telegram.ui.ActionBar.c6 c6Var = dnVar.P.f24432n;
        if (c6Var != null) {
            drawable = c6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f23824x = (org.telegram.ui.ActionBar.d5) (drawable == null ? org.telegram.ui.ActionBar.g6.P0("drawableMsgOutMedia") : drawable);
        this.f23825y = new m.f3();
    }

    public static void a(cn cnVar, xm xmVar, boolean z10) {
        long j10;
        ArrayList arrayList = cnVar.h;
        cnVar.f23812k = xmVar;
        if (xmVar == null) {
            return;
        }
        HashMap hashMap = xmVar.f30949b;
        xmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = elapsedRealtime - cnVar.f23807c;
        long j12 = 200;
        if (j11 < 200) {
            float f7 = ((float) j11) / 200.0f;
            cnVar.f23809g = AndroidUtilities.lerp(cnVar.f23809g, cnVar.e, f7);
            cnVar.f23808f = AndroidUtilities.lerp(cnVar.f23808f, cnVar.d, f7);
        } else {
            cnVar.f23809g = cnVar.e;
            cnVar.f23808f = cnVar.d;
        }
        cnVar.d = xmVar.f30950c / 1000.0f;
        cnVar.e = xmVar.f30951f;
        if (z10) {
            j10 = elapsedRealtime;
        } else {
            j10 = 0;
        }
        cnVar.f23807c = j10;
        cnVar.f23810i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            bn bnVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j13 = j12;
            int i11 = i10;
            cnVar.f23810i = Math.max(cnVar.f23810i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                bn bnVar2 = (bn) arrayList.get(i12);
                if (bnVar2.f23497b == photoEntry) {
                    bnVar = bnVar2;
                    break;
                }
                i12++;
            }
            if (bnVar == null) {
                bn bnVar3 = new bn(cnVar);
                bn.a(bnVar3, photoEntry);
                bn.b(bnVar3, xmVar, groupedMessagePosition, z10);
                arrayList.add(bnVar3);
            } else {
                bn.b(bnVar, xmVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j12 = j13;
        }
        long j14 = j12;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            bn bnVar4 = (bn) arrayList.get(i13);
            if (!hashMap.containsKey(bnVar4.f23497b)) {
                if (bnVar4.f23503k <= 0.0f && bnVar4.h + j14 <= elapsedRealtime) {
                    wh.f fVar = bnVar4.f23511s;
                    if (fVar != null) {
                        fVar.b(bnVar4.O.f23826z);
                        bnVar4.f23511s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    bn.b(bnVar4, null, null, z10);
                }
            }
            i13++;
        }
        cnVar.f23826z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f23826z.P.getPreviewScale() * AndroidUtilities.lerp(this.f23809g, this.e, this.f23811j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f23807c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
