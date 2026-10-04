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
    public final int f24993a;
    public int f24994b;
    public boolean f24995c;
    public boolean d;
    public final Object f24996e;
    public final Object f24997f;
    public Object f24998g;
    public Object h;
    public Object f24999i;
    public final Object f25000j;
    public Object f25001k;

    public bl0(zl0 zl0Var, s4.c0 c0Var) {
        this.f24993a = 0;
        this.f25000j = new SparseArray();
        this.f25001k = new HashMap();
        this.f24996e = zl0Var;
        this.f24997f = c0Var;
    }

    public final void a() {
        switch (this.f24993a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f24998g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                zl0 zl0Var = (zl0) this.f24996e;
                zl0Var.setVerticalScrollBarEnabled(true);
                zl0Var.X1 = false;
                s4.h0 adapter = zl0Var.getAdapter();
                if (adapter instanceof zk0) {
                    ((zk0) adapter).E();
                }
                this.f24998g = null;
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
                p4.q qVar = (p4.q) this.f24996e;
                if (!this.f24995c && !this.d) {
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
        p4.v vVar = (p4.v) this.f24997f;
        int i10 = this.f24994b;
        WeakReference weakReference = (WeakReference) this.f25000j;
        p4.x.b();
        if (!this.f24995c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f44151g == this && ((kVar = (c0.k) this.f25001k) == null || !kVar.isCancelled())) {
                this.f24995c = true;
                eVar.f44151g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f44147b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f44146a.obtainMessage(263, vVar);
                        obtainMessage.arg1 = i10;
                        obtainMessage.sendToTarget();
                        p4.q qVar = eVar2.f44149e;
                        if (qVar != null) {
                            qVar.h(i10);
                            eVar2.f44149e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (p4.q qVar2 : hashMap.values()) {
                                qVar2.h(i10);
                                qVar2.d();
                            }
                            hashMap.clear();
                        }
                        eVar2.f44149e = null;
                    }
                }
                p4.e eVar3 = (p4.e) weakReference.get();
                if (eVar3 != null) {
                    p4.b bVar = eVar3.f44146a;
                    p4.v vVar2 = (p4.v) this.f24998g;
                    eVar3.d = vVar2;
                    eVar3.f44149e = (p4.q) this.f24996e;
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
                    eVar3.f44147b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f24999i;
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
        HashMap hashMap = (HashMap) this.f25001k;
        SparseArray sparseArray = (SparseArray) this.f25000j;
        s4.c0 c0Var = (s4.c0) this.f24997f;
        zl0 zl0Var = (zl0) this.f24996e;
        if (!zl0Var.X1) {
            if (zl0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.m0 itemAnimator = zl0Var.getItemAnimator();
                    wk0 wk0Var = new wk0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        d(i10, i11, z10, false);
                    } else {
                        itemAnimator.f46612b.add(wk0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (zl0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f24994b == -1) {
                c0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = zl0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f24994b == 0) {
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
                    if (adapter == null || (!adapter.f46580b && !this.f24995c)) {
                        h0Var = adapter;
                    } else {
                        if (this.f24995c) {
                            int b10 = ((s4.p0) childAt.getLayoutParams()).f46642a.b();
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
                            j3 = ((s4.p0) childAt.getLayoutParams()).f46642a.f46526e;
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
                aVar.m((ArrayList) aVar.f45964e);
                aVar.f45962b = 0;
                of.e eVar = zl0Var.f3061b;
                s4.h0 h0Var3 = zl0Var.f3088w;
                eVar.d(h0Var3, h0Var3);
                zl0Var.f3085t0.f46704f = true;
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
                w7.a6 a6Var = (w7.a6) this.f24999i;
                if (a6Var != null) {
                    a6Var.c();
                }
                zl0Var.X1 = true;
                if (zk0Var2 != null) {
                    zk0Var2.f33508c = true;
                    zk0Var2.d = false;
                    zk0Var2.f33509e.clear();
                    zk0Var2.f33510f.clear();
                }
                zl0Var.addOnLayoutChangeListener(new yk0(this, h0Var2, arrayList, z12, zk0Var2));
                return;
            }
            c0Var.i1(i10, i11, z10);
        }
    }

    public void e(w7.a6 a6Var) {
        this.f24999i = a6Var;
    }

    public bl0(p4.e eVar, p4.v vVar, p4.q qVar, int i10, p4.v vVar2, Collection collection) {
        this.f24993a = 1;
        this.f25001k = null;
        this.f24995c = false;
        this.d = false;
        this.f25000j = new WeakReference(eVar);
        this.f24998g = vVar;
        this.f24996e = qVar;
        this.f24994b = i10;
        this.f24997f = eVar.d;
        this.h = vVar2;
        this.f24999i = collection != null ? new ArrayList(collection) : null;
        eVar.f44146a.postDelayed(new org.telegram.ui.web.u0(this, 8), 15000L);
    }
}
