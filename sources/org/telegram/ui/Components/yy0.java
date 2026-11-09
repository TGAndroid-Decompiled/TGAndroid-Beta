package org.telegram.ui.Components;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
public final class yy0 implements Choreographer.FrameCallback {
    public final int f40839a;
    public final Object f40840b;

    public yy0(Object obj, int i7) {
        this.f40839a = i7;
        this.f40840b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        boolean z9;
        float min;
        int i7;
        boolean z10;
        switch (this.f40839a) {
            case 0:
                cz0 cz0Var = ((ez0) this.f40840b).f33525a;
                if (cz0Var != null) {
                    Handler handler = cz0Var.getHandler();
                    if (handler != null && cz0Var.f32797b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((ez0) this.f40840b).f33525a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
            default:
                r1.a aVar = (r1.a) ((rt) ((org.telegram.ui.ky0) this.f40840b).f47422b).f37805b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = aVar.f54258b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    r1.g gVar = (r1.g) arrayList.get(i10);
                    if (gVar != null) {
                        a0.l lVar = aVar.f54257a;
                        Long l10 = (Long) lVar.get(gVar);
                        if (l10 != null) {
                            if (l10.longValue() < uptimeMillis2) {
                                lVar.remove(gVar);
                            }
                        }
                        long j10 = gVar.f54276i;
                        if (j10 == 0) {
                            gVar.f54276i = uptimeMillis;
                            gVar.g(gVar.f54271b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            gVar.f54276i = uptimeMillis;
                            if (gVar.f54281n != Float.MAX_VALUE) {
                                r1.h hVar = gVar.f54280m;
                                double d = hVar.f54288i;
                                z9 = true;
                                long j12 = j11 / 2;
                                org.telegram.ui.Cells.i c10 = hVar.c(gVar.f54271b, gVar.f54270a, j12);
                                r1.h hVar2 = gVar.f54280m;
                                hVar2.f54288i = gVar.f54281n;
                                gVar.f54281n = Float.MAX_VALUE;
                                org.telegram.ui.Cells.i c11 = hVar2.c(c10.f29302a, c10.f29303b, j12);
                                gVar.f54271b = c11.f29302a;
                                gVar.f54270a = c11.f29303b;
                            } else {
                                z9 = true;
                                org.telegram.ui.Cells.i c12 = gVar.f54280m.c(gVar.f54271b, gVar.f54270a, j11);
                                gVar.f54271b = c12.f29302a;
                                gVar.f54270a = c12.f29303b;
                            }
                            float max = Math.max(gVar.f54271b, gVar.h);
                            gVar.f54271b = max;
                            gVar.f54271b = Math.min(max, gVar.f54275g);
                            float f10 = gVar.f54270a;
                            r1.h hVar3 = gVar.f54280m;
                            hVar3.getClass();
                            double abs = Math.abs(f10);
                            i7 = i10;
                            if (abs < hVar3.f54285e && Math.abs(min - ((float) hVar3.f54288i)) < hVar3.d) {
                                gVar.f54271b = (float) gVar.f54280m.f54288i;
                                gVar.f54270a = 0.0f;
                                z10 = z9;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(gVar.f54271b, gVar.f54275g);
                            gVar.f54271b = min2;
                            float max2 = Math.max(min2, gVar.h);
                            gVar.f54271b = max2;
                            gVar.g(max2);
                            if (z10) {
                                gVar.e(false);
                            }
                            i10 = i7 + 1;
                        }
                    }
                    i7 = i10;
                    i10 = i7 + 1;
                }
                if (aVar.f54260e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    aVar.f54260e = false;
                }
                if (arrayList.size() > 0) {
                    if (aVar.d == null) {
                        aVar.d = new org.telegram.ui.ky0(aVar.f54259c);
                    }
                    org.telegram.ui.ky0 ky0Var = aVar.d;
                    ((Choreographer) ky0Var.f47423c).postFrameCallback((yy0) ky0Var.d);
                    return;
                }
                return;
        }
    }
}
