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
    public long f29115i;
    public jm f29117k;
    public float f29120n;
    public float f29121o;
    public float f29122p;
    public float f29123q;
    public float f29124r;
    public float f29125s;
    public f01 f29127u;
    public long v;
    public final org.telegram.ui.ActionBar.f5 f29129x;
    public final m.c3 f29130y;
    public final pm f29131z;
    public float f29109a = 0.0f;
    public int f29110b = 0;
    public long f29111c = 0;
    public float d = 0.0f;
    public float f29112e = 0.0f;
    public float f29113f = 0.0f;
    public float f29114g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final pr f29116j = pr.f29469j;
    public final int f29118l = AndroidUtilities.dp(4.0f);
    public final int f29119m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f29126t = new RectF();
    public final Paint f29128w = new Paint(1);

    public om(pm pmVar) {
        Drawable drawable;
        this.f29131z = pmVar;
        org.telegram.ui.ActionBar.f6 f6Var = pmVar.P.f29768n;
        if (f6Var != null) {
            drawable = f6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f29129x = (org.telegram.ui.ActionBar.f5) (drawable == null ? org.telegram.ui.ActionBar.j6.O0("drawableMsgOutMedia") : drawable);
        this.f29130y = new m.c3();
    }

    public static void a(om omVar, jm jmVar, boolean z10) {
        long j3;
        ArrayList arrayList = omVar.h;
        omVar.f29117k = jmVar;
        if (jmVar == null) {
            return;
        }
        HashMap hashMap = jmVar.f27534b;
        jmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - omVar.f29111c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = ((float) j10) / 200.0f;
            omVar.f29114g = AndroidUtilities.lerp(omVar.f29114g, omVar.f29112e, f7);
            omVar.f29113f = AndroidUtilities.lerp(omVar.f29113f, omVar.d, f7);
        } else {
            omVar.f29114g = omVar.f29112e;
            omVar.f29113f = omVar.d;
        }
        omVar.d = jmVar.f27535c / 1000.0f;
        omVar.f29112e = jmVar.f27537f;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        omVar.f29111c = j3;
        omVar.f29115i = 0L;
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
            omVar.f29115i = Math.max(omVar.f29115i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                nm nmVar2 = (nm) arrayList.get(i12);
                if (nmVar2.f28792b == photoEntry) {
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
            if (!hashMap.containsKey(nmVar4.f28792b)) {
                if (nmVar4.f28799k <= 0.0f && nmVar4.h + j13 <= elapsedRealtime) {
                    wh.g gVar = nmVar4.f28807s;
                    if (gVar != null) {
                        gVar.b(nmVar4.O.f29131z);
                        nmVar4.f28807s = null;
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
        omVar.f29131z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f29131z.P.getPreviewScale() * AndroidUtilities.lerp(this.f29114g, this.f29112e, this.f29116j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f29111c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
