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
    public final int f24994a;
    public int f24995b;
    public boolean f24996c;
    public boolean d;
    public final Object f24997e;
    public final Object f24998f;
    public Object f24999g;
    public Object h;
    public Object f25000i;
    public final Object f25001j;
    public Object f25002k;

    public bl0(zl0 zl0Var, s4.c0 c0Var) {
        this.f24994a = 0;
        this.f25001j = new SparseArray();
        this.f25002k = new HashMap();
        this.f24997e = zl0Var;
        this.f24998f = c0Var;
    }

    public final void a() {
        switch (this.f24994a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f24999g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                zl0 zl0Var = (zl0) this.f24997e;
                zl0Var.setVerticalScrollBarEnabled(true);
                zl0Var.X1 = false;
                s4.h0 adapter = zl0Var.getAdapter();
                if (adapter instanceof zk0) {
                    ((zk0) adapter).E();
                }
                this.f24999g = null;
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
                p4.q qVar = (p4.q) this.f24997e;
                if (!this.f24996c && !this.d) {
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
        p4.v vVar = (p4.v) this.f24998f;
        int i10 = this.f24995b;
        WeakReference weakReference = (WeakReference) this.f25001j;
        p4.x.b();
        if (!this.f24996c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f44152g == this && ((kVar = (c0.k) this.f25002k) == null || !kVar.isCancelled())) {
                this.f24996c = true;
                eVar.f44152g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f44148b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f44147a.obtainMessage(263, vVar);
                        obtainMessage.arg1 = i10;
                        obtainMessage.sendToTarget();
                        p4.q qVar = eVar2.f44150e;
                        if (qVar != null) {
                            qVar.h(i10);
                            eVar2.f44150e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (p4.q qVar2 : hashMap.values()) {
                                qVar2.h(i10);
                                qVar2.d();
                            }
                            hashMap.clear();
                        }
                        eVar2.f44150e = null;
                    }
                }
                p4.e eVar3 = (p4.e) weakReference.get();
                if (eVar3 != null) {
                    p4.b bVar = eVar3.f44147a;
                    p4.v vVar2 = (p4.v) this.f24999g;
                    eVar3.d = vVar2;
                    eVar3.f44150e = (p4.q) this.f24997e;
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
                    eVar3.f44148b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f25000i;
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
        HashMap hashMap = (HashMap) this.f25002k;
        SparseArray sparseArray = (SparseArray) this.f25001j;
        s4.c0 c0Var = (s4.c0) this.f24998f;
        zl0 zl0Var = (zl0) this.f24997e;
        if (!zl0Var.X1) {
            if (zl0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.m0 itemAnimator = zl0Var.getItemAnimator();
                    wk0 wk0Var = new wk0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        d(i10, i11, z10, false);
                    } else {
                        itemAnimator.f46613b.add(wk0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (zl0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f24995b == -1) {
                c0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = zl0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f24995b == 0) {
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
                    if (adapter == null || (!adapter.f46581b && !this.f24996c)) {
                        h0Var = adapter;
                    } else {
                        if (this.f24996c) {
                            int b10 = ((s4.p0) childAt.getLayoutParams()).f46643a.b();
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
                            j3 = ((s4.p0) childAt.getLayoutParams()).f46643a.f46527e;
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
                aVar.m((ArrayList) aVar.f45965e);
                aVar.f45963b = 0;
                of.e eVar = zl0Var.f3061b;
                s4.h0 h0Var3 = zl0Var.f3088w;
                eVar.d(h0Var3, h0Var3);
                zl0Var.f3085t0.f46705f = true;
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
                w7.a6 a6Var = (w7.a6) this.f25000i;
                if (a6Var != null) {
                    a6Var.c();
                }
                zl0Var.X1 = true;
                if (zk0Var2 != null) {
                    zk0Var2.f33509c = true;
                    zk0Var2.d = false;
                    zk0Var2.f33510e.clear();
                    zk0Var2.f33511f.clear();
                }
                zl0Var.addOnLayoutChangeListener(new yk0(this, h0Var2, arrayList, z12, zk0Var2));
                return;
            }
            c0Var.i1(i10, i11, z10);
        }
    }

    public void e(w7.a6 a6Var) {
        this.f25000i = a6Var;
    }

    public bl0(p4.e eVar, p4.v vVar, p4.q qVar, int i10, p4.v vVar2, Collection collection) {
        this.f24994a = 1;
        this.f25002k = null;
        this.f24996c = false;
        this.d = false;
        this.f25001j = new WeakReference(eVar);
        this.f24999g = vVar;
        this.f24997e = qVar;
        this.f24995b = i10;
        this.f24998f = eVar.d;
        this.h = vVar2;
        this.f25000i = collection != null ? new ArrayList(collection) : null;
        eVar.f44147a.postDelayed(new org.telegram.ui.web.u0(this, 8), 15000L);
    }
}
