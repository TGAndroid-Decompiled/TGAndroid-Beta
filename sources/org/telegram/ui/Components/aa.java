package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class aa implements View.OnAttachStateChangeListener {
    public final int f31742a;
    public final Object f31743b;
    public final Object f31744c;

    public aa(int i7, Object obj, Object obj2) {
        this.f31742a = i7;
        this.f31744c = obj;
        this.f31743b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i7 = this.f31742a;
        Object obj = this.f31743b;
        Object obj2 = this.f31744c;
        switch (i7) {
            case 0:
                y9 y9Var = (y9) obj;
                if (y9Var != null) {
                    y9Var.d.add((ca) obj2);
                    return;
                }
                return;
            case 1:
                ly0 ly0Var = (ly0) obj2;
                ly0Var.f35783k = r5.update(ly0Var.f35784l, (View) obj, ly0Var.f35783k, ly0Var.f35776b);
                return;
            default:
                org.telegram.ui.Wallet.d4 d4Var = (org.telegram.ui.Wallet.d4) obj2;
                org.telegram.ui.Wallet.c4 c4Var = d4Var.f42335m;
                if (c4Var != null) {
                    c4Var.setPaused(!d4Var.f42336n);
                }
                d4Var.f42313a.isAttachedToWindow();
                int i10 = d4Var.f42352v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        org.telegram.messenger.qs.f(i10).n(d4Var.f42356x0, 67);
                    }
                    d4Var.f42352v0 = -1;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f31742a) {
            case 0:
                ca caVar = (ca) this.f31744c;
                y9 y9Var = (y9) this.f31743b;
                if (y9Var != null) {
                    ArrayList arrayList = y9Var.d;
                    arrayList.remove(caVar);
                    if (y9Var.f40571e.isEmpty() && arrayList.isEmpty()) {
                        y9Var.f40579n.o();
                    }
                }
                caVar.f32490n = null;
                Paint paint = caVar.h;
                caVar.f32491o = null;
                paint.setShader(null);
                return;
            case 1:
                r5.release((View) this.f31743b, ((ly0) this.f31744c).f35783k);
                return;
            default:
                org.telegram.ui.Wallet.d4 d4Var = (org.telegram.ui.Wallet.d4) this.f31744c;
                org.telegram.ui.Cells.t0 t0Var = d4Var.f42313a;
                d4Var.f();
                d4Var.M = false;
                d4Var.N = 0L;
                d4Var.k();
                r1.g gVar = d4Var.Z;
                if (gVar != null) {
                    gVar.d();
                    d4Var.Z = null;
                }
                d4Var.f42314a0 = 1.0f;
                t0Var.invalidate();
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                }
                d4Var.l();
                org.telegram.ui.Wallet.i6 i6Var = d4Var.f42331k;
                WeakHashMap weakHashMap = i6Var.f42592e;
                weakHashMap.remove((org.telegram.ui.Cells.t0) this.f31743b);
                if (weakHashMap.isEmpty()) {
                    i6Var.a();
                }
                t0Var.isAttachedToWindow();
                int i7 = d4Var.f42352v0;
                if (-1 != i7) {
                    if (i7 >= 0) {
                        org.telegram.messenger.qs.f(i7).n(d4Var.f42356x0, 67);
                    }
                    d4Var.f42352v0 = -1;
                }
                org.telegram.ui.Wallet.c4 c4Var = d4Var.f42335m;
                if (c4Var != null) {
                    c4Var.setPaused(true);
                }
                d4Var.f42333l.stop();
                d4Var.H = false;
                return;
        }
    }
}
