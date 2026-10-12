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
public final class cn {
    public long f24123i;
    public xm f24125k;
    public float f24128n;
    public float f24129o;
    public float f24130p;
    public float f24131q;
    public float f24132r;
    public float f24133s;
    public h11 f24135u;
    public long v;
    public final org.telegram.ui.ActionBar.d5 f24137x;
    public final m.d3 f24138y;
    public final dn f24139z;
    public float f24118a = 0.0f;
    public int f24119b = 0;
    public long f24120c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f24121f = 0.0f;
    public float f24122g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final es f24124j = es.f24774j;
    public final int f24126l = AndroidUtilities.dp(4.0f);
    public final int f24127m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f24134t = new RectF();
    public final Paint f24136w = new Paint(1);

    public cn(dn dnVar) {
        Drawable drawable;
        this.f24139z = dnVar;
        org.telegram.ui.ActionBar.c6 c6Var = dnVar.P.f24745n;
        if (c6Var != null) {
            drawable = c6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f24137x = (org.telegram.ui.ActionBar.d5) (drawable == null ? org.telegram.ui.ActionBar.g6.P0("drawableMsgOutMedia") : drawable);
        this.f24138y = new m.d3();
    }

    public static void a(cn cnVar, xm xmVar, boolean z10) {
        long j10;
        ArrayList arrayList = cnVar.h;
        cnVar.f24125k = xmVar;
        if (xmVar == null) {
            return;
        }
        HashMap hashMap = xmVar.f31272b;
        xmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = elapsedRealtime - cnVar.f24120c;
        long j12 = 200;
        if (j11 < 200) {
            float f7 = ((float) j11) / 200.0f;
            cnVar.f24122g = AndroidUtilities.lerp(cnVar.f24122g, cnVar.e, f7);
            cnVar.f24121f = AndroidUtilities.lerp(cnVar.f24121f, cnVar.d, f7);
        } else {
            cnVar.f24122g = cnVar.e;
            cnVar.f24121f = cnVar.d;
        }
        cnVar.d = xmVar.f31273c / 1000.0f;
        cnVar.e = xmVar.f31274f;
        if (z10) {
            j10 = elapsedRealtime;
        } else {
            j10 = 0;
        }
        cnVar.f24120c = j10;
        cnVar.f24123i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            bn bnVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j13 = j12;
            int i11 = i10;
            cnVar.f24123i = Math.max(cnVar.f24123i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                bn bnVar2 = (bn) arrayList.get(i12);
                if (bnVar2.f23804b == photoEntry) {
                    bnVar = bnVar2;
                    break;
                }
                i12++;
            }
            if (bnVar == null) {
                bn bnVar3 = new bn(cnVar);
                bn.a(bnVar3, photoEntry);
                bn.b(bnVar3, xmVar, groupedMessagePosition, z10);
                arrayList.add(bnVar3);
            } else {
                bn.b(bnVar, xmVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j12 = j13;
        }
        long j14 = j12;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            bn bnVar4 = (bn) arrayList.get(i13);
            if (!hashMap.containsKey(bnVar4.f23804b)) {
                if (bnVar4.f23810k <= 0.0f && bnVar4.h + j14 <= elapsedRealtime) {
                    wh.f fVar = bnVar4.f23818s;
                    if (fVar != null) {
                        fVar.b(bnVar4.O.f24139z);
                        bnVar4.f23818s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    bn.b(bnVar4, null, null, z10);
                }
            }
            i13++;
        }
        cnVar.f24139z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f24139z.P.getPreviewScale() * AndroidUtilities.lerp(this.f24122g, this.e, this.f24124j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f24120c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
