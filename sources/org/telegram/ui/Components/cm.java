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

public final class cm {

    public long f27489i;

    public wl f27491k;

    public float f27494n;

    public float f27495o;

    public float f27496p;

    public float f27497q;

    public float f27498r;

    public float f27499s;

    public pz0 f27501u;
    public long v;

    public final org.telegram.ui.ActionBar.d5 f27503x;

    public final m.f3 f27504y;

    public final dm f27505z;

    public float f27483a = 0.0f;

    public int f27484b = 0;

    public long f27485c = 0;
    public float d = 0.0f;

    public float f27486e = 0.0f;

    public float f27487f = 0.0f;

    public float f27488g = 0.0f;
    public final ArrayList h = new ArrayList();

    public final er f27490j = er.f28125j;

    public final int f27492l = AndroidUtilities.dp(4.0f);

    public final int f27493m = AndroidUtilities.dp(2.0f) / 2;

    public final RectF f27500t = new RectF();

    public final Paint f27502w = new Paint(1);

    public cm(dm dmVar) {
        this.f27505z = dmVar;
        org.telegram.ui.ActionBar.c6 c6Var = dmVar.L.f28086n;
        Drawable drawable = c6Var != null ? c6Var.getDrawable("drawableMsgOutMedia") : null;
        this.f27503x = (org.telegram.ui.ActionBar.d5) (drawable == null ? org.telegram.ui.ActionBar.g6.O0("drawableMsgOutMedia") : drawable);
        this.f27504y = new m.f3();
    }

    public static void a(cm cmVar, wl wlVar, boolean z10) {
        ArrayList arrayList = cmVar.h;
        cmVar.f27491k = wlVar;
        if (wlVar == null) {
            return;
        }
        HashMap map = wlVar.f34281b;
        wlVar.a();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - cmVar.f27485c;
        long j11 = 200;
        if (j10 < 200) {
            float f10 = j10 / 200.0f;
            cmVar.f27488g = AndroidUtilities.lerp(cmVar.f27488g, cmVar.f27486e, f10);
            cmVar.f27487f = AndroidUtilities.lerp(cmVar.f27487f, cmVar.d, f10);
        } else {
            cmVar.f27488g = cmVar.f27486e;
            cmVar.f27487f = cmVar.d;
        }
        cmVar.d = wlVar.f34282c / 1000.0f;
        cmVar.f27486e = wlVar.f34284f;
        cmVar.f27485c = z10 ? jElapsedRealtime : 0L;
        cmVar.f27489i = 0L;
        ArrayList arrayList2 = new ArrayList(map.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            bm bmVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) map.get(photoEntry);
            long j12 = j11;
            int i11 = i10;
            cmVar.f27489i = Math.max(cmVar.f27489i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                bm bmVar2 = (bm) arrayList.get(i12);
                if (bmVar2.f27138b == photoEntry) {
                    bmVar = bmVar2;
                    break;
                }
            }
            if (bmVar == null) {
                bm bmVar3 = new bm(cmVar);
                bm.a(bmVar3, photoEntry);
                bm.b(bmVar3, wlVar, groupedMessagePosition, z10);
                arrayList.add(bmVar3);
            } else {
                bm.b(bmVar, wlVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            bm bmVar4 = (bm) arrayList.get(i13);
            if (!map.containsKey(bmVar4.f27138b)) {
                if (bmVar4.f27145k > 0.0f || bmVar4.h + j13 > jElapsedRealtime) {
                    bm.b(bmVar4, null, null, z10);
                } else {
                    eh.j jVar = bmVar4.f27153s;
                    if (jVar != null) {
                        jVar.b(bmVar4.O.f27505z);
                        bmVar4.f27153s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                }
            }
            i13++;
        }
        cmVar.f27505z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f27505z.L.getPreviewScale() * AndroidUtilities.lerp(this.f27488g, this.f27486e, this.f27490j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.f27485c) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
