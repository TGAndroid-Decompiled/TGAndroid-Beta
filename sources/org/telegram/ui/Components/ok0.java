package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.MessagesController;
public class ok0 {
    public final int f29097a;
    public int f29098b;
    public boolean f29099c;
    public boolean d;
    public final Object f29100e;
    public final Object f29101f;
    public Object f29102g;
    public Object h;
    public Object f29103i;
    public final Object f29104j;
    public Object f29105k;

    public ok0(ll0 ll0Var, s4.c0 c0Var) {
        this.f29097a = 0;
        this.f29104j = new SparseArray();
        this.f29105k = new HashMap();
        this.f29100e = ll0Var;
        this.f29101f = c0Var;
    }

    public final void a() {
        switch (this.f29097a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f29102g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ll0 ll0Var = (ll0) this.f29100e;
                ll0Var.setVerticalScrollBarEnabled(true);
                ll0Var.X1 = false;
                s4.h0 adapter = ll0Var.getAdapter();
                if (adapter instanceof mk0) {
                    ((mk0) adapter).E();
                }
                this.f29102g = null;
                int childCount = ll0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = ll0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.n4) {
                        ((org.telegram.ui.Cells.n4) childAt).e(false, false);
                    }
                }
                return;
            default:
                p4.q qVar = (p4.q) this.f29100e;
                if (!this.f29099c && !this.d) {
                    this.d = true;
                    if (qVar != null) {
                        qVar.h(0);
                        qVar.d();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void b() {
        c0.k kVar;
        p4.v vVar = (p4.v) this.f29101f;
        int i10 = this.f29098b;
        WeakReference weakReference = (WeakReference) this.f29104j;
        p4.x.b();
        if (!this.f29099c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f43810g == this && ((kVar = (c0.k) this.f29105k) == null || !kVar.isCancelled())) {
                this.f29099c = true;
                eVar.f43810g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f43806b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f43805a.obtainMessage(263, vVar);
                        obtainMessage.arg1 = i10;
                        obtainMessage.sendToTarget();
                        p4.q qVar = eVar2.f43808e;
                        if (qVar != null) {
                            qVar.h(i10);
                            eVar2.f43808e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (p4.q qVar2 : hashMap.values()) {
                                qVar2.h(i10);
                                qVar2.d();
                            }
                            hashMap.clear();
                        }
                        eVar2.f43808e = null;
                    }
                }
                p4.e eVar3 = (p4.e) weakReference.get();
                if (eVar3 != null) {
                    p4.b bVar = eVar3.f43805a;
                    p4.v vVar2 = (p4.v) this.f29102g;
                    eVar3.d = vVar2;
                    eVar3.f43808e = (p4.q) this.f29100e;
                    p4.v vVar3 = (p4.v) this.h;
                    if (vVar3 == null) {
                        Message obtainMessage2 = bVar.obtainMessage(262, new q0.b(vVar, vVar2));
                        obtainMessage2.arg1 = i10;
                        obtainMessage2.sendToTarget();
                    } else {
                        Message obtainMessage3 = bVar.obtainMessage(264, new q0.b(vVar3, vVar2));
                        obtainMessage3.arg1 = i10;
                        obtainMessage3.sendToTarget();
                    }
                    eVar3.f43806b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f29103i;
                    if (arrayList != null) {
                        eVar3.d.n(arrayList);
                        return;
                    }
                    return;
                }
                return;
            }
            a();
        }
    }

    public void c(int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        mk0 mk0Var;
        s4.h0 h0Var;
        long j3;
        HashMap hashMap = (HashMap) this.f29105k;
        SparseArray sparseArray = (SparseArray) this.f29104j;
        s4.c0 c0Var = (s4.c0) this.f29101f;
        ll0 ll0Var = (ll0) this.f29100e;
        if (!ll0Var.X1) {
            if (ll0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.m0 itemAnimator = ll0Var.getItemAnimator();
                    jk0 jk0Var = new jk0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        c(i10, i11, z10, false);
                    } else {
                        itemAnimator.f45827b.add(jk0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (ll0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f29098b == -1) {
                c0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = ll0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f29098b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ll0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                s4.h0 adapter = ll0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = ll0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    c0Var.getClass();
                    sparseArray.put(s4.o0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f45795b && !this.f29099c)) {
                        h0Var = adapter;
                    } else {
                        if (this.f29099c) {
                            int b10 = ((s4.p0) childAt.getLayoutParams()).f45857a.b();
                            if (b10 < 0) {
                                h0Var = adapter;
                                i12++;
                                adapter = h0Var;
                            } else {
                                h0Var = adapter;
                                j3 = adapter.i(b10);
                            }
                        } else {
                            h0Var = adapter;
                            j3 = ((s4.p0) childAt.getLayoutParams()).f45857a.f45741e;
                        }
                        hashMap.put(Long.valueOf(j3), childAt);
                    }
                    if (childAt instanceof org.telegram.ui.Cells.n4) {
                        ((org.telegram.ui.Cells.n4) childAt).e(true, true);
                    }
                    i12++;
                    adapter = h0Var;
                }
                s4.h0 h0Var2 = adapter;
                ll0Var.B0();
                ll0Var.o0();
                ra.a aVar = ll0Var.d;
                aVar.m((ArrayList) aVar.d);
                aVar.m((ArrayList) aVar.f45065e);
                aVar.f45063b = 0;
                pf.e eVar = ll0Var.f1867b;
                s4.h0 h0Var3 = ll0Var.f1894w;
                eVar.d(h0Var3, h0Var3);
                ll0Var.f1891t0.f45919f = true;
                ll0Var.f1872e.L();
                eVar.l();
                if (h0Var2 instanceof mk0) {
                    mk0Var = (mk0) h0Var2;
                } else {
                    mk0Var = null;
                }
                mk0 mk0Var2 = mk0Var;
                c0Var.i1(i10, i11, z10);
                if (h0Var2 != null) {
                    h0Var2.l();
                }
                ll0Var.B0();
                ll0Var.setVerticalScrollBarEnabled(false);
                w7.y5 y5Var = (w7.y5) this.f29103i;
                if (y5Var != null) {
                    y5Var.c();
                }
                ll0Var.X1 = true;
                if (mk0Var2 != null) {
                    mk0Var2.f28462c = true;
                    mk0Var2.d = false;
                    mk0Var2.f28463e.clear();
                    mk0Var2.f28464f.clear();
                }
                ll0Var.addOnLayoutChangeListener(new lk0(this, h0Var2, arrayList, z12, mk0Var2));
                return;
            }
            c0Var.i1(i10, i11, z10);
        }
    }

    public ok0(p4.e eVar, p4.v vVar, p4.q qVar, int i10, p4.v vVar2, Collection collection) {
        this.f29097a = 1;
        this.f29105k = null;
        this.f29099c = false;
        this.d = false;
        this.f29104j = new WeakReference(eVar);
        this.f29102g = vVar;
        this.f29100e = qVar;
        this.f29098b = i10;
        this.f29101f = eVar.d;
        this.h = vVar2;
        this.f29103i = collection != null ? new ArrayList(collection) : null;
        eVar.f43805a.postDelayed(new org.telegram.ui.web.b(this, 11), 15000L);
    }
}
