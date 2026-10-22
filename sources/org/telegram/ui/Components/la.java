package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.NotificationCenter;
public final class la implements View.OnAttachStateChangeListener {
    public final int f28126a;
    public final Object f28127b;
    public final Object f28128c;

    public la(int i10, Object obj, Object obj2) {
        this.f28126a = i10;
        this.f28128c = obj;
        this.f28127b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f28126a;
        Object obj = this.f28127b;
        Object obj2 = this.f28128c;
        switch (i10) {
            case 0:
                ja jaVar = (ja) obj;
                if (jaVar != null) {
                    jaVar.d.add((na) obj2);
                    return;
                }
                return;
            case 1:
                f11 f11Var = (f11) obj2;
                f11Var.f26029k = a6.update(f11Var.f26030l, (View) obj, f11Var.f26029k, f11Var.f26023b);
                return;
            default:
                org.telegram.ui.Wallet.n3 n3Var = (org.telegram.ui.Wallet.n3) obj2;
                org.telegram.ui.Wallet.m3 m3Var = n3Var.f34579m;
                if (m3Var != null) {
                    m3Var.setPaused(!n3Var.f34580n);
                }
                n3Var.f34558a.isAttachedToWindow();
                int i11 = n3Var.f34596v0;
                if (-1 != i11) {
                    if (i11 >= 0) {
                        NotificationCenter.getInstance(i11).removeObserver(n3Var.f34600x0, NotificationCenter.userInfoDidLoad);
                    }
                    n3Var.f34596v0 = -1;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f28126a) {
            case 0:
                na naVar = (na) this.f28128c;
                ja jaVar = (ja) this.f28127b;
                if (jaVar != null) {
                    ArrayList arrayList = jaVar.d;
                    arrayList.remove(naVar);
                    if (jaVar.e.isEmpty() && arrayList.isEmpty()) {
                        jaVar.f27486n.a();
                    }
                }
                naVar.f28746n = null;
                Paint paint = naVar.h;
                naVar.f28747o = null;
                paint.setShader(null);
                return;
            case 1:
                a6.release((View) this.f28127b, ((f11) this.f28128c).f26029k);
                return;
            default:
                org.telegram.ui.Wallet.n3 n3Var = (org.telegram.ui.Wallet.n3) this.f28128c;
                org.telegram.ui.Cells.w0 w0Var = n3Var.f34558a;
                n3Var.f();
                n3Var.M = false;
                n3Var.N = 0L;
                n3Var.k();
                o1.k kVar = n3Var.Z;
                if (kVar != null) {
                    kVar.c();
                    n3Var.Z = null;
                }
                n3Var.f34559a0 = 1.0f;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                }
                n3Var.l();
                org.telegram.ui.Wallet.y5 y5Var = n3Var.f34575k;
                WeakHashMap weakHashMap = y5Var.e;
                weakHashMap.remove((org.telegram.ui.Cells.w0) this.f28127b);
                if (weakHashMap.isEmpty()) {
                    y5Var.a();
                }
                w0Var.isAttachedToWindow();
                int i10 = n3Var.f34596v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        NotificationCenter.getInstance(i10).removeObserver(n3Var.f34600x0, NotificationCenter.userInfoDidLoad);
                    }
                    n3Var.f34596v0 = -1;
                }
                org.telegram.ui.Wallet.m3 m3Var = n3Var.f34579m;
                if (m3Var != null) {
                    m3Var.setPaused(true);
                }
                n3Var.f34577l.stop();
                n3Var.H = false;
                return;
        }
    }
}
