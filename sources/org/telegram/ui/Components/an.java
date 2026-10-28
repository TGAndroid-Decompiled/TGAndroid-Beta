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
    public long f26617i;
    public vm f26619k;
    public float f26622n;
    public float f26623o;
    public float f26624p;
    public float f26625q;
    public float f26626r;
    public float f26627s;
    public r11 f26629u;
    public long v;
    public final org.telegram.ui.ActionBar.l5 f26631x;
    public final m.d3 f26632y;
    public final bn f26633z;
    public float f26612a = 0.0f;
    public int f26613b = 0;
    public long f26614c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f26615f = 0.0f;
    public float f26616g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final ds f26618j = ds.f27533j;
    public final int f26620l = AndroidUtilities.dp(4.0f);
    public final int f26621m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f26628t = new RectF();
    public final Paint f26630w = new Paint(1);

    public an(bn bnVar) {
        Drawable drawable;
        this.f26633z = bnVar;
        org.telegram.ui.ActionBar.u6 u6Var = bnVar.P.f27209n;
        if (u6Var != null) {
            drawable = u6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f26631x = (org.telegram.ui.ActionBar.l5) (drawable == null ? org.telegram.ui.ActionBar.y6.Q0("drawableMsgOutMedia") : drawable);
        this.f26632y = new m.d3();
    }

    public static void a(an anVar, vm vmVar, boolean z10) {
        long j10;
        ArrayList arrayList = anVar.h;
        anVar.f26619k = vmVar;
        if (vmVar == null) {
            return;
        }
        HashMap hashMap = vmVar.f33769b;
        vmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = elapsedRealtime - anVar.f26614c;
        long j12 = 200;
        if (j11 < 200) {
            float f7 = ((float) j11) / 200.0f;
            anVar.f26616g = AndroidUtilities.lerp(anVar.f26616g, anVar.e, f7);
            anVar.f26615f = AndroidUtilities.lerp(anVar.f26615f, anVar.d, f7);
        } else {
            anVar.f26616g = anVar.e;
            anVar.f26615f = anVar.d;
        }
        anVar.d = vmVar.f33770c / 1000.0f;
        anVar.e = vmVar.f33771f;
        if (z10) {
            j10 = elapsedRealtime;
        } else {
            j10 = 0;
        }
        anVar.f26614c = j10;
        anVar.f26617i = 0L;
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
            anVar.f26617i = Math.max(anVar.f26617i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                zm zmVar2 = (zm) arrayList.get(i12);
                if (zmVar2.f35378b == photoEntry) {
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
            if (!hashMap.containsKey(zmVar4.f35378b)) {
                if (zmVar4.f35384k <= 0.0f && zmVar4.h + j14 <= elapsedRealtime) {
                    xh.f fVar = zmVar4.f35392s;
                    if (fVar != null) {
                        fVar.b(zmVar4.O.f26633z);
                        zmVar4.f35392s = null;
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
        anVar.f26633z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f26633z.P.getPreviewScale() * AndroidUtilities.lerp(this.f26616g, this.e, this.f26618j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f26614c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
