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
public class tl0 {
    public final int f31223a;
    public int f31224b;
    public boolean f31225c;
    public boolean d;
    public final Object f31226e;
    public final Object f31227f;
    public Object f31228g;
    public Object h;
    public Object f31229i;
    public final Object f31230j;
    public Object f31231k;

    public tl0(qm0 qm0Var, s4.d0 d0Var) {
        this.f31223a = 0;
        this.f31230j = new SparseArray();
        this.f31231k = new HashMap();
        this.f31226e = qm0Var;
        this.f31227f = d0Var;
    }

    public final void a() {
        switch (this.f31223a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f31228g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                qm0 qm0Var = (qm0) this.f31226e;
                qm0Var.setVerticalScrollBarEnabled(true);
                qm0Var.V1 = false;
                s4.i0 adapter = qm0Var.getAdapter();
                if (adapter instanceof rl0) {
                    ((rl0) adapter).E();
                }
                this.f31228g = null;
                int childCount = qm0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = qm0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) childAt).c(false, false);
                    }
                }
                return;
            default:
                p4.q qVar = (p4.q) this.f31226e;
                if (!this.f31225c && !this.d) {
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
        p4.v vVar = (p4.v) this.f31227f;
        int i10 = this.f31224b;
        WeakReference weakReference = (WeakReference) this.f31230j;
        p4.x.b();
        if (!this.f31225c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f45332g == this && ((kVar = (c0.k) this.f31231k) == null || !kVar.isCancelled())) {
                this.f31225c = true;
                eVar.f45332g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f45328b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f45327a.obtainMessage(263, vVar);
                        obtainMessage.arg1 = i10;
                        obtainMessage.sendToTarget();
                        p4.q qVar = eVar2.f45330e;
                        if (qVar != null) {
                            qVar.h(i10);
                            eVar2.f45330e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (p4.q qVar2 : hashMap.values()) {
                                qVar2.h(i10);
                                qVar2.d();
                            }
                            hashMap.clear();
                        }
                        eVar2.f45330e = null;
                    }
                }
                p4.e eVar3 = (p4.e) weakReference.get();
                if (eVar3 != null) {
                    p4.b bVar = eVar3.f45327a;
                    p4.v vVar2 = (p4.v) this.f31228g;
                    eVar3.d = vVar2;
                    eVar3.f45330e = (p4.q) this.f31226e;
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
                    eVar3.f45328b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f31229i;
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
        rl0 rl0Var;
        s4.i0 i0Var;
        long j3;
        HashMap hashMap = (HashMap) this.f31231k;
        SparseArray sparseArray = (SparseArray) this.f31230j;
        s4.d0 d0Var = (s4.d0) this.f31227f;
        qm0 qm0Var = (qm0) this.f31226e;
        if (!qm0Var.V1) {
            if (qm0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.n0 itemAnimator = qm0Var.getItemAnimator();
                    ol0 ol0Var = new ol0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        c(i10, i11, z10, false);
                    } else {
                        itemAnimator.f47749b.add(ol0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (qm0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f31224b == -1) {
                d0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = qm0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f31224b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                qm0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                s4.i0 adapter = qm0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = qm0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    d0Var.getClass();
                    sparseArray.put(s4.p0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f47713b && !this.f31225c)) {
                        i0Var = adapter;
                    } else {
                        if (this.f31225c) {
                            int b10 = ((s4.q0) childAt.getLayoutParams()).f47780a.b();
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
                            j3 = ((s4.q0) childAt.getLayoutParams()).f47780a.f47661e;
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
                qm0Var.B0();
                qm0Var.o0();
                ra.a aVar = qm0Var.d;
                aVar.m((ArrayList) aVar.d);
                aVar.m((ArrayList) aVar.f47131e);
                aVar.f47129b = 0;
                pf.e eVar = qm0Var.f3140b;
                s4.i0 i0Var3 = qm0Var.f3167w;
                eVar.d(i0Var3, i0Var3);
                qm0Var.f3165u0.f47612f = true;
                qm0Var.f3145e.T();
                eVar.l();
                if (i0Var2 instanceof rl0) {
                    rl0Var = (rl0) i0Var2;
                } else {
                    rl0Var = null;
                }
                rl0 rl0Var2 = rl0Var;
                d0Var.i1(i10, i11, z10);
                if (i0Var2 != null) {
                    i0Var2.l();
                }
                qm0Var.B0();
                qm0Var.setVerticalScrollBarEnabled(false);
                w7.y5 y5Var = (w7.y5) this.f31229i;
                if (y5Var != null) {
                    y5Var.c();
                }
                qm0Var.V1 = true;
                if (rl0Var2 != null) {
                    rl0Var2.f30464c = true;
                    rl0Var2.d = false;
                    rl0Var2.f30465e.clear();
                    rl0Var2.f30466f.clear();
                }
                qm0Var.addOnLayoutChangeListener(new ql0(this, i0Var2, arrayList, z12, rl0Var2));
                return;
            }
            d0Var.i1(i10, i11, z10);
        }
    }

    public void d(w7.y5 y5Var) {
        this.f31229i = y5Var;
    }

    public tl0(p4.e eVar, p4.v vVar, p4.q qVar, int i10, p4.v vVar2, Collection collection) {
        this.f31223a = 1;
        this.f31231k = null;
        this.f31225c = false;
        this.d = false;
        this.f31230j = new WeakReference(eVar);
        this.f31228g = vVar;
        this.f31226e = qVar;
        this.f31224b = i10;
        this.f31227f = eVar.d;
        this.h = vVar2;
        this.f31229i = collection != null ? new ArrayList(collection) : null;
        eVar.f45327a.postDelayed(new org.telegram.ui.web.q0(this, 9), 15000L);
    }
}
