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
    public long f26381i;
    public an f26383k;
    public float f26386n;
    public float f26387o;
    public float f26388p;
    public float f26389q;
    public float f26390r;
    public float f26391s;
    public n11 f26393u;
    public long v;
    public final org.telegram.ui.ActionBar.d5 f26395x;
    public final m.c3 f26396y;
    public final gn f26397z;
    public float f26375a = 0.0f;
    public int f26376b = 0;
    public long f26377c = 0;
    public float d = 0.0f;
    public float f26378e = 0.0f;
    public float f26379f = 0.0f;
    public float f26380g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final is f26382j = is.f27454j;
    public final int f26384l = AndroidUtilities.dp(4.0f);
    public final int f26385m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f26392t = new RectF();
    public final Paint f26394w = new Paint(1);

    public fn(gn gnVar) {
        Drawable drawable;
        this.f26397z = gnVar;
        org.telegram.ui.ActionBar.d6 d6Var = gnVar.P.f27031n;
        if (d6Var != null) {
            drawable = d6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f26395x = (org.telegram.ui.ActionBar.d5) (drawable == null ? org.telegram.ui.ActionBar.h6.P0("drawableMsgOutMedia") : drawable);
        this.f26396y = new m.c3();
    }

    public static void a(fn fnVar, an anVar, boolean z10) {
        long j3;
        ArrayList arrayList = fnVar.h;
        fnVar.f26383k = anVar;
        if (anVar == null) {
            return;
        }
        HashMap hashMap = anVar.f24540b;
        anVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - fnVar.f26377c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = ((float) j10) / 200.0f;
            fnVar.f26380g = AndroidUtilities.lerp(fnVar.f26380g, fnVar.f26378e, f7);
            fnVar.f26379f = AndroidUtilities.lerp(fnVar.f26379f, fnVar.d, f7);
        } else {
            fnVar.f26380g = fnVar.f26378e;
            fnVar.f26379f = fnVar.d;
        }
        fnVar.d = anVar.f24541c / 1000.0f;
        fnVar.f26378e = anVar.f24543f;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        fnVar.f26377c = j3;
        fnVar.f26381i = 0L;
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
            fnVar.f26381i = Math.max(fnVar.f26381i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                en enVar2 = (en) arrayList.get(i12);
                if (enVar2.f26082b == photoEntry) {
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
            if (!hashMap.containsKey(enVar4.f26082b)) {
                if (enVar4.f26089k <= 0.0f && enVar4.h + j13 <= elapsedRealtime) {
                    vh.f fVar = enVar4.f26097s;
                    if (fVar != null) {
                        fVar.b(enVar4.O.f26397z);
                        enVar4.f26097s = null;
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
        fnVar.f26397z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f26397z.P.getPreviewScale() * AndroidUtilities.lerp(this.f26380g, this.f26378e, this.f26382j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f26377c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
