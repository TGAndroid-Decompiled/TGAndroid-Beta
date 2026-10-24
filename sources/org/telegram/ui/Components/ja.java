package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.NotificationCenter;
public final class ja implements View.OnAttachStateChangeListener {
    public final int f27650a;
    public final Object f27651b;
    public final Object f27652c;

    public ja(int i10, Object obj, Object obj2) {
        this.f27650a = i10;
        this.f27652c = obj;
        this.f27651b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f27650a;
        Object obj = this.f27651b;
        Object obj2 = this.f27652c;
        switch (i10) {
            case 0:
                ha haVar = (ha) obj;
                if (haVar != null) {
                    haVar.d.add((la) obj2);
                    return;
                }
                return;
            case 1:
                h11 h11Var = (h11) obj2;
                h11Var.f26848k = y5.update(h11Var.f26849l, (View) obj, h11Var.f26848k, h11Var.f26842b);
                return;
            default:
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) obj2;
                org.telegram.ui.Wallet.l3 l3Var = m3Var.f34827m;
                if (l3Var != null) {
                    l3Var.setPaused(!m3Var.f34828n);
                }
                m3Var.f34806a.isAttachedToWindow();
                int i11 = m3Var.f34844v0;
                if (-1 != i11) {
                    if (i11 >= 0) {
                        NotificationCenter.getInstance(i11).removeObserver(m3Var.f34848x0, NotificationCenter.userInfoDidLoad);
                    }
                    m3Var.f34844v0 = -1;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f27650a) {
            case 0:
                la laVar = (la) this.f27652c;
                ha haVar = (ha) this.f27651b;
                if (haVar != null) {
                    ArrayList arrayList = haVar.d;
                    arrayList.remove(laVar);
                    if (haVar.e.isEmpty() && arrayList.isEmpty()) {
                        haVar.f26984n.a();
                    }
                }
                laVar.f28300n = null;
                Paint paint = laVar.h;
                laVar.f28301o = null;
                paint.setShader(null);
                return;
            case 1:
                y5.release((View) this.f27651b, ((h11) this.f27652c).f26848k);
                return;
            default:
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) this.f27652c;
                org.telegram.ui.Cells.v0 v0Var = m3Var.f34806a;
                m3Var.f();
                m3Var.M = false;
                m3Var.N = 0L;
                m3Var.k();
                o1.k kVar = m3Var.Z;
                if (kVar != null) {
                    kVar.c();
                    m3Var.Z = null;
                }
                m3Var.f34807a0 = 1.0f;
                v0Var.invalidate();
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                }
                m3Var.l();
                org.telegram.ui.Wallet.y5 y5Var = m3Var.f34823k;
                WeakHashMap weakHashMap = y5Var.e;
                weakHashMap.remove((org.telegram.ui.Cells.v0) this.f27651b);
                if (weakHashMap.isEmpty()) {
                    y5Var.a();
                }
                v0Var.isAttachedToWindow();
                int i10 = m3Var.f34844v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        NotificationCenter.getInstance(i10).removeObserver(m3Var.f34848x0, NotificationCenter.userInfoDidLoad);
                    }
                    m3Var.f34844v0 = -1;
                }
                org.telegram.ui.Wallet.l3 l3Var = m3Var.f34827m;
                if (l3Var != null) {
                    l3Var.setPaused(true);
                }
                m3Var.f34825l.stop();
                m3Var.H = false;
                return;
        }
    }
}
