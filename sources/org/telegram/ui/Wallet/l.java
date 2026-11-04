package org.telegram.ui.Wallet;

import android.view.View;
import b8.vf;
import org.telegram.ui.Components.l41;
public final class l implements Runnable {
    public final int f42764a;
    public final Object f42765b;

    public l(Object obj, int i3) {
        this.f42764a = i3;
        this.f42765b = obj;
    }

    private final void a() {
        a0 a0Var = (a0) this.f42765b;
        synchronized (a0Var) {
            if (a0Var.f42116a) {
                return;
            }
            a0Var.f42116a = true;
            Runnable runnable = a0Var.f42117b;
            if (runnable != null) {
                runnable.run();
                a0Var.f42117b = null;
            }
        }
    }

    @Override
    public final void run() {
        View d;
        boolean z10;
        switch (this.f42764a) {
            case 0:
                y yVar = (y) this.f42765b;
                synchronized (yVar) {
                    if (!yVar.f43448a) {
                        yVar.f43448a = true;
                        Runnable runnable = yVar.f43449b;
                        if (runnable != null) {
                            runnable.run();
                            yVar.f43449b = null;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((h0) this.f42765b).close();
                return;
            case 3:
                ((boolean[]) this.f42765b)[0] = true;
                return;
            case 4:
                t0 t0Var = (t0) this.f42765b;
                t0Var.c("AUTH_CANCELED");
                t0Var.e();
                if (vf.f3099b == t0Var) {
                    vf.f3099b = null;
                    return;
                }
                return;
            case 5:
                ((x2) this.f42765b).dismiss();
                return;
            case 6:
                ((org.telegram.ui.Cells.t0) this.f42765b).invalidate();
                return;
            case 7:
                org.telegram.messenger.g0.E2((gi.l3) this.f42765b);
                return;
            case 8:
                s5 s5Var = (s5) this.f42765b;
                ai.h4 h4Var = s5Var.f43155c;
                if (h4Var != null && h4Var.getScrollState() == 0) {
                    l41 y02 = s5Var.f43160j.y0();
                    if ((y02 == null || y02.getScrollState() == 0) && (d = s5Var.d(s5Var.f43155c.f35593f3)) != null) {
                        u4.b0 b0Var = s5Var.f43155c.f35593f3;
                        b0Var.getClass();
                        int i3 = new int[]{0, u4.o0.z(d) - b0Var.F()}[1];
                        if (i3 != 0) {
                            s5Var.f43155c.w0(0, i3, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ei.e3 e3Var = (ei.e3) this.f42765b;
                bi.f fVar = (bi.f) e3Var.f10221b;
                bi.e eVar = (bi.e) e3Var.f10222c;
                if (eVar != null) {
                    fVar.a(eVar);
                    fVar.D = 0.0f;
                    e3Var.f10222c = null;
                    e3Var.invalidate();
                    return;
                }
                return;
            case 10:
                ((WalletEngine2) this.f42765b).lambda$close$53();
                return;
            case 11:
                o8 o8Var = (o8) this.f42765b;
                boolean z11 = false;
                if (o8Var.h != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && !o8Var.f43021s) {
                    o8Var.f43016c = o8Var.c();
                    o8Var.d = 0.0f;
                }
                if (z10 || o8Var.f43021s || o8Var.f43017e > 1.001f) {
                    z11 = true;
                }
                a4 a4Var = o8Var.f43015b;
                float f10 = o8Var.f43016c;
                float f11 = o8Var.d;
                a4Var.f57751r = f10;
                a4Var.f57752s = f11;
                a4Var.f57753w = z11;
                a4Var.f57754x = z11;
                return;
            case 12:
                u8 u8Var = (u8) this.f42765b;
                u8Var.removeSelfFromStack();
                Runnable runnable2 = u8Var.f43273f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.w3) this.f42765b).requestLayout();
                return;
            default:
                ((ea) this.f42765b).Z();
                return;
        }
    }
}
