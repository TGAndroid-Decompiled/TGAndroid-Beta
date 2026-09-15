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
    public long f26845i;
    public jm f26847k;
    public float f26850n;
    public float f26851o;
    public float f26852p;
    public float f26853q;
    public float f26854r;
    public float f26855s;
    public g01 f26857u;
    public long v;
    public final org.telegram.ui.ActionBar.f5 f26859x;
    public final m.c3 f26860y;
    public final pm f26861z;
    public float f26840a = 0.0f;
    public int f26841b = 0;
    public long f26842c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f26843f = 0.0f;
    public float f26844g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final qr f26846j = qr.f27426j;
    public final int f26848l = AndroidUtilities.dp(4.0f);
    public final int f26849m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f26856t = new RectF();
    public final Paint f26858w = new Paint(1);

    public om(pm pmVar) {
        Drawable drawable;
        this.f26861z = pmVar;
        org.telegram.ui.ActionBar.e6 e6Var = pmVar.P.f27386n;
        if (e6Var != null) {
            drawable = e6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f26859x = (org.telegram.ui.ActionBar.f5) (drawable == null ? org.telegram.ui.ActionBar.i6.O0("drawableMsgOutMedia") : drawable);
        this.f26860y = new m.c3();
    }

    public static void a(om omVar, jm jmVar, boolean z10) {
        long j3;
        ArrayList arrayList = omVar.h;
        omVar.f26847k = jmVar;
        if (jmVar == null) {
            return;
        }
        HashMap hashMap = jmVar.f25374b;
        jmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - omVar.f26842c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = ((float) j10) / 200.0f;
            omVar.f26844g = AndroidUtilities.lerp(omVar.f26844g, omVar.e, f7);
            omVar.f26843f = AndroidUtilities.lerp(omVar.f26843f, omVar.d, f7);
        } else {
            omVar.f26844g = omVar.e;
            omVar.f26843f = omVar.d;
        }
        omVar.d = jmVar.f25375c / 1000.0f;
        omVar.e = jmVar.f25376f;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        omVar.f26842c = j3;
        omVar.f26845i = 0L;
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
            omVar.f26845i = Math.max(omVar.f26845i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                nm nmVar2 = (nm) arrayList.get(i12);
                if (nmVar2.f26498b == photoEntry) {
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
            if (!hashMap.containsKey(nmVar4.f26498b)) {
                if (nmVar4.f26504k <= 0.0f && nmVar4.h + j13 <= elapsedRealtime) {
                    vh.g gVar = nmVar4.f26512s;
                    if (gVar != null) {
                        gVar.b(nmVar4.O.f26861z);
                        nmVar4.f26512s = null;
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
        omVar.f26861z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f26861z.P.getPreviewScale() * AndroidUtilities.lerp(this.f26844g, this.e, this.f26846j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f26842c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
