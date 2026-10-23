package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.NotificationCenter;
public final class la implements View.OnAttachStateChangeListener {
    public final int f28316a;
    public final Object f28317b;
    public final Object f28318c;

    public la(int i10, Object obj, Object obj2) {
        this.f28316a = i10;
        this.f28318c = obj;
        this.f28317b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f28316a;
        Object obj = this.f28317b;
        Object obj2 = this.f28318c;
        switch (i10) {
            case 0:
                ja jaVar = (ja) obj;
                if (jaVar != null) {
                    jaVar.d.add((na) obj2);
                    return;
                }
                return;
            case 1:
                i11 i11Var = (i11) obj2;
                i11Var.f27169k = a6.update(i11Var.f27170l, (View) obj, i11Var.f27169k, i11Var.f27163b);
                return;
            default:
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) obj2;
                org.telegram.ui.Wallet.l3 l3Var = m3Var.f34825m;
                if (l3Var != null) {
                    l3Var.setPaused(!m3Var.f34826n);
                }
                m3Var.f34804a.isAttachedToWindow();
                int i11 = m3Var.f34842v0;
                if (-1 != i11) {
                    if (i11 >= 0) {
                        NotificationCenter.getInstance(i11).removeObserver(m3Var.f34846x0, NotificationCenter.userInfoDidLoad);
                    }
                    m3Var.f34842v0 = -1;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f28316a) {
            case 0:
                na naVar = (na) this.f28318c;
                ja jaVar = (ja) this.f28317b;
                if (jaVar != null) {
                    ArrayList arrayList = jaVar.d;
                    arrayList.remove(naVar);
                    if (jaVar.e.isEmpty() && arrayList.isEmpty()) {
                        jaVar.f27644n.a();
                    }
                }
                naVar.f28915n = null;
                Paint paint = naVar.h;
                naVar.f28916o = null;
                paint.setShader(null);
                return;
            case 1:
                a6.release((View) this.f28317b, ((i11) this.f28318c).f27169k);
                return;
            default:
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) this.f28318c;
                org.telegram.ui.Cells.v0 v0Var = m3Var.f34804a;
                m3Var.f();
                m3Var.M = false;
                m3Var.N = 0L;
                m3Var.k();
                o1.k kVar = m3Var.Z;
                if (kVar != null) {
                    kVar.c();
                    m3Var.Z = null;
                }
                m3Var.f34805a0 = 1.0f;
                v0Var.invalidate();
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                }
                m3Var.l();
                org.telegram.ui.Wallet.y5 y5Var = m3Var.f34821k;
                WeakHashMap weakHashMap = y5Var.e;
                weakHashMap.remove((org.telegram.ui.Cells.v0) this.f28317b);
                if (weakHashMap.isEmpty()) {
                    y5Var.a();
                }
                v0Var.isAttachedToWindow();
                int i10 = m3Var.f34842v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        NotificationCenter.getInstance(i10).removeObserver(m3Var.f34846x0, NotificationCenter.userInfoDidLoad);
                    }
                    m3Var.f34842v0 = -1;
                }
                org.telegram.ui.Wallet.l3 l3Var = m3Var.f34825m;
                if (l3Var != null) {
                    l3Var.setPaused(true);
                }
                m3Var.f34823l.stop();
                m3Var.H = false;
                return;
        }
    }
}
