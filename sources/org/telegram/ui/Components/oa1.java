package org.telegram.ui.Components;

import org.json.JSONObject;
public final class oa1 implements Runnable {
    public final int f31254a;
    public final dc1 f31255b;

    public oa1(dc1 dc1Var, int i10) {
        this.f31254a = i10;
        this.f31255b = dc1Var;
    }

    @Override
    public final void run() {
        ac1 ac1Var;
        JSONObject jSONObject;
        cc1 cc1Var;
        int i10;
        switch (this.f31254a) {
            case 0:
                dc1 dc1Var = this.f31255b;
                long j10 = dc1Var.f27411s;
                if (!dc1Var.f27412t && j10 != 0) {
                    WidgetSandboxNative.touch(j10, 0, 5.0f, 5.0f, 0, true, false, 0, 0);
                    return;
                }
                return;
            case 1:
                dc1 dc1Var2 = this.f31255b;
                long j11 = dc1Var2.f27411s;
                if (!dc1Var2.f27412t && j11 != 0) {
                    WidgetSandboxNative.touch(j11, 2, 5.0f, 5.0f, 0, true, false, 0, 0);
                    return;
                }
                return;
            case 2:
                this.f31255b.b();
                return;
            case 3:
                dc1 dc1Var3 = this.f31255b;
                synchronized (dc1Var3.f27408p) {
                    ac1Var = dc1Var3.F;
                    dc1Var3.F = null;
                    jSONObject = dc1Var3.G;
                    dc1Var3.G = null;
                    dc1Var3.H = false;
                }
                if (dc1Var3.f27412t) {
                    if (ac1Var != null) {
                        ac1Var.f26505a.c();
                        return;
                    }
                    return;
                }
                if (ac1Var != null && (i10 = dc1Var3.D) != 0 && Math.abs(ac1Var.d - i10) > 1) {
                    ac1Var.f26505a.c();
                    dc1Var3.B = false;
                    ac1Var = null;
                }
                if (ac1Var != null) {
                    dc1Var3.E = ac1Var;
                    dc1Var3.B = false;
                    cc1 cc1Var2 = dc1Var3.I;
                    if (cc1Var2 != null) {
                        cc1Var2.f(dc1Var3);
                    }
                }
                if (jSONObject != null && (cc1Var = dc1Var3.I) != null) {
                    cc1Var.h(jSONObject);
                    return;
                }
                return;
            case 4:
                this.f31255b.d();
                return;
            default:
                dc1 dc1Var4 = this.f31255b;
                dc1Var4.f27407o.set(true);
                dc1Var4.d();
                return;
        }
    }
}
