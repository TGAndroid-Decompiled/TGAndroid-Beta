package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class na implements View.OnAttachStateChangeListener {
    public final int f28762a;
    public final Object f28763b;
    public final Object f28764c;

    public na(int i10, Object obj, Object obj2) {
        this.f28762a = i10;
        this.f28764c = obj;
        this.f28763b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f28762a;
        Object obj = this.f28763b;
        Object obj2 = this.f28764c;
        switch (i10) {
            case 0:
                la laVar = (la) obj;
                if (laVar != null) {
                    laVar.d.add((pa) obj2);
                    return;
                }
                return;
            case 1:
                r11 r11Var = (r11) obj2;
                r11Var.f29994k = b6.update(r11Var.f29995l, (View) obj, r11Var.f29994k, r11Var.f29987b);
                return;
            default:
                org.telegram.ui.Wallet.f3 f3Var = (org.telegram.ui.Wallet.f3) obj2;
                org.telegram.ui.Wallet.e3 e3Var = f3Var.f34727m;
                if (e3Var != null) {
                    e3Var.setPaused(!f3Var.f34728n);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f28762a) {
            case 0:
                pa paVar = (pa) this.f28764c;
                la laVar = (la) this.f28763b;
                if (laVar != null) {
                    ArrayList arrayList = laVar.d;
                    arrayList.remove(paVar);
                    if (laVar.f28135e.isEmpty() && arrayList.isEmpty()) {
                        laVar.f28143n.a();
                    }
                }
                paVar.f29467n = null;
                Paint paint = paVar.h;
                paVar.f29468o = null;
                paint.setShader(null);
                return;
            case 1:
                b6.release((View) this.f28763b, ((r11) this.f28764c).f29994k);
                return;
            default:
                org.telegram.ui.Wallet.f3 f3Var = (org.telegram.ui.Wallet.f3) this.f28764c;
                f3Var.f();
                f3Var.M = false;
                f3Var.N = 0L;
                f3Var.k();
                o1.k kVar = f3Var.Z;
                if (kVar != null) {
                    kVar.c();
                    f3Var.Z = null;
                }
                f3Var.f34706a0 = 1.0f;
                org.telegram.ui.Cells.w0 w0Var = f3Var.f34705a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                }
                f3Var.l();
                org.telegram.ui.Wallet.o5 o5Var = f3Var.f34723k;
                WeakHashMap weakHashMap = o5Var.f35167e;
                weakHashMap.remove((org.telegram.ui.Cells.w0) this.f28763b);
                if (weakHashMap.isEmpty()) {
                    o5Var.a();
                }
                org.telegram.ui.Wallet.e3 e3Var = f3Var.f34727m;
                if (e3Var != null) {
                    e3Var.setPaused(true);
                }
                f3Var.f34725l.stop();
                f3Var.H = false;
                return;
        }
    }
}
