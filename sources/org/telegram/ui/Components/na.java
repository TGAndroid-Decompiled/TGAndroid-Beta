package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class na implements View.OnAttachStateChangeListener {
    public final int f29134a;
    public final Object f29135b;
    public final Object f29136c;

    public na(int i10, Object obj, Object obj2) {
        this.f29134a = i10;
        this.f29136c = obj;
        this.f29135b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f29134a;
        Object obj = this.f29135b;
        Object obj2 = this.f29136c;
        switch (i10) {
            case 0:
                la laVar = (la) obj;
                if (laVar != null) {
                    laVar.d.add((pa) obj2);
                    return;
                }
                return;
            case 1:
                m11 m11Var = (m11) obj2;
                m11Var.f28684k = b6.update(m11Var.f28685l, (View) obj, m11Var.f28684k, m11Var.f28677b);
                return;
            default:
                org.telegram.ui.Wallet.f3 f3Var = (org.telegram.ui.Wallet.f3) obj2;
                org.telegram.ui.Wallet.e3 e3Var = f3Var.f34952m;
                if (e3Var != null) {
                    e3Var.setPaused(!f3Var.f34953n);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f29134a) {
            case 0:
                pa paVar = (pa) this.f29136c;
                la laVar = (la) this.f29135b;
                if (laVar != null) {
                    ArrayList arrayList = laVar.d;
                    arrayList.remove(paVar);
                    if (laVar.f28320e.isEmpty() && arrayList.isEmpty()) {
                        laVar.f28328n.a();
                    }
                }
                paVar.f29817n = null;
                Paint paint = paVar.h;
                paVar.f29818o = null;
                paint.setShader(null);
                return;
            case 1:
                b6.release((View) this.f29135b, ((m11) this.f29136c).f28684k);
                return;
            default:
                org.telegram.ui.Wallet.f3 f3Var = (org.telegram.ui.Wallet.f3) this.f29136c;
                f3Var.f();
                f3Var.M = false;
                f3Var.N = 0L;
                f3Var.k();
                o1.k kVar = f3Var.Z;
                if (kVar != null) {
                    kVar.c();
                    f3Var.Z = null;
                }
                f3Var.f34931a0 = 1.0f;
                org.telegram.ui.Cells.w0 w0Var = f3Var.f34930a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                }
                f3Var.l();
                org.telegram.ui.Wallet.n5 n5Var = f3Var.f34948k;
                WeakHashMap weakHashMap = n5Var.f35359e;
                weakHashMap.remove((org.telegram.ui.Cells.w0) this.f29135b);
                if (weakHashMap.isEmpty()) {
                    n5Var.a();
                }
                org.telegram.ui.Wallet.e3 e3Var = f3Var.f34952m;
                if (e3Var != null) {
                    e3Var.setPaused(true);
                }
                f3Var.f34950l.stop();
                f3Var.H = false;
                return;
        }
    }
}
