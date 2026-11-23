package org.telegram.ui.Components;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
public final class hz0 implements Choreographer.FrameCallback {
    public final int f35849a;
    public final Object f35850b;

    public hz0(Object obj, int i7) {
        this.f35849a = i7;
        this.f35850b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        boolean z10;
        float min;
        int i7;
        boolean z11;
        switch (this.f35849a) {
            case 0:
                lz0 lz0Var = ((nz0) this.f35850b).f37961a;
                if (lz0Var != null) {
                    Handler handler = lz0Var.getHandler();
                    if (handler != null && lz0Var.f37268b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((nz0) this.f35850b).f37961a.T) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
            default:
                r1.a aVar = (r1.a) ((org.telegram.ui.Cells.aa) ((i61) this.f35850b).f35958b).f30491b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = aVar.f56424b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    r1.g gVar = (r1.g) arrayList.get(i10);
                    if (gVar != null) {
                        a0.l lVar = aVar.f56423a;
                        Long l10 = (Long) lVar.get(gVar);
                        if (l10 != null) {
                            if (l10.longValue() < uptimeMillis2) {
                                lVar.remove(gVar);
                            }
                        }
                        long j10 = gVar.f56442i;
                        if (j10 == 0) {
                            gVar.f56442i = uptimeMillis;
                            gVar.g(gVar.f56437b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            gVar.f56442i = uptimeMillis;
                            if (gVar.f56447n != Float.MAX_VALUE) {
                                r1.h hVar = gVar.f56446m;
                                double d = hVar.f56454i;
                                z10 = true;
                                long j12 = j11 / 2;
                                org.telegram.ui.Cells.i c10 = hVar.c(gVar.f56437b, gVar.f56436a, j12);
                                r1.h hVar2 = gVar.f56446m;
                                hVar2.f56454i = gVar.f56447n;
                                gVar.f56447n = Float.MAX_VALUE;
                                org.telegram.ui.Cells.i c11 = hVar2.c(c10.f30860a, c10.f30861b, j12);
                                gVar.f56437b = c11.f30860a;
                                gVar.f56436a = c11.f30861b;
                            } else {
                                z10 = true;
                                org.telegram.ui.Cells.i c12 = gVar.f56446m.c(gVar.f56437b, gVar.f56436a, j11);
                                gVar.f56437b = c12.f30860a;
                                gVar.f56436a = c12.f30861b;
                            }
                            float max = Math.max(gVar.f56437b, gVar.h);
                            gVar.f56437b = max;
                            gVar.f56437b = Math.min(max, gVar.f56441g);
                            float f10 = gVar.f56436a;
                            r1.h hVar3 = gVar.f56446m;
                            hVar3.getClass();
                            double abs = Math.abs(f10);
                            i7 = i10;
                            if (abs < hVar3.f56451e && Math.abs(min - ((float) hVar3.f56454i)) < hVar3.d) {
                                gVar.f56437b = (float) gVar.f56446m.f56454i;
                                gVar.f56436a = 0.0f;
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            float min2 = Math.min(gVar.f56437b, gVar.f56441g);
                            gVar.f56437b = min2;
                            float max2 = Math.max(min2, gVar.h);
                            gVar.f56437b = max2;
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
                if (aVar.f56426e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    aVar.f56426e = false;
                }
                if (arrayList.size() > 0) {
                    if (aVar.d == null) {
                        aVar.d = new i61(aVar.f56425c);
                    }
                    i61 i61Var = aVar.d;
                    ((Choreographer) i61Var.f35959c).postFrameCallback((hz0) i61Var.d);
                    return;
                }
                return;
        }
    }
}
