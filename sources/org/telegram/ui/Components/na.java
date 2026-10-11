package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class na implements View.OnAttachStateChangeListener {
    public final int f29022a;
    public final Object f29023b;
    public final Object f29024c;

    public na(int i10, Object obj, Object obj2) {
        this.f29022a = i10;
        this.f29024c = obj;
        this.f29023b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f29022a;
        Object obj = this.f29023b;
        Object obj2 = this.f29024c;
        switch (i10) {
            case 0:
                la laVar = (la) obj;
                if (laVar != null) {
                    laVar.d.add((pa) obj2);
                    return;
                }
                return;
            case 1:
                n11 n11Var = (n11) obj2;
                n11Var.f28908k = b6.update(n11Var.f28909l, (View) obj, n11Var.f28908k, n11Var.f28901b);
                return;
            default:
                org.telegram.ui.Wallet.f3 f3Var = (org.telegram.ui.Wallet.f3) obj2;
                org.telegram.ui.Wallet.e3 e3Var = f3Var.f34918m;
                if (e3Var != null) {
                    e3Var.setPaused(!f3Var.f34919n);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f29022a) {
            case 0:
                pa paVar = (pa) this.f29024c;
                la laVar = (la) this.f29023b;
                if (laVar != null) {
                    ArrayList arrayList = laVar.d;
                    arrayList.remove(paVar);
                    if (laVar.f28267e.isEmpty() && arrayList.isEmpty()) {
                        laVar.f28275n.a();
                    }
                }
                paVar.f29697n = null;
                Paint paint = paVar.h;
                paVar.f29698o = null;
                paint.setShader(null);
                return;
            case 1:
                b6.release((View) this.f29023b, ((n11) this.f29024c).f28908k);
                return;
            default:
                org.telegram.ui.Wallet.f3 f3Var = (org.telegram.ui.Wallet.f3) this.f29024c;
                f3Var.f();
                f3Var.M = false;
                f3Var.N = 0L;
                f3Var.k();
                o1.k kVar = f3Var.Z;
                if (kVar != null) {
                    kVar.c();
                    f3Var.Z = null;
                }
                f3Var.f34897a0 = 1.0f;
                org.telegram.ui.Cells.w0 w0Var = f3Var.f34896a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                }
                f3Var.l();
                org.telegram.ui.Wallet.n5 n5Var = f3Var.f34914k;
                WeakHashMap weakHashMap = n5Var.f35325e;
                weakHashMap.remove((org.telegram.ui.Cells.w0) this.f29023b);
                if (weakHashMap.isEmpty()) {
                    n5Var.a();
                }
                org.telegram.ui.Wallet.e3 e3Var = f3Var.f34918m;
                if (e3Var != null) {
                    e3Var.setPaused(true);
                }
                f3Var.f34916l.stop();
                f3Var.H = false;
                return;
        }
    }
}
