package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class la implements View.OnAttachStateChangeListener {
    public final int f28191a;
    public final Object f28192b;
    public final Object f28193c;

    public la(int i10, Object obj, Object obj2) {
        this.f28191a = i10;
        this.f28193c = obj;
        this.f28192b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f28191a;
        Object obj = this.f28192b;
        Object obj2 = this.f28193c;
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
                d11Var.f25449k = a6.update(d11Var.f25450l, (View) obj, d11Var.f25449k, d11Var.f25443b);
                return;
            default:
                org.telegram.ui.Wallet.l3 l3Var = (org.telegram.ui.Wallet.l3) obj2;
                org.telegram.ui.Wallet.k3 k3Var = l3Var.f34467m;
                if (k3Var != null) {
                    k3Var.setPaused(!l3Var.f34468n);
                }
                l3Var.u();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f28191a) {
            case 0:
                na naVar = (na) this.f28193c;
                ja jaVar = (ja) this.f28192b;
                if (jaVar != null) {
                    ArrayList arrayList = jaVar.d;
                    arrayList.remove(naVar);
                    if (jaVar.e.isEmpty() && arrayList.isEmpty()) {
                        jaVar.f27493n.a();
                    }
                }
                naVar.f28705n = null;
                Paint paint = naVar.h;
                naVar.f28706o = null;
                paint.setShader(null);
                return;
            case 1:
                a6.release((View) this.f28192b, ((d11) this.f28193c).f25449k);
                return;
            default:
                org.telegram.ui.Wallet.l3 l3Var = (org.telegram.ui.Wallet.l3) this.f28193c;
                l3Var.g();
                l3Var.M = false;
                l3Var.N = 0L;
                l3Var.m();
                o1.k kVar = l3Var.Z;
                if (kVar != null) {
                    kVar.c();
                    l3Var.Z = null;
                }
                l3Var.f34447a0 = 1.0f;
                org.telegram.ui.Cells.w0 w0Var = l3Var.f34446a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                }
                l3Var.n();
                org.telegram.ui.Wallet.c6 c6Var = l3Var.f34463k;
                WeakHashMap weakHashMap = c6Var.e;
                weakHashMap.remove((org.telegram.ui.Cells.w0) this.f28192b);
                if (weakHashMap.isEmpty()) {
                    c6Var.a();
                }
                l3Var.u();
                org.telegram.ui.Wallet.k3 k3Var = l3Var.f34467m;
                if (k3Var != null) {
                    k3Var.setPaused(true);
                }
                l3Var.f34465l.stop();
                l3Var.H = false;
                return;
        }
    }
}
