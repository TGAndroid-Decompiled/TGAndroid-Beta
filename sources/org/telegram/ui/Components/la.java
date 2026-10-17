package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class la implements View.OnAttachStateChangeListener {
    public final int f28184a;
    public final Object f28185b;
    public final Object f28186c;

    public la(int i10, Object obj, Object obj2) {
        this.f28184a = i10;
        this.f28186c = obj;
        this.f28185b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f28184a;
        Object obj = this.f28185b;
        Object obj2 = this.f28186c;
        switch (i10) {
            case 0:
                ja jaVar = (ja) obj;
                if (jaVar != null) {
                    jaVar.d.add((na) obj2);
                    return;
                }
                return;
            case 1:
                d11 d11Var = (d11) obj2;
                d11Var.f25442k = a6.update(d11Var.f25443l, (View) obj, d11Var.f25442k, d11Var.f25436b);
                return;
            default:
                org.telegram.ui.Wallet.k3 k3Var = (org.telegram.ui.Wallet.k3) obj2;
                org.telegram.ui.Wallet.j3 j3Var = k3Var.f34406m;
                if (j3Var != null) {
                    j3Var.setPaused(!k3Var.f34407n);
                }
                k3Var.u();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f28184a) {
            case 0:
                na naVar = (na) this.f28186c;
                ja jaVar = (ja) this.f28185b;
                if (jaVar != null) {
                    ArrayList arrayList = jaVar.d;
                    arrayList.remove(naVar);
                    if (jaVar.e.isEmpty() && arrayList.isEmpty()) {
                        jaVar.f27486n.a();
                    }
                }
                naVar.f28698n = null;
                Paint paint = naVar.h;
                naVar.f28699o = null;
                paint.setShader(null);
                return;
            case 1:
                a6.release((View) this.f28185b, ((d11) this.f28186c).f25442k);
                return;
            default:
                org.telegram.ui.Wallet.k3 k3Var = (org.telegram.ui.Wallet.k3) this.f28186c;
                k3Var.g();
                k3Var.M = false;
                k3Var.N = 0L;
                k3Var.m();
                o1.k kVar = k3Var.Z;
                if (kVar != null) {
                    kVar.c();
                    k3Var.Z = null;
                }
                k3Var.f34386a0 = 1.0f;
                org.telegram.ui.Cells.x0 x0Var = k3Var.f34385a;
                x0Var.invalidate();
                if (x0Var.getParent() instanceof View) {
                    ((View) x0Var.getParent()).invalidate();
                }
                k3Var.n();
                org.telegram.ui.Wallet.z5 z5Var = k3Var.f34402k;
                WeakHashMap weakHashMap = z5Var.e;
                weakHashMap.remove((org.telegram.ui.Cells.x0) this.f28185b);
                if (weakHashMap.isEmpty()) {
                    z5Var.a();
                }
                k3Var.u();
                org.telegram.ui.Wallet.j3 j3Var = k3Var.f34406m;
                if (j3Var != null) {
                    j3Var.setPaused(true);
                }
                k3Var.f34404l.stop();
                k3Var.H = false;
                return;
        }
    }
}
