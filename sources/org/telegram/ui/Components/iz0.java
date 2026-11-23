package org.telegram.ui.Components;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
public final class iz0 implements Choreographer.FrameCallback {
    public final int f36335a;
    public final Object f36336b;

    public iz0(Object obj, int i7) {
        this.f36335a = i7;
        this.f36336b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        boolean z10;
        float min;
        int i7;
        boolean z11;
        switch (this.f36335a) {
            case 0:
                mz0 mz0Var = ((oz0) this.f36336b).f38423a;
                if (mz0Var != null) {
                    Handler handler = mz0Var.getHandler();
                    if (handler != null && mz0Var.f37669b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((oz0) this.f36336b).f38423a.T) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
            default:
                r1.a aVar = (r1.a) ((qf) ((org.telegram.ui.md0) this.f36336b).f49857b).f38896b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = aVar.f56346b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    r1.g gVar = (r1.g) arrayList.get(i10);
                    if (gVar != null) {
                        a0.l lVar = aVar.f56345a;
                        Long l10 = (Long) lVar.get(gVar);
                        if (l10 != null) {
                            if (l10.longValue() < uptimeMillis2) {
                                lVar.remove(gVar);
                            }
                        }
                        long j10 = gVar.f56364i;
                        if (j10 == 0) {
                            gVar.f56364i = uptimeMillis;
                            gVar.g(gVar.f56359b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            gVar.f56364i = uptimeMillis;
                            if (gVar.f56369n != Float.MAX_VALUE) {
                                r1.h hVar = gVar.f56368m;
                                double d = hVar.f56376i;
                                z10 = true;
                                long j12 = j11 / 2;
                                org.telegram.ui.Cells.i c10 = hVar.c(gVar.f56359b, gVar.f56358a, j12);
                                r1.h hVar2 = gVar.f56368m;
                                hVar2.f56376i = gVar.f56369n;
                                gVar.f56369n = Float.MAX_VALUE;
                                org.telegram.ui.Cells.i c11 = hVar2.c(c10.f30804a, c10.f30805b, j12);
                                gVar.f56359b = c11.f30804a;
                                gVar.f56358a = c11.f30805b;
                            } else {
                                z10 = true;
                                org.telegram.ui.Cells.i c12 = gVar.f56368m.c(gVar.f56359b, gVar.f56358a, j11);
                                gVar.f56359b = c12.f30804a;
                                gVar.f56358a = c12.f30805b;
                            }
                            float max = Math.max(gVar.f56359b, gVar.h);
                            gVar.f56359b = max;
                            gVar.f56359b = Math.min(max, gVar.f56363g);
                            float f10 = gVar.f56358a;
                            r1.h hVar3 = gVar.f56368m;
                            hVar3.getClass();
                            double abs = Math.abs(f10);
                            i7 = i10;
                            if (abs < hVar3.f56373e && Math.abs(min - ((float) hVar3.f56376i)) < hVar3.d) {
                                gVar.f56359b = (float) gVar.f56368m.f56376i;
                                gVar.f56358a = 0.0f;
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            float min2 = Math.min(gVar.f56359b, gVar.f56363g);
                            gVar.f56359b = min2;
                            float max2 = Math.max(min2, gVar.h);
                            gVar.f56359b = max2;
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
                if (aVar.f56348e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    aVar.f56348e = false;
                }
                if (arrayList.size() > 0) {
                    if (aVar.d == null) {
                        aVar.d = new org.telegram.ui.md0(aVar.f56347c);
                    }
                    org.telegram.ui.md0 md0Var = aVar.d;
                    ((Choreographer) md0Var.f49858c).postFrameCallback((iz0) md0Var.d);
                    return;
                }
                return;
        }
    }
}
