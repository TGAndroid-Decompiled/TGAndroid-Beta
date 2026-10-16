package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class na implements View.OnAttachStateChangeListener {
    public final int f27329a;
    public final Object f27330b;
    public final Object f27331c;

    public na(int i10, Object obj, Object obj2) {
        this.f27329a = i10;
        this.f27331c = obj;
        this.f27330b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f27329a;
        Object obj = this.f27330b;
        Object obj2 = this.f27331c;
        switch (i10) {
            case 0:
                la laVar = (la) obj;
                if (laVar != null) {
                    laVar.d.add((pa) obj2);
                    return;
                }
                return;
            case 1:
                i11 i11Var = (i11) obj2;
                i11Var.f25460k = b6.update(i11Var.f25461l, (View) obj, i11Var.f25460k, i11Var.f25454b);
                return;
            default:
                org.telegram.ui.Wallet.e3 e3Var = (org.telegram.ui.Wallet.e3) obj2;
                org.telegram.ui.Wallet.d3 d3Var = e3Var.f32843m;
                if (d3Var != null) {
                    d3Var.setPaused(!e3Var.f32844n);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f27329a) {
            case 0:
                pa paVar = (pa) this.f27331c;
                la laVar = (la) this.f27330b;
                if (laVar != null) {
                    ArrayList arrayList = laVar.d;
                    arrayList.remove(paVar);
                    if (laVar.e.isEmpty() && arrayList.isEmpty()) {
                        laVar.f26711n.a();
                    }
                }
                paVar.f27948n = null;
                Paint paint = paVar.h;
                paVar.f27949o = null;
                paint.setShader(null);
                return;
            case 1:
                b6.release((View) this.f27330b, ((i11) this.f27331c).f25460k);
                return;
            default:
                org.telegram.ui.Wallet.e3 e3Var = (org.telegram.ui.Wallet.e3) this.f27331c;
                e3Var.f();
                e3Var.M = false;
                e3Var.N = 0L;
                e3Var.k();
                o1.k kVar = e3Var.Z;
                if (kVar != null) {
                    kVar.c();
                    e3Var.Z = null;
                }
                e3Var.f32823a0 = 1.0f;
                org.telegram.ui.Cells.w0 w0Var = e3Var.f32822a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                }
                e3Var.l();
                org.telegram.ui.Wallet.m5 m5Var = e3Var.f32839k;
                WeakHashMap weakHashMap = m5Var.e;
                weakHashMap.remove((org.telegram.ui.Cells.w0) this.f27330b);
                if (weakHashMap.isEmpty()) {
                    m5Var.a();
                }
                org.telegram.ui.Wallet.d3 d3Var = e3Var.f32843m;
                if (d3Var != null) {
                    d3Var.setPaused(true);
                }
                e3Var.f32841l.stop();
                e3Var.H = false;
                return;
        }
    }
}
