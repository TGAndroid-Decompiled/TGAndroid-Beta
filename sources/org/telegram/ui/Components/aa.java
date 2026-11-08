package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class aa implements View.OnAttachStateChangeListener {
    public final int f31759a;
    public final Object f31760b;
    public final Object f31761c;

    public aa(int i7, Object obj, Object obj2) {
        this.f31759a = i7;
        this.f31761c = obj;
        this.f31760b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i7 = this.f31759a;
        Object obj = this.f31760b;
        Object obj2 = this.f31761c;
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
                my0Var.f36153k = r5.update(my0Var.f36154l, (View) obj, my0Var.f36153k, my0Var.f36146b);
                return;
            default:
                org.telegram.ui.Wallet.c4 c4Var = (org.telegram.ui.Wallet.c4) obj2;
                org.telegram.ui.Wallet.b4 b4Var = c4Var.f42330m;
                if (b4Var != null) {
                    b4Var.setPaused(!c4Var.f42331n);
                }
                c4Var.f42308a.isAttachedToWindow();
                int i10 = c4Var.f42347v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        org.telegram.messenger.qs.f(i10).n(c4Var.f42351x0, 67);
                    }
                    c4Var.f42347v0 = -1;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f31759a) {
            case 0:
                ca caVar = (ca) this.f31761c;
                y9 y9Var = (y9) this.f31760b;
                if (y9Var != null) {
                    ArrayList arrayList = y9Var.d;
                    arrayList.remove(caVar);
                    if (y9Var.f40628e.isEmpty() && arrayList.isEmpty()) {
                        y9Var.f40636n.o();
                    }
                }
                caVar.f32512n = null;
                Paint paint = caVar.h;
                caVar.f32513o = null;
                paint.setShader(null);
                return;
            case 1:
                r5.release((View) this.f31760b, ((my0) this.f31761c).f36153k);
                return;
            default:
                org.telegram.ui.Wallet.c4 c4Var = (org.telegram.ui.Wallet.c4) this.f31761c;
                org.telegram.ui.Cells.t0 t0Var = c4Var.f42308a;
                c4Var.f();
                c4Var.M = false;
                c4Var.N = 0L;
                c4Var.k();
                r1.g gVar = c4Var.Z;
                if (gVar != null) {
                    gVar.d();
                    c4Var.Z = null;
                }
                c4Var.f42309a0 = 1.0f;
                t0Var.invalidate();
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                }
                c4Var.l();
                org.telegram.ui.Wallet.h6 h6Var = c4Var.f42326k;
                WeakHashMap weakHashMap = h6Var.f42587e;
                weakHashMap.remove((org.telegram.ui.Cells.t0) this.f31760b);
                if (weakHashMap.isEmpty()) {
                    h6Var.a();
                }
                t0Var.isAttachedToWindow();
                int i7 = c4Var.f42347v0;
                if (-1 != i7) {
                    if (i7 >= 0) {
                        org.telegram.messenger.qs.f(i7).n(c4Var.f42351x0, 67);
                    }
                    c4Var.f42347v0 = -1;
                }
                org.telegram.ui.Wallet.b4 b4Var = c4Var.f42330m;
                if (b4Var != null) {
                    b4Var.setPaused(true);
                }
                c4Var.f42328l.stop();
                c4Var.H = false;
                return;
        }
    }
}
