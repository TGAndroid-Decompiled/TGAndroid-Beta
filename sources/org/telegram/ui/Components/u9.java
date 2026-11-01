package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class u9 implements View.OnAttachStateChangeListener {
    public final int f30906a;
    public final Object f30907b;
    public final Object f30908c;

    public u9(int i10, Object obj, Object obj2) {
        this.f30906a = i10;
        this.f30908c = obj;
        this.f30907b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f30906a;
        Object obj = this.f30907b;
        Object obj2 = this.f30908c;
        switch (i10) {
            case 0:
                s9 s9Var = (s9) obj;
                if (s9Var != null) {
                    s9Var.d.add((w9) obj2);
                    return;
                }
                return;
            case 1:
                rz0 rz0Var = (rz0) obj2;
                rz0Var.f30131k = o5.update(rz0Var.f30132l, (View) obj, rz0Var.f30131k, rz0Var.f30125b);
                return;
            default:
                org.telegram.ui.Wallet.d4 d4Var = (org.telegram.ui.Wallet.d4) obj2;
                org.telegram.ui.Wallet.c4 c4Var = d4Var.f34403m;
                if (c4Var != null) {
                    c4Var.setPaused(!d4Var.f34404n);
                }
                d4Var.f34382a.isAttachedToWindow();
                int i11 = d4Var.f34420v0;
                if (-1 != i11) {
                    if (i11 >= 0) {
                        org.telegram.messenger.at.f(i11).n(d4Var.f34424x0, 67);
                    }
                    d4Var.f34420v0 = -1;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f30906a) {
            case 0:
                w9 w9Var = (w9) this.f30908c;
                s9 s9Var = (s9) this.f30907b;
                if (s9Var != null) {
                    ArrayList arrayList = s9Var.d;
                    arrayList.remove(w9Var);
                    if (s9Var.e.isEmpty() && arrayList.isEmpty()) {
                        s9Var.f30249n.c();
                    }
                }
                w9Var.f32184n = null;
                Paint paint = w9Var.h;
                w9Var.f32185o = null;
                paint.setShader(null);
                return;
            case 1:
                o5.release((View) this.f30907b, ((rz0) this.f30908c).f30131k);
                return;
            default:
                org.telegram.ui.Wallet.d4 d4Var = (org.telegram.ui.Wallet.d4) this.f30908c;
                org.telegram.ui.Cells.s0 s0Var = d4Var.f34382a;
                d4Var.f();
                d4Var.M = false;
                d4Var.N = 0L;
                d4Var.k();
                o1.j jVar = d4Var.Z;
                if (jVar != null) {
                    jVar.d();
                    d4Var.Z = null;
                }
                d4Var.f34383a0 = 1.0f;
                s0Var.invalidate();
                if (s0Var.getParent() instanceof View) {
                    ((View) s0Var.getParent()).invalidate();
                }
                d4Var.l();
                org.telegram.ui.Wallet.m6 m6Var = d4Var.f34399k;
                WeakHashMap weakHashMap = m6Var.e;
                weakHashMap.remove((org.telegram.ui.Cells.s0) this.f30907b);
                if (weakHashMap.isEmpty()) {
                    m6Var.a();
                }
                s0Var.isAttachedToWindow();
                int i10 = d4Var.f34420v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        org.telegram.messenger.at.f(i10).n(d4Var.f34424x0, 67);
                    }
                    d4Var.f34420v0 = -1;
                }
                org.telegram.ui.Wallet.c4 c4Var = d4Var.f34403m;
                if (c4Var != null) {
                    c4Var.setPaused(true);
                }
                d4Var.f34401l.stop();
                d4Var.H = false;
                return;
        }
    }
}
