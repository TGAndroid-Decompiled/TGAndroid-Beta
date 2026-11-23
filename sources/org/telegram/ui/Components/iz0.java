package org.telegram.ui.Components;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
public final class iz0 implements Choreographer.FrameCallback {
    public final int f36293a;
    public final Object f36294b;

    public iz0(Object obj, int i7) {
        this.f36293a = i7;
        this.f36294b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        boolean z10;
        float min;
        int i7;
        boolean z11;
        switch (this.f36293a) {
            case 0:
                mz0 mz0Var = ((oz0) this.f36294b).f38380a;
                if (mz0Var != null) {
                    Handler handler = mz0Var.getHandler();
                    if (handler != null && mz0Var.f37624b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((oz0) this.f36294b).f38380a.T) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
            default:
                r1.a aVar = (r1.a) ((pf) ((org.telegram.ui.md0) this.f36294b).f49830b).f38544b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = aVar.f56311b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    r1.g gVar = (r1.g) arrayList.get(i10);
                    if (gVar != null) {
                        a0.l lVar = aVar.f56310a;
                        Long l10 = (Long) lVar.get(gVar);
                        if (l10 != null) {
                            if (l10.longValue() < uptimeMillis2) {
                                lVar.remove(gVar);
                            }
                        }
                        long j10 = gVar.f56329i;
                        if (j10 == 0) {
                            gVar.f56329i = uptimeMillis;
                            gVar.g(gVar.f56324b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            gVar.f56329i = uptimeMillis;
                            if (gVar.f56334n != Float.MAX_VALUE) {
                                r1.h hVar = gVar.f56333m;
                                double d = hVar.f56341i;
                                z10 = true;
                                long j12 = j11 / 2;
                                org.telegram.ui.Cells.i c10 = hVar.c(gVar.f56324b, gVar.f56323a, j12);
                                r1.h hVar2 = gVar.f56333m;
                                hVar2.f56341i = gVar.f56334n;
                                gVar.f56334n = Float.MAX_VALUE;
                                org.telegram.ui.Cells.i c11 = hVar2.c(c10.f30770a, c10.f30771b, j12);
                                gVar.f56324b = c11.f30770a;
                                gVar.f56323a = c11.f30771b;
                            } else {
                                z10 = true;
                                org.telegram.ui.Cells.i c12 = gVar.f56333m.c(gVar.f56324b, gVar.f56323a, j11);
                                gVar.f56324b = c12.f30770a;
                                gVar.f56323a = c12.f30771b;
                            }
                            float max = Math.max(gVar.f56324b, gVar.h);
                            gVar.f56324b = max;
                            gVar.f56324b = Math.min(max, gVar.f56328g);
                            float f10 = gVar.f56323a;
                            r1.h hVar3 = gVar.f56333m;
                            hVar3.getClass();
                            double abs = Math.abs(f10);
                            i7 = i10;
                            if (abs < hVar3.f56338e && Math.abs(min - ((float) hVar3.f56341i)) < hVar3.d) {
                                gVar.f56324b = (float) gVar.f56333m.f56341i;
                                gVar.f56323a = 0.0f;
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            float min2 = Math.min(gVar.f56324b, gVar.f56328g);
                            gVar.f56324b = min2;
                            float max2 = Math.max(min2, gVar.h);
                            gVar.f56324b = max2;
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
                if (aVar.f56313e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    aVar.f56313e = false;
                }
                if (arrayList.size() > 0) {
                    if (aVar.d == null) {
                        aVar.d = new org.telegram.ui.md0(aVar.f56312c);
                    }
                    org.telegram.ui.md0 md0Var = aVar.d;
                    ((Choreographer) md0Var.f49831c).postFrameCallback((iz0) md0Var.d);
                    return;
                }
                return;
        }
    }
}
