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
    public long f26787i;
    public jm f26789k;
    public float f26792n;
    public float f26793o;
    public float f26794p;
    public float f26795q;
    public float f26796r;
    public float f26797s;
    public h01 f26799u;
    public long v;
    public final org.telegram.ui.ActionBar.g5 f26801x;
    public final m.c3 f26802y;
    public final pm f26803z;
    public float f26782a = 0.0f;
    public int f26783b = 0;
    public long f26784c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f26785f = 0.0f;
    public float f26786g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final qr f26788j = qr.f27386j;
    public final int f26790l = AndroidUtilities.dp(4.0f);
    public final int f26791m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f26798t = new RectF();
    public final Paint f26800w = new Paint(1);

    public om(pm pmVar) {
        Drawable drawable;
        this.f26803z = pmVar;
        org.telegram.ui.ActionBar.f6 f6Var = pmVar.P.f27350n;
        if (f6Var != null) {
            drawable = f6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f26801x = (org.telegram.ui.ActionBar.g5) (drawable == null ? org.telegram.ui.ActionBar.j6.O0("drawableMsgOutMedia") : drawable);
        this.f26802y = new m.c3();
    }

    public static void a(om omVar, jm jmVar, boolean z10) {
        long j3;
        ArrayList arrayList = omVar.h;
        omVar.f26789k = jmVar;
        if (jmVar == null) {
            return;
        }
        HashMap hashMap = jmVar.f25325b;
        jmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - omVar.f26784c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = ((float) j10) / 200.0f;
            omVar.f26786g = AndroidUtilities.lerp(omVar.f26786g, omVar.e, f7);
            omVar.f26785f = AndroidUtilities.lerp(omVar.f26785f, omVar.d, f7);
        } else {
            omVar.f26786g = omVar.e;
            omVar.f26785f = omVar.d;
        }
        omVar.d = jmVar.f25326c / 1000.0f;
        omVar.e = jmVar.f25327f;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        omVar.f26784c = j3;
        omVar.f26787i = 0L;
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
            omVar.f26787i = Math.max(omVar.f26787i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                nm nmVar2 = (nm) arrayList.get(i12);
                if (nmVar2.f26483b == photoEntry) {
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
            if (!hashMap.containsKey(nmVar4.f26483b)) {
                if (nmVar4.f26489k <= 0.0f && nmVar4.h + j13 <= elapsedRealtime) {
                    vh.g gVar = nmVar4.f26497s;
                    if (gVar != null) {
                        gVar.b(nmVar4.O.f26803z);
                        nmVar4.f26497s = null;
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
        omVar.f26803z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f26803z.P.getPreviewScale() * AndroidUtilities.lerp(this.f26786g, this.e, this.f26788j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f26784c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
