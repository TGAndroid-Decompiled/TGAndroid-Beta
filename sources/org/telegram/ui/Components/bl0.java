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
public class bl0 {
    public final int f25014a;
    public int f25015b;
    public boolean f25016c;
    public boolean d;
    public final Object f25017e;
    public final Object f25018f;
    public Object f25019g;
    public Object h;
    public Object f25020i;
    public final Object f25021j;
    public Object f25022k;

    public bl0(zl0 zl0Var, s4.c0 c0Var) {
        this.f25014a = 0;
        this.f25021j = new SparseArray();
        this.f25022k = new HashMap();
        this.f25017e = zl0Var;
        this.f25018f = c0Var;
    }

    public final void a() {
        switch (this.f25014a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f25019g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                zl0 zl0Var = (zl0) this.f25017e;
                zl0Var.setVerticalScrollBarEnabled(true);
                zl0Var.X1 = false;
                s4.h0 adapter = zl0Var.getAdapter();
                if (adapter instanceof zk0) {
                    ((zk0) adapter).E();
                }
                this.f25019g = null;
                int childCount = zl0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = zl0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) childAt).c(false, false);
                    }
                }
                return;
            default:
                p4.q qVar = (p4.q) this.f25017e;
                if (!this.f25016c && !this.d) {
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
        p4.v vVar = (p4.v) this.f25018f;
        int i10 = this.f25015b;
        WeakReference weakReference = (WeakReference) this.f25021j;
        p4.x.b();
        if (!this.f25016c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f44166g == this && ((kVar = (c0.k) this.f25022k) == null || !kVar.isCancelled())) {
                this.f25016c = true;
                eVar.f44166g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f44162b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f44161a.obtainMessage(263, vVar);
                        obtainMessage.arg1 = i10;
                        obtainMessage.sendToTarget();
                        p4.q qVar = eVar2.f44164e;
                        if (qVar != null) {
                            qVar.h(i10);
                            eVar2.f44164e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (p4.q qVar2 : hashMap.values()) {
                                qVar2.h(i10);
                                qVar2.d();
                            }
                            hashMap.clear();
                        }
                        eVar2.f44164e = null;
                    }
                }
                p4.e eVar3 = (p4.e) weakReference.get();
                if (eVar3 != null) {
                    p4.b bVar = eVar3.f44161a;
                    p4.v vVar2 = (p4.v) this.f25019g;
                    eVar3.d = vVar2;
                    eVar3.f44164e = (p4.q) this.f25017e;
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
                    eVar3.f44162b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f25020i;
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
        zk0 zk0Var;
        s4.h0 h0Var;
        long j3;
        HashMap hashMap = (HashMap) this.f25022k;
        SparseArray sparseArray = (SparseArray) this.f25021j;
        s4.c0 c0Var = (s4.c0) this.f25018f;
        zl0 zl0Var = (zl0) this.f25017e;
        if (!zl0Var.X1) {
            if (zl0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.m0 itemAnimator = zl0Var.getItemAnimator();
                    wk0 wk0Var = new wk0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        d(i10, i11, z10, false);
                    } else {
                        itemAnimator.f46627b.add(wk0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (zl0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f25015b == -1) {
                c0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = zl0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f25015b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zl0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                s4.h0 adapter = zl0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = zl0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    c0Var.getClass();
                    sparseArray.put(s4.o0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f46595b && !this.f25016c)) {
                        h0Var = adapter;
                    } else {
                        if (this.f25016c) {
                            int b10 = ((s4.p0) childAt.getLayoutParams()).f46657a.b();
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
                            j3 = ((s4.p0) childAt.getLayoutParams()).f46657a.f46541e;
                        }
                        hashMap.put(Long.valueOf(j3), childAt);
                    }
                    if (childAt instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) childAt).c(true, true);
                    }
                    i12++;
                    adapter = h0Var;
                }
                s4.h0 h0Var2 = adapter;
                zl0Var.C0();
                zl0Var.p0();
                ra.a aVar = zl0Var.d;
                aVar.m((ArrayList) aVar.d);
                aVar.m((ArrayList) aVar.f45979e);
                aVar.f45977b = 0;
                of.e eVar = zl0Var.f3061b;
                s4.h0 h0Var3 = zl0Var.f3088w;
                eVar.d(h0Var3, h0Var3);
                zl0Var.f3085t0.f46719f = true;
                zl0Var.f3066e.S();
                eVar.l();
                if (h0Var2 instanceof zk0) {
                    zk0Var = (zk0) h0Var2;
                } else {
                    zk0Var = null;
                }
                zk0 zk0Var2 = zk0Var;
                c0Var.i1(i10, i11, z10);
                if (h0Var2 != null) {
                    h0Var2.l();
                }
                zl0Var.C0();
                zl0Var.setVerticalScrollBarEnabled(false);
                w7.a6 a6Var = (w7.a6) this.f25020i;
                if (a6Var != null) {
                    a6Var.c();
                }
                zl0Var.X1 = true;
                if (zk0Var2 != null) {
                    zk0Var2.f33523c = true;
                    zk0Var2.d = false;
                    zk0Var2.f33524e.clear();
                    zk0Var2.f33525f.clear();
                }
                zl0Var.addOnLayoutChangeListener(new yk0(this, h0Var2, arrayList, z12, zk0Var2));
                return;
            }
            c0Var.i1(i10, i11, z10);
        }
    }

    public void e(w7.a6 a6Var) {
        this.f25020i = a6Var;
    }

    public bl0(p4.e eVar, p4.v vVar, p4.q qVar, int i10, p4.v vVar2, Collection collection) {
        this.f25014a = 1;
        this.f25022k = null;
        this.f25016c = false;
        this.d = false;
        this.f25021j = new WeakReference(eVar);
        this.f25019g = vVar;
        this.f25017e = qVar;
        this.f25015b = i10;
        this.f25018f = eVar.d;
        this.h = vVar2;
        this.f25020i = collection != null ? new ArrayList(collection) : null;
        eVar.f44161a.postDelayed(new org.telegram.ui.web.u0(this, 8), 15000L);
    }
}
