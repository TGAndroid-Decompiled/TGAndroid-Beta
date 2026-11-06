package org.telegram.ui.Components;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
public final class xy0 implements Choreographer.FrameCallback {
    public final int f40483a;
    public final Object f40484b;

    public xy0(Object obj, int i7) {
        this.f40483a = i7;
        this.f40484b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        boolean z9;
        float min;
        int i7;
        boolean z10;
        switch (this.f40483a) {
            case 0:
                bz0 bz0Var = ((dz0) this.f40484b).f33098a;
                if (bz0Var != null) {
                    Handler handler = bz0Var.getHandler();
                    if (handler != null && bz0Var.f32348b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((dz0) this.f40484b).f33098a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
            default:
                r1.a aVar = (r1.a) ((qt) ((org.telegram.ui.hy0) this.f40484b).f46527b).f37389b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = aVar.f54152b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    r1.g gVar = (r1.g) arrayList.get(i10);
                    if (gVar != null) {
                        a0.l lVar = aVar.f54151a;
                        Long l10 = (Long) lVar.get(gVar);
                        if (l10 != null) {
                            if (l10.longValue() < uptimeMillis2) {
                                lVar.remove(gVar);
                            }
                        }
                        long j10 = gVar.f54170i;
                        if (j10 == 0) {
                            gVar.f54170i = uptimeMillis;
                            gVar.g(gVar.f54165b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            gVar.f54170i = uptimeMillis;
                            if (gVar.f54175n != Float.MAX_VALUE) {
                                r1.h hVar = gVar.f54174m;
                                double d = hVar.f54182i;
                                z9 = true;
                                long j12 = j11 / 2;
                                org.telegram.ui.Cells.i c10 = hVar.c(gVar.f54165b, gVar.f54164a, j12);
                                r1.h hVar2 = gVar.f54174m;
                                hVar2.f54182i = gVar.f54175n;
                                gVar.f54175n = Float.MAX_VALUE;
                                org.telegram.ui.Cells.i c11 = hVar2.c(c10.f29295a, c10.f29296b, j12);
                                gVar.f54165b = c11.f29295a;
                                gVar.f54164a = c11.f29296b;
                            } else {
                                z9 = true;
                                org.telegram.ui.Cells.i c12 = gVar.f54174m.c(gVar.f54165b, gVar.f54164a, j11);
                                gVar.f54165b = c12.f29295a;
                                gVar.f54164a = c12.f29296b;
                            }
                            float max = Math.max(gVar.f54165b, gVar.h);
                            gVar.f54165b = max;
                            gVar.f54165b = Math.min(max, gVar.f54169g);
                            float f10 = gVar.f54164a;
                            r1.h hVar3 = gVar.f54174m;
                            hVar3.getClass();
                            double abs = Math.abs(f10);
                            i7 = i10;
                            if (abs < hVar3.f54179e && Math.abs(min - ((float) hVar3.f54182i)) < hVar3.d) {
                                gVar.f54165b = (float) gVar.f54174m.f54182i;
                                gVar.f54164a = 0.0f;
                                z10 = z9;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(gVar.f54165b, gVar.f54169g);
                            gVar.f54165b = min2;
                            float max2 = Math.max(min2, gVar.h);
                            gVar.f54165b = max2;
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
                if (aVar.f54154e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    aVar.f54154e = false;
                }
                if (arrayList.size() > 0) {
                    if (aVar.d == null) {
                        aVar.d = new org.telegram.ui.hy0(aVar.f54153c);
                    }
                    org.telegram.ui.hy0 hy0Var = aVar.d;
                    ((Choreographer) hy0Var.f46528c).postFrameCallback((xy0) hy0Var.d);
                    return;
                }
                return;
        }
    }
}
