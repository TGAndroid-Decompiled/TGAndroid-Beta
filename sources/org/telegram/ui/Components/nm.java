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
public final class nm {
    public long f29522i;
    public hm f29524k;
    public float f29527n;
    public float f29528o;
    public float f29529p;
    public float f29530q;
    public float f29531r;
    public float f29532s;
    public k01 f29534u;
    public long v;
    public final org.telegram.ui.ActionBar.h5 f29536x;
    public final m.e3 f29537y;
    public final om f29538z;
    public float f29516a = 0.0f;
    public int f29517b = 0;
    public long f29518c = 0;
    public float d = 0.0f;
    public float f29519e = 0.0f;
    public float f29520f = 0.0f;
    public float f29521g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final pr f29523j = pr.f30171j;
    public final int f29525l = AndroidUtilities.dp(4.0f);
    public final int f29526m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f29533t = new RectF();
    public final Paint f29535w = new Paint(1);

    public nm(om omVar) {
        Drawable drawable;
        this.f29538z = omVar;
        org.telegram.ui.ActionBar.g6 g6Var = omVar.M.f30121n;
        if (g6Var != null) {
            drawable = g6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f29536x = (org.telegram.ui.ActionBar.h5) (drawable == null ? org.telegram.ui.ActionBar.k6.O0("drawableMsgOutMedia") : drawable);
        this.f29537y = new m.e3();
    }

    public static void a(nm nmVar, hm hmVar, boolean z4) {
        long j10;
        ArrayList arrayList = nmVar.h;
        nmVar.f29524k = hmVar;
        if (hmVar == null) {
            return;
        }
        HashMap hashMap = hmVar.f27561b;
        hmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = elapsedRealtime - nmVar.f29518c;
        long j12 = 200;
        if (j11 < 200) {
            float f10 = ((float) j11) / 200.0f;
            nmVar.f29521g = AndroidUtilities.lerp(nmVar.f29521g, nmVar.f29519e, f10);
            nmVar.f29520f = AndroidUtilities.lerp(nmVar.f29520f, nmVar.d, f10);
        } else {
            nmVar.f29521g = nmVar.f29519e;
            nmVar.f29520f = nmVar.d;
        }
        nmVar.d = hmVar.f27562c / 1000.0f;
        nmVar.f29519e = hmVar.f27564f;
        if (z4) {
            j10 = elapsedRealtime;
        } else {
            j10 = 0;
        }
        nmVar.f29518c = j10;
        nmVar.f29522i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            mm mmVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j13 = j12;
            int i11 = i10;
            nmVar.f29522i = Math.max(nmVar.f29522i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                mm mmVar2 = (mm) arrayList.get(i12);
                if (mmVar2.f29157b == photoEntry) {
                    mmVar = mmVar2;
                    break;
                }
                i12++;
            }
            if (mmVar == null) {
                mm mmVar3 = new mm(nmVar);
                mm.a(mmVar3, photoEntry);
                mm.b(mmVar3, hmVar, groupedMessagePosition, z4);
                arrayList.add(mmVar3);
            } else {
                mm.b(mmVar, hmVar, groupedMessagePosition, z4);
            }
            i10 = i11 + 1;
            j12 = j13;
        }
        long j14 = j12;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            mm mmVar4 = (mm) arrayList.get(i13);
            if (!hashMap.containsKey(mmVar4.f29157b)) {
                if (mmVar4.f29164k <= 0.0f && mmVar4.h + j14 <= elapsedRealtime) {
                    jh.j jVar = mmVar4.f29172s;
                    if (jVar != null) {
                        jVar.b(mmVar4.O.f29538z);
                        mmVar4.f29172s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    mm.b(mmVar4, null, null, z4);
                }
            }
            i13++;
        }
        nmVar.f29538z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f29538z.M.getPreviewScale() * AndroidUtilities.lerp(this.f29521g, this.f29519e, this.f29523j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f29518c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
