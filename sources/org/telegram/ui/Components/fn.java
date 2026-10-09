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
public final class fn {
    public long f26415i;
    public an f26417k;
    public float f26420n;
    public float f26421o;
    public float f26422p;
    public float f26423q;
    public float f26424r;
    public float f26425s;
    public l11 f26427u;
    public long v;
    public final org.telegram.ui.ActionBar.f5 f26429x;
    public final m.c3 f26430y;
    public final gn f26431z;
    public float f26409a = 0.0f;
    public int f26410b = 0;
    public long f26411c = 0;
    public float d = 0.0f;
    public float f26412e = 0.0f;
    public float f26413f = 0.0f;
    public float f26414g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final hs f26416j = hs.f27121j;
    public final int f26418l = AndroidUtilities.dp(4.0f);
    public final int f26419m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f26426t = new RectF();
    public final Paint f26428w = new Paint(1);

    public fn(gn gnVar) {
        Drawable drawable;
        this.f26431z = gnVar;
        org.telegram.ui.ActionBar.e6 e6Var = gnVar.P.f27089n;
        if (e6Var != null) {
            drawable = e6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f26429x = (org.telegram.ui.ActionBar.f5) (drawable == null ? org.telegram.ui.ActionBar.i6.P0("drawableMsgOutMedia") : drawable);
        this.f26430y = new m.c3();
    }

    public static void a(fn fnVar, an anVar, boolean z10) {
        long j3;
        ArrayList arrayList = fnVar.h;
        fnVar.f26417k = anVar;
        if (anVar == null) {
            return;
        }
        HashMap hashMap = anVar.f24713b;
        anVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - fnVar.f26411c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = ((float) j10) / 200.0f;
            fnVar.f26414g = AndroidUtilities.lerp(fnVar.f26414g, fnVar.f26412e, f7);
            fnVar.f26413f = AndroidUtilities.lerp(fnVar.f26413f, fnVar.d, f7);
        } else {
            fnVar.f26414g = fnVar.f26412e;
            fnVar.f26413f = fnVar.d;
        }
        fnVar.d = anVar.f24714c / 1000.0f;
        fnVar.f26412e = anVar.f24716f;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        fnVar.f26411c = j3;
        fnVar.f26415i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            en enVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j12 = j11;
            int i11 = i10;
            fnVar.f26415i = Math.max(fnVar.f26415i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                en enVar2 = (en) arrayList.get(i12);
                if (enVar2.f26114b == photoEntry) {
                    enVar = enVar2;
                    break;
                }
                i12++;
            }
            if (enVar == null) {
                en enVar3 = new en(fnVar);
                en.a(enVar3, photoEntry);
                en.b(enVar3, anVar, groupedMessagePosition, z10);
                arrayList.add(enVar3);
            } else {
                en.b(enVar, anVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            en enVar4 = (en) arrayList.get(i13);
            if (!hashMap.containsKey(enVar4.f26114b)) {
                if (enVar4.f26121k <= 0.0f && enVar4.h + j13 <= elapsedRealtime) {
                    vh.f fVar = enVar4.f26129s;
                    if (fVar != null) {
                        fVar.b(enVar4.O.f26431z);
                        enVar4.f26129s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    en.b(enVar4, null, null, z10);
                }
            }
            i13++;
        }
        fnVar.f26431z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f26431z.P.getPreviewScale() * AndroidUtilities.lerp(this.f26414g, this.f26412e, this.f26416j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f26411c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
