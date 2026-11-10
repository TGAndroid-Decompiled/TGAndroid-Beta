package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class z9 implements View.OnAttachStateChangeListener {
    public final int f40897a;
    public final Object f40898b;
    public final Object f40899c;

    public z9(int i7, Object obj, Object obj2) {
        this.f40897a = i7;
        this.f40899c = obj;
        this.f40898b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i7 = this.f40897a;
        Object obj = this.f40898b;
        Object obj2 = this.f40899c;
        switch (i7) {
            case 0:
                x9 x9Var = (x9) obj;
                if (x9Var != null) {
                    x9Var.d.add((ba) obj2);
                    return;
                }
                return;
            case 1:
                my0 my0Var = (my0) obj2;
                my0Var.f36139k = q5.update(my0Var.f36140l, (View) obj, my0Var.f36139k, my0Var.f36132b);
                return;
            default:
                org.telegram.ui.Wallet.d4 d4Var = (org.telegram.ui.Wallet.d4) obj2;
                org.telegram.ui.Wallet.c4 c4Var = d4Var.f42324m;
                if (c4Var != null) {
                    c4Var.setPaused(!d4Var.f42325n);
                }
                d4Var.f42302a.isAttachedToWindow();
                int i10 = d4Var.f42341v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        org.telegram.messenger.qs.f(i10).n(d4Var.f42345x0, 67);
                    }
                    d4Var.f42341v0 = -1;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f40897a) {
            case 0:
                ba baVar = (ba) this.f40899c;
                x9 x9Var = (x9) this.f40898b;
                if (x9Var != null) {
                    ArrayList arrayList = x9Var.d;
                    arrayList.remove(baVar);
                    if (x9Var.f40261e.isEmpty() && arrayList.isEmpty()) {
                        x9Var.f40269n.o();
                    }
                }
                baVar.f32185n = null;
                Paint paint = baVar.h;
                baVar.f32186o = null;
                paint.setShader(null);
                return;
            case 1:
                q5.release((View) this.f40898b, ((my0) this.f40899c).f36139k);
                return;
            default:
                org.telegram.ui.Wallet.d4 d4Var = (org.telegram.ui.Wallet.d4) this.f40899c;
                org.telegram.ui.Cells.t0 t0Var = d4Var.f42302a;
                d4Var.f();
                d4Var.M = false;
                d4Var.N = 0L;
                d4Var.k();
                r1.g gVar = d4Var.Z;
                if (gVar != null) {
                    gVar.d();
                    d4Var.Z = null;
                }
                d4Var.f42303a0 = 1.0f;
                t0Var.invalidate();
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                }
                d4Var.l();
                org.telegram.ui.Wallet.j6 j6Var = d4Var.f42320k;
                WeakHashMap weakHashMap = j6Var.f42680e;
                weakHashMap.remove((org.telegram.ui.Cells.t0) this.f40898b);
                if (weakHashMap.isEmpty()) {
                    j6Var.a();
                }
                t0Var.isAttachedToWindow();
                int i7 = d4Var.f42341v0;
                if (-1 != i7) {
                    if (i7 >= 0) {
                        org.telegram.messenger.qs.f(i7).n(d4Var.f42345x0, 67);
                    }
                    d4Var.f42341v0 = -1;
                }
                org.telegram.ui.Wallet.c4 c4Var = d4Var.f42324m;
                if (c4Var != null) {
                    c4Var.setPaused(true);
                }
                d4Var.f42322l.stop();
                d4Var.H = false;
                return;
        }
    }
}
