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
    public final int f26829a;
    public int f26830b;
    public boolean f26831c;
    public boolean d;
    public final Object e;
    public final Object f26832f;
    public Object f26833g;
    public Object h;
    public Object f26834i;
    public final Object f26835j;
    public Object f26836k;

    public ok0(ll0 ll0Var, s4.c0 c0Var) {
        this.f26829a = 0;
        this.f26835j = new SparseArray();
        this.f26836k = new HashMap();
        this.e = ll0Var;
        this.f26832f = c0Var;
    }

    public final void a() {
        switch (this.f26829a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f26833g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ll0 ll0Var = (ll0) this.e;
                ll0Var.setVerticalScrollBarEnabled(true);
                ll0Var.X1 = false;
                s4.h0 adapter = ll0Var.getAdapter();
                if (adapter instanceof mk0) {
                    ((mk0) adapter).E();
                }
                this.f26833g = null;
                int childCount = ll0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = ll0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.n4) {
                        ((org.telegram.ui.Cells.n4) childAt).c(false, false);
                    }
                }
                return;
            default:
                p4.q qVar = (p4.q) this.e;
                if (!this.f26831c && !this.d) {
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
        p4.v vVar = (p4.v) this.f26832f;
        int i10 = this.f26830b;
        WeakReference weakReference = (WeakReference) this.f26835j;
        p4.x.b();
        if (!this.f26831c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f40556g == this && ((kVar = (c0.k) this.f26836k) == null || !kVar.isCancelled())) {
                this.f26831c = true;
                eVar.f40556g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f40553b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f40552a.obtainMessage(263, vVar);
                        obtainMessage.arg1 = i10;
                        obtainMessage.sendToTarget();
                        p4.q qVar = eVar2.e;
                        if (qVar != null) {
                            qVar.h(i10);
                            eVar2.e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (p4.q qVar2 : hashMap.values()) {
                                qVar2.h(i10);
                                qVar2.d();
                            }
                            hashMap.clear();
                        }
                        eVar2.e = null;
                    }
                }
                p4.e eVar3 = (p4.e) weakReference.get();
                if (eVar3 != null) {
                    p4.b bVar = eVar3.f40552a;
                    p4.v vVar2 = (p4.v) this.f26833g;
                    eVar3.d = vVar2;
                    eVar3.e = (p4.q) this.e;
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
                    eVar3.f40553b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f26834i;
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

    public void c(int i10, int i11, boolean z10) {
        d(i10, i11, z10, false);
    }

    public void d(int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        mk0 mk0Var;
        s4.h0 h0Var;
        long j3;
        HashMap hashMap = (HashMap) this.f26836k;
        SparseArray sparseArray = (SparseArray) this.f26835j;
        s4.c0 c0Var = (s4.c0) this.f26832f;
        ll0 ll0Var = (ll0) this.e;
        if (!ll0Var.X1) {
            if (ll0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.m0 itemAnimator = ll0Var.getItemAnimator();
                    jk0 jk0Var = new jk0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        d(i10, i11, z10, false);
                    } else {
                        itemAnimator.f42755b.add(jk0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (ll0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f26830b == -1) {
                c0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = ll0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f26830b == 0) {
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
                    if (adapter == null || (!adapter.f42725b && !this.f26831c)) {
                        h0Var = adapter;
                    } else {
                        if (this.f26831c) {
                            int b10 = ((s4.p0) childAt.getLayoutParams()).f42781a.b();
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
                            j3 = ((s4.p0) childAt.getLayoutParams()).f42781a.e;
                        }
                        hashMap.put(Long.valueOf(j3), childAt);
                    }
                    if (childAt instanceof org.telegram.ui.Cells.n4) {
                        ((org.telegram.ui.Cells.n4) childAt).c(true, true);
                    }
                    i12++;
                    adapter = h0Var;
                }
                s4.h0 h0Var2 = adapter;
                ll0Var.B0();
                ll0Var.o0();
                ra.a aVar = ll0Var.d;
                aVar.m((ArrayList) aVar.d);
                aVar.m((ArrayList) aVar.e);
                aVar.f42178b = 0;
                of.e eVar = ll0Var.f2835b;
                s4.h0 h0Var3 = ll0Var.f2861w;
                eVar.d(h0Var3, h0Var3);
                ll0Var.f2858t0.f42836f = true;
                ll0Var.e.R();
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
                w7.y5 y5Var = (w7.y5) this.f26834i;
                if (y5Var != null) {
                    y5Var.c();
                }
                ll0Var.X1 = true;
                if (mk0Var2 != null) {
                    mk0Var2.f26173c = true;
                    mk0Var2.d = false;
                    mk0Var2.e.clear();
                    mk0Var2.f26174f.clear();
                }
                ll0Var.addOnLayoutChangeListener(new lk0(this, h0Var2, arrayList, z12, mk0Var2));
                return;
            }
            c0Var.i1(i10, i11, z10);
        }
    }

    public void e(w7.y5 y5Var) {
        this.f26834i = y5Var;
    }

    public ok0(p4.e eVar, p4.v vVar, p4.q qVar, int i10, p4.v vVar2, Collection collection) {
        this.f26829a = 1;
        this.f26836k = null;
        this.f26831c = false;
        this.d = false;
        this.f26835j = new WeakReference(eVar);
        this.f26833g = vVar;
        this.e = qVar;
        this.f26830b = i10;
        this.f26832f = eVar.d;
        this.h = vVar2;
        this.f26834i = collection != null ? new ArrayList(collection) : null;
        eVar.f40552a.postDelayed(new org.telegram.ui.web.u0(this, 8), 15000L);
    }
}
