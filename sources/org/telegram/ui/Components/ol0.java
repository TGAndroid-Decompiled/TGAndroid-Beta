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
public class ol0 {
    public final int f29316a;
    public int f29317b;
    public boolean f29318c;
    public boolean d;
    public final Object e;
    public final Object f29319f;
    public Object f29320g;
    public Object h;
    public Object f29321i;
    public final Object f29322j;
    public Object f29323k;

    public ol0(lm0 lm0Var, s4.b0 b0Var) {
        this.f29316a = 0;
        this.f29322j = new SparseArray();
        this.f29323k = new HashMap();
        this.e = lm0Var;
        this.f29319f = b0Var;
    }

    public final void a() {
        switch (this.f29316a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f29320g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                lm0 lm0Var = (lm0) this.e;
                lm0Var.setVerticalScrollBarEnabled(true);
                lm0Var.V1 = false;
                s4.g0 adapter = lm0Var.getAdapter();
                if (adapter instanceof ml0) {
                    ((ml0) adapter).E();
                }
                this.f29320g = null;
                int childCount = lm0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = lm0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.n4) {
                        ((org.telegram.ui.Cells.n4) childAt).d(false, false);
                    }
                }
                return;
            default:
                p4.q qVar = (p4.q) this.e;
                if (!this.f29318c && !this.d) {
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
        p4.v vVar = (p4.v) this.f29319f;
        int i10 = this.f29317b;
        WeakReference weakReference = (WeakReference) this.f29322j;
        p4.x.b();
        if (!this.f29318c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f44519g == this && ((lVar = (c0.l) this.f29323k) == null || !lVar.isCancelled())) {
                this.f29318c = true;
                eVar.f44519g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f44516b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f44515a.obtainMessage(263, vVar);
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
                    p4.b bVar = eVar3.f44515a;
                    p4.v vVar2 = (p4.v) this.f29320g;
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
                    eVar3.f44516b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f29321i;
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
        ml0 ml0Var;
        s4.g0 g0Var;
        long j10;
        HashMap hashMap = (HashMap) this.f29323k;
        SparseArray sparseArray = (SparseArray) this.f29322j;
        s4.b0 b0Var = (s4.b0) this.f29319f;
        lm0 lm0Var = (lm0) this.e;
        if (!lm0Var.V1) {
            if (lm0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.l0 itemAnimator = lm0Var.getItemAnimator();
                    jl0 jl0Var = new jl0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        c(i10, i11, z10, false);
                    } else {
                        itemAnimator.f46420b.add(jl0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (lm0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f29317b == -1) {
                b0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = lm0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f29317b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                lm0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                s4.g0 adapter = lm0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = lm0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    b0Var.getClass();
                    sparseArray.put(s4.n0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f46388b && !this.f29318c)) {
                        g0Var = adapter;
                    } else {
                        if (this.f29318c) {
                            int b10 = ((s4.o0) childAt.getLayoutParams()).f46446a.b();
                            if (b10 < 0) {
                                g0Var = adapter;
                                i12++;
                                adapter = g0Var;
                            } else {
                                g0Var = adapter;
                                j10 = adapter.i(b10);
                            }
                        } else {
                            g0Var = adapter;
                            j10 = ((s4.o0) childAt.getLayoutParams()).f46446a.e;
                        }
                        hashMap.put(Long.valueOf(j10), childAt);
                    }
                    if (childAt instanceof org.telegram.ui.Cells.n4) {
                        ((org.telegram.ui.Cells.n4) childAt).d(true, true);
                    }
                    i12++;
                    adapter = g0Var;
                }
                s4.g0 g0Var2 = adapter;
                lm0Var.B0();
                lm0Var.o0();
                s4.b bVar = lm0Var.d;
                bVar.m((ArrayList) bVar.d);
                bVar.m((ArrayList) bVar.e);
                bVar.f46326b = 0;
                qf.e eVar = lm0Var.f3610b;
                s4.g0 g0Var3 = lm0Var.f3636w;
                eVar.d(g0Var3, g0Var3);
                lm0Var.f3634u0.f46501f = true;
                lm0Var.e.R();
                eVar.l();
                if (g0Var2 instanceof ml0) {
                    ml0Var = (ml0) g0Var2;
                } else {
                    ml0Var = null;
                }
                ml0 ml0Var2 = ml0Var;
                b0Var.i1(i10, i11, z10);
                if (g0Var2 != null) {
                    g0Var2.l();
                }
                lm0Var.B0();
                lm0Var.setVerticalScrollBarEnabled(false);
                w7.a6 a6Var = (w7.a6) this.f29321i;
                if (a6Var != null) {
                    a6Var.c();
                }
                lm0Var.V1 = true;
                if (ml0Var2 != null) {
                    ml0Var2.f28622c = true;
                    ml0Var2.d = false;
                    ml0Var2.e.clear();
                    ml0Var2.f28623f.clear();
                }
                lm0Var.addOnLayoutChangeListener(new ll0(this, g0Var2, arrayList, z12, ml0Var2));
                return;
            }
            b0Var.i1(i10, i11, z10);
        }
    }

    public void d(w7.a6 a6Var) {
        this.f29321i = a6Var;
    }

    public ol0(p4.e eVar, p4.v vVar, p4.q qVar, int i10, p4.v vVar2, Collection collection) {
        this.f29316a = 1;
        this.f29323k = null;
        this.f29318c = false;
        this.d = false;
        this.f29322j = new WeakReference(eVar);
        this.f29320g = vVar;
        this.e = qVar;
        this.f29317b = i10;
        this.f29319f = eVar.d;
        this.h = vVar2;
        this.f29321i = collection != null ? new ArrayList(collection) : null;
        eVar.f44515a.postDelayed(new org.telegram.ui.web.a2(this, 3), 15000L);
    }
}
