package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class aa implements View.OnAttachStateChangeListener {
    public final int f31755a;
    public final Object f31756b;
    public final Object f31757c;

    public aa(int i7, Object obj, Object obj2) {
        this.f31755a = i7;
        this.f31757c = obj;
        this.f31756b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i7 = this.f31755a;
        Object obj = this.f31756b;
        Object obj2 = this.f31757c;
        switch (i7) {
            case 0:
                y9 y9Var = (y9) obj;
                if (y9Var != null) {
                    y9Var.d.add((ca) obj2);
                    return;
                }
                return;
            case 1:
                ny0 ny0Var = (ny0) obj2;
                ny0Var.f36547k = r5.update(ny0Var.f36548l, (View) obj, ny0Var.f36547k, ny0Var.f36540b);
                return;
            default:
                org.telegram.ui.Wallet.b4 b4Var = (org.telegram.ui.Wallet.b4) obj2;
                org.telegram.ui.Wallet.a4 a4Var = b4Var.f42244m;
                if (a4Var != null) {
                    a4Var.setPaused(!b4Var.f42245n);
                }
                b4Var.f42222a.isAttachedToWindow();
                int i10 = b4Var.f42261v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        org.telegram.messenger.qs.f(i10).n(b4Var.f42265x0, 67);
                    }
                    b4Var.f42261v0 = -1;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f31755a) {
            case 0:
                ca caVar = (ca) this.f31757c;
                y9 y9Var = (y9) this.f31756b;
                if (y9Var != null) {
                    ArrayList arrayList = y9Var.d;
                    arrayList.remove(caVar);
                    if (y9Var.f40674e.isEmpty() && arrayList.isEmpty()) {
                        y9Var.f40682n.o();
                    }
                }
                caVar.f32609n = null;
                Paint paint = caVar.h;
                caVar.f32610o = null;
                paint.setShader(null);
                return;
            case 1:
                r5.release((View) this.f31756b, ((ny0) this.f31757c).f36547k);
                return;
            default:
                org.telegram.ui.Wallet.b4 b4Var = (org.telegram.ui.Wallet.b4) this.f31757c;
                org.telegram.ui.Cells.t0 t0Var = b4Var.f42222a;
                b4Var.f();
                b4Var.M = false;
                b4Var.N = 0L;
                b4Var.k();
                r1.g gVar = b4Var.Z;
                if (gVar != null) {
                    gVar.d();
                    b4Var.Z = null;
                }
                b4Var.f42223a0 = 1.0f;
                t0Var.invalidate();
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                }
                b4Var.l();
                org.telegram.ui.Wallet.g6 g6Var = b4Var.f42240k;
                WeakHashMap weakHashMap = g6Var.f42506e;
                weakHashMap.remove((org.telegram.ui.Cells.t0) this.f31756b);
                if (weakHashMap.isEmpty()) {
                    g6Var.a();
                }
                t0Var.isAttachedToWindow();
                int i7 = b4Var.f42261v0;
                if (-1 != i7) {
                    if (i7 >= 0) {
                        org.telegram.messenger.qs.f(i7).n(b4Var.f42265x0, 67);
                    }
                    b4Var.f42261v0 = -1;
                }
                org.telegram.ui.Wallet.a4 a4Var = b4Var.f42244m;
                if (a4Var != null) {
                    a4Var.setPaused(true);
                }
                b4Var.f42242l.stop();
                b4Var.H = false;
                return;
        }
    }
}
