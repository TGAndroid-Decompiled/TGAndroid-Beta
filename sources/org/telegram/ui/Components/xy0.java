package org.telegram.ui.Components;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
public final class xy0 implements Choreographer.FrameCallback {
    public final int f40434a;
    public final Object f40435b;

    public xy0(Object obj, int i7) {
        this.f40434a = i7;
        this.f40435b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        boolean z9;
        float min;
        int i7;
        boolean z10;
        switch (this.f40434a) {
            case 0:
                bz0 bz0Var = ((dz0) this.f40435b).f33105a;
                if (bz0Var != null) {
                    Handler handler = bz0Var.getHandler();
                    if (handler != null && bz0Var.f32388b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((dz0) this.f40435b).f33105a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
            default:
                r1.a aVar = (r1.a) ((qt) ((org.telegram.ui.ly0) this.f40435b).f47746b).f37395b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = aVar.f54257b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    r1.g gVar = (r1.g) arrayList.get(i10);
                    if (gVar != null) {
                        a0.l lVar = aVar.f54256a;
                        Long l10 = (Long) lVar.get(gVar);
                        if (l10 != null) {
                            if (l10.longValue() < uptimeMillis2) {
                                lVar.remove(gVar);
                            }
                        }
                        long j10 = gVar.f54275i;
                        if (j10 == 0) {
                            gVar.f54275i = uptimeMillis;
                            gVar.g(gVar.f54270b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            gVar.f54275i = uptimeMillis;
                            if (gVar.f54280n != Float.MAX_VALUE) {
                                r1.h hVar = gVar.f54279m;
                                double d = hVar.f54287i;
                                z9 = true;
                                long j12 = j11 / 2;
                                org.telegram.ui.Cells.i c10 = hVar.c(gVar.f54270b, gVar.f54269a, j12);
                                r1.h hVar2 = gVar.f54279m;
                                hVar2.f54287i = gVar.f54280n;
                                gVar.f54280n = Float.MAX_VALUE;
                                org.telegram.ui.Cells.i c11 = hVar2.c(c10.f29313a, c10.f29314b, j12);
                                gVar.f54270b = c11.f29313a;
                                gVar.f54269a = c11.f29314b;
                            } else {
                                z9 = true;
                                org.telegram.ui.Cells.i c12 = gVar.f54279m.c(gVar.f54270b, gVar.f54269a, j11);
                                gVar.f54270b = c12.f29313a;
                                gVar.f54269a = c12.f29314b;
                            }
                            float max = Math.max(gVar.f54270b, gVar.h);
                            gVar.f54270b = max;
                            gVar.f54270b = Math.min(max, gVar.f54274g);
                            float f10 = gVar.f54269a;
                            r1.h hVar3 = gVar.f54279m;
                            hVar3.getClass();
                            double abs = Math.abs(f10);
                            i7 = i10;
                            if (abs < hVar3.f54284e && Math.abs(min - ((float) hVar3.f54287i)) < hVar3.d) {
                                gVar.f54270b = (float) gVar.f54279m.f54287i;
                                gVar.f54269a = 0.0f;
                                z10 = z9;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(gVar.f54270b, gVar.f54274g);
                            gVar.f54270b = min2;
                            float max2 = Math.max(min2, gVar.h);
                            gVar.f54270b = max2;
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
                if (aVar.f54259e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    aVar.f54259e = false;
                }
                if (arrayList.size() > 0) {
                    if (aVar.d == null) {
                        aVar.d = new org.telegram.ui.ly0(aVar.f54258c);
                    }
                    org.telegram.ui.ly0 ly0Var = aVar.d;
                    ((Choreographer) ly0Var.f47747c).postFrameCallback((xy0) ly0Var.d);
                    return;
                }
                return;
        }
    }
}
