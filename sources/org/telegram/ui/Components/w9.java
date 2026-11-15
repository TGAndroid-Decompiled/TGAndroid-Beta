package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class w9 implements View.OnAttachStateChangeListener {
    public final int f41318a;
    public final Object f41319b;
    public final Object f41320c;

    public w9(int i7, Object obj, Object obj2) {
        this.f41318a = i7;
        this.f41320c = obj;
        this.f41319b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i7 = this.f41318a;
        Object obj = this.f41319b;
        Object obj2 = this.f41320c;
        switch (i7) {
            case 0:
                u9 u9Var = (u9) obj;
                if (u9Var != null) {
                    u9Var.d.add((y9) obj2);
                    return;
                }
                return;
            case 1:
                oy0 oy0Var = (oy0) obj2;
                oy0Var.f38109k = p5.update(oy0Var.f38110l, (View) obj, oy0Var.f38109k, oy0Var.f38102b);
                return;
            default:
                org.telegram.ui.Wallet.c4 c4Var = (org.telegram.ui.Wallet.c4) obj2;
                org.telegram.ui.Wallet.b4 b4Var = c4Var.f43593m;
                if (b4Var != null) {
                    b4Var.setPaused(!c4Var.f43594n);
                }
                c4Var.f43571a.isAttachedToWindow();
                int i10 = c4Var.f43610v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        org.telegram.messenger.ns.f(i10).n(c4Var.f43614x0, 67);
                    }
                    c4Var.f43610v0 = -1;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f41318a) {
            case 0:
                y9 y9Var = (y9) this.f41320c;
                u9 u9Var = (u9) this.f41319b;
                if (u9Var != null) {
                    ArrayList arrayList = u9Var.d;
                    arrayList.remove(y9Var);
                    if (u9Var.f39969e.isEmpty() && arrayList.isEmpty()) {
                        u9Var.f39977n.o();
                    }
                }
                y9Var.f41953n = null;
                Paint paint = y9Var.h;
                y9Var.f41954o = null;
                paint.setShader(null);
                return;
            case 1:
                p5.release((View) this.f41319b, ((oy0) this.f41320c).f38109k);
                return;
            default:
                org.telegram.ui.Wallet.c4 c4Var = (org.telegram.ui.Wallet.c4) this.f41320c;
                org.telegram.ui.Cells.t0 t0Var = c4Var.f43571a;
                c4Var.f();
                c4Var.M = false;
                c4Var.N = 0L;
                c4Var.k();
                r1.g gVar = c4Var.Z;
                if (gVar != null) {
                    gVar.d();
                    c4Var.Z = null;
                }
                c4Var.f43572a0 = 1.0f;
                t0Var.invalidate();
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                }
                c4Var.l();
                org.telegram.ui.Wallet.i6 i6Var = c4Var.f43589k;
                WeakHashMap weakHashMap = i6Var.f43979e;
                weakHashMap.remove((org.telegram.ui.Cells.t0) this.f41319b);
                if (weakHashMap.isEmpty()) {
                    i6Var.a();
                }
                t0Var.isAttachedToWindow();
                int i7 = c4Var.f43610v0;
                if (-1 != i7) {
                    if (i7 >= 0) {
                        org.telegram.messenger.ns.f(i7).n(c4Var.f43614x0, 67);
                    }
                    c4Var.f43610v0 = -1;
                }
                org.telegram.ui.Wallet.b4 b4Var = c4Var.f43593m;
                if (b4Var != null) {
                    b4Var.setPaused(true);
                }
                c4Var.f43591l.stop();
                c4Var.H = false;
                return;
        }
    }
}
