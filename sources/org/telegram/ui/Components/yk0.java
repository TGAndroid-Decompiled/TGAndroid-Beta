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
public class yk0 {
    public final int f30570a;
    public int f30571b;
    public boolean f30572c;
    public boolean d;
    public final Object e;
    public final Object f30573f;
    public Object f30574g;
    public Object h;
    public Object f30575i;
    public final Object f30576j;
    public Object f30577k;

    public yk0(vl0 vl0Var, s4.c0 c0Var) {
        this.f30570a = 0;
        this.f30576j = new SparseArray();
        this.f30577k = new HashMap();
        this.e = vl0Var;
        this.f30573f = c0Var;
    }

    public final void a() {
        switch (this.f30570a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f30574g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                vl0 vl0Var = (vl0) this.e;
                vl0Var.setVerticalScrollBarEnabled(true);
                vl0Var.X1 = false;
                s4.h0 adapter = vl0Var.getAdapter();
                if (adapter instanceof wk0) {
                    ((wk0) adapter).E();
                }
                this.f30574g = null;
                int childCount = vl0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = vl0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) childAt).c(false, false);
                    }
                }
                return;
            default:
                p4.q qVar = (p4.q) this.e;
                if (!this.f30572c && !this.d) {
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
        p4.v vVar = (p4.v) this.f30573f;
        int i10 = this.f30571b;
        WeakReference weakReference = (WeakReference) this.f30576j;
        p4.x.b();
        if (!this.f30572c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f40850g == this && ((kVar = (c0.k) this.f30577k) == null || !kVar.isCancelled())) {
                this.f30572c = true;
                eVar.f40850g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f40847b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f40846a.obtainMessage(263, vVar);
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
                    p4.b bVar = eVar3.f40846a;
                    p4.v vVar2 = (p4.v) this.f30574g;
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
                    eVar3.f40847b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f30575i;
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
        wk0 wk0Var;
        s4.h0 h0Var;
        long j3;
        HashMap hashMap = (HashMap) this.f30577k;
        SparseArray sparseArray = (SparseArray) this.f30576j;
        s4.c0 c0Var = (s4.c0) this.f30573f;
        vl0 vl0Var = (vl0) this.e;
        if (!vl0Var.X1) {
            if (vl0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.m0 itemAnimator = vl0Var.getItemAnimator();
                    tk0 tk0Var = new tk0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        d(i10, i11, z10, false);
                    } else {
                        itemAnimator.f43054b.add(tk0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (vl0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f30571b == -1) {
                c0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = vl0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f30571b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                vl0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                s4.h0 adapter = vl0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = vl0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    c0Var.getClass();
                    sparseArray.put(s4.o0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f43024b && !this.f30572c)) {
                        h0Var = adapter;
                    } else {
                        if (this.f30572c) {
                            int b10 = ((s4.p0) childAt.getLayoutParams()).f43080a.b();
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
                            j3 = ((s4.p0) childAt.getLayoutParams()).f43080a.e;
                        }
                        hashMap.put(Long.valueOf(j3), childAt);
                    }
                    if (childAt instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) childAt).c(true, true);
                    }
                    i12++;
                    adapter = h0Var;
                }
                s4.h0 h0Var2 = adapter;
                vl0Var.C0();
                vl0Var.p0();
                ra.a aVar = vl0Var.d;
                aVar.m((ArrayList) aVar.d);
                aVar.m((ArrayList) aVar.e);
                aVar.f42476b = 0;
                of.e eVar = vl0Var.f2840b;
                s4.h0 h0Var3 = vl0Var.f2866w;
                eVar.d(h0Var3, h0Var3);
                vl0Var.f2863t0.f43135f = true;
                vl0Var.e.S();
                eVar.l();
                if (h0Var2 instanceof wk0) {
                    wk0Var = (wk0) h0Var2;
                } else {
                    wk0Var = null;
                }
                wk0 wk0Var2 = wk0Var;
                c0Var.i1(i10, i11, z10);
                if (h0Var2 != null) {
                    h0Var2.l();
                }
                vl0Var.C0();
                vl0Var.setVerticalScrollBarEnabled(false);
                w7.z5 z5Var = (w7.z5) this.f30575i;
                if (z5Var != null) {
                    z5Var.c();
                }
                vl0Var.X1 = true;
                if (wk0Var2 != null) {
                    wk0Var2.f30063c = true;
                    wk0Var2.d = false;
                    wk0Var2.e.clear();
                    wk0Var2.f30064f.clear();
                }
                vl0Var.addOnLayoutChangeListener(new vk0(this, h0Var2, arrayList, z12, wk0Var2));
                return;
            }
            c0Var.i1(i10, i11, z10);
        }
    }

    public void e(w7.z5 z5Var) {
        this.f30575i = z5Var;
    }

    public yk0(p4.e eVar, p4.v vVar, p4.q qVar, int i10, p4.v vVar2, Collection collection) {
        this.f30570a = 1;
        this.f30577k = null;
        this.f30572c = false;
        this.d = false;
        this.f30576j = new WeakReference(eVar);
        this.f30574g = vVar;
        this.e = qVar;
        this.f30571b = i10;
        this.f30573f = eVar.d;
        this.h = vVar2;
        this.f30575i = collection != null ? new ArrayList(collection) : null;
        eVar.f40846a.postDelayed(new org.telegram.ui.web.r0(this, 9), 15000L);
    }
}
