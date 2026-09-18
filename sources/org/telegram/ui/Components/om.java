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
    public long f26993i;
    public jm f26995k;
    public float f26998n;
    public float f26999o;
    public float f27000p;
    public float f27001q;
    public float f27002r;
    public float f27003s;
    public v01 f27005u;
    public long v;
    public final org.telegram.ui.ActionBar.f5 f27007x;
    public final m.c3 f27008y;
    public final pm f27009z;
    public float f26988a = 0.0f;
    public int f26989b = 0;
    public long f26990c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f26991f = 0.0f;
    public float f26992g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final qr f26994j = qr.f27718j;
    public final int f26996l = AndroidUtilities.dp(4.0f);
    public final int f26997m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f27004t = new RectF();
    public final Paint f27006w = new Paint(1);

    public om(pm pmVar) {
        Drawable drawable;
        this.f27009z = pmVar;
        org.telegram.ui.ActionBar.e6 e6Var = pmVar.P.f27683n;
        if (e6Var != null) {
            drawable = e6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f27007x = (org.telegram.ui.ActionBar.f5) (drawable == null ? org.telegram.ui.ActionBar.j6.O0("drawableMsgOutMedia") : drawable);
        this.f27008y = new m.c3();
    }

    public static void a(om omVar, jm jmVar, boolean z10) {
        long j3;
        ArrayList arrayList = omVar.h;
        omVar.f26995k = jmVar;
        if (jmVar == null) {
            return;
        }
        HashMap hashMap = jmVar.f25365b;
        jmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - omVar.f26990c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = ((float) j10) / 200.0f;
            omVar.f26992g = AndroidUtilities.lerp(omVar.f26992g, omVar.e, f7);
            omVar.f26991f = AndroidUtilities.lerp(omVar.f26991f, omVar.d, f7);
        } else {
            omVar.f26992g = omVar.e;
            omVar.f26991f = omVar.d;
        }
        omVar.d = jmVar.f25366c / 1000.0f;
        omVar.e = jmVar.f25367f;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        omVar.f26990c = j3;
        omVar.f26993i = 0L;
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
            omVar.f26993i = Math.max(omVar.f26993i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                nm nmVar2 = (nm) arrayList.get(i12);
                if (nmVar2.f26705b == photoEntry) {
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
            if (!hashMap.containsKey(nmVar4.f26705b)) {
                if (nmVar4.f26711k <= 0.0f && nmVar4.h + j13 <= elapsedRealtime) {
                    vh.g gVar = nmVar4.f26719s;
                    if (gVar != null) {
                        gVar.b(nmVar4.O.f27009z);
                        nmVar4.f26719s = null;
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
        omVar.f27009z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f27009z.P.getPreviewScale() * AndroidUtilities.lerp(this.f26992g, this.e, this.f26994j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f26990c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
