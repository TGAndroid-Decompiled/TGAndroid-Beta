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
public final class om {
    public long f27130i;
    public jm f27132k;
    public float f27135n;
    public float f27136o;
    public float f27137p;
    public float f27138q;
    public float f27139r;
    public float f27140s;
    public w01 f27142u;
    public long v;
    public final org.telegram.ui.ActionBar.f5 f27144x;
    public final m.c3 f27145y;
    public final pm f27146z;
    public float f27125a = 0.0f;
    public int f27126b = 0;
    public long f27127c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f27128f = 0.0f;
    public float f27129g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final qr f27131j = qr.f27656j;
    public final int f27133l = AndroidUtilities.dp(4.0f);
    public final int f27134m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f27141t = new RectF();
    public final Paint f27143w = new Paint(1);

    public om(pm pmVar) {
        Drawable drawable;
        this.f27146z = pmVar;
        org.telegram.ui.ActionBar.f6 f6Var = pmVar.P.f27603n;
        if (f6Var != null) {
            drawable = f6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f27144x = (org.telegram.ui.ActionBar.f5) (drawable == null ? org.telegram.ui.ActionBar.j6.O0("drawableMsgOutMedia") : drawable);
        this.f27145y = new m.c3();
    }

    public static void a(om omVar, jm jmVar, boolean z10) {
        long j3;
        ArrayList arrayList = omVar.h;
        omVar.f27132k = jmVar;
        if (jmVar == null) {
            return;
        }
        HashMap hashMap = jmVar.f25401b;
        jmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - omVar.f27127c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = ((float) j10) / 200.0f;
            omVar.f27129g = AndroidUtilities.lerp(omVar.f27129g, omVar.e, f7);
            omVar.f27128f = AndroidUtilities.lerp(omVar.f27128f, omVar.d, f7);
        } else {
            omVar.f27129g = omVar.e;
            omVar.f27128f = omVar.d;
        }
        omVar.d = jmVar.f25402c / 1000.0f;
        omVar.e = jmVar.f25403f;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        omVar.f27127c = j3;
        omVar.f27130i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            nm nmVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j12 = j11;
            int i11 = i10;
            omVar.f27130i = Math.max(omVar.f27130i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                nm nmVar2 = (nm) arrayList.get(i12);
                if (nmVar2.f26806b == photoEntry) {
                    nmVar = nmVar2;
                    break;
                }
                i12++;
            }
            if (nmVar == null) {
                nm nmVar3 = new nm(omVar);
                nm.a(nmVar3, photoEntry);
                nm.b(nmVar3, jmVar, groupedMessagePosition, z10);
                arrayList.add(nmVar3);
            } else {
                nm.b(nmVar, jmVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            nm nmVar4 = (nm) arrayList.get(i13);
            if (!hashMap.containsKey(nmVar4.f26806b)) {
                if (nmVar4.f26812k <= 0.0f && nmVar4.h + j13 <= elapsedRealtime) {
                    vh.f fVar = nmVar4.f26820s;
                    if (fVar != null) {
                        fVar.b(nmVar4.O.f27146z);
                        nmVar4.f26820s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    nm.b(nmVar4, null, null, z10);
                }
            }
            i13++;
        }
        omVar.f27146z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f27146z.P.getPreviewScale() * AndroidUtilities.lerp(this.f27129g, this.e, this.f27131j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f27127c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
