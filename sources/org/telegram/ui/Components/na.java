package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class na implements View.OnAttachStateChangeListener {
    public final int f27643a;
    public final Object f27644b;
    public final Object f27645c;

    public na(int i10, Object obj, Object obj2) {
        this.f27643a = i10;
        this.f27645c = obj;
        this.f27644b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f27643a;
        Object obj = this.f27644b;
        Object obj2 = this.f27645c;
        switch (i10) {
            case 0:
                la laVar = (la) obj;
                if (laVar != null) {
                    laVar.d.add((pa) obj2);
                    return;
                }
                return;
            case 1:
                h11 h11Var = (h11) obj2;
                h11Var.f25478k = b6.update(h11Var.f25479l, (View) obj, h11Var.f25478k, h11Var.f25472b);
                return;
            default:
                org.telegram.ui.Wallet.d3 d3Var = (org.telegram.ui.Wallet.d3) obj2;
                org.telegram.ui.Wallet.c3 c3Var = d3Var.f33066m;
                if (c3Var != null) {
                    c3Var.setPaused(!d3Var.f33067n);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f27643a) {
            case 0:
                pa paVar = (pa) this.f27645c;
                la laVar = (la) this.f27644b;
                if (laVar != null) {
                    ArrayList arrayList = laVar.d;
                    arrayList.remove(paVar);
                    if (laVar.e.isEmpty() && arrayList.isEmpty()) {
                        laVar.f27011n.a();
                    }
                }
                paVar.f28267n = null;
                Paint paint = paVar.h;
                paVar.f28268o = null;
                paint.setShader(null);
                return;
            case 1:
                b6.release((View) this.f27644b, ((h11) this.f27645c).f25478k);
                return;
            default:
                org.telegram.ui.Wallet.d3 d3Var = (org.telegram.ui.Wallet.d3) this.f27645c;
                d3Var.f();
                d3Var.M = false;
                d3Var.N = 0L;
                d3Var.k();
                o1.k kVar = d3Var.Z;
                if (kVar != null) {
                    kVar.c();
                    d3Var.Z = null;
                }
                d3Var.f33046a0 = 1.0f;
                org.telegram.ui.Cells.x0 x0Var = d3Var.f33045a;
                x0Var.invalidate();
                if (x0Var.getParent() instanceof View) {
                    ((View) x0Var.getParent()).invalidate();
                }
                d3Var.l();
                org.telegram.ui.Wallet.k5 k5Var = d3Var.f33062k;
                WeakHashMap weakHashMap = k5Var.e;
                weakHashMap.remove((org.telegram.ui.Cells.x0) this.f27644b);
                if (weakHashMap.isEmpty()) {
                    k5Var.a();
                }
                org.telegram.ui.Wallet.c3 c3Var = d3Var.f33066m;
                if (c3Var != null) {
                    c3Var.setPaused(true);
                }
                d3Var.f33064l.stop();
                d3Var.H = false;
                return;
        }
    }
}
