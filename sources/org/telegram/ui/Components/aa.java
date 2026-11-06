package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class aa implements View.OnAttachStateChangeListener {
    public final int f31750a;
    public final Object f31751b;
    public final Object f31752c;

    public aa(int i7, Object obj, Object obj2) {
        this.f31750a = i7;
        this.f31752c = obj;
        this.f31751b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i7 = this.f31750a;
        Object obj = this.f31751b;
        Object obj2 = this.f31752c;
        switch (i7) {
            case 0:
                y9 y9Var = (y9) obj;
                if (y9Var != null) {
                    y9Var.d.add((ca) obj2);
                    return;
                }
                return;
            case 1:
                my0 my0Var = (my0) obj2;
                my0Var.f36131k = r5.update(my0Var.f36132l, (View) obj, my0Var.f36131k, my0Var.f36124b);
                return;
            default:
                org.telegram.ui.Wallet.d4 d4Var = (org.telegram.ui.Wallet.d4) obj2;
                org.telegram.ui.Wallet.c4 c4Var = d4Var.f42359m;
                if (c4Var != null) {
                    c4Var.setPaused(!d4Var.f42360n);
                }
                d4Var.f42337a.isAttachedToWindow();
                int i10 = d4Var.f42376v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        org.telegram.messenger.qs.f(i10).n(d4Var.f42380x0, 67);
                    }
                    d4Var.f42376v0 = -1;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f31750a) {
            case 0:
                ca caVar = (ca) this.f31752c;
                y9 y9Var = (y9) this.f31751b;
                if (y9Var != null) {
                    ArrayList arrayList = y9Var.d;
                    arrayList.remove(caVar);
                    if (y9Var.f40602e.isEmpty() && arrayList.isEmpty()) {
                        y9Var.f40610n.o();
                    }
                }
                caVar.f32481n = null;
                Paint paint = caVar.h;
                caVar.f32482o = null;
                paint.setShader(null);
                return;
            case 1:
                r5.release((View) this.f31751b, ((my0) this.f31752c).f36131k);
                return;
            default:
                org.telegram.ui.Wallet.d4 d4Var = (org.telegram.ui.Wallet.d4) this.f31752c;
                org.telegram.ui.Cells.t0 t0Var = d4Var.f42337a;
                d4Var.f();
                d4Var.M = false;
                d4Var.N = 0L;
                d4Var.k();
                r1.g gVar = d4Var.Z;
                if (gVar != null) {
                    gVar.d();
                    d4Var.Z = null;
                }
                d4Var.f42338a0 = 1.0f;
                t0Var.invalidate();
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                }
                d4Var.l();
                org.telegram.ui.Wallet.i6 i6Var = d4Var.f42355k;
                WeakHashMap weakHashMap = i6Var.f42616e;
                weakHashMap.remove((org.telegram.ui.Cells.t0) this.f31751b);
                if (weakHashMap.isEmpty()) {
                    i6Var.a();
                }
                t0Var.isAttachedToWindow();
                int i7 = d4Var.f42376v0;
                if (-1 != i7) {
                    if (i7 >= 0) {
                        org.telegram.messenger.qs.f(i7).n(d4Var.f42380x0, 67);
                    }
                    d4Var.f42376v0 = -1;
                }
                org.telegram.ui.Wallet.c4 c4Var = d4Var.f42359m;
                if (c4Var != null) {
                    c4Var.setPaused(true);
                }
                d4Var.f42357l.stop();
                d4Var.H = false;
                return;
        }
    }
}
