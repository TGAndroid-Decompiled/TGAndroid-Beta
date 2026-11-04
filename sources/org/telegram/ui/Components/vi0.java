package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
public class vi0 {
    public final int f39125a;
    public int f39126b;
    public boolean f39127c;
    public boolean d;
    public final Object f39128e;
    public final Object f39129f;
    public Object f39130g;
    public Object h;
    public Object f39131i;
    public final Object f39132j;
    public Object f39133k;

    public vi0(tj0 tj0Var, u4.b0 b0Var) {
        this.f39125a = 0;
        this.f39132j = new SparseArray();
        this.f39133k = new HashMap();
        this.f39128e = tj0Var;
        this.f39129f = b0Var;
    }

    public final void a() {
        switch (this.f39125a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f39130g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                tj0 tj0Var = (tj0) this.f39128e;
                tj0Var.setVerticalScrollBarEnabled(true);
                tj0Var.W1 = false;
                u4.h0 adapter = tj0Var.getAdapter();
                if (adapter instanceof ti0) {
                    ((ti0) adapter).E();
                }
                this.f39130g = null;
                int childCount = tj0Var.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = tj0Var.getChildAt(i3);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) childAt).b(false, false);
                    }
                }
                return;
            default:
                r4.q qVar = (r4.q) this.f39128e;
                if (!this.f39127c && !this.d) {
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
        r4.w wVar = (r4.w) this.f39129f;
        int i3 = this.f39126b;
        WeakReference weakReference = (WeakReference) this.f39132j;
        r4.y.b();
        if (!this.f39127c && !this.d) {
            r4.e eVar = (r4.e) weakReference.get();
            if (eVar != null && eVar.f54262g == this && ((lVar = (c0.l) this.f39133k) == null || !lVar.isCancelled())) {
                this.f39127c = true;
                eVar.f54262g = null;
                r4.e eVar2 = (r4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f54258b;
                    if (eVar2.d == wVar) {
                        Message obtainMessage = eVar2.f54257a.obtainMessage(263, wVar);
                        obtainMessage.arg1 = i3;
                        obtainMessage.sendToTarget();
                        r4.q qVar = eVar2.f54260e;
                        if (qVar != null) {
                            qVar.h(i3);
                            eVar2.f54260e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (r4.q qVar2 : hashMap.values()) {
                                qVar2.h(i3);
                                qVar2.d();
                            }
                            hashMap.clear();
                        }
                        eVar2.f54260e = null;
                    }
                }
                r4.e eVar3 = (r4.e) weakReference.get();
                if (eVar3 != null) {
                    r4.b bVar = eVar3.f54257a;
                    r4.w wVar2 = (r4.w) this.f39130g;
                    eVar3.d = wVar2;
                    eVar3.f54260e = (r4.q) this.f39128e;
                    r4.w wVar3 = (r4.w) this.h;
                    if (wVar3 == null) {
                        Message obtainMessage2 = bVar.obtainMessage(262, new q0.b(wVar, wVar2));
                        obtainMessage2.arg1 = i3;
                        obtainMessage2.sendToTarget();
                    } else {
                        Message obtainMessage3 = bVar.obtainMessage(264, new q0.b(wVar3, wVar2));
                        obtainMessage3.arg1 = i3;
                        obtainMessage3.sendToTarget();
                    }
                    eVar3.f54258b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f39131i;
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

    public void c(int i3, int i10, boolean z10) {
        d(i3, i10, z10, false);
    }

    public void d(int i3, int i10, boolean z10, boolean z11) {
        boolean z12;
        ti0 ti0Var;
        u4.h0 h0Var;
        long j10;
        HashMap hashMap = (HashMap) this.f39133k;
        SparseArray sparseArray = (SparseArray) this.f39132j;
        u4.b0 b0Var = (u4.b0) this.f39129f;
        tj0 tj0Var = (tj0) this.f39128e;
        if (!tj0Var.W1) {
            if (tj0Var.getItemAnimator() != null) {
                if (z11) {
                    u4.m0 itemAnimator = tj0Var.getItemAnimator();
                    pi0 pi0Var = new pi0(this, i3, i10, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        d(i3, i10, z10, false);
                    } else {
                        itemAnimator.f55615b.add(pi0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (tj0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f39126b == -1) {
                b0Var.i1(i3, i10, z10);
                return;
            }
            int childCount = tj0Var.getChildCount();
            if (childCount != 0 && org.telegram.messenger.hp.e1().getBoolean("view_animations", true)) {
                if (this.f39126b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                tj0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                u4.h0 adapter = tj0Var.getAdapter();
                hashMap.clear();
                int i11 = 0;
                while (i11 < childCount) {
                    View childAt = tj0Var.getChildAt(i11);
                    arrayList.add(childAt);
                    b0Var.getClass();
                    sparseArray.put(u4.o0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f55580b && !this.f39127c)) {
                        h0Var = adapter;
                    } else {
                        if (this.f39127c) {
                            int b10 = ((u4.p0) childAt.getLayoutParams()).f55645a.b();
                            if (b10 < 0) {
                                h0Var = adapter;
                                i11++;
                                adapter = h0Var;
                            } else {
                                h0Var = adapter;
                                j10 = adapter.c(b10);
                            }
                        } else {
                            h0Var = adapter;
                            j10 = ((u4.p0) childAt.getLayoutParams()).f55645a.f55543e;
                        }
                        hashMap.put(Long.valueOf(j10), childAt);
                    }
                    if (childAt instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) childAt).b(true, true);
                    }
                    i11++;
                    adapter = h0Var;
                }
                u4.h0 h0Var2 = adapter;
                tj0Var.C0();
                tj0Var.p0();
                u4.b bVar = tj0Var.d;
                bVar.l((ArrayList) bVar.d);
                bVar.l((ArrayList) bVar.f55506e);
                bVar.f55504b = 0;
                tf.e eVar = tj0Var.f2274b;
                u4.h0 h0Var3 = tj0Var.f2303x;
                eVar.d(h0Var3, h0Var3);
                tj0Var.f2300v0.f55494f = true;
                tj0Var.f2279e.B();
                eVar.l();
                if (h0Var2 instanceof ti0) {
                    ti0Var = (ti0) h0Var2;
                } else {
                    ti0Var = null;
                }
                ti0 ti0Var2 = ti0Var;
                b0Var.i1(i3, i10, z10);
                if (h0Var2 != null) {
                    h0Var2.f();
                }
                tj0Var.C0();
                tj0Var.setVerticalScrollBarEnabled(false);
                b8.of ofVar = (b8.of) this.f39131i;
                if (ofVar != null) {
                    ofVar.c();
                }
                tj0Var.W1 = true;
                if (ti0Var2 != null) {
                    ti0Var2.f38421c = true;
                    ti0Var2.d = false;
                    ti0Var2.f38422e.clear();
                    ti0Var2.f38423f.clear();
                }
                tj0Var.addOnLayoutChangeListener(new si0(this, h0Var2, arrayList, z12, ti0Var2));
                return;
            }
            b0Var.i1(i3, i10, z10);
        }
    }

    public void e(b8.of ofVar) {
        this.f39131i = ofVar;
    }

    public vi0(r4.e eVar, r4.w wVar, r4.q qVar, int i3, r4.w wVar2, Collection collection) {
        this.f39125a = 1;
        this.f39133k = null;
        this.f39127c = false;
        this.d = false;
        this.f39132j = new WeakReference(eVar);
        this.f39130g = wVar;
        this.f39128e = qVar;
        this.f39126b = i3;
        this.f39129f = eVar.d;
        this.h = wVar2;
        this.f39131i = collection != null ? new ArrayList(collection) : null;
        eVar.f54257a.postDelayed(new r4.u(this, 0), 15000L);
    }
}
