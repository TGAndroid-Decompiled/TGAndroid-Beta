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
public class cl0 {
    public final int f23355a;
    public int f23356b;
    public boolean f23357c;
    public boolean d;
    public final Object e;
    public final Object f23358f;
    public Object f23359g;
    public Object h;
    public Object f23360i;
    public final Object f23361j;
    public Object f23362k;

    public cl0(zl0 zl0Var, s4.c0 c0Var) {
        this.f23355a = 0;
        this.f23361j = new SparseArray();
        this.f23362k = new HashMap();
        this.e = zl0Var;
        this.f23358f = c0Var;
    }

    public final void a() {
        switch (this.f23355a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f23359g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                zl0 zl0Var = (zl0) this.e;
                zl0Var.setVerticalScrollBarEnabled(true);
                zl0Var.X1 = false;
                s4.h0 adapter = zl0Var.getAdapter();
                if (adapter instanceof al0) {
                    ((al0) adapter).E();
                }
                this.f23359g = null;
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
                p4.q qVar = (p4.q) this.e;
                if (!this.f23357c && !this.d) {
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
        p4.v vVar = (p4.v) this.f23358f;
        int i10 = this.f23356b;
        WeakReference weakReference = (WeakReference) this.f23361j;
        p4.x.b();
        if (!this.f23357c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f40922g == this && ((kVar = (c0.k) this.f23362k) == null || !kVar.isCancelled())) {
                this.f23357c = true;
                eVar.f40922g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f40919b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f40918a.obtainMessage(263, vVar);
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
                    p4.b bVar = eVar3.f40918a;
                    p4.v vVar2 = (p4.v) this.f23359g;
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
                    eVar3.f40919b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f23360i;
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
        al0 al0Var;
        s4.h0 h0Var;
        long j3;
        HashMap hashMap = (HashMap) this.f23362k;
        SparseArray sparseArray = (SparseArray) this.f23361j;
        s4.c0 c0Var = (s4.c0) this.f23358f;
        zl0 zl0Var = (zl0) this.e;
        if (!zl0Var.X1) {
            if (zl0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.m0 itemAnimator = zl0Var.getItemAnimator();
                    xk0 xk0Var = new xk0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        d(i10, i11, z10, false);
                    } else {
                        itemAnimator.f43148b.add(xk0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (zl0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f23356b == -1) {
                c0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = zl0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f23356b == 0) {
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
                    if (adapter == null || (!adapter.f43118b && !this.f23357c)) {
                        h0Var = adapter;
                    } else {
                        if (this.f23357c) {
                            int b10 = ((s4.p0) childAt.getLayoutParams()).f43174a.b();
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
                            j3 = ((s4.p0) childAt.getLayoutParams()).f43174a.e;
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
                aVar.m((ArrayList) aVar.e);
                aVar.f42567b = 0;
                of.e eVar = zl0Var.f2839b;
                s4.h0 h0Var3 = zl0Var.f2865w;
                eVar.d(h0Var3, h0Var3);
                zl0Var.f2862t0.f43229f = true;
                zl0Var.e.S();
                eVar.l();
                if (h0Var2 instanceof al0) {
                    al0Var = (al0) h0Var2;
                } else {
                    al0Var = null;
                }
                al0 al0Var2 = al0Var;
                c0Var.i1(i10, i11, z10);
                if (h0Var2 != null) {
                    h0Var2.l();
                }
                zl0Var.C0();
                zl0Var.setVerticalScrollBarEnabled(false);
                w7.z5 z5Var = (w7.z5) this.f23360i;
                if (z5Var != null) {
                    z5Var.c();
                }
                zl0Var.X1 = true;
                if (al0Var2 != null) {
                    al0Var2.f22657c = true;
                    al0Var2.d = false;
                    al0Var2.e.clear();
                    al0Var2.f22658f.clear();
                }
                zl0Var.addOnLayoutChangeListener(new zk0(this, h0Var2, arrayList, z12, al0Var2));
                return;
            }
            c0Var.i1(i10, i11, z10);
        }
    }

    public void e(w7.z5 z5Var) {
        this.f23360i = z5Var;
    }

    public cl0(p4.e eVar, p4.v vVar, p4.q qVar, int i10, p4.v vVar2, Collection collection) {
        this.f23355a = 1;
        this.f23362k = null;
        this.f23357c = false;
        this.d = false;
        this.f23361j = new WeakReference(eVar);
        this.f23359g = vVar;
        this.e = qVar;
        this.f23356b = i10;
        this.f23358f = eVar.d;
        this.h = vVar2;
        this.f23360i = collection != null ? new ArrayList(collection) : null;
        eVar.f40918a.postDelayed(new org.telegram.ui.web.q0(this, 9), 15000L);
    }
}
