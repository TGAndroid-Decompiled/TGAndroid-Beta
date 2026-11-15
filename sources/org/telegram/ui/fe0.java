package org.telegram.ui;

import android.os.Build;
import android.os.Bundle;
public final class fe0 implements Runnable {
    public final int f47129a;
    public final je0 f47130b;

    public fe0(je0 je0Var, int i7) {
        this.f47129a = i7;
        this.f47130b = je0Var;
    }

    @Override
    public final void run() {
        ui.f fVar;
        qh.b[] bVarArr;
        int i7 = this.f47129a;
        je0 je0Var = this.f47130b;
        switch (i7) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = je0Var.T) != null) {
                    fVar.f58438c.d = 0L;
                    je0Var.U.f58438c.d = 0L;
                    je0Var.i0();
                    return;
                }
                return;
            case 1:
                je0.g0(je0Var);
                return;
            case 2:
                je0Var.getClass();
                i9.l0(je0Var);
                return;
            case 3:
                je0.h0(je0Var);
                return;
            case 4:
                je0.f0(je0Var);
                return;
            case 5:
                org.telegram.messenger.g0.E2(je0Var.Q);
                return;
            case 6:
                je0Var.getClass();
                new bh0(je0Var.getParentActivity(), je0Var).show();
                return;
            case 7:
                je0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                je0Var.presentFragment(new i9(bundle));
                return;
            default:
                if (je0Var.getParentActivity() != null && (bVarArr = je0Var.L) != null) {
                    qh.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (je0Var.f49204b.getWidth() - ((bVar.getX() + je0Var.G.getX()) + bVar.getWidth()))) / org.telegram.messenger.g0.f23608p;
                    hi.l3 l3Var = new hi.l3(je0Var.getParentActivity(), 3);
                    je0Var.Q = l3Var;
                    l3Var.setTranslationY(org.telegram.messenger.g0.L(4.0f) + (-je0Var.M));
                    je0Var.Q.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    je0Var.Q.r(false);
                    je0Var.Q.k(true);
                    je0Var.Q.u(org.telegram.messenger.hd.M0(2131744301, null));
                    je0Var.Q.o(1.0f, (-width) + 7.33f);
                    je0Var.f49204b.addView(je0Var.Q, c8.ja.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    hi.l3 l3Var2 = je0Var.Q;
                    l3Var2.f14570r0 = new fe0(je0Var, 5);
                    l3Var2.d = 8000L;
                    l3Var2.w();
                    org.telegram.ui.Components.c30.f33486r.b();
                    return;
                }
                return;
        }
    }
}
