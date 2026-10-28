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
public class ql0 {
    public final int f31933a;
    public int f31934b;
    public boolean f31935c;
    public boolean d;
    public final Object e;
    public final Object f31936f;
    public Object f31937g;
    public Object h;
    public Object f31938i;
    public final Object f31939j;
    public Object f31940k;

    public ql0(nm0 nm0Var, s4.c0 c0Var) {
        this.f31933a = 0;
        this.f31939j = new SparseArray();
        this.f31940k = new HashMap();
        this.e = nm0Var;
        this.f31936f = c0Var;
    }

    public final void a() {
        switch (this.f31933a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f31937g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                nm0 nm0Var = (nm0) this.e;
                nm0Var.setVerticalScrollBarEnabled(true);
                nm0Var.V1 = false;
                s4.h0 adapter = nm0Var.getAdapter();
                if (adapter instanceof ol0) {
                    ((ol0) adapter).E();
                }
                this.f31937g = null;
                int childCount = nm0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = nm0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.s4) {
                        ((org.telegram.ui.Cells.s4) childAt).b(false, false);
                    }
                }
                return;
            default:
                p4.q qVar = (p4.q) this.e;
                if (!this.f31935c && !this.d) {
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
        c0.l lVar;
        p4.v vVar = (p4.v) this.f31936f;
        int i10 = this.f31934b;
        WeakReference weakReference = (WeakReference) this.f31939j;
        p4.x.b();
        if (!this.f31935c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f46697g == this && ((lVar = (c0.l) this.f31940k) == null || !lVar.isCancelled())) {
                this.f31935c = true;
                eVar.f46697g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f46694b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f46693a.obtainMessage(263, vVar);
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
                    p4.b bVar = eVar3.f46693a;
                    p4.v vVar2 = (p4.v) this.f31937g;
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
                    eVar3.f46694b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f31938i;
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
        ol0 ol0Var;
        s4.h0 h0Var;
        long j10;
        HashMap hashMap = (HashMap) this.f31940k;
        SparseArray sparseArray = (SparseArray) this.f31939j;
        s4.c0 c0Var = (s4.c0) this.f31936f;
        nm0 nm0Var = (nm0) this.e;
        if (!nm0Var.V1) {
            if (nm0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.m0 itemAnimator = nm0Var.getItemAnimator();
                    kl0 kl0Var = new kl0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        c(i10, i11, z10, false);
                    } else {
                        itemAnimator.f47837b.add(kl0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (nm0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f31934b == -1) {
                c0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = nm0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f31934b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                nm0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                s4.h0 adapter = nm0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = nm0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    c0Var.getClass();
                    sparseArray.put(s4.p0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f47804b && !this.f31935c)) {
                        h0Var = adapter;
                    } else {
                        if (this.f31935c) {
                            int b10 = ((s4.q0) childAt.getLayoutParams()).f47867a.b();
                            if (b10 < 0) {
                                h0Var = adapter;
                                i12++;
                                adapter = h0Var;
                            } else {
                                h0Var = adapter;
                                j10 = adapter.i(b10);
                            }
                        } else {
                            h0Var = adapter;
                            j10 = ((s4.q0) childAt.getLayoutParams()).f47867a.e;
                        }
                        hashMap.put(Long.valueOf(j10), childAt);
                    }
                    if (childAt instanceof org.telegram.ui.Cells.s4) {
                        ((org.telegram.ui.Cells.s4) childAt).b(true, true);
                    }
                    i12++;
                    adapter = h0Var;
                }
                s4.h0 h0Var2 = adapter;
                nm0Var.C0();
                nm0Var.p0();
                s4.b bVar = nm0Var.d;
                bVar.m((ArrayList) bVar.d);
                bVar.m((ArrayList) bVar.e);
                bVar.f47722b = 0;
                rf.e eVar = nm0Var.f3056b;
                s4.h0 h0Var3 = nm0Var.f3082w;
                eVar.d(h0Var3, h0Var3);
                nm0Var.f3080u0.f47732f = true;
                nm0Var.e.s();
                eVar.l();
                if (h0Var2 instanceof ol0) {
                    ol0Var = (ol0) h0Var2;
                } else {
                    ol0Var = null;
                }
                ol0 ol0Var2 = ol0Var;
                c0Var.i1(i10, i11, z10);
                if (h0Var2 != null) {
                    h0Var2.l();
                }
                nm0Var.C0();
                nm0Var.setVerticalScrollBarEnabled(false);
                kb1 kb1Var = (kb1) this.f31938i;
                if (kb1Var != null) {
                    kb1Var.Q();
                }
                nm0Var.V1 = true;
                if (ol0Var2 != null) {
                    ol0Var2.f31340c = true;
                    ol0Var2.d = false;
                    ol0Var2.e.clear();
                    ol0Var2.f31341f.clear();
                }
                nm0Var.addOnLayoutChangeListener(new nl0(this, h0Var2, arrayList, z12, ol0Var2));
                return;
            }
            c0Var.i1(i10, i11, z10);
        }
    }

    public void d(kb1 kb1Var) {
        this.f31938i = kb1Var;
    }

    public ql0(p4.e eVar, p4.v vVar, p4.q qVar, int i10, p4.v vVar2, Collection collection) {
        this.f31933a = 1;
        this.f31940k = null;
        this.f31935c = false;
        this.d = false;
        this.f31939j = new WeakReference(eVar);
        this.f31937g = vVar;
        this.e = qVar;
        this.f31934b = i10;
        this.f31936f = eVar.d;
        this.h = vVar2;
        this.f31938i = collection != null ? new ArrayList(collection) : null;
        eVar.f46693a.postDelayed(new org.telegram.ui.web.h1(this, 6), 15000L);
    }
}
