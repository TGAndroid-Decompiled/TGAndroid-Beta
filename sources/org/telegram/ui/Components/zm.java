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
    public long f32951i;
    public um f32953k;
    public float f32956n;
    public float f32957o;
    public float f32958p;
    public float f32959q;
    public float f32960r;
    public float f32961s;
    public f11 f32963u;
    public long v;
    public final org.telegram.ui.ActionBar.f5 f32965x;
    public final m.e3 f32966y;
    public final an f32967z;
    public float f32946a = 0.0f;
    public int f32947b = 0;
    public long f32948c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f32949f = 0.0f;
    public float f32950g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final bs f32952j = bs.f25024j;
    public final int f32954l = AndroidUtilities.dp(4.0f);
    public final int f32955m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f32962t = new RectF();
    public final Paint f32964w = new Paint(1);

    public zm(an anVar) {
        Drawable drawable;
        this.f32967z = anVar;
        org.telegram.ui.ActionBar.d6 d6Var = anVar.P.f24990n;
        if (d6Var != null) {
            drawable = d6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f32965x = (org.telegram.ui.ActionBar.f5) (drawable == null ? org.telegram.ui.ActionBar.h6.P0("drawableMsgOutMedia") : drawable);
        this.f32966y = new m.e3();
    }

    public static void a(zm zmVar, um umVar, boolean z10) {
        long j10;
        ArrayList arrayList = zmVar.h;
        zmVar.f32953k = umVar;
        if (umVar == null) {
            return;
        }
        HashMap hashMap = umVar.f30959b;
        umVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = elapsedRealtime - zmVar.f32948c;
        long j12 = 200;
        if (j11 < 200) {
            float f7 = ((float) j11) / 200.0f;
            zmVar.f32950g = AndroidUtilities.lerp(zmVar.f32950g, zmVar.e, f7);
            zmVar.f32949f = AndroidUtilities.lerp(zmVar.f32949f, zmVar.d, f7);
        } else {
            zmVar.f32950g = zmVar.e;
            zmVar.f32949f = zmVar.d;
        }
        zmVar.d = umVar.f30960c / 1000.0f;
        zmVar.e = umVar.f30961f;
        if (z10) {
            j10 = elapsedRealtime;
        } else {
            j10 = 0;
        }
        zmVar.f32948c = j10;
        zmVar.f32951i = 0L;
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
            zmVar.f32951i = Math.max(zmVar.f32951i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                ym ymVar2 = (ym) arrayList.get(i12);
                if (ymVar2.f32675b == photoEntry) {
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
            if (!hashMap.containsKey(ymVar4.f32675b)) {
                if (ymVar4.f32681k <= 0.0f && ymVar4.h + j14 <= elapsedRealtime) {
                    wh.f fVar = ymVar4.f32689s;
                    if (fVar != null) {
                        fVar.b(ymVar4.O.f32967z);
                        ymVar4.f32689s = null;
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
        zmVar.f32967z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f32967z.P.getPreviewScale() * AndroidUtilities.lerp(this.f32950g, this.e, this.f32952j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f32948c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
