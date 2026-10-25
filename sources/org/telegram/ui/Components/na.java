package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.NotificationCenter;
public final class na implements View.OnAttachStateChangeListener {
    public final int f30930a;
    public final Object f30931b;
    public final Object f30932c;

    public na(int i10, Object obj, Object obj2) {
        this.f30930a = i10;
        this.f30932c = obj;
        this.f30931b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f30930a;
        Object obj = this.f30931b;
        Object obj2 = this.f30932c;
        switch (i10) {
            case 0:
                la laVar = (la) obj;
                if (laVar != null) {
                    laVar.d.add((pa) obj2);
                    return;
                }
                return;
            case 1:
                q11 q11Var = (q11) obj2;
                q11Var.f31793k = c6.update(q11Var.f31794l, (View) obj, q11Var.f31793k, q11Var.f31787b);
                return;
            default:
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) obj2;
                org.telegram.ui.Wallet.l3 l3Var = m3Var.f36905m;
                if (l3Var != null) {
                    l3Var.setPaused(!m3Var.f36906n);
                }
                m3Var.f36884a.isAttachedToWindow();
                int i11 = m3Var.f36922v0;
                if (-1 != i11) {
                    if (i11 >= 0) {
                        NotificationCenter.getInstance(i11).removeObserver(m3Var.f36926x0, NotificationCenter.userInfoDidLoad);
                    }
                    m3Var.f36922v0 = -1;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f30930a) {
            case 0:
                pa paVar = (pa) this.f30932c;
                la laVar = (la) this.f30931b;
                if (laVar != null) {
                    ArrayList arrayList = laVar.d;
                    arrayList.remove(paVar);
                    if (laVar.e.isEmpty() && arrayList.isEmpty()) {
                        laVar.f30145n.a();
                    }
                }
                paVar.f31484n = null;
                Paint paint = paVar.h;
                paVar.f31485o = null;
                paint.setShader(null);
                return;
            case 1:
                c6.release((View) this.f30931b, ((q11) this.f30932c).f31793k);
                return;
            default:
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) this.f30932c;
                org.telegram.ui.Cells.v0 v0Var = m3Var.f36884a;
                m3Var.f();
                m3Var.M = false;
                m3Var.N = 0L;
                m3Var.k();
                o1.j jVar = m3Var.Z;
                if (jVar != null) {
                    jVar.c();
                    m3Var.Z = null;
                }
                m3Var.f36885a0 = 1.0f;
                v0Var.invalidate();
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                }
                m3Var.l();
                org.telegram.ui.Wallet.x5 x5Var = m3Var.f36901k;
                WeakHashMap weakHashMap = x5Var.e;
                weakHashMap.remove((org.telegram.ui.Cells.v0) this.f30931b);
                if (weakHashMap.isEmpty()) {
                    x5Var.a();
                }
                v0Var.isAttachedToWindow();
                int i10 = m3Var.f36922v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        NotificationCenter.getInstance(i10).removeObserver(m3Var.f36926x0, NotificationCenter.userInfoDidLoad);
                    }
                    m3Var.f36922v0 = -1;
                }
                org.telegram.ui.Wallet.l3 l3Var = m3Var.f36905m;
                if (l3Var != null) {
                    l3Var.setPaused(true);
                }
                m3Var.f36903l.stop();
                m3Var.H = false;
                return;
        }
    }
}
