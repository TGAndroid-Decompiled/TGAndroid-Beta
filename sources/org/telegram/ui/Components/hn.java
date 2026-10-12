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
public final class hn {
    public long f26821i;
    public cn f26823k;
    public float f26826n;
    public float f26827o;
    public float f26828p;
    public float f26829q;
    public float f26830r;
    public float f26831s;
    public r11 f26833u;
    public long v;
    public final org.telegram.ui.ActionBar.d5 f26835x;
    public final m.d3 f26836y;
    public final in f26837z;
    public float f26815a = 0.0f;
    public int f26816b = 0;
    public long f26817c = 0;
    public float d = 0.0f;
    public float f26818e = 0.0f;
    public float f26819f = 0.0f;
    public float f26820g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final js f26822j = js.f27630j;
    public final int f26824l = AndroidUtilities.dp(4.0f);
    public final int f26825m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f26832t = new RectF();
    public final Paint f26834w = new Paint(1);

    public hn(in inVar) {
        Drawable drawable;
        this.f26837z = inVar;
        org.telegram.ui.ActionBar.c6 c6Var = inVar.P.f27558n;
        if (c6Var != null) {
            drawable = c6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f26835x = (org.telegram.ui.ActionBar.d5) (drawable == null ? org.telegram.ui.ActionBar.h6.P0("drawableMsgOutMedia") : drawable);
        this.f26836y = new m.d3();
    }

    public static void a(hn hnVar, cn cnVar, boolean z10) {
        long j3;
        ArrayList arrayList = hnVar.h;
        hnVar.f26823k = cnVar;
        if (cnVar == null) {
            return;
        }
        HashMap hashMap = cnVar.f24974b;
        cnVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - hnVar.f26817c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = ((float) j10) / 200.0f;
            hnVar.f26820g = AndroidUtilities.lerp(hnVar.f26820g, hnVar.f26818e, f7);
            hnVar.f26819f = AndroidUtilities.lerp(hnVar.f26819f, hnVar.d, f7);
        } else {
            hnVar.f26820g = hnVar.f26818e;
            hnVar.f26819f = hnVar.d;
        }
        hnVar.d = cnVar.f24975c / 1000.0f;
        hnVar.f26818e = cnVar.f24977f;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        hnVar.f26817c = j3;
        hnVar.f26821i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            gn gnVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j12 = j11;
            int i11 = i10;
            hnVar.f26821i = Math.max(hnVar.f26821i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                gn gnVar2 = (gn) arrayList.get(i12);
                if (gnVar2.f26456b == photoEntry) {
                    gnVar = gnVar2;
                    break;
                }
                i12++;
            }
            if (gnVar == null) {
                gn gnVar3 = new gn(hnVar);
                gn.a(gnVar3, photoEntry);
                gn.b(gnVar3, cnVar, groupedMessagePosition, z10);
                arrayList.add(gnVar3);
            } else {
                gn.b(gnVar, cnVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            gn gnVar4 = (gn) arrayList.get(i13);
            if (!hashMap.containsKey(gnVar4.f26456b)) {
                if (gnVar4.f26463k <= 0.0f && gnVar4.h + j13 <= elapsedRealtime) {
                    vh.f fVar = gnVar4.f26471s;
                    if (fVar != null) {
                        fVar.b(gnVar4.O.f26837z);
                        gnVar4.f26471s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    gn.b(gnVar4, null, null, z10);
                }
            }
            i13++;
        }
        hnVar.f26837z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f26837z.P.getPreviewScale() * AndroidUtilities.lerp(this.f26820g, this.f26818e, this.f26822j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f26817c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
