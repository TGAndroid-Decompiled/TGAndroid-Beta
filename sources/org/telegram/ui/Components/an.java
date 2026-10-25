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
public final class an {
    public long f26559i;
    public vm f26561k;
    public float f26564n;
    public float f26565o;
    public float f26566p;
    public float f26567q;
    public float f26568r;
    public float f26569s;
    public q11 f26571u;
    public long v;
    public final org.telegram.ui.ActionBar.l5 f26573x;
    public final m.d3 f26574y;
    public final bn f26575z;
    public float f26554a = 0.0f;
    public int f26555b = 0;
    public long f26556c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f26557f = 0.0f;
    public float f26558g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final ds f26560j = ds.f27587j;
    public final int f26562l = AndroidUtilities.dp(4.0f);
    public final int f26563m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f26570t = new RectF();
    public final Paint f26572w = new Paint(1);

    public an(bn bnVar) {
        Drawable drawable;
        this.f26575z = bnVar;
        org.telegram.ui.ActionBar.u6 u6Var = bnVar.P.f27198n;
        if (u6Var != null) {
            drawable = u6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f26573x = (org.telegram.ui.ActionBar.l5) (drawable == null ? org.telegram.ui.ActionBar.y6.Q0("drawableMsgOutMedia") : drawable);
        this.f26574y = new m.d3();
    }

    public static void a(an anVar, vm vmVar, boolean z10) {
        long j10;
        ArrayList arrayList = anVar.h;
        anVar.f26561k = vmVar;
        if (vmVar == null) {
            return;
        }
        HashMap hashMap = vmVar.f33682b;
        vmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = elapsedRealtime - anVar.f26556c;
        long j12 = 200;
        if (j11 < 200) {
            float f7 = ((float) j11) / 200.0f;
            anVar.f26558g = AndroidUtilities.lerp(anVar.f26558g, anVar.e, f7);
            anVar.f26557f = AndroidUtilities.lerp(anVar.f26557f, anVar.d, f7);
        } else {
            anVar.f26558g = anVar.e;
            anVar.f26557f = anVar.d;
        }
        anVar.d = vmVar.f33683c / 1000.0f;
        anVar.e = vmVar.f33684f;
        if (z10) {
            j10 = elapsedRealtime;
        } else {
            j10 = 0;
        }
        anVar.f26556c = j10;
        anVar.f26559i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            zm zmVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j13 = j12;
            int i11 = i10;
            anVar.f26559i = Math.max(anVar.f26559i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                zm zmVar2 = (zm) arrayList.get(i12);
                if (zmVar2.f35355b == photoEntry) {
                    zmVar = zmVar2;
                    break;
                }
                i12++;
            }
            if (zmVar == null) {
                zm zmVar3 = new zm(anVar);
                zm.a(zmVar3, photoEntry);
                zm.b(zmVar3, vmVar, groupedMessagePosition, z10);
                arrayList.add(zmVar3);
            } else {
                zm.b(zmVar, vmVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j12 = j13;
        }
        long j14 = j12;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            zm zmVar4 = (zm) arrayList.get(i13);
            if (!hashMap.containsKey(zmVar4.f35355b)) {
                if (zmVar4.f35361k <= 0.0f && zmVar4.h + j14 <= elapsedRealtime) {
                    xh.f fVar = zmVar4.f35369s;
                    if (fVar != null) {
                        fVar.b(zmVar4.O.f26575z);
                        zmVar4.f35369s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    zm.b(zmVar4, null, null, z10);
                }
            }
            i13++;
        }
        anVar.f26575z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f26575z.P.getPreviewScale() * AndroidUtilities.lerp(this.f26558g, this.e, this.f26560j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f26556c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
