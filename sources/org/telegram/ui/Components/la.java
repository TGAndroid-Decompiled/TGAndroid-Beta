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
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) obj2;
                org.telegram.ui.Wallet.l3 l3Var = m3Var.f34503m;
                if (l3Var != null) {
                    l3Var.setPaused(!m3Var.f34504n);
                }
                m3Var.u();
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
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) this.f28186c;
                m3Var.g();
                m3Var.M = false;
                m3Var.N = 0L;
                m3Var.m();
                o1.k kVar = m3Var.Z;
                if (kVar != null) {
                    kVar.c();
                    m3Var.Z = null;
                }
                m3Var.f34483a0 = 1.0f;
                org.telegram.ui.Cells.w0 w0Var = m3Var.f34482a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                }
                m3Var.n();
                org.telegram.ui.Wallet.y5 y5Var = m3Var.f34499k;
                WeakHashMap weakHashMap = y5Var.e;
                weakHashMap.remove((org.telegram.ui.Cells.w0) this.f28185b);
                if (weakHashMap.isEmpty()) {
                    y5Var.a();
                }
                m3Var.u();
                org.telegram.ui.Wallet.l3 l3Var = m3Var.f34503m;
                if (l3Var != null) {
                    l3Var.setPaused(true);
                }
                m3Var.f34501l.stop();
                m3Var.H = false;
                return;
        }
    }
}
