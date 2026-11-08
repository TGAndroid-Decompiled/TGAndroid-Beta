package org.telegram.ui.Components;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
public final class xy0 implements Choreographer.FrameCallback {
    public final int f40507a;
    public final Object f40508b;

    public xy0(Object obj, int i7) {
        this.f40507a = i7;
        this.f40508b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        boolean z9;
        float min;
        int i7;
        boolean z10;
        switch (this.f40507a) {
            case 0:
                bz0 bz0Var = ((dz0) this.f40508b).f33139a;
                if (bz0Var != null) {
                    Handler handler = bz0Var.getHandler();
                    if (handler != null && bz0Var.f32381b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((dz0) this.f40508b).f33139a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
            default:
                r1.a aVar = (r1.a) ((rt) ((org.telegram.ui.hy0) this.f40508b).f46526b).f37758b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = aVar.f54245b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    r1.g gVar = (r1.g) arrayList.get(i10);
                    if (gVar != null) {
                        a0.l lVar = aVar.f54244a;
                        Long l10 = (Long) lVar.get(gVar);
                        if (l10 != null) {
                            if (l10.longValue() < uptimeMillis2) {
                                lVar.remove(gVar);
                            }
                        }
                        long j10 = gVar.f54263i;
                        if (j10 == 0) {
                            gVar.f54263i = uptimeMillis;
                            gVar.g(gVar.f54258b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            gVar.f54263i = uptimeMillis;
                            if (gVar.f54268n != Float.MAX_VALUE) {
                                r1.h hVar = gVar.f54267m;
                                double d = hVar.f54275i;
                                z9 = true;
                                long j12 = j11 / 2;
                                org.telegram.ui.Cells.i c10 = hVar.c(gVar.f54258b, gVar.f54257a, j12);
                                r1.h hVar2 = gVar.f54267m;
                                hVar2.f54275i = gVar.f54268n;
                                gVar.f54268n = Float.MAX_VALUE;
                                org.telegram.ui.Cells.i c11 = hVar2.c(c10.f29298a, c10.f29299b, j12);
                                gVar.f54258b = c11.f29298a;
                                gVar.f54257a = c11.f29299b;
                            } else {
                                z9 = true;
                                org.telegram.ui.Cells.i c12 = gVar.f54267m.c(gVar.f54258b, gVar.f54257a, j11);
                                gVar.f54258b = c12.f29298a;
                                gVar.f54257a = c12.f29299b;
                            }
                            float max = Math.max(gVar.f54258b, gVar.h);
                            gVar.f54258b = max;
                            gVar.f54258b = Math.min(max, gVar.f54262g);
                            float f10 = gVar.f54257a;
                            r1.h hVar3 = gVar.f54267m;
                            hVar3.getClass();
                            double abs = Math.abs(f10);
                            i7 = i10;
                            if (abs < hVar3.f54272e && Math.abs(min - ((float) hVar3.f54275i)) < hVar3.d) {
                                gVar.f54258b = (float) gVar.f54267m.f54275i;
                                gVar.f54257a = 0.0f;
                                z10 = z9;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(gVar.f54258b, gVar.f54262g);
                            gVar.f54258b = min2;
                            float max2 = Math.max(min2, gVar.h);
                            gVar.f54258b = max2;
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
                if (aVar.f54247e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    aVar.f54247e = false;
                }
                if (arrayList.size() > 0) {
                    if (aVar.d == null) {
                        aVar.d = new org.telegram.ui.hy0(aVar.f54246c);
                    }
                    org.telegram.ui.hy0 hy0Var = aVar.d;
                    ((Choreographer) hy0Var.f46527c).postFrameCallback((xy0) hy0Var.d);
                    return;
                }
                return;
        }
    }
}
