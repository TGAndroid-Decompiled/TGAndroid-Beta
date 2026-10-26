package org.telegram.ui.Components;

import org.json.JSONObject;
public final class na1 implements Runnable {
    public final int f30938a;
    public final yb1 f30939b;

    public na1(yb1 yb1Var, int i10) {
        this.f30938a = i10;
        this.f30939b = yb1Var;
    }

    @Override
    public final void run() {
        vb1 vb1Var;
        JSONObject jSONObject;
        xb1 xb1Var;
        int i10;
        switch (this.f30938a) {
            case 0:
                yb1 yb1Var = this.f30939b;
                long j10 = yb1Var.f35017r;
                if (!yb1Var.f35018s && j10 != 0) {
                    WidgetSandboxNative.touch(j10, 0, 5.0f, 5.0f, 0, true, false, 0, 0);
                    return;
                }
                return;
            case 1:
                yb1 yb1Var2 = this.f30939b;
                long j11 = yb1Var2.f35017r;
                if (!yb1Var2.f35018s && j11 != 0) {
                    WidgetSandboxNative.touch(j11, 2, 5.0f, 5.0f, 0, true, false, 0, 0);
                    return;
                }
                return;
            case 2:
                this.f30939b.a();
                return;
            case 3:
                this.f30939b.c();
                return;
            case 4:
                yb1 yb1Var3 = this.f30939b;
                yb1Var3.f35013n.set(true);
                yb1Var3.c();
                return;
            default:
                yb1 yb1Var4 = this.f30939b;
                synchronized (yb1Var4.f35014o) {
                    vb1Var = yb1Var4.E;
                    yb1Var4.E = null;
                    jSONObject = yb1Var4.F;
                    yb1Var4.F = null;
                    yb1Var4.G = false;
                }
                if (yb1Var4.f35018s) {
                    if (vb1Var != null) {
                        vb1Var.f33623a.c();
                        return;
                    }
                    return;
                }
                if (vb1Var != null && (i10 = yb1Var4.C) != 0 && Math.abs(vb1Var.d - i10) > 1) {
                    vb1Var.f33623a.c();
                    yb1Var4.A = false;
                    vb1Var = null;
                }
                if (vb1Var != null) {
                    yb1Var4.D = vb1Var;
                    yb1Var4.A = false;
                    xb1 xb1Var2 = yb1Var4.H;
                    if (xb1Var2 != null) {
                        xb1Var2.d(yb1Var4);
                    }
                }
                if (jSONObject != null && (xb1Var = yb1Var4.H) != null) {
                    xb1Var.f(jSONObject);
                    return;
                }
                return;
        }
    }
}
