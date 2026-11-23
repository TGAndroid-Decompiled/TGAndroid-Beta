package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class da implements View.OnAttachStateChangeListener {
    public final int f34250a;
    public final Object f34251b;
    public final Object f34252c;

    public da(int i7, Object obj, Object obj2) {
        this.f34250a = i7;
        this.f34252c = obj;
        this.f34251b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i7 = this.f34250a;
        Object obj = this.f34251b;
        Object obj2 = this.f34252c;
        switch (i7) {
            case 0:
                ba baVar = (ba) obj;
                if (baVar != null) {
                    baVar.d.add((fa) obj2);
                    return;
                }
                return;
            case 1:
                wy0 wy0Var = (wy0) obj2;
                wy0Var.f41769k = x5.update(wy0Var.f41770l, (View) obj, wy0Var.f41769k, wy0Var.f41762b);
                return;
            default:
                org.telegram.ui.Wallet.n4 n4Var = (org.telegram.ui.Wallet.n4) obj2;
                org.telegram.ui.Wallet.m4 m4Var = n4Var.f44717m;
                if (m4Var != null) {
                    m4Var.setPaused(!n4Var.f44718n);
                }
                n4Var.f44695a.isAttachedToWindow();
                int i10 = n4Var.f44734v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        org.telegram.messenger.ks.f(i10).n(n4Var.f44738x0, 67);
                    }
                    n4Var.f44734v0 = -1;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f34250a) {
            case 0:
                fa faVar = (fa) this.f34252c;
                ba baVar = (ba) this.f34251b;
                if (baVar != null) {
                    ArrayList arrayList = baVar.d;
                    arrayList.remove(faVar);
                    if (baVar.f33710e.isEmpty() && arrayList.isEmpty()) {
                        baVar.f33718n.o();
                    }
                }
                faVar.f35075n = null;
                Paint paint = faVar.h;
                faVar.f35076o = null;
                paint.setShader(null);
                return;
            case 1:
                x5.release((View) this.f34251b, ((wy0) this.f34252c).f41769k);
                return;
            default:
                org.telegram.ui.Wallet.n4 n4Var = (org.telegram.ui.Wallet.n4) this.f34252c;
                org.telegram.ui.Cells.v0 v0Var = n4Var.f44695a;
                n4Var.f();
                n4Var.M = false;
                n4Var.N = 0L;
                n4Var.k();
                r1.g gVar = n4Var.Z;
                if (gVar != null) {
                    gVar.d();
                    n4Var.Z = null;
                }
                n4Var.f44696a0 = 1.0f;
                v0Var.invalidate();
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                }
                n4Var.l();
                org.telegram.ui.Wallet.z6 z6Var = n4Var.f44713k;
                WeakHashMap weakHashMap = z6Var.f45487e;
                weakHashMap.remove((org.telegram.ui.Cells.v0) this.f34251b);
                if (weakHashMap.isEmpty()) {
                    z6Var.a();
                }
                v0Var.isAttachedToWindow();
                int i7 = n4Var.f44734v0;
                if (-1 != i7) {
                    if (i7 >= 0) {
                        org.telegram.messenger.ks.f(i7).n(n4Var.f44738x0, 67);
                    }
                    n4Var.f44734v0 = -1;
                }
                org.telegram.ui.Wallet.m4 m4Var = n4Var.f44717m;
                if (m4Var != null) {
                    m4Var.setPaused(true);
                }
                n4Var.f44715l.stop();
                n4Var.H = false;
                return;
        }
    }
}
