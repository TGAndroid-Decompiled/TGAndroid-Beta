package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class oa implements View.OnAttachStateChangeListener {
    public final int f29428a;
    public final Object f29429b;
    public final Object f29430c;

    public oa(int i10, Object obj, Object obj2) {
        this.f29428a = i10;
        this.f29430c = obj;
        this.f29429b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f29428a;
        Object obj = this.f29429b;
        Object obj2 = this.f29430c;
        switch (i10) {
            case 0:
                ma maVar = (ma) obj;
                if (maVar != null) {
                    maVar.d.add((qa) obj2);
                    return;
                }
                return;
            case 1:
                m11 m11Var = (m11) obj2;
                m11Var.f28608k = b6.update(m11Var.f28609l, (View) obj, m11Var.f28608k, m11Var.f28601b);
                return;
            default:
                org.telegram.ui.Wallet.e3 e3Var = (org.telegram.ui.Wallet.e3) obj2;
                org.telegram.ui.Wallet.d3 d3Var = e3Var.f34886m;
                if (d3Var != null) {
                    d3Var.setPaused(!e3Var.f34887n);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f29428a) {
            case 0:
                qa qaVar = (qa) this.f29430c;
                ma maVar = (ma) this.f29429b;
                if (maVar != null) {
                    ArrayList arrayList = maVar.d;
                    arrayList.remove(qaVar);
                    if (maVar.f28740e.isEmpty() && arrayList.isEmpty()) {
                        maVar.f28748n.a();
                    }
                }
                qaVar.f30152n = null;
                Paint paint = qaVar.h;
                qaVar.f30153o = null;
                paint.setShader(null);
                return;
            case 1:
                b6.release((View) this.f29429b, ((m11) this.f29430c).f28608k);
                return;
            default:
                org.telegram.ui.Wallet.e3 e3Var = (org.telegram.ui.Wallet.e3) this.f29430c;
                e3Var.f();
                e3Var.M = false;
                e3Var.N = 0L;
                e3Var.k();
                o1.k kVar = e3Var.Z;
                if (kVar != null) {
                    kVar.c();
                    e3Var.Z = null;
                }
                e3Var.f34865a0 = 1.0f;
                org.telegram.ui.Cells.w0 w0Var = e3Var.f34864a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                }
                e3Var.l();
                org.telegram.ui.Wallet.m5 m5Var = e3Var.f34882k;
                WeakHashMap weakHashMap = m5Var.f35295e;
                weakHashMap.remove((org.telegram.ui.Cells.w0) this.f29429b);
                if (weakHashMap.isEmpty()) {
                    m5Var.a();
                }
                org.telegram.ui.Wallet.d3 d3Var = e3Var.f34886m;
                if (d3Var != null) {
                    d3Var.setPaused(true);
                }
                e3Var.f34884l.stop();
                e3Var.H = false;
                return;
        }
    }
}
