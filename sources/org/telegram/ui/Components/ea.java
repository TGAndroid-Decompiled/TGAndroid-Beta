package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class ea implements View.OnAttachStateChangeListener {
    public final int f34713a;
    public final Object f34714b;
    public final Object f34715c;

    public ea(int i7, Object obj, Object obj2) {
        this.f34713a = i7;
        this.f34715c = obj;
        this.f34714b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i7 = this.f34713a;
        Object obj = this.f34714b;
        Object obj2 = this.f34715c;
        switch (i7) {
            case 0:
                ca caVar = (ca) obj;
                if (caVar != null) {
                    caVar.d.add((ga) obj2);
                    return;
                }
                return;
            case 1:
                xy0 xy0Var = (xy0) obj2;
                xy0Var.f42260k = y5.update(xy0Var.f42261l, (View) obj, xy0Var.f42260k, xy0Var.f42253b);
                return;
            default:
                org.telegram.ui.Wallet.m4 m4Var = (org.telegram.ui.Wallet.m4) obj2;
                org.telegram.ui.Wallet.l4 l4Var = m4Var.f44577m;
                if (l4Var != null) {
                    l4Var.setPaused(!m4Var.f44578n);
                }
                m4Var.f44555a.isAttachedToWindow();
                int i10 = m4Var.f44594v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        org.telegram.messenger.ks.f(i10).n(m4Var.f44598x0, 67);
                    }
                    m4Var.f44594v0 = -1;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f34713a) {
            case 0:
                ga gaVar = (ga) this.f34715c;
                ca caVar = (ca) this.f34714b;
                if (caVar != null) {
                    ArrayList arrayList = caVar.d;
                    arrayList.remove(gaVar);
                    if (caVar.f34134e.isEmpty() && arrayList.isEmpty()) {
                        caVar.f34142n.o();
                    }
                }
                gaVar.f35479n = null;
                Paint paint = gaVar.h;
                gaVar.f35480o = null;
                paint.setShader(null);
                return;
            case 1:
                y5.release((View) this.f34714b, ((xy0) this.f34715c).f42260k);
                return;
            default:
                org.telegram.ui.Wallet.m4 m4Var = (org.telegram.ui.Wallet.m4) this.f34715c;
                org.telegram.ui.Cells.v0 v0Var = m4Var.f44555a;
                m4Var.f();
                m4Var.M = false;
                m4Var.N = 0L;
                m4Var.k();
                r1.g gVar = m4Var.Z;
                if (gVar != null) {
                    gVar.d();
                    m4Var.Z = null;
                }
                m4Var.f44556a0 = 1.0f;
                v0Var.invalidate();
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                }
                m4Var.l();
                org.telegram.ui.Wallet.y6 y6Var = m4Var.f44573k;
                WeakHashMap weakHashMap = y6Var.f45355e;
                weakHashMap.remove((org.telegram.ui.Cells.v0) this.f34714b);
                if (weakHashMap.isEmpty()) {
                    y6Var.a();
                }
                v0Var.isAttachedToWindow();
                int i7 = m4Var.f44594v0;
                if (-1 != i7) {
                    if (i7 >= 0) {
                        org.telegram.messenger.ks.f(i7).n(m4Var.f44598x0, 67);
                    }
                    m4Var.f44594v0 = -1;
                }
                org.telegram.ui.Wallet.l4 l4Var = m4Var.f44577m;
                if (l4Var != null) {
                    l4Var.setPaused(true);
                }
                m4Var.f44575l.stop();
                m4Var.H = false;
                return;
        }
    }
}
