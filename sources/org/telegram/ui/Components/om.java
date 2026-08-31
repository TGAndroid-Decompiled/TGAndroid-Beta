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
    public long f29804i;
    public im f29806k;
    public float f29809n;
    public float f29810o;
    public float f29811p;
    public float f29812q;
    public float f29813r;
    public float f29814s;
    public l01 f29816u;
    public long v;
    public final org.telegram.ui.ActionBar.h5 f29818x;
    public final m.e3 f29819y;
    public final pm f29820z;
    public float f29798a = 0.0f;
    public int f29799b = 0;
    public long f29800c = 0;
    public float d = 0.0f;
    public float f29801e = 0.0f;
    public float f29802f = 0.0f;
    public float f29803g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final pr f29805j = pr.f30186j;
    public final int f29807l = AndroidUtilities.dp(4.0f);
    public final int f29808m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f29815t = new RectF();
    public final Paint f29817w = new Paint(1);

    public om(pm pmVar) {
        Drawable drawable;
        this.f29820z = pmVar;
        org.telegram.ui.ActionBar.g6 g6Var = pmVar.M.f30415n;
        if (g6Var != null) {
            drawable = g6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f29818x = (org.telegram.ui.ActionBar.h5) (drawable == null ? org.telegram.ui.ActionBar.k6.O0("drawableMsgOutMedia") : drawable);
        this.f29819y = new m.e3();
    }

    public static void a(om omVar, im imVar, boolean z4) {
        long j10;
        ArrayList arrayList = omVar.h;
        omVar.f29806k = imVar;
        if (imVar == null) {
            return;
        }
        HashMap hashMap = imVar.f27856b;
        imVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = elapsedRealtime - omVar.f29800c;
        long j12 = 200;
        if (j11 < 200) {
            float f10 = ((float) j11) / 200.0f;
            omVar.f29803g = AndroidUtilities.lerp(omVar.f29803g, omVar.f29801e, f10);
            omVar.f29802f = AndroidUtilities.lerp(omVar.f29802f, omVar.d, f10);
        } else {
            omVar.f29803g = omVar.f29801e;
            omVar.f29802f = omVar.d;
        }
        omVar.d = imVar.f27857c / 1000.0f;
        omVar.f29801e = imVar.f27859f;
        if (z4) {
            j10 = elapsedRealtime;
        } else {
            j10 = 0;
        }
        omVar.f29800c = j10;
        omVar.f29804i = 0L;
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
            long j13 = j12;
            int i11 = i10;
            omVar.f29804i = Math.max(omVar.f29804i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                nm nmVar2 = (nm) arrayList.get(i12);
                if (nmVar2.f29542b == photoEntry) {
                    nmVar = nmVar2;
                    break;
                }
                i12++;
            }
            if (nmVar == null) {
                nm nmVar3 = new nm(omVar);
                nm.a(nmVar3, photoEntry);
                nm.b(nmVar3, imVar, groupedMessagePosition, z4);
                arrayList.add(nmVar3);
            } else {
                nm.b(nmVar, imVar, groupedMessagePosition, z4);
            }
            i10 = i11 + 1;
            j12 = j13;
        }
        long j14 = j12;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            nm nmVar4 = (nm) arrayList.get(i13);
            if (!hashMap.containsKey(nmVar4.f29542b)) {
                if (nmVar4.f29549k <= 0.0f && nmVar4.h + j14 <= elapsedRealtime) {
                    jh.j jVar = nmVar4.f29557s;
                    if (jVar != null) {
                        jVar.b(nmVar4.O.f29820z);
                        nmVar4.f29557s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    nm.b(nmVar4, null, null, z4);
                }
            }
            i13++;
        }
        omVar.f29820z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f29820z.M.getPreviewScale() * AndroidUtilities.lerp(this.f29803g, this.f29801e, this.f29805j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f29800c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
