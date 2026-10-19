package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.NotificationCenter;
public final class la implements View.OnAttachStateChangeListener {
    public final int f28171a;
    public final Object f28172b;
    public final Object f28173c;

    public la(int i10, Object obj, Object obj2) {
        this.f28171a = i10;
        this.f28173c = obj;
        this.f28172b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f28171a;
        Object obj = this.f28172b;
        Object obj2 = this.f28173c;
        switch (i10) {
            case 0:
                ja jaVar = (ja) obj;
                if (jaVar != null) {
                    jaVar.d.add((na) obj2);
                    return;
                }
                return;
            case 1:
                e11 e11Var = (e11) obj2;
                e11Var.f25735k = a6.update(e11Var.f25736l, (View) obj, e11Var.f25735k, e11Var.f25729b);
                return;
            default:
                org.telegram.ui.Wallet.n3 n3Var = (org.telegram.ui.Wallet.n3) obj2;
                org.telegram.ui.Wallet.m3 m3Var = n3Var.f34567m;
                if (m3Var != null) {
                    m3Var.setPaused(!n3Var.f34568n);
                }
                n3Var.f34546a.isAttachedToWindow();
                int i11 = n3Var.f34584v0;
                if (-1 != i11) {
                    if (i11 >= 0) {
                        NotificationCenter.getInstance(i11).removeObserver(n3Var.f34588x0, NotificationCenter.userInfoDidLoad);
                    }
                    n3Var.f34584v0 = -1;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f28171a) {
            case 0:
                na naVar = (na) this.f28173c;
                ja jaVar = (ja) this.f28172b;
                if (jaVar != null) {
                    ArrayList arrayList = jaVar.d;
                    arrayList.remove(naVar);
                    if (jaVar.e.isEmpty() && arrayList.isEmpty()) {
                        jaVar.f27489n.a();
                    }
                }
                naVar.f28716n = null;
                Paint paint = naVar.h;
                naVar.f28717o = null;
                paint.setShader(null);
                return;
            case 1:
                a6.release((View) this.f28172b, ((e11) this.f28173c).f25735k);
                return;
            default:
                org.telegram.ui.Wallet.n3 n3Var = (org.telegram.ui.Wallet.n3) this.f28173c;
                org.telegram.ui.Cells.w0 w0Var = n3Var.f34546a;
                n3Var.f();
                n3Var.M = false;
                n3Var.N = 0L;
                n3Var.k();
                o1.k kVar = n3Var.Z;
                if (kVar != null) {
                    kVar.c();
                    n3Var.Z = null;
                }
                n3Var.f34547a0 = 1.0f;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                }
                n3Var.l();
                org.telegram.ui.Wallet.y5 y5Var = n3Var.f34563k;
                WeakHashMap weakHashMap = y5Var.e;
                weakHashMap.remove((org.telegram.ui.Cells.w0) this.f28172b);
                if (weakHashMap.isEmpty()) {
                    y5Var.a();
                }
                w0Var.isAttachedToWindow();
                int i10 = n3Var.f34584v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        NotificationCenter.getInstance(i10).removeObserver(n3Var.f34588x0, NotificationCenter.userInfoDidLoad);
                    }
                    n3Var.f34584v0 = -1;
                }
                org.telegram.ui.Wallet.m3 m3Var = n3Var.f34567m;
                if (m3Var != null) {
                    m3Var.setPaused(true);
                }
                n3Var.f34565l.stop();
                n3Var.H = false;
                return;
        }
    }
}
