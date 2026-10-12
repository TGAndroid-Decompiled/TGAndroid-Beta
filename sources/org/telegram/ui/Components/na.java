package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class na implements View.OnAttachStateChangeListener {
    public final int f28751a;
    public final Object f28752b;
    public final Object f28753c;

    public na(int i10, Object obj, Object obj2) {
        this.f28751a = i10;
        this.f28753c = obj;
        this.f28752b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f28751a;
        Object obj = this.f28752b;
        Object obj2 = this.f28753c;
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
                r11Var.f29995k = b6.update(r11Var.f29996l, (View) obj, r11Var.f29995k, r11Var.f29988b);
                return;
            default:
                org.telegram.ui.Wallet.f3 f3Var = (org.telegram.ui.Wallet.f3) obj2;
                org.telegram.ui.Wallet.e3 e3Var = f3Var.f34729m;
                if (e3Var != null) {
                    e3Var.setPaused(!f3Var.f34730n);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f28751a) {
            case 0:
                pa paVar = (pa) this.f28753c;
                la laVar = (la) this.f28752b;
                if (laVar != null) {
                    ArrayList arrayList = laVar.d;
                    arrayList.remove(paVar);
                    if (laVar.f28120e.isEmpty() && arrayList.isEmpty()) {
                        laVar.f28128n.a();
                    }
                }
                paVar.f29470n = null;
                Paint paint = paVar.h;
                paVar.f29471o = null;
                paint.setShader(null);
                return;
            case 1:
                b6.release((View) this.f28752b, ((r11) this.f28753c).f29995k);
                return;
            default:
                org.telegram.ui.Wallet.f3 f3Var = (org.telegram.ui.Wallet.f3) this.f28753c;
                f3Var.f();
                f3Var.M = false;
                f3Var.N = 0L;
                f3Var.k();
                o1.k kVar = f3Var.Z;
                if (kVar != null) {
                    kVar.c();
                    f3Var.Z = null;
                }
                f3Var.f34708a0 = 1.0f;
                org.telegram.ui.Cells.w0 w0Var = f3Var.f34707a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                }
                f3Var.l();
                org.telegram.ui.Wallet.o5 o5Var = f3Var.f34725k;
                WeakHashMap weakHashMap = o5Var.f35169e;
                weakHashMap.remove((org.telegram.ui.Cells.w0) this.f28752b);
                if (weakHashMap.isEmpty()) {
                    o5Var.a();
                }
                org.telegram.ui.Wallet.e3 e3Var = f3Var.f34729m;
                if (e3Var != null) {
                    e3Var.setPaused(true);
                }
                f3Var.f34727l.stop();
                f3Var.H = false;
                return;
        }
    }
}
