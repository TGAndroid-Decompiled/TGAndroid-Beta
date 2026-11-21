package org.telegram.ui.Components;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
public final class iz0 implements Choreographer.FrameCallback {
    public final int f36341a;
    public final Object f36342b;

    public iz0(Object obj, int i7) {
        this.f36341a = i7;
        this.f36342b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        boolean z10;
        float min;
        int i7;
        boolean z11;
        switch (this.f36341a) {
            case 0:
                mz0 mz0Var = ((oz0) this.f36342b).f38429a;
                if (mz0Var != null) {
                    Handler handler = mz0Var.getHandler();
                    if (handler != null && mz0Var.f37671b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((oz0) this.f36342b).f38429a.T) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
            default:
                r1.a aVar = (r1.a) ((qf) ((org.telegram.ui.md0) this.f36342b).f49853b).f38902b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = aVar.f56342b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    r1.g gVar = (r1.g) arrayList.get(i10);
                    if (gVar != null) {
                        a0.l lVar = aVar.f56341a;
                        Long l10 = (Long) lVar.get(gVar);
                        if (l10 != null) {
                            if (l10.longValue() < uptimeMillis2) {
                                lVar.remove(gVar);
                            }
                        }
                        long j10 = gVar.f56360i;
                        if (j10 == 0) {
                            gVar.f56360i = uptimeMillis;
                            gVar.g(gVar.f56355b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            gVar.f56360i = uptimeMillis;
                            if (gVar.f56365n != Float.MAX_VALUE) {
                                r1.h hVar = gVar.f56364m;
                                double d = hVar.f56372i;
                                z10 = true;
                                long j12 = j11 / 2;
                                org.telegram.ui.Cells.i c10 = hVar.c(gVar.f56355b, gVar.f56354a, j12);
                                r1.h hVar2 = gVar.f56364m;
                                hVar2.f56372i = gVar.f56365n;
                                gVar.f56365n = Float.MAX_VALUE;
                                org.telegram.ui.Cells.i c11 = hVar2.c(c10.f30801a, c10.f30802b, j12);
                                gVar.f56355b = c11.f30801a;
                                gVar.f56354a = c11.f30802b;
                            } else {
                                z10 = true;
                                org.telegram.ui.Cells.i c12 = gVar.f56364m.c(gVar.f56355b, gVar.f56354a, j11);
                                gVar.f56355b = c12.f30801a;
                                gVar.f56354a = c12.f30802b;
                            }
                            float max = Math.max(gVar.f56355b, gVar.h);
                            gVar.f56355b = max;
                            gVar.f56355b = Math.min(max, gVar.f56359g);
                            float f10 = gVar.f56354a;
                            r1.h hVar3 = gVar.f56364m;
                            hVar3.getClass();
                            double abs = Math.abs(f10);
                            i7 = i10;
                            if (abs < hVar3.f56369e && Math.abs(min - ((float) hVar3.f56372i)) < hVar3.d) {
                                gVar.f56355b = (float) gVar.f56364m.f56372i;
                                gVar.f56354a = 0.0f;
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            float min2 = Math.min(gVar.f56355b, gVar.f56359g);
                            gVar.f56355b = min2;
                            float max2 = Math.max(min2, gVar.h);
                            gVar.f56355b = max2;
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
                if (aVar.f56344e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    aVar.f56344e = false;
                }
                if (arrayList.size() > 0) {
                    if (aVar.d == null) {
                        aVar.d = new org.telegram.ui.md0(aVar.f56343c);
                    }
                    org.telegram.ui.md0 md0Var = aVar.d;
                    ((Choreographer) md0Var.f49854c).postFrameCallback((iz0) md0Var.d);
                    return;
                }
                return;
        }
    }
}
