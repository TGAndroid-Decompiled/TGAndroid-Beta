package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
public class vj0 {
    public final int f31272a;
    public int f31273b;
    public boolean f31274c;
    public boolean d;
    public final Object e;
    public final Object f31275f;
    public Object f31276g;
    public Object h;
    public Object f31277i;
    public final Object f31278j;
    public Object f31279k;

    public vj0(tk0 tk0Var, s4.a0 a0Var) {
        this.f31272a = 0;
        this.f31278j = new SparseArray();
        this.f31279k = new HashMap();
        this.e = tk0Var;
        this.f31275f = a0Var;
    }

    public final void a() {
        switch (this.f31272a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f31276g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                tk0 tk0Var = (tk0) this.e;
                tk0Var.setVerticalScrollBarEnabled(true);
                tk0Var.V1 = false;
                s4.g0 adapter = tk0Var.getAdapter();
                if (adapter instanceof tj0) {
                    ((tj0) adapter).E();
                }
                this.f31276g = null;
                int childCount = tk0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = tk0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.r4) {
                        ((org.telegram.ui.Cells.r4) childAt).b(false, false);
                    }
                }
                return;
            default:
                p4.q qVar = (p4.q) this.e;
                if (!this.f31274c && !this.d) {
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
        p4.w wVar = (p4.w) this.f31275f;
        int i10 = this.f31273b;
        WeakReference weakReference = (WeakReference) this.f31278j;
        p4.y.b();
        if (!this.f31274c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f44714g == this && ((lVar = (c0.l) this.f31279k) == null || !lVar.isCancelled())) {
                this.f31274c = true;
                eVar.f44714g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f44711b;
                    if (eVar2.d == wVar) {
                        Message obtainMessage = eVar2.f44710a.obtainMessage(263, wVar);
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
                    p4.b bVar = eVar3.f44710a;
                    p4.w wVar2 = (p4.w) this.f31276g;
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
                    eVar3.f44711b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f31277i;
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
        tj0 tj0Var;
        s4.g0 g0Var;
        long j10;
        HashMap hashMap = (HashMap) this.f31279k;
        SparseArray sparseArray = (SparseArray) this.f31278j;
        s4.a0 a0Var = (s4.a0) this.f31275f;
        tk0 tk0Var = (tk0) this.e;
        if (!tk0Var.V1) {
            if (tk0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.l0 itemAnimator = tk0Var.getItemAnimator();
                    qj0 qj0Var = new qj0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        d(i10, i11, z10, false);
                    } else {
                        itemAnimator.f47966b.add(qj0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (tk0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f31273b == -1) {
                a0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = tk0Var.getChildCount();
            if (childCount != 0 && org.telegram.messenger.vp.d1().getBoolean("view_animations", true)) {
                if (this.f31273b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                tk0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                s4.g0 adapter = tk0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = tk0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    a0Var.getClass();
                    sparseArray.put(s4.n0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f47933b && !this.f31274c)) {
                        g0Var = adapter;
                    } else {
                        if (this.f31274c) {
                            int b10 = ((s4.o0) childAt.getLayoutParams()).f47992a.b();
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
                            j10 = ((s4.o0) childAt.getLayoutParams()).f47992a.e;
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
                tk0Var.C0();
                tk0Var.p0();
                kg.s0 s0Var = tk0Var.d;
                s0Var.m((ArrayList) s0Var.d);
                s0Var.m((ArrayList) s0Var.e);
                s0Var.f11263b = 0;
                hf.e eVar = tk0Var.f1894b;
                s4.g0 g0Var3 = tk0Var.f1922x;
                eVar.d(g0Var3, g0Var3);
                tk0Var.f1918u0.f48056f = true;
                tk0Var.e.w();
                eVar.l();
                if (g0Var2 instanceof tj0) {
                    tj0Var = (tj0) g0Var2;
                } else {
                    tj0Var = null;
                }
                tj0 tj0Var2 = tj0Var;
                a0Var.i1(i10, i11, z10);
                if (g0Var2 != null) {
                    g0Var2.f();
                }
                tk0Var.C0();
                tk0Var.setVerticalScrollBarEnabled(false);
                w7.d6 d6Var = (w7.d6) this.f31277i;
                if (d6Var != null) {
                    d6Var.c();
                }
                tk0Var.V1 = true;
                if (tj0Var2 != null) {
                    tj0Var2.f30593c = true;
                    tj0Var2.d = false;
                    tj0Var2.e.clear();
                    tj0Var2.f30594f.clear();
                }
                tk0Var.addOnLayoutChangeListener(new sj0(this, g0Var2, arrayList, z12, tj0Var2));
                return;
            }
            a0Var.i1(i10, i11, z10);
        }
    }

    public void e(w7.d6 d6Var) {
        this.f31277i = d6Var;
    }

    public vj0(p4.e eVar, p4.w wVar, p4.q qVar, int i10, p4.w wVar2, Collection collection) {
        this.f31272a = 1;
        this.f31279k = null;
        this.f31274c = false;
        this.d = false;
        this.f31278j = new WeakReference(eVar);
        this.f31276g = wVar;
        this.e = qVar;
        this.f31273b = i10;
        this.f31275f = eVar.d;
        this.h = wVar2;
        this.f31277i = collection != null ? new ArrayList(collection) : null;
        eVar.f44710a.postDelayed(new org.telegram.ui.ActionBar.w5(this, 23), 15000L);
    }
}
