package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class z9 implements View.OnAttachStateChangeListener {
    public final int f40991a;
    public final Object f40992b;
    public final Object f40993c;

    public z9(int i3, Object obj, Object obj2) {
        this.f40991a = i3;
        this.f40993c = obj;
        this.f40992b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i3 = this.f40991a;
        Object obj = this.f40992b;
        Object obj2 = this.f40993c;
        switch (i3) {
            case 0:
                x9 x9Var = (x9) obj;
                if (x9Var != null) {
                    x9Var.d.add((ba) obj2);
                    return;
                }
                return;
            case 1:
                ly0 ly0Var = (ly0) obj2;
                ly0Var.f35924k = p5.update(ly0Var.f35925l, (View) obj, ly0Var.f35924k, ly0Var.f35917b);
                return;
            default:
                org.telegram.ui.Wallet.b4 b4Var = (org.telegram.ui.Wallet.b4) obj2;
                org.telegram.ui.Wallet.a4 a4Var = b4Var.f42254m;
                if (a4Var != null) {
                    a4Var.setPaused(!b4Var.f42255n);
                }
                b4Var.f42232a.isAttachedToWindow();
                int i10 = b4Var.f42271v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        org.telegram.messenger.hs.f(i10).n(b4Var.f42275x0, 67);
                    }
                    b4Var.f42271v0 = -1;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f40991a) {
            case 0:
                ba baVar = (ba) this.f40993c;
                x9 x9Var = (x9) this.f40992b;
                if (x9Var != null) {
                    ArrayList arrayList = x9Var.d;
                    arrayList.remove(baVar);
                    if (x9Var.f40274e.isEmpty() && arrayList.isEmpty()) {
                        x9Var.f40282n.o();
                    }
                }
                baVar.f32135n = null;
                Paint paint = baVar.h;
                baVar.f32136o = null;
                paint.setShader(null);
                return;
            case 1:
                p5.release((View) this.f40992b, ((ly0) this.f40993c).f35924k);
                return;
            default:
                org.telegram.ui.Wallet.b4 b4Var = (org.telegram.ui.Wallet.b4) this.f40993c;
                org.telegram.ui.Cells.t0 t0Var = b4Var.f42232a;
                b4Var.f();
                b4Var.M = false;
                b4Var.N = 0L;
                b4Var.k();
                q1.g gVar = b4Var.Z;
                if (gVar != null) {
                    gVar.d();
                    b4Var.Z = null;
                }
                b4Var.f42233a0 = 1.0f;
                t0Var.invalidate();
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                }
                b4Var.l();
                org.telegram.ui.Wallet.g6 g6Var = b4Var.f42250k;
                WeakHashMap weakHashMap = g6Var.f42572e;
                weakHashMap.remove((org.telegram.ui.Cells.t0) this.f40992b);
                if (weakHashMap.isEmpty()) {
                    g6Var.a();
                }
                t0Var.isAttachedToWindow();
                int i3 = b4Var.f42271v0;
                if (-1 != i3) {
                    if (i3 >= 0) {
                        org.telegram.messenger.hs.f(i3).n(b4Var.f42275x0, 67);
                    }
                    b4Var.f42271v0 = -1;
                }
                org.telegram.ui.Wallet.a4 a4Var = b4Var.f42254m;
                if (a4Var != null) {
                    a4Var.setPaused(true);
                }
                b4Var.f42252l.stop();
                b4Var.H = false;
                return;
        }
    }
}
