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
public final class zm {
    public long f33264i;
    public um f33266k;
    public float f33269n;
    public float f33270o;
    public float f33271p;
    public float f33272q;
    public float f33273r;
    public float f33274s;
    public i11 f33276u;
    public long v;
    public final org.telegram.ui.ActionBar.j5 f33278x;
    public final m.e3 f33279y;
    public final an f33280z;
    public float f33259a = 0.0f;
    public int f33260b = 0;
    public long f33261c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f33262f = 0.0f;
    public float f33263g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final bs f33265j = bs.f25136j;
    public final int f33267l = AndroidUtilities.dp(4.0f);
    public final int f33268m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f33275t = new RectF();
    public final Paint f33277w = new Paint(1);

    public zm(an anVar) {
        Drawable drawable;
        this.f33280z = anVar;
        org.telegram.ui.ActionBar.g6 g6Var = anVar.P.f25101n;
        if (g6Var != null) {
            drawable = g6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f33278x = (org.telegram.ui.ActionBar.j5) (drawable == null ? org.telegram.ui.ActionBar.k6.Q0("drawableMsgOutMedia") : drawable);
        this.f33279y = new m.e3();
    }

    public static void a(zm zmVar, um umVar, boolean z10) {
        long j10;
        ArrayList arrayList = zmVar.h;
        zmVar.f33266k = umVar;
        if (umVar == null) {
            return;
        }
        HashMap hashMap = umVar.f31183b;
        umVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = elapsedRealtime - zmVar.f33261c;
        long j12 = 200;
        if (j11 < 200) {
            float f7 = ((float) j11) / 200.0f;
            zmVar.f33263g = AndroidUtilities.lerp(zmVar.f33263g, zmVar.e, f7);
            zmVar.f33262f = AndroidUtilities.lerp(zmVar.f33262f, zmVar.d, f7);
        } else {
            zmVar.f33263g = zmVar.e;
            zmVar.f33262f = zmVar.d;
        }
        zmVar.d = umVar.f31184c / 1000.0f;
        zmVar.e = umVar.f31185f;
        if (z10) {
            j10 = elapsedRealtime;
        } else {
            j10 = 0;
        }
        zmVar.f33261c = j10;
        zmVar.f33264i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            ym ymVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j13 = j12;
            int i11 = i10;
            zmVar.f33264i = Math.max(zmVar.f33264i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                ym ymVar2 = (ym) arrayList.get(i12);
                if (ymVar2.f32977b == photoEntry) {
                    ymVar = ymVar2;
                    break;
                }
                i12++;
            }
            if (ymVar == null) {
                ym ymVar3 = new ym(zmVar);
                ym.a(ymVar3, photoEntry);
                ym.b(ymVar3, umVar, groupedMessagePosition, z10);
                arrayList.add(ymVar3);
            } else {
                ym.b(ymVar, umVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j12 = j13;
        }
        long j14 = j12;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            ym ymVar4 = (ym) arrayList.get(i13);
            if (!hashMap.containsKey(ymVar4.f32977b)) {
                if (ymVar4.f32983k <= 0.0f && ymVar4.h + j14 <= elapsedRealtime) {
                    wh.f fVar = ymVar4.f32991s;
                    if (fVar != null) {
                        fVar.b(ymVar4.O.f33280z);
                        ymVar4.f32991s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    ym.b(ymVar4, null, null, z10);
                }
            }
            i13++;
        }
        zmVar.f33280z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f33280z.P.getPreviewScale() * AndroidUtilities.lerp(this.f33263g, this.e, this.f33265j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f33261c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
