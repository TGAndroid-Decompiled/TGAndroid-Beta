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
public class pk0 {
    public final int f27063a;
    public int f27064b;
    public boolean f27065c;
    public boolean d;
    public final Object e;
    public final Object f27066f;
    public Object f27067g;
    public Object h;
    public Object f27068i;
    public final Object f27069j;
    public Object f27070k;

    public pk0(ml0 ml0Var, s4.c0 c0Var) {
        this.f27063a = 0;
        this.f27069j = new SparseArray();
        this.f27070k = new HashMap();
        this.e = ml0Var;
        this.f27066f = c0Var;
    }

    public final void a() {
        switch (this.f27063a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f27067g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ml0 ml0Var = (ml0) this.e;
                ml0Var.setVerticalScrollBarEnabled(true);
                ml0Var.X1 = false;
                s4.h0 adapter = ml0Var.getAdapter();
                if (adapter instanceof nk0) {
                    ((nk0) adapter).E();
                }
                this.f27067g = null;
                int childCount = ml0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = ml0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.n4) {
                        ((org.telegram.ui.Cells.n4) childAt).c(false, false);
                    }
                }
                return;
            default:
                p4.q qVar = (p4.q) this.e;
                if (!this.f27065c && !this.d) {
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
        p4.v vVar = (p4.v) this.f27066f;
        int i10 = this.f27064b;
        WeakReference weakReference = (WeakReference) this.f27069j;
        p4.x.b();
        if (!this.f27065c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f40583g == this && ((kVar = (c0.k) this.f27070k) == null || !kVar.isCancelled())) {
                this.f27065c = true;
                eVar.f40583g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f40580b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f40579a.obtainMessage(263, vVar);
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
                    p4.b bVar = eVar3.f40579a;
                    p4.v vVar2 = (p4.v) this.f27067g;
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
                    eVar3.f40580b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f27068i;
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
        nk0 nk0Var;
        s4.h0 h0Var;
        long j3;
        HashMap hashMap = (HashMap) this.f27070k;
        SparseArray sparseArray = (SparseArray) this.f27069j;
        s4.c0 c0Var = (s4.c0) this.f27066f;
        ml0 ml0Var = (ml0) this.e;
        if (!ml0Var.X1) {
            if (ml0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.m0 itemAnimator = ml0Var.getItemAnimator();
                    kk0 kk0Var = new kk0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        d(i10, i11, z10, false);
                    } else {
                        itemAnimator.f42782b.add(kk0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (ml0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f27064b == -1) {
                c0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = ml0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f27064b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ml0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                s4.h0 adapter = ml0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = ml0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    c0Var.getClass();
                    sparseArray.put(s4.o0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f42752b && !this.f27065c)) {
                        h0Var = adapter;
                    } else {
                        if (this.f27065c) {
                            int b10 = ((s4.p0) childAt.getLayoutParams()).f42808a.b();
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
                            j3 = ((s4.p0) childAt.getLayoutParams()).f42808a.e;
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
                ml0Var.C0();
                ml0Var.p0();
                ra.a aVar = ml0Var.d;
                aVar.m((ArrayList) aVar.d);
                aVar.m((ArrayList) aVar.e);
                aVar.f42205b = 0;
                of.e eVar = ml0Var.f2840b;
                s4.h0 h0Var3 = ml0Var.f2866w;
                eVar.d(h0Var3, h0Var3);
                ml0Var.f2863t0.f42863f = true;
                ml0Var.e.S();
                eVar.l();
                if (h0Var2 instanceof nk0) {
                    nk0Var = (nk0) h0Var2;
                } else {
                    nk0Var = null;
                }
                nk0 nk0Var2 = nk0Var;
                c0Var.i1(i10, i11, z10);
                if (h0Var2 != null) {
                    h0Var2.l();
                }
                ml0Var.C0();
                ml0Var.setVerticalScrollBarEnabled(false);
                w7.y5 y5Var = (w7.y5) this.f27068i;
                if (y5Var != null) {
                    y5Var.c();
                }
                ml0Var.X1 = true;
                if (nk0Var2 != null) {
                    nk0Var2.f26477c = true;
                    nk0Var2.d = false;
                    nk0Var2.e.clear();
                    nk0Var2.f26478f.clear();
                }
                ml0Var.addOnLayoutChangeListener(new mk0(this, h0Var2, arrayList, z12, nk0Var2));
                return;
            }
            c0Var.i1(i10, i11, z10);
        }
    }

    public void e(w7.y5 y5Var) {
        this.f27068i = y5Var;
    }

    public pk0(p4.e eVar, p4.v vVar, p4.q qVar, int i10, p4.v vVar2, Collection collection) {
        this.f27063a = 1;
        this.f27070k = null;
        this.f27065c = false;
        this.d = false;
        this.f27069j = new WeakReference(eVar);
        this.f27067g = vVar;
        this.e = qVar;
        this.f27064b = i10;
        this.f27066f = eVar.d;
        this.h = vVar2;
        this.f27068i = collection != null ? new ArrayList(collection) : null;
        eVar.f40579a.postDelayed(new org.telegram.ui.web.u0(this, 8), 15000L);
    }
}
