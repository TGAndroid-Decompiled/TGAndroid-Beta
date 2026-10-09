package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class oa implements View.OnAttachStateChangeListener {
    public final int f29437a;
    public final Object f29438b;
    public final Object f29439c;

    public oa(int i10, Object obj, Object obj2) {
        this.f29437a = i10;
        this.f29439c = obj;
        this.f29438b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f29437a;
        Object obj = this.f29438b;
        Object obj2 = this.f29439c;
        switch (i10) {
            case 0:
                ma maVar = (ma) obj;
                if (maVar != null) {
                    maVar.d.add((qa) obj2);
                    return;
                }
                return;
            case 1:
                l11 l11Var = (l11) obj2;
                l11Var.f28228k = b6.update(l11Var.f28229l, (View) obj, l11Var.f28228k, l11Var.f28221b);
                return;
            default:
                org.telegram.ui.Wallet.c3 c3Var = (org.telegram.ui.Wallet.c3) obj2;
                org.telegram.ui.Wallet.b3 b3Var = c3Var.f34730m;
                if (b3Var != null) {
                    b3Var.setPaused(!c3Var.f34731n);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f29437a) {
            case 0:
                qa qaVar = (qa) this.f29439c;
                ma maVar = (ma) this.f29438b;
                if (maVar != null) {
                    ArrayList arrayList = maVar.d;
                    arrayList.remove(qaVar);
                    if (maVar.f28790e.isEmpty() && arrayList.isEmpty()) {
                        maVar.f28798n.a();
                    }
                }
                qaVar.f30128n = null;
                Paint paint = qaVar.h;
                qaVar.f30129o = null;
                paint.setShader(null);
                return;
            case 1:
                b6.release((View) this.f29438b, ((l11) this.f29439c).f28228k);
                return;
            default:
                org.telegram.ui.Wallet.c3 c3Var = (org.telegram.ui.Wallet.c3) this.f29439c;
                c3Var.f();
                c3Var.M = false;
                c3Var.N = 0L;
                c3Var.k();
                o1.k kVar = c3Var.Z;
                if (kVar != null) {
                    kVar.c();
                    c3Var.Z = null;
                }
                c3Var.f34709a0 = 1.0f;
                c3Var.l();
                org.telegram.ui.Wallet.k5 k5Var = c3Var.f34726k;
                WeakHashMap weakHashMap = k5Var.f35134e;
                weakHashMap.remove((org.telegram.ui.Cells.w0) this.f29438b);
                if (weakHashMap.isEmpty()) {
                    k5Var.a();
                }
                org.telegram.ui.Wallet.b3 b3Var = c3Var.f34730m;
                if (b3Var != null) {
                    b3Var.setPaused(true);
                }
                c3Var.f34728l.stop();
                c3Var.H = false;
                return;
        }
    }
}
