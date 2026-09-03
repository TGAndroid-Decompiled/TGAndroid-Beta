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
public final class lm {
    public long f26785i;
    public gm f26787k;
    public float f26790n;
    public float f26791o;
    public float f26792p;
    public float f26793q;
    public float f26794r;
    public float f26795s;
    public k01 f26797u;
    public long v;
    public final org.telegram.ui.ActionBar.g5 f26799x;
    public final m.f3 f26800y;
    public final mm f26801z;
    public float f26780a = 0.0f;
    public int f26781b = 0;
    public long f26782c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f26783f = 0.0f;
    public float f26784g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final mr f26786j = mr.f27125j;
    public final int f26788l = AndroidUtilities.dp(4.0f);
    public final int f26789m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f26796t = new RectF();
    public final Paint f26798w = new Paint(1);

    public lm(mm mmVar) {
        Drawable drawable;
        this.f26801z = mmVar;
        org.telegram.ui.ActionBar.f6 f6Var = mmVar.M.f27298n;
        if (f6Var != null) {
            drawable = f6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f26799x = (org.telegram.ui.ActionBar.g5) (drawable == null ? org.telegram.ui.ActionBar.j6.O0("drawableMsgOutMedia") : drawable);
        this.f26800y = new m.f3();
    }

    public static void a(lm lmVar, gm gmVar, boolean z4) {
        long j10;
        ArrayList arrayList = lmVar.h;
        lmVar.f26787k = gmVar;
        if (gmVar == null) {
            return;
        }
        HashMap hashMap = gmVar.f25197b;
        gmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = elapsedRealtime - lmVar.f26782c;
        long j12 = 200;
        if (j11 < 200) {
            float f10 = ((float) j11) / 200.0f;
            lmVar.f26784g = AndroidUtilities.lerp(lmVar.f26784g, lmVar.e, f10);
            lmVar.f26783f = AndroidUtilities.lerp(lmVar.f26783f, lmVar.d, f10);
        } else {
            lmVar.f26784g = lmVar.e;
            lmVar.f26783f = lmVar.d;
        }
        lmVar.d = gmVar.f25198c / 1000.0f;
        lmVar.e = gmVar.f25199f;
        if (z4) {
            j10 = elapsedRealtime;
        } else {
            j10 = 0;
        }
        lmVar.f26782c = j10;
        lmVar.f26785i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            km kmVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j13 = j12;
            int i11 = i10;
            lmVar.f26785i = Math.max(lmVar.f26785i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                km kmVar2 = (km) arrayList.get(i12);
                if (kmVar2.f26331b == photoEntry) {
                    kmVar = kmVar2;
                    break;
                }
                i12++;
            }
            if (kmVar == null) {
                km kmVar3 = new km(lmVar);
                km.a(kmVar3, photoEntry);
                km.b(kmVar3, gmVar, groupedMessagePosition, z4);
                arrayList.add(kmVar3);
            } else {
                km.b(kmVar, gmVar, groupedMessagePosition, z4);
            }
            i10 = i11 + 1;
            j12 = j13;
        }
        long j14 = j12;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            km kmVar4 = (km) arrayList.get(i13);
            if (!hashMap.containsKey(kmVar4.f26331b)) {
                if (kmVar4.f26337k <= 0.0f && kmVar4.h + j14 <= elapsedRealtime) {
                    ih.j jVar = kmVar4.f26345s;
                    if (jVar != null) {
                        jVar.b(kmVar4.O.f26801z);
                        kmVar4.f26345s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    km.b(kmVar4, null, null, z4);
                }
            }
            i13++;
        }
        lmVar.f26801z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f26801z.M.getPreviewScale() * AndroidUtilities.lerp(this.f26784g, this.e, this.f26786j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f26782c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
