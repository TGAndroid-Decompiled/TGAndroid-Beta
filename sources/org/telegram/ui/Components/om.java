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
    public long f26784i;
    public jm f26786k;
    public float f26789n;
    public float f26790o;
    public float f26791p;
    public float f26792q;
    public float f26793r;
    public float f26794s;
    public h01 f26796u;
    public long v;
    public final org.telegram.ui.ActionBar.g5 f26798x;
    public final m.c3 f26799y;
    public final pm f26800z;
    public float f26779a = 0.0f;
    public int f26780b = 0;
    public long f26781c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f26782f = 0.0f;
    public float f26783g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final qr f26785j = qr.f27383j;
    public final int f26787l = AndroidUtilities.dp(4.0f);
    public final int f26788m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f26795t = new RectF();
    public final Paint f26797w = new Paint(1);

    public om(pm pmVar) {
        Drawable drawable;
        this.f26800z = pmVar;
        org.telegram.ui.ActionBar.f6 f6Var = pmVar.P.f27347n;
        if (f6Var != null) {
            drawable = f6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f26798x = (org.telegram.ui.ActionBar.g5) (drawable == null ? org.telegram.ui.ActionBar.j6.O0("drawableMsgOutMedia") : drawable);
        this.f26799y = new m.c3();
    }

    public static void a(om omVar, jm jmVar, boolean z10) {
        long j3;
        ArrayList arrayList = omVar.h;
        omVar.f26786k = jmVar;
        if (jmVar == null) {
            return;
        }
        HashMap hashMap = jmVar.f25322b;
        jmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - omVar.f26781c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = ((float) j10) / 200.0f;
            omVar.f26783g = AndroidUtilities.lerp(omVar.f26783g, omVar.e, f7);
            omVar.f26782f = AndroidUtilities.lerp(omVar.f26782f, omVar.d, f7);
        } else {
            omVar.f26783g = omVar.e;
            omVar.f26782f = omVar.d;
        }
        omVar.d = jmVar.f25323c / 1000.0f;
        omVar.e = jmVar.f25324f;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        omVar.f26781c = j3;
        omVar.f26784i = 0L;
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
            omVar.f26784i = Math.max(omVar.f26784i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                nm nmVar2 = (nm) arrayList.get(i12);
                if (nmVar2.f26480b == photoEntry) {
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
            if (!hashMap.containsKey(nmVar4.f26480b)) {
                if (nmVar4.f26486k <= 0.0f && nmVar4.h + j13 <= elapsedRealtime) {
                    vh.g gVar = nmVar4.f26494s;
                    if (gVar != null) {
                        gVar.b(nmVar4.O.f26800z);
                        nmVar4.f26494s = null;
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
        omVar.f26800z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f26800z.P.getPreviewScale() * AndroidUtilities.lerp(this.f26783g, this.e, this.f26785j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f26781c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
