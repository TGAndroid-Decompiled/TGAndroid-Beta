package org.telegram.ui.Components;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
public final class wy0 implements Choreographer.FrameCallback {
    public final int f40103a;
    public final Object f40104b;

    public wy0(Object obj, int i7) {
        this.f40103a = i7;
        this.f40104b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        boolean z9;
        float min;
        int i7;
        boolean z10;
        switch (this.f40103a) {
            case 0:
                az0 az0Var = ((cz0) this.f40104b).f32722a;
                if (az0Var != null) {
                    Handler handler = az0Var.getHandler();
                    if (handler != null && az0Var.f31944b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((cz0) this.f40104b).f32722a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
            default:
                r1.a aVar = (r1.a) ((qt) ((org.telegram.ui.hy0) this.f40104b).f46519b).f37504b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = aVar.f54128b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    r1.g gVar = (r1.g) arrayList.get(i10);
                    if (gVar != null) {
                        a0.l lVar = aVar.f54127a;
                        Long l10 = (Long) lVar.get(gVar);
                        if (l10 != null) {
                            if (l10.longValue() < uptimeMillis2) {
                                lVar.remove(gVar);
                            }
                        }
                        long j10 = gVar.f54146i;
                        if (j10 == 0) {
                            gVar.f54146i = uptimeMillis;
                            gVar.g(gVar.f54141b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            gVar.f54146i = uptimeMillis;
                            if (gVar.f54151n != Float.MAX_VALUE) {
                                r1.h hVar = gVar.f54150m;
                                double d = hVar.f54158i;
                                z9 = true;
                                long j12 = j11 / 2;
                                org.telegram.ui.Cells.i c10 = hVar.c(gVar.f54141b, gVar.f54140a, j12);
                                r1.h hVar2 = gVar.f54150m;
                                hVar2.f54158i = gVar.f54151n;
                                gVar.f54151n = Float.MAX_VALUE;
                                org.telegram.ui.Cells.i c11 = hVar2.c(c10.f29294a, c10.f29295b, j12);
                                gVar.f54141b = c11.f29294a;
                                gVar.f54140a = c11.f29295b;
                            } else {
                                z9 = true;
                                org.telegram.ui.Cells.i c12 = gVar.f54150m.c(gVar.f54141b, gVar.f54140a, j11);
                                gVar.f54141b = c12.f29294a;
                                gVar.f54140a = c12.f29295b;
                            }
                            float max = Math.max(gVar.f54141b, gVar.h);
                            gVar.f54141b = max;
                            gVar.f54141b = Math.min(max, gVar.f54145g);
                            float f10 = gVar.f54140a;
                            r1.h hVar3 = gVar.f54150m;
                            hVar3.getClass();
                            double abs = Math.abs(f10);
                            i7 = i10;
                            if (abs < hVar3.f54155e && Math.abs(min - ((float) hVar3.f54158i)) < hVar3.d) {
                                gVar.f54141b = (float) gVar.f54150m.f54158i;
                                gVar.f54140a = 0.0f;
                                z10 = z9;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(gVar.f54141b, gVar.f54145g);
                            gVar.f54141b = min2;
                            float max2 = Math.max(min2, gVar.h);
                            gVar.f54141b = max2;
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
                if (aVar.f54130e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    aVar.f54130e = false;
                }
                if (arrayList.size() > 0) {
                    if (aVar.d == null) {
                        aVar.d = new org.telegram.ui.hy0(aVar.f54129c);
                    }
                    org.telegram.ui.hy0 hy0Var = aVar.d;
                    ((Choreographer) hy0Var.f46520c).postFrameCallback((wy0) hy0Var.d);
                    return;
                }
                return;
        }
    }
}
