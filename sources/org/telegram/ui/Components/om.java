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
    public long f26842i;
    public jm f26844k;
    public float f26847n;
    public float f26848o;
    public float f26849p;
    public float f26850q;
    public float f26851r;
    public float f26852s;
    public g01 f26854u;
    public long v;
    public final org.telegram.ui.ActionBar.f5 f26856x;
    public final m.c3 f26857y;
    public final pm f26858z;
    public float f26837a = 0.0f;
    public int f26838b = 0;
    public long f26839c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f26840f = 0.0f;
    public float f26841g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final qr f26843j = qr.f27423j;
    public final int f26845l = AndroidUtilities.dp(4.0f);
    public final int f26846m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f26853t = new RectF();
    public final Paint f26855w = new Paint(1);

    public om(pm pmVar) {
        Drawable drawable;
        this.f26858z = pmVar;
        org.telegram.ui.ActionBar.e6 e6Var = pmVar.P.f27383n;
        if (e6Var != null) {
            drawable = e6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f26856x = (org.telegram.ui.ActionBar.f5) (drawable == null ? org.telegram.ui.ActionBar.i6.O0("drawableMsgOutMedia") : drawable);
        this.f26857y = new m.c3();
    }

    public static void a(om omVar, jm jmVar, boolean z10) {
        long j3;
        ArrayList arrayList = omVar.h;
        omVar.f26844k = jmVar;
        if (jmVar == null) {
            return;
        }
        HashMap hashMap = jmVar.f25371b;
        jmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - omVar.f26839c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = ((float) j10) / 200.0f;
            omVar.f26841g = AndroidUtilities.lerp(omVar.f26841g, omVar.e, f7);
            omVar.f26840f = AndroidUtilities.lerp(omVar.f26840f, omVar.d, f7);
        } else {
            omVar.f26841g = omVar.e;
            omVar.f26840f = omVar.d;
        }
        omVar.d = jmVar.f25372c / 1000.0f;
        omVar.e = jmVar.f25373f;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        omVar.f26839c = j3;
        omVar.f26842i = 0L;
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
            omVar.f26842i = Math.max(omVar.f26842i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                nm nmVar2 = (nm) arrayList.get(i12);
                if (nmVar2.f26497b == photoEntry) {
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
            if (!hashMap.containsKey(nmVar4.f26497b)) {
                if (nmVar4.f26503k <= 0.0f && nmVar4.h + j13 <= elapsedRealtime) {
                    vh.g gVar = nmVar4.f26511s;
                    if (gVar != null) {
                        gVar.b(nmVar4.O.f26858z);
                        nmVar4.f26511s = null;
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
        omVar.f26858z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f26858z.P.getPreviewScale() * AndroidUtilities.lerp(this.f26841g, this.e, this.f26843j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f26839c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
