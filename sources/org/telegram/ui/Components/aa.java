package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class aa implements View.OnAttachStateChangeListener {
    public final int f31754a;
    public final Object f31755b;
    public final Object f31756c;

    public aa(int i7, Object obj, Object obj2) {
        this.f31754a = i7;
        this.f31756c = obj;
        this.f31755b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i7 = this.f31754a;
        Object obj = this.f31755b;
        Object obj2 = this.f31756c;
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
                ly0Var.f35788k = r5.update(ly0Var.f35789l, (View) obj, ly0Var.f35788k, ly0Var.f35781b);
                return;
            default:
                org.telegram.ui.Wallet.d4 d4Var = (org.telegram.ui.Wallet.d4) obj2;
                org.telegram.ui.Wallet.c4 c4Var = d4Var.f42360m;
                if (c4Var != null) {
                    c4Var.setPaused(!d4Var.f42361n);
                }
                d4Var.f42338a.isAttachedToWindow();
                int i10 = d4Var.f42377v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        org.telegram.messenger.qs.f(i10).n(d4Var.f42381x0, 67);
                    }
                    d4Var.f42377v0 = -1;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f31754a) {
            case 0:
                ca caVar = (ca) this.f31756c;
                y9 y9Var = (y9) this.f31755b;
                if (y9Var != null) {
                    ArrayList arrayList = y9Var.d;
                    arrayList.remove(caVar);
                    if (y9Var.f40590e.isEmpty() && arrayList.isEmpty()) {
                        y9Var.f40598n.o();
                    }
                }
                caVar.f32494n = null;
                Paint paint = caVar.h;
                caVar.f32495o = null;
                paint.setShader(null);
                return;
            case 1:
                r5.release((View) this.f31755b, ((ly0) this.f31756c).f35788k);
                return;
            default:
                org.telegram.ui.Wallet.d4 d4Var = (org.telegram.ui.Wallet.d4) this.f31756c;
                org.telegram.ui.Cells.t0 t0Var = d4Var.f42338a;
                d4Var.f();
                d4Var.M = false;
                d4Var.N = 0L;
                d4Var.k();
                r1.g gVar = d4Var.Z;
                if (gVar != null) {
                    gVar.d();
                    d4Var.Z = null;
                }
                d4Var.f42339a0 = 1.0f;
                t0Var.invalidate();
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                }
                d4Var.l();
                org.telegram.ui.Wallet.i6 i6Var = d4Var.f42356k;
                WeakHashMap weakHashMap = i6Var.f42617e;
                weakHashMap.remove((org.telegram.ui.Cells.t0) this.f31755b);
                if (weakHashMap.isEmpty()) {
                    i6Var.a();
                }
                t0Var.isAttachedToWindow();
                int i7 = d4Var.f42377v0;
                if (-1 != i7) {
                    if (i7 >= 0) {
                        org.telegram.messenger.qs.f(i7).n(d4Var.f42381x0, 67);
                    }
                    d4Var.f42377v0 = -1;
                }
                org.telegram.ui.Wallet.c4 c4Var = d4Var.f42360m;
                if (c4Var != null) {
                    c4Var.setPaused(true);
                }
                d4Var.f42358l.stop();
                d4Var.H = false;
                return;
        }
    }
}
