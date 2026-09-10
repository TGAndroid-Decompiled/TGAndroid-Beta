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
public final class vm {
    public long f28013i;
    public pm f28015k;
    public float f28018n;
    public float f28019o;
    public float f28020p;
    public float f28021q;
    public float f28022r;
    public float f28023s;
    public t01 f28025u;
    public long v;
    public final org.telegram.ui.ActionBar.h5 f28027x;
    public final m.c3 f28028y;
    public final wm f28029z;
    public float f28008a = 0.0f;
    public int f28009b = 0;
    public long f28010c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f28011f = 0.0f;
    public float f28012g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final wr f28014j = wr.f28822j;
    public final int f28016l = AndroidUtilities.dp(4.0f);
    public final int f28017m = AndroidUtilities.dp(2.0f) / 2;
    public final RectF f28024t = new RectF();
    public final Paint f28026w = new Paint(1);

    public vm(wm wmVar) {
        Drawable drawable;
        this.f28029z = wmVar;
        org.telegram.ui.ActionBar.f6 f6Var = wmVar.P.f29079n;
        if (f6Var != null) {
            drawable = f6Var.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.f28027x = (org.telegram.ui.ActionBar.h5) (drawable == null ? org.telegram.ui.ActionBar.j6.O0("drawableMsgOutMedia") : drawable);
        this.f28028y = new m.c3();
    }

    public static void a(vm vmVar, pm pmVar, boolean z10) {
        long j3;
        ArrayList arrayList = vmVar.h;
        vmVar.f28015k = pmVar;
        if (pmVar == null) {
            return;
        }
        HashMap hashMap = pmVar.f26209b;
        pmVar.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - vmVar.f28010c;
        long j11 = 200;
        if (j10 < 200) {
            float f7 = ((float) j10) / 200.0f;
            vmVar.f28012g = AndroidUtilities.lerp(vmVar.f28012g, vmVar.e, f7);
            vmVar.f28011f = AndroidUtilities.lerp(vmVar.f28011f, vmVar.d, f7);
        } else {
            vmVar.f28012g = vmVar.e;
            vmVar.f28011f = vmVar.d;
        }
        vmVar.d = pmVar.f26210c / 1000.0f;
        vmVar.e = pmVar.f26211f;
        if (z10) {
            j3 = elapsedRealtime;
        } else {
            j3 = 0;
        }
        vmVar.f28010c = j3;
        vmVar.f28013i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            um umVar = null;
            if (i10 >= size) {
                break;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) hashMap.get(photoEntry);
            long j12 = j11;
            int i11 = i10;
            vmVar.f28013i = Math.max(vmVar.f28013i, photoEntry.starsAmount);
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                um umVar2 = (um) arrayList.get(i12);
                if (umVar2.f27698b == photoEntry) {
                    umVar = umVar2;
                    break;
                }
                i12++;
            }
            if (umVar == null) {
                um umVar3 = new um(vmVar);
                um.a(umVar3, photoEntry);
                um.b(umVar3, pmVar, groupedMessagePosition, z10);
                arrayList.add(umVar3);
            } else {
                um.b(umVar, pmVar, groupedMessagePosition, z10);
            }
            i10 = i11 + 1;
            j11 = j12;
        }
        long j13 = j11;
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            um umVar4 = (um) arrayList.get(i13);
            if (!hashMap.containsKey(umVar4.f27698b)) {
                if (umVar4.f27704k <= 0.0f && umVar4.h + j13 <= elapsedRealtime) {
                    uh.g gVar = umVar4.f27712s;
                    if (gVar != null) {
                        gVar.b(umVar4.O.f28029z);
                        umVar4.f27712s = null;
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    um.b(umVar4, null, null, z10);
                }
            }
            i13++;
        }
        vmVar.f28029z.invalidate();
    }

    public final float b() {
        Point point = AndroidUtilities.displaySize;
        return this.f28029z.P.getPreviewScale() * AndroidUtilities.lerp(this.f28012g, this.e, this.f28014j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f28010c)) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
    }
}
