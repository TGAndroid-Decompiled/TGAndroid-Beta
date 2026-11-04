package org.telegram.ui.Components;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
public final class wy0 implements Choreographer.FrameCallback {
    public final int f40170a;
    public final Object f40171b;

    public wy0(Object obj, int i3) {
        this.f40170a = i3;
        this.f40171b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        boolean z10;
        float min;
        int i3;
        boolean z11;
        switch (this.f40170a) {
            case 0:
                az0 az0Var = ((cz0) this.f40171b).f32868a;
                if (az0Var != null) {
                    Handler handler = az0Var.getHandler();
                    if (handler != null && az0Var.f32008b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((cz0) this.f40171b).f32868a.T) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
            default:
                q1.a aVar = (q1.a) ((nh) ((p7.d) this.f40171b).f53345b).f36540b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = aVar.f53631b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    q1.g gVar = (q1.g) arrayList.get(i10);
                    if (gVar != null) {
                        a0.l lVar = aVar.f53630a;
                        Long l10 = (Long) lVar.get(gVar);
                        if (l10 != null) {
                            if (l10.longValue() < uptimeMillis2) {
                                lVar.remove(gVar);
                            }
                        }
                        long j11 = gVar.f53649i;
                        if (j11 == 0) {
                            gVar.f53649i = uptimeMillis;
                            gVar.g(gVar.f53644b);
                        } else {
                            long j12 = uptimeMillis - j11;
                            gVar.f53649i = uptimeMillis;
                            if (gVar.f53654n != Float.MAX_VALUE) {
                                q1.h hVar = gVar.f53653m;
                                double d = hVar.f53661i;
                                z10 = true;
                                long j13 = j12 / 2;
                                org.telegram.ui.Cells.i c2 = hVar.c(gVar.f53644b, gVar.f53643a, j13);
                                q1.h hVar2 = gVar.f53653m;
                                hVar2.f53661i = gVar.f53654n;
                                gVar.f53654n = Float.MAX_VALUE;
                                org.telegram.ui.Cells.i c10 = hVar2.c(c2.f29364a, c2.f29365b, j13);
                                gVar.f53644b = c10.f29364a;
                                gVar.f53643a = c10.f29365b;
                            } else {
                                z10 = true;
                                org.telegram.ui.Cells.i c11 = gVar.f53653m.c(gVar.f53644b, gVar.f53643a, j12);
                                gVar.f53644b = c11.f29364a;
                                gVar.f53643a = c11.f29365b;
                            }
                            float max = Math.max(gVar.f53644b, gVar.h);
                            gVar.f53644b = max;
                            gVar.f53644b = Math.min(max, gVar.f53648g);
                            float f10 = gVar.f53643a;
                            q1.h hVar3 = gVar.f53653m;
                            hVar3.getClass();
                            double abs = Math.abs(f10);
                            i3 = i10;
                            if (abs < hVar3.f53658e && Math.abs(min - ((float) hVar3.f53661i)) < hVar3.d) {
                                gVar.f53644b = (float) gVar.f53653m.f53661i;
                                gVar.f53643a = 0.0f;
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            float min2 = Math.min(gVar.f53644b, gVar.f53648g);
                            gVar.f53644b = min2;
                            float max2 = Math.max(min2, gVar.h);
                            gVar.f53644b = max2;
                            gVar.g(max2);
                            if (z11) {
                                gVar.e(false);
                            }
                            i10 = i3 + 1;
                        }
                    }
                    i3 = i10;
                    i10 = i3 + 1;
                }
                if (aVar.f53633e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    aVar.f53633e = false;
                }
                if (arrayList.size() > 0) {
                    if (aVar.d == null) {
                        aVar.d = new p7.d(aVar.f53632c);
                    }
                    p7.d dVar = aVar.d;
                    ((Choreographer) dVar.d).postFrameCallback((wy0) dVar.f53346c);
                    return;
                }
                return;
        }
    }
}
