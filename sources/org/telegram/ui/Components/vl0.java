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
public class vl0 {
    public final int f31836a;
    public int f31837b;
    public boolean f31838c;
    public boolean d;
    public final Object f31839e;
    public final Object f31840f;
    public Object f31841g;
    public Object h;
    public Object f31842i;
    public final Object f31843j;
    public Object f31844k;

    public vl0(sm0 sm0Var, s4.d0 d0Var) {
        this.f31836a = 0;
        this.f31843j = new SparseArray();
        this.f31844k = new HashMap();
        this.f31839e = sm0Var;
        this.f31840f = d0Var;
    }

    public final void a() {
        switch (this.f31836a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f31841g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                sm0 sm0Var = (sm0) this.f31839e;
                sm0Var.setVerticalScrollBarEnabled(true);
                sm0Var.V1 = false;
                s4.i0 adapter = sm0Var.getAdapter();
                if (adapter instanceof tl0) {
                    ((tl0) adapter).E();
                }
                this.f31841g = null;
                int childCount = sm0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = sm0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) childAt).c(false, false);
                    }
                }
                return;
            default:
                p4.q qVar = (p4.q) this.f31839e;
                if (!this.f31838c && !this.d) {
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
        p4.v vVar = (p4.v) this.f31840f;
        int i10 = this.f31837b;
        WeakReference weakReference = (WeakReference) this.f31843j;
        p4.x.b();
        if (!this.f31838c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f45366g == this && ((kVar = (c0.k) this.f31844k) == null || !kVar.isCancelled())) {
                this.f31838c = true;
                eVar.f45366g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f45362b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f45361a.obtainMessage(263, vVar);
                        obtainMessage.arg1 = i10;
                        obtainMessage.sendToTarget();
                        p4.q qVar = eVar2.f45364e;
                        if (qVar != null) {
                            qVar.h(i10);
                            eVar2.f45364e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (p4.q qVar2 : hashMap.values()) {
                                qVar2.h(i10);
                                qVar2.d();
                            }
                            hashMap.clear();
                        }
                        eVar2.f45364e = null;
                    }
                }
                p4.e eVar3 = (p4.e) weakReference.get();
                if (eVar3 != null) {
                    p4.b bVar = eVar3.f45361a;
                    p4.v vVar2 = (p4.v) this.f31841g;
                    eVar3.d = vVar2;
                    eVar3.f45364e = (p4.q) this.f31839e;
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
                    eVar3.f45362b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f31842i;
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
        tl0 tl0Var;
        s4.i0 i0Var;
        long j3;
        HashMap hashMap = (HashMap) this.f31844k;
        SparseArray sparseArray = (SparseArray) this.f31843j;
        s4.d0 d0Var = (s4.d0) this.f31840f;
        sm0 sm0Var = (sm0) this.f31839e;
        if (!sm0Var.V1) {
            if (sm0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.n0 itemAnimator = sm0Var.getItemAnimator();
                    ql0 ql0Var = new ql0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        c(i10, i11, z10, false);
                    } else {
                        itemAnimator.f47839b.add(ql0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (sm0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f31837b == -1) {
                d0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = sm0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f31837b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                sm0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                s4.i0 adapter = sm0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = sm0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    d0Var.getClass();
                    sparseArray.put(s4.p0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f47803b && !this.f31838c)) {
                        i0Var = adapter;
                    } else {
                        if (this.f31838c) {
                            int b10 = ((s4.q0) childAt.getLayoutParams()).f47870a.b();
                            if (b10 < 0) {
                                i0Var = adapter;
                                i12++;
                                adapter = i0Var;
                            } else {
                                i0Var = adapter;
                                j3 = adapter.i(b10);
                            }
                        } else {
                            i0Var = adapter;
                            j3 = ((s4.q0) childAt.getLayoutParams()).f47870a.f47751e;
                        }
                        hashMap.put(Long.valueOf(j3), childAt);
                    }
                    if (childAt instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) childAt).c(true, true);
                    }
                    i12++;
                    adapter = i0Var;
                }
                s4.i0 i0Var2 = adapter;
                sm0Var.B0();
                sm0Var.o0();
                ra.a aVar = sm0Var.d;
                aVar.m((ArrayList) aVar.d);
                aVar.m((ArrayList) aVar.f47221e);
                aVar.f47219b = 0;
                pf.e eVar = sm0Var.f3140b;
                s4.i0 i0Var3 = sm0Var.f3167w;
                eVar.d(i0Var3, i0Var3);
                sm0Var.f3165u0.f47702f = true;
                sm0Var.f3145e.T();
                eVar.l();
                if (i0Var2 instanceof tl0) {
                    tl0Var = (tl0) i0Var2;
                } else {
                    tl0Var = null;
                }
                tl0 tl0Var2 = tl0Var;
                d0Var.i1(i10, i11, z10);
                if (i0Var2 != null) {
                    i0Var2.l();
                }
                sm0Var.B0();
                sm0Var.setVerticalScrollBarEnabled(false);
                w7.y5 y5Var = (w7.y5) this.f31842i;
                if (y5Var != null) {
                    y5Var.c();
                }
                sm0Var.V1 = true;
                if (tl0Var2 != null) {
                    tl0Var2.f31118c = true;
                    tl0Var2.d = false;
                    tl0Var2.f31119e.clear();
                    tl0Var2.f31120f.clear();
                }
                sm0Var.addOnLayoutChangeListener(new sl0(this, i0Var2, arrayList, z12, tl0Var2));
                return;
            }
            d0Var.i1(i10, i11, z10);
        }
    }

    public void d(w7.y5 y5Var) {
        this.f31842i = y5Var;
    }

    public vl0(p4.e eVar, p4.v vVar, p4.q qVar, int i10, p4.v vVar2, Collection collection) {
        this.f31836a = 1;
        this.f31844k = null;
        this.f31838c = false;
        this.d = false;
        this.f31843j = new WeakReference(eVar);
        this.f31841g = vVar;
        this.f31839e = qVar;
        this.f31837b = i10;
        this.f31840f = eVar.d;
        this.h = vVar2;
        this.f31842i = collection != null ? new ArrayList(collection) : null;
        eVar.f45361a.postDelayed(new org.telegram.ui.web.t0(this, 8), 15000L);
    }
}
