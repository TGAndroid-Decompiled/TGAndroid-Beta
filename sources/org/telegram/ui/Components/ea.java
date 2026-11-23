package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class ea implements View.OnAttachStateChangeListener {
    public final int f34711a;
    public final Object f34712b;
    public final Object f34713c;

    public ea(int i7, Object obj, Object obj2) {
        this.f34711a = i7;
        this.f34713c = obj;
        this.f34712b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i7 = this.f34711a;
        Object obj = this.f34712b;
        Object obj2 = this.f34713c;
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
                xy0Var.f42253k = y5.update(xy0Var.f42254l, (View) obj, xy0Var.f42253k, xy0Var.f42246b);
                return;
            default:
                org.telegram.ui.Wallet.m4 m4Var = (org.telegram.ui.Wallet.m4) obj2;
                org.telegram.ui.Wallet.l4 l4Var = m4Var.f44581m;
                if (l4Var != null) {
                    l4Var.setPaused(!m4Var.f44582n);
                }
                m4Var.f44559a.isAttachedToWindow();
                int i10 = m4Var.f44598v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        org.telegram.messenger.ls.f(i10).n(m4Var.f44602x0, 67);
                    }
                    m4Var.f44598v0 = -1;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f34711a) {
            case 0:
                ga gaVar = (ga) this.f34713c;
                ca caVar = (ca) this.f34712b;
                if (caVar != null) {
                    ArrayList arrayList = caVar.d;
                    arrayList.remove(gaVar);
                    if (caVar.f34128e.isEmpty() && arrayList.isEmpty()) {
                        caVar.f34136n.o();
                    }
                }
                gaVar.f35498n = null;
                Paint paint = gaVar.h;
                gaVar.f35499o = null;
                paint.setShader(null);
                return;
            case 1:
                y5.release((View) this.f34712b, ((xy0) this.f34713c).f42253k);
                return;
            default:
                org.telegram.ui.Wallet.m4 m4Var = (org.telegram.ui.Wallet.m4) this.f34713c;
                org.telegram.ui.Cells.v0 v0Var = m4Var.f44559a;
                m4Var.f();
                m4Var.M = false;
                m4Var.N = 0L;
                m4Var.k();
                r1.g gVar = m4Var.Z;
                if (gVar != null) {
                    gVar.d();
                    m4Var.Z = null;
                }
                m4Var.f44560a0 = 1.0f;
                v0Var.invalidate();
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                }
                m4Var.l();
                org.telegram.ui.Wallet.y6 y6Var = m4Var.f44577k;
                WeakHashMap weakHashMap = y6Var.f45359e;
                weakHashMap.remove((org.telegram.ui.Cells.v0) this.f34712b);
                if (weakHashMap.isEmpty()) {
                    y6Var.a();
                }
                v0Var.isAttachedToWindow();
                int i7 = m4Var.f44598v0;
                if (-1 != i7) {
                    if (i7 >= 0) {
                        org.telegram.messenger.ls.f(i7).n(m4Var.f44602x0, 67);
                    }
                    m4Var.f44598v0 = -1;
                }
                org.telegram.ui.Wallet.l4 l4Var = m4Var.f44581m;
                if (l4Var != null) {
                    l4Var.setPaused(true);
                }
                m4Var.f44579l.stop();
                m4Var.H = false;
                return;
        }
    }
}
