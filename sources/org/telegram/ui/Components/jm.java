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
public final class jm {
    public long f29744i;
    public em f29746k;
    public float f29749n;
    public float f29750o;
    public float f29751p;
    public float f29752q;
    public float f29753r;
    public float f29754s;
    public zz0 f29756u;
    public long v;
    public final org.telegram.ui.ActionBar.d5 f29758x;
    public final m.f3 f29759y;
    public final km f29760z;
    public float f29738a = 0.0f;
    public int f29739b = 0;
    public long f29740c = 0;
    public float d = 0.0f;
    public float f29741e = 0.0f;
    public float f29742f = 0.0f;
    public float f29743g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final jr f29745j = jr.f29803j;
    public final int f29747l = AndroidUtilities.dp(4.0f);
    public final int f29748m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f29755t = new RectF();
    public final Paint f29757w = new Paint(1);

    public jm(km kmVar) {
        Drawable drawable;
        this.f29760z = kmVar;
        org.telegram.ui.ActionBar.c6 c6Var = kmVar.L.f30371n;
        if (c6Var != null) {
            drawable = c6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f29758x = (org.telegram.ui.ActionBar.d5) (drawable == null ? org.telegram.ui.ActionBar.g6.O0("drawableMsgOutMedia") : drawable);
        this.f29759y = new m.f3();
    }

    public static void a(jm jmVar, em emVar, boolean z10) {
        long j10;
        ArrayList arrayList = jmVar.h;
        jmVar.f29746k = emVar;
        if (emVar == null) {
            return;
        }
        HashMap hashMap = emVar.f28108b;
        emVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = elapsedRealtime - jmVar.f29740c;
        long j12 = 200;
        if (j11 < 200) {
            float f9 = ((float) j11) / 200.0f;
            jmVar.f29743g = AndroidUtilities.lerp(jmVar.f29743g, jmVar.f29741e, f9);
            jmVar.f29742f = AndroidUtilities.lerp(jmVar.f29742f, jmVar.d, f9);
        } else {
            jmVar.f29743g = jmVar.f29741e;
            jmVar.f29742f = jmVar.d;
        }
        jmVar.d = emVar.f28109c / 1000.0f;
        jmVar.f29741e = emVar.f28111f;
        if (z10) {
            j10 = elapsedRealtime;
        } else {
            j10 = 0;
        }
        jmVar.f29740c = j10;
        jmVar.f29744i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            im imVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j13 = j12;
            int i11 = i10;
            jmVar.f29744i = Math.max(jmVar.f29744i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                im imVar2 = (im) arrayList.get(i12);
                if (imVar2.f29409b == photoEntry) {
                    imVar = imVar2;
                    break;
                }
                i12++;
            }
            if (imVar == null) {
                im imVar3 = new im(jmVar);
                im.a(imVar3, photoEntry);
                im.b(imVar3, emVar, groupedMessagePosition, z10);
                arrayList.add(imVar3);
            } else {
                im.b(imVar, emVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j12 = j13;
        }
        long j14 = j12;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            im imVar4 = (im) arrayList.get(i13);
            if (!hashMap.containsKey(imVar4.f29409b)) {
                if (imVar4.f29416k <= 0.0f && imVar4.h + j14 <= elapsedRealtime) {
                    gh.j jVar = imVar4.f29424s;
                    if (jVar != null) {
                        jVar.b(imVar4.O.f29760z);
                        imVar4.f29424s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    im.b(imVar4, null, null, z10);
                }
            }
            i13++;
        }
        jmVar.f29760z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f29760z.L.getPreviewScale() * AndroidUtilities.lerp(this.f29743g, this.f29741e, this.f29745j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f29740c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
