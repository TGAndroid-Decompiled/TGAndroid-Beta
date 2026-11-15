package org.telegram.ui.Components;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
public final class zy0 implements Choreographer.FrameCallback {
    public final int f42495a;
    public final Object f42496b;

    public zy0(Object obj, int i7) {
        this.f42495a = i7;
        this.f42496b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        boolean z10;
        float min;
        int i7;
        boolean z11;
        switch (this.f42495a) {
            case 0:
                dz0 dz0Var = ((fz0) this.f42496b).f34759a;
                if (dz0Var != null) {
                    Handler handler = dz0Var.getHandler();
                    if (handler != null && dz0Var.f34097b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((fz0) this.f42496b).f34759a.T) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
            default:
                r1.a aVar = (r1.a) ((ff) ((org.telegram.ui.ld0) this.f42496b).f48972b).f34590b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = aVar.f55726b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    r1.g gVar = (r1.g) arrayList.get(i10);
                    if (gVar != null) {
                        a0.l lVar = aVar.f55725a;
                        Long l10 = (Long) lVar.get(gVar);
                        if (l10 != null) {
                            if (l10.longValue() < uptimeMillis2) {
                                lVar.remove(gVar);
                            }
                        }
                        long j10 = gVar.f55744i;
                        if (j10 == 0) {
                            gVar.f55744i = uptimeMillis;
                            gVar.g(gVar.f55739b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            gVar.f55744i = uptimeMillis;
                            if (gVar.f55749n != Float.MAX_VALUE) {
                                r1.h hVar = gVar.f55748m;
                                double d = hVar.f55756i;
                                z10 = true;
                                long j12 = j11 / 2;
                                org.telegram.ui.Cells.i c10 = hVar.c(gVar.f55739b, gVar.f55738a, j12);
                                r1.h hVar2 = gVar.f55748m;
                                hVar2.f55756i = gVar.f55749n;
                                gVar.f55749n = Float.MAX_VALUE;
                                org.telegram.ui.Cells.i c11 = hVar2.c(c10.f30423a, c10.f30424b, j12);
                                gVar.f55739b = c11.f30423a;
                                gVar.f55738a = c11.f30424b;
                            } else {
                                z10 = true;
                                org.telegram.ui.Cells.i c12 = gVar.f55748m.c(gVar.f55739b, gVar.f55738a, j11);
                                gVar.f55739b = c12.f30423a;
                                gVar.f55738a = c12.f30424b;
                            }
                            float max = Math.max(gVar.f55739b, gVar.h);
                            gVar.f55739b = max;
                            gVar.f55739b = Math.min(max, gVar.f55743g);
                            float f10 = gVar.f55738a;
                            r1.h hVar3 = gVar.f55748m;
                            hVar3.getClass();
                            double abs = Math.abs(f10);
                            i7 = i10;
                            if (abs < hVar3.f55753e && Math.abs(min - ((float) hVar3.f55756i)) < hVar3.d) {
                                gVar.f55739b = (float) gVar.f55748m.f55756i;
                                gVar.f55738a = 0.0f;
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            float min2 = Math.min(gVar.f55739b, gVar.f55743g);
                            gVar.f55739b = min2;
                            float max2 = Math.max(min2, gVar.h);
                            gVar.f55739b = max2;
                            gVar.g(max2);
                            if (z11) {
                                gVar.e(false);
                            }
                            i10 = i7 + 1;
                        }
                    }
                    i7 = i10;
                    i10 = i7 + 1;
                }
                if (aVar.f55728e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    aVar.f55728e = false;
                }
                if (arrayList.size() > 0) {
                    if (aVar.d == null) {
                        aVar.d = new org.telegram.ui.ld0(aVar.f55727c);
                    }
                    org.telegram.ui.ld0 ld0Var = aVar.d;
                    ((Choreographer) ld0Var.f48973c).postFrameCallback((zy0) ld0Var.d);
                    return;
                }
                return;
        }
    }
}
