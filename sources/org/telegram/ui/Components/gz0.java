package org.telegram.ui.Components;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
public final class gz0 implements Choreographer.FrameCallback {
    public final int f35668a;
    public final Object f35669b;

    public gz0(Object obj, int i7) {
        this.f35668a = i7;
        this.f35669b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        boolean z10;
        float min;
        int i7;
        boolean z11;
        switch (this.f35668a) {
            case 0:
                kz0 kz0Var = ((mz0) this.f35669b).f37675a;
                if (kz0Var != null) {
                    Handler handler = kz0Var.getHandler();
                    if (handler != null && kz0Var.f36922b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((mz0) this.f35669b).f37675a.T) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
            default:
                r1.a aVar = (r1.a) ((of) ((org.telegram.ui.md0) this.f35669b).f49838b).f38076b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = aVar.f56301b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    r1.g gVar = (r1.g) arrayList.get(i10);
                    if (gVar != null) {
                        a0.l lVar = aVar.f56300a;
                        Long l10 = (Long) lVar.get(gVar);
                        if (l10 != null) {
                            if (l10.longValue() < uptimeMillis2) {
                                lVar.remove(gVar);
                            }
                        }
                        long j10 = gVar.f56319i;
                        if (j10 == 0) {
                            gVar.f56319i = uptimeMillis;
                            gVar.g(gVar.f56314b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            gVar.f56319i = uptimeMillis;
                            if (gVar.f56324n != Float.MAX_VALUE) {
                                r1.h hVar = gVar.f56323m;
                                double d = hVar.f56331i;
                                z10 = true;
                                long j12 = j11 / 2;
                                org.telegram.ui.Cells.i c10 = hVar.c(gVar.f56314b, gVar.f56313a, j12);
                                r1.h hVar2 = gVar.f56323m;
                                hVar2.f56331i = gVar.f56324n;
                                gVar.f56324n = Float.MAX_VALUE;
                                org.telegram.ui.Cells.i c11 = hVar2.c(c10.f30801a, c10.f30802b, j12);
                                gVar.f56314b = c11.f30801a;
                                gVar.f56313a = c11.f30802b;
                            } else {
                                z10 = true;
                                org.telegram.ui.Cells.i c12 = gVar.f56323m.c(gVar.f56314b, gVar.f56313a, j11);
                                gVar.f56314b = c12.f30801a;
                                gVar.f56313a = c12.f30802b;
                            }
                            float max = Math.max(gVar.f56314b, gVar.h);
                            gVar.f56314b = max;
                            gVar.f56314b = Math.min(max, gVar.f56318g);
                            float f10 = gVar.f56313a;
                            r1.h hVar3 = gVar.f56323m;
                            hVar3.getClass();
                            double abs = Math.abs(f10);
                            i7 = i10;
                            if (abs < hVar3.f56328e && Math.abs(min - ((float) hVar3.f56331i)) < hVar3.d) {
                                gVar.f56314b = (float) gVar.f56323m.f56331i;
                                gVar.f56313a = 0.0f;
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            float min2 = Math.min(gVar.f56314b, gVar.f56318g);
                            gVar.f56314b = min2;
                            float max2 = Math.max(min2, gVar.h);
                            gVar.f56314b = max2;
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
                if (aVar.f56303e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    aVar.f56303e = false;
                }
                if (arrayList.size() > 0) {
                    if (aVar.d == null) {
                        aVar.d = new org.telegram.ui.md0(aVar.f56302c);
                    }
                    org.telegram.ui.md0 md0Var = aVar.d;
                    ((Choreographer) md0Var.f49839c).postFrameCallback((gz0) md0Var.d);
                    return;
                }
                return;
        }
    }
}
