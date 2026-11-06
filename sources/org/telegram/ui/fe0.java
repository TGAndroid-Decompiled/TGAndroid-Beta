package org.telegram.ui;

import android.os.Build;
import android.os.Bundle;
public final class fe0 implements Runnable {
    public final int f45616a;
    public final je0 f45617b;

    public fe0(je0 je0Var, int i7) {
        this.f45616a = i7;
        this.f45617b = je0Var;
    }

    @Override
    public final void run() {
        ri.f fVar;
        qh.b[] bVarArr;
        int i7 = this.f45616a;
        je0 je0Var = this.f45617b;
        switch (i7) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = je0Var.S) != null) {
                    fVar.f54479c.d = 0L;
                    je0Var.T.f54479c.d = 0L;
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
                org.telegram.messenger.g0.E2(je0Var.P);
                return;
            case 6:
                je0Var.getClass();
                new ah0(je0Var.getParentActivity(), je0Var).show();
                return;
            case 7:
                je0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                je0Var.presentFragment(new i9(bundle));
                return;
            default:
                if (je0Var.getParentActivity() != null && (bVarArr = je0Var.K) != null) {
                    qh.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (je0Var.f48014b.getWidth() - ((bVar.getX() + je0Var.F.getX()) + bVar.getWidth()))) / org.telegram.messenger.g0.f22536p;
                    fi.m3 m3Var = new fi.m3(je0Var.getParentActivity(), 3);
                    je0Var.P = m3Var;
                    m3Var.setTranslationY(org.telegram.messenger.g0.L(4.0f) + (-je0Var.L));
                    je0Var.P.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    je0Var.P.r(false);
                    je0Var.P.k(true);
                    je0Var.P.u(org.telegram.messenger.hd.M0(2131744302, null));
                    je0Var.P.o(1.0f, (-width) + 7.33f);
                    je0Var.f48014b.addView(je0Var.P, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    fi.m3 m3Var2 = je0Var.P;
                    m3Var2.f12436q0 = new fe0(je0Var, 5);
                    m3Var2.d = 8000L;
                    m3Var2.w();
                    org.telegram.ui.Components.z20.f40836r.b();
                    return;
                }
                return;
        }
    }
}
