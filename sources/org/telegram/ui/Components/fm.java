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
public final class fm {
    public long f28496i;
    public am f28498k;
    public float f28501n;
    public float f28502o;
    public float f28503p;
    public float f28504q;
    public float f28505r;
    public float f28506s;
    public nz0 f28508u;
    public long v;
    public final org.telegram.ui.ActionBar.d5 f28510x;
    public final m.f3 f28511y;
    public final gm f28512z;
    public float f28490a = 0.0f;
    public int f28491b = 0;
    public long f28492c = 0;
    public float d = 0.0f;
    public float f28493e = 0.0f;
    public float f28494f = 0.0f;
    public float f28495g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final gr f28497j = gr.f28847j;
    public final int f28499l = AndroidUtilities.dp(4.0f);
    public final int f28500m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f28507t = new RectF();
    public final Paint f28509w = new Paint(1);

    public fm(gm gmVar) {
        Drawable drawable;
        this.f28512z = gmVar;
        org.telegram.ui.ActionBar.b6 b6Var = gmVar.L.f29123n;
        if (b6Var != null) {
            drawable = b6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f28510x = (org.telegram.ui.ActionBar.d5) (drawable == null ? org.telegram.ui.ActionBar.f6.O0("drawableMsgOutMedia") : drawable);
        this.f28511y = new m.f3();
    }

    public static void a(fm fmVar, am amVar, boolean z10) {
        long j10;
        ArrayList arrayList = fmVar.h;
        fmVar.f28498k = amVar;
        if (amVar == null) {
            return;
        }
        HashMap hashMap = amVar.f26863b;
        amVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = elapsedRealtime - fmVar.f28492c;
        long j12 = 200;
        if (j11 < 200) {
            float f10 = ((float) j11) / 200.0f;
            fmVar.f28495g = AndroidUtilities.lerp(fmVar.f28495g, fmVar.f28493e, f10);
            fmVar.f28494f = AndroidUtilities.lerp(fmVar.f28494f, fmVar.d, f10);
        } else {
            fmVar.f28495g = fmVar.f28493e;
            fmVar.f28494f = fmVar.d;
        }
        fmVar.d = amVar.f26864c / 1000.0f;
        fmVar.f28493e = amVar.f26866f;
        if (z10) {
            j10 = elapsedRealtime;
        } else {
            j10 = 0;
        }
        fmVar.f28492c = j10;
        fmVar.f28496i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i9 = 0;
        while (true) {
            em emVar = null;
            if (i9 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i9);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j13 = j12;
            int i10 = i9;
            fmVar.f28496i = Math.max(fmVar.f28496i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                em emVar2 = (em) arrayList.get(i11);
                if (emVar2.f28063b == photoEntry) {
                    emVar = emVar2;
                    break;
                }
                i11++;
            }
            if (emVar == null) {
                em emVar3 = new em(fmVar);
                em.a(emVar3, photoEntry);
                em.b(emVar3, amVar, groupedMessagePosition, z10);
                arrayList.add(emVar3);
            } else {
                em.b(emVar, amVar, groupedMessagePosition, z10);
            }
            i9 = i10 + 1;
            j12 = j13;
        }
        long j14 = j12;
        int size3 = arrayList.size();
        int i12 = 0;
        while (i12 < size3) {
            em emVar4 = (em) arrayList.get(i12);
            if (!hashMap.containsKey(emVar4.f28063b)) {
                if (emVar4.f28070k <= 0.0f && emVar4.h + j14 <= elapsedRealtime) {
                    dh.k kVar = emVar4.f28078s;
                    if (kVar != null) {
                        kVar.b(emVar4.O.f28512z);
                        emVar4.f28078s = null;
                    }
                    arrayList.remove(i12);
                    i12--;
                    size3--;
                } else {
                    em.b(emVar4, null, null, z10);
                }
            }
            i12++;
        }
        fmVar.f28512z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f28512z.L.getPreviewScale() * AndroidUtilities.lerp(this.f28495g, this.f28493e, this.f28497j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f28492c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
