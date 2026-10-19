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
    public long f32976i;
    public um f32978k;
    public float f32981n;
    public float f32982o;
    public float f32983p;
    public float f32984q;
    public float f32985r;
    public float f32986s;
    public e11 f32988u;
    public long v;
    public final org.telegram.ui.ActionBar.f5 f32990x;
    public final m.e3 f32991y;
    public final an f32992z;
    public float f32971a = 0.0f;
    public int f32972b = 0;
    public long f32973c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f32974f = 0.0f;
    public float f32975g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final bs f32977j = bs.f25015j;
    public final int f32979l = AndroidUtilities.dp(4.0f);
    public final int f32980m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f32987t = new RectF();
    public final Paint f32989w = new Paint(1);

    public zm(an anVar) {
        Drawable drawable;
        this.f32992z = anVar;
        org.telegram.ui.ActionBar.d6 d6Var = anVar.P.f24990n;
        if (d6Var != null) {
            drawable = d6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f32990x = (org.telegram.ui.ActionBar.f5) (drawable == null ? org.telegram.ui.ActionBar.h6.P0("drawableMsgOutMedia") : drawable);
        this.f32991y = new m.e3();
    }

    public static void a(zm zmVar, um umVar, boolean z10) {
        long j10;
        ArrayList arrayList = zmVar.h;
        zmVar.f32978k = umVar;
        if (umVar == null) {
            return;
        }
        HashMap hashMap = umVar.f31018b;
        umVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = elapsedRealtime - zmVar.f32973c;
        long j12 = 200;
        if (j11 < 200) {
            float f7 = ((float) j11) / 200.0f;
            zmVar.f32975g = AndroidUtilities.lerp(zmVar.f32975g, zmVar.e, f7);
            zmVar.f32974f = AndroidUtilities.lerp(zmVar.f32974f, zmVar.d, f7);
        } else {
            zmVar.f32975g = zmVar.e;
            zmVar.f32974f = zmVar.d;
        }
        zmVar.d = umVar.f31019c / 1000.0f;
        zmVar.e = umVar.f31020f;
        if (z10) {
            j10 = elapsedRealtime;
        } else {
            j10 = 0;
        }
        zmVar.f32973c = j10;
        zmVar.f32976i = 0L;
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
            zmVar.f32976i = Math.max(zmVar.f32976i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                ym ymVar2 = (ym) arrayList.get(i12);
                if (ymVar2.f32672b == photoEntry) {
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
            if (!hashMap.containsKey(ymVar4.f32672b)) {
                if (ymVar4.f32678k <= 0.0f && ymVar4.h + j14 <= elapsedRealtime) {
                    wh.f fVar = ymVar4.f32686s;
                    if (fVar != null) {
                        fVar.b(ymVar4.O.f32992z);
                        ymVar4.f32686s = null;
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
        zmVar.f32992z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f32992z.P.getPreviewScale() * AndroidUtilities.lerp(this.f32975g, this.e, this.f32977j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f32973c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
