package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class ea implements View.OnAttachStateChangeListener {
    public final int f34655a;
    public final Object f34656b;
    public final Object f34657c;

    public ea(int i7, Object obj, Object obj2) {
        this.f34655a = i7;
        this.f34657c = obj;
        this.f34656b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i7 = this.f34655a;
        Object obj = this.f34656b;
        Object obj2 = this.f34657c;
        switch (i7) {
            case 0:
                ca caVar = (ca) obj;
                if (caVar != null) {
                    caVar.d.add((ga) obj2);
                    return;
                }
                return;
            case 1:
                vy0 vy0Var = (vy0) obj2;
                vy0Var.f41488k = x5.update(vy0Var.f41489l, (View) obj, vy0Var.f41488k, vy0Var.f41481b);
                return;
            default:
                org.telegram.ui.Wallet.m4 m4Var = (org.telegram.ui.Wallet.m4) obj2;
                org.telegram.ui.Wallet.l4 l4Var = m4Var.f44537m;
                if (l4Var != null) {
                    l4Var.setPaused(!m4Var.f44538n);
                }
                m4Var.f44515a.isAttachedToWindow();
                int i10 = m4Var.f44554v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        org.telegram.messenger.ks.f(i10).n(m4Var.f44558x0, 67);
                    }
                    m4Var.f44554v0 = -1;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f34655a) {
            case 0:
                ga gaVar = (ga) this.f34657c;
                ca caVar = (ca) this.f34656b;
                if (caVar != null) {
                    ArrayList arrayList = caVar.d;
                    arrayList.remove(gaVar);
                    if (caVar.f33944e.isEmpty() && arrayList.isEmpty()) {
                        caVar.f33952n.o();
                    }
                }
                gaVar.f35443n = null;
                Paint paint = gaVar.h;
                gaVar.f35444o = null;
                paint.setShader(null);
                return;
            case 1:
                x5.release((View) this.f34656b, ((vy0) this.f34657c).f41488k);
                return;
            default:
                org.telegram.ui.Wallet.m4 m4Var = (org.telegram.ui.Wallet.m4) this.f34657c;
                org.telegram.ui.Cells.u0 u0Var = m4Var.f44515a;
                m4Var.f();
                m4Var.M = false;
                m4Var.N = 0L;
                m4Var.k();
                r1.g gVar = m4Var.Z;
                if (gVar != null) {
                    gVar.d();
                    m4Var.Z = null;
                }
                m4Var.f44516a0 = 1.0f;
                u0Var.invalidate();
                if (u0Var.getParent() instanceof View) {
                    ((View) u0Var.getParent()).invalidate();
                }
                m4Var.l();
                org.telegram.ui.Wallet.y6 y6Var = m4Var.f44533k;
                WeakHashMap weakHashMap = y6Var.f45315e;
                weakHashMap.remove((org.telegram.ui.Cells.u0) this.f34656b);
                if (weakHashMap.isEmpty()) {
                    y6Var.a();
                }
                u0Var.isAttachedToWindow();
                int i7 = m4Var.f44554v0;
                if (-1 != i7) {
                    if (i7 >= 0) {
                        org.telegram.messenger.ks.f(i7).n(m4Var.f44558x0, 67);
                    }
                    m4Var.f44554v0 = -1;
                }
                org.telegram.ui.Wallet.l4 l4Var = m4Var.f44537m;
                if (l4Var != null) {
                    l4Var.setPaused(true);
                }
                m4Var.f44535l.stop();
                m4Var.H = false;
                return;
        }
    }
}
