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
    public long f32952i;
    public um f32954k;
    public float f32957n;
    public float f32958o;
    public float f32959p;
    public float f32960q;
    public float f32961r;
    public float f32962s;
    public d11 f32964u;
    public long v;
    public final org.telegram.ui.ActionBar.f5 f32966x;
    public final m.e3 f32967y;
    public final an f32968z;
    public float f32947a = 0.0f;
    public int f32948b = 0;
    public long f32949c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f32950f = 0.0f;
    public float f32951g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final bs f32953j = bs.f25033j;
    public final int f32955l = AndroidUtilities.dp(4.0f);
    public final int f32956m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f32963t = new RectF();
    public final Paint f32965w = new Paint(1);

    public zm(an anVar) {
        Drawable drawable;
        this.f32968z = anVar;
        org.telegram.ui.ActionBar.d6 d6Var = anVar.P.f25008n;
        if (d6Var != null) {
            drawable = d6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f32966x = (org.telegram.ui.ActionBar.f5) (drawable == null ? org.telegram.ui.ActionBar.h6.P0("drawableMsgOutMedia") : drawable);
        this.f32967y = new m.e3();
    }

    public static void a(zm zmVar, um umVar, boolean z10) {
        long j10;
        ArrayList arrayList = zmVar.h;
        zmVar.f32954k = umVar;
        if (umVar == null) {
            return;
        }
        HashMap hashMap = umVar.f31045b;
        umVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = elapsedRealtime - zmVar.f32949c;
        long j12 = 200;
        if (j11 < 200) {
            float f7 = ((float) j11) / 200.0f;
            zmVar.f32951g = AndroidUtilities.lerp(zmVar.f32951g, zmVar.e, f7);
            zmVar.f32950f = AndroidUtilities.lerp(zmVar.f32950f, zmVar.d, f7);
        } else {
            zmVar.f32951g = zmVar.e;
            zmVar.f32950f = zmVar.d;
        }
        zmVar.d = umVar.f31046c / 1000.0f;
        zmVar.e = umVar.f31047f;
        if (z10) {
            j10 = elapsedRealtime;
        } else {
            j10 = 0;
        }
        zmVar.f32949c = j10;
        zmVar.f32952i = 0L;
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
            zmVar.f32952i = Math.max(zmVar.f32952i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                ym ymVar2 = (ym) arrayList.get(i12);
                if (ymVar2.f32680b == photoEntry) {
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
            if (!hashMap.containsKey(ymVar4.f32680b)) {
                if (ymVar4.f32686k <= 0.0f && ymVar4.h + j14 <= elapsedRealtime) {
                    wh.f fVar = ymVar4.f32694s;
                    if (fVar != null) {
                        fVar.b(ymVar4.O.f32968z);
                        ymVar4.f32694s = null;
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
        zmVar.f32968z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f32968z.P.getPreviewScale() * AndroidUtilities.lerp(this.f32951g, this.e, this.f32953j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f32949c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
