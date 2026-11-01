package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
public class wj0 {
    public final int f32266a;
    public int f32267b;
    public boolean f32268c;
    public boolean d;
    public final Object e;
    public final Object f32269f;
    public Object f32270g;
    public Object h;
    public Object f32271i;
    public final Object f32272j;
    public Object f32273k;

    public wj0(uk0 uk0Var, s4.a0 a0Var) {
        this.f32266a = 0;
        this.f32272j = new SparseArray();
        this.f32273k = new HashMap();
        this.e = uk0Var;
        this.f32269f = a0Var;
    }

    public final void a() {
        switch (this.f32266a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f32270g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                uk0 uk0Var = (uk0) this.e;
                uk0Var.setVerticalScrollBarEnabled(true);
                uk0Var.V1 = false;
                s4.g0 adapter = uk0Var.getAdapter();
                if (adapter instanceof uj0) {
                    ((uj0) adapter).E();
                }
                this.f32270g = null;
                int childCount = uk0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = uk0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.r4) {
                        ((org.telegram.ui.Cells.r4) childAt).b(false, false);
                    }
                }
                return;
            default:
                p4.q qVar = (p4.q) this.e;
                if (!this.f32268c && !this.d) {
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
        p4.w wVar = (p4.w) this.f32269f;
        int i10 = this.f32267b;
        WeakReference weakReference = (WeakReference) this.f32272j;
        p4.y.b();
        if (!this.f32268c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f44725g == this && ((lVar = (c0.l) this.f32273k) == null || !lVar.isCancelled())) {
                this.f32268c = true;
                eVar.f44725g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f44722b;
                    if (eVar2.d == wVar) {
                        Message obtainMessage = eVar2.f44721a.obtainMessage(263, wVar);
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
                    p4.b bVar = eVar3.f44721a;
                    p4.w wVar2 = (p4.w) this.f32270g;
                    eVar3.d = wVar2;
                    eVar3.e = (p4.q) this.e;
                    p4.w wVar3 = (p4.w) this.h;
                    if (wVar3 == null) {
                        Message obtainMessage2 = bVar.obtainMessage(262, new q0.b(wVar, wVar2));
                        obtainMessage2.arg1 = i10;
                        obtainMessage2.sendToTarget();
                    } else {
                        Message obtainMessage3 = bVar.obtainMessage(264, new q0.b(wVar3, wVar2));
                        obtainMessage3.arg1 = i10;
                        obtainMessage3.sendToTarget();
                    }
                    eVar3.f44722b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f32271i;
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
        uj0 uj0Var;
        s4.g0 g0Var;
        long j10;
        HashMap hashMap = (HashMap) this.f32273k;
        SparseArray sparseArray = (SparseArray) this.f32272j;
        s4.a0 a0Var = (s4.a0) this.f32269f;
        uk0 uk0Var = (uk0) this.e;
        if (!uk0Var.V1) {
            if (uk0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.l0 itemAnimator = uk0Var.getItemAnimator();
                    rj0 rj0Var = new rj0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        d(i10, i11, z10, false);
                    } else {
                        itemAnimator.f47977b.add(rj0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (uk0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f32267b == -1) {
                a0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = uk0Var.getChildCount();
            if (childCount != 0 && org.telegram.messenger.wp.d1().getBoolean("view_animations", true)) {
                if (this.f32267b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                uk0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                s4.g0 adapter = uk0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = uk0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    a0Var.getClass();
                    sparseArray.put(s4.n0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f47944b && !this.f32268c)) {
                        g0Var = adapter;
                    } else {
                        if (this.f32268c) {
                            int b10 = ((s4.o0) childAt.getLayoutParams()).f48003a.b();
                            if (b10 < 0) {
                                g0Var = adapter;
                                i12++;
                                adapter = g0Var;
                            } else {
                                g0Var = adapter;
                                j10 = adapter.c(b10);
                            }
                        } else {
                            g0Var = adapter;
                            j10 = ((s4.o0) childAt.getLayoutParams()).f48003a.e;
                        }
                        hashMap.put(Long.valueOf(j10), childAt);
                    }
                    if (childAt instanceof org.telegram.ui.Cells.r4) {
                        ((org.telegram.ui.Cells.r4) childAt).b(true, true);
                    }
                    i12++;
                    adapter = g0Var;
                }
                s4.g0 g0Var2 = adapter;
                uk0Var.C0();
                uk0Var.p0();
                kg.s0 s0Var = uk0Var.d;
                s0Var.m((ArrayList) s0Var.d);
                s0Var.m((ArrayList) s0Var.e);
                s0Var.f11264b = 0;
                hf.e eVar = uk0Var.f1894b;
                s4.g0 g0Var3 = uk0Var.f1922x;
                eVar.d(g0Var3, g0Var3);
                uk0Var.f1918u0.f48067f = true;
                uk0Var.e.w();
                eVar.l();
                if (g0Var2 instanceof uj0) {
                    uj0Var = (uj0) g0Var2;
                } else {
                    uj0Var = null;
                }
                uj0 uj0Var2 = uj0Var;
                a0Var.i1(i10, i11, z10);
                if (g0Var2 != null) {
                    g0Var2.f();
                }
                uk0Var.C0();
                uk0Var.setVerticalScrollBarEnabled(false);
                w7.d6 d6Var = (w7.d6) this.f32271i;
                if (d6Var != null) {
                    d6Var.c();
                }
                uk0Var.V1 = true;
                if (uj0Var2 != null) {
                    uj0Var2.f30975c = true;
                    uj0Var2.d = false;
                    uj0Var2.e.clear();
                    uj0Var2.f30976f.clear();
                }
                uk0Var.addOnLayoutChangeListener(new tj0(this, g0Var2, arrayList, z12, uj0Var2));
                return;
            }
            a0Var.i1(i10, i11, z10);
        }
    }

    public void e(w7.d6 d6Var) {
        this.f32271i = d6Var;
    }

    public wj0(p4.e eVar, p4.w wVar, p4.q qVar, int i10, p4.w wVar2, Collection collection) {
        this.f32266a = 1;
        this.f32273k = null;
        this.f32268c = false;
        this.d = false;
        this.f32272j = new WeakReference(eVar);
        this.f32270g = wVar;
        this.e = qVar;
        this.f32267b = i10;
        this.f32269f = eVar.d;
        this.h = wVar2;
        this.f32271i = collection != null ? new ArrayList(collection) : null;
        eVar.f44721a.postDelayed(new org.telegram.ui.ActionBar.w5(this, 23), 15000L);
    }
}
