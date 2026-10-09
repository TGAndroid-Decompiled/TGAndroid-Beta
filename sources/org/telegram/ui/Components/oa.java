package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class oa implements View.OnAttachStateChangeListener {
    public final int f29437a;
    public final Object f29438b;
    public final Object f29439c;

    public oa(int i10, Object obj, Object obj2) {
        this.f29437a = i10;
        this.f29439c = obj;
        this.f29438b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f29437a;
        Object obj = this.f29438b;
        Object obj2 = this.f29439c;
        switch (i10) {
            case 0:
                ma maVar = (ma) obj;
                if (maVar != null) {
                    maVar.d.add((qa) obj2);
                    return;
                }
                return;
            case 1:
                l11 l11Var = (l11) obj2;
                l11Var.f28228k = b6.update(l11Var.f28229l, (View) obj, l11Var.f28228k, l11Var.f28221b);
                return;
            default:
                org.telegram.ui.Wallet.d3 d3Var = (org.telegram.ui.Wallet.d3) obj2;
                org.telegram.ui.Wallet.c3 c3Var = d3Var.f34795m;
                if (c3Var != null) {
                    c3Var.setPaused(!d3Var.f34796n);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f29437a) {
            case 0:
                qa qaVar = (qa) this.f29439c;
                ma maVar = (ma) this.f29438b;
                if (maVar != null) {
                    ArrayList arrayList = maVar.d;
                    arrayList.remove(qaVar);
                    if (maVar.f28790e.isEmpty() && arrayList.isEmpty()) {
                        maVar.f28798n.a();
                    }
                }
                qaVar.f30128n = null;
                Paint paint = qaVar.h;
                qaVar.f30129o = null;
                paint.setShader(null);
                return;
            case 1:
                b6.release((View) this.f29438b, ((l11) this.f29439c).f28228k);
                return;
            default:
                org.telegram.ui.Wallet.d3 d3Var = (org.telegram.ui.Wallet.d3) this.f29439c;
                d3Var.f();
                d3Var.M = false;
                d3Var.N = 0L;
                d3Var.k();
                o1.k kVar = d3Var.Z;
                if (kVar != null) {
                    kVar.c();
                    d3Var.Z = null;
                }
                d3Var.f34774a0 = 1.0f;
                org.telegram.ui.Cells.w0 w0Var = d3Var.f34773a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                }
                d3Var.l();
                org.telegram.ui.Wallet.l5 l5Var = d3Var.f34791k;
                WeakHashMap weakHashMap = l5Var.f35199e;
                weakHashMap.remove((org.telegram.ui.Cells.w0) this.f29438b);
                if (weakHashMap.isEmpty()) {
                    l5Var.a();
                }
                org.telegram.ui.Wallet.c3 c3Var = d3Var.f34795m;
                if (c3Var != null) {
                    c3Var.setPaused(true);
                }
                d3Var.f34793l.stop();
                d3Var.H = false;
                return;
        }
    }
}
