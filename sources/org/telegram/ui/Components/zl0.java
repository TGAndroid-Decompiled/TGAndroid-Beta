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
public class zl0 {
    public final int f33429a;
    public int f33430b;
    public boolean f33431c;
    public boolean d;
    public final Object f33432e;
    public final Object f33433f;
    public Object f33434g;
    public Object h;
    public Object f33435i;
    public final Object f33436j;
    public Object f33437k;

    public zl0(wm0 wm0Var, s4.d0 d0Var) {
        this.f33429a = 0;
        this.f33436j = new SparseArray();
        this.f33437k = new HashMap();
        this.f33432e = wm0Var;
        this.f33433f = d0Var;
    }

    public final void a() {
        switch (this.f33429a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f33434g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                wm0 wm0Var = (wm0) this.f33432e;
                wm0Var.setVerticalScrollBarEnabled(true);
                wm0Var.V1 = false;
                s4.i0 adapter = wm0Var.getAdapter();
                if (adapter instanceof xl0) {
                    ((xl0) adapter).E();
                }
                this.f33434g = null;
                int childCount = wm0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = wm0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) childAt).c(false, false);
                    }
                }
                return;
            default:
                p4.q qVar = (p4.q) this.f33432e;
                if (!this.f33431c && !this.d) {
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
        p4.w wVar = (p4.w) this.f33433f;
        int i10 = this.f33430b;
        WeakReference weakReference = (WeakReference) this.f33436j;
        p4.y.b();
        if (!this.f33431c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f45219g == this && ((kVar = (c0.k) this.f33437k) == null || !kVar.isCancelled())) {
                this.f33431c = true;
                eVar.f45219g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f45215b;
                    if (eVar2.d == wVar) {
                        Message obtainMessage = eVar2.f45214a.obtainMessage(263, wVar);
                        obtainMessage.arg1 = i10;
                        obtainMessage.sendToTarget();
                        p4.q qVar = eVar2.f45217e;
                        if (qVar != null) {
                            qVar.h(i10);
                            eVar2.f45217e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (p4.q qVar2 : hashMap.values()) {
                                qVar2.h(i10);
                                qVar2.d();
                            }
                            hashMap.clear();
                        }
                        eVar2.f45217e = null;
                    }
                }
                p4.e eVar3 = (p4.e) weakReference.get();
                if (eVar3 != null) {
                    p4.b bVar = eVar3.f45214a;
                    p4.w wVar2 = (p4.w) this.f33434g;
                    eVar3.d = wVar2;
                    eVar3.f45217e = (p4.q) this.f33432e;
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
                    eVar3.f45215b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f33435i;
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
        xl0 xl0Var;
        s4.i0 i0Var;
        long j3;
        HashMap hashMap = (HashMap) this.f33437k;
        SparseArray sparseArray = (SparseArray) this.f33436j;
        s4.d0 d0Var = (s4.d0) this.f33433f;
        wm0 wm0Var = (wm0) this.f33432e;
        if (!wm0Var.V1) {
            if (wm0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.n0 itemAnimator = wm0Var.getItemAnimator();
                    ul0 ul0Var = new ul0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        d(i10, i11, z10, false);
                    } else {
                        itemAnimator.f47980b.add(ul0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (wm0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f33430b == -1) {
                d0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = wm0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f33430b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                wm0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                s4.i0 adapter = wm0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = wm0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    d0Var.getClass();
                    sparseArray.put(s4.p0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f47944b && !this.f33431c)) {
                        i0Var = adapter;
                    } else {
                        if (this.f33431c) {
                            int b10 = ((s4.q0) childAt.getLayoutParams()).f48011a.b();
                            if (b10 < 0) {
                                i0Var = adapter;
                                i12++;
                                adapter = i0Var;
                            } else {
                                i0Var = adapter;
                                j3 = adapter.i(b10);
                            }
                        } else {
                            i0Var = adapter;
                            j3 = ((s4.q0) childAt.getLayoutParams()).f48011a.f47892e;
                        }
                        hashMap.put(Long.valueOf(j3), childAt);
                    }
                    if (childAt instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) childAt).c(true, true);
                    }
                    i12++;
                    adapter = i0Var;
                }
                s4.i0 i0Var2 = adapter;
                wm0Var.B0();
                wm0Var.o0();
                ra.a aVar = wm0Var.d;
                aVar.m((ArrayList) aVar.d);
                aVar.m((ArrayList) aVar.f47345e);
                aVar.f47343b = 0;
                pf.e eVar = wm0Var.f3138b;
                s4.i0 i0Var3 = wm0Var.f3165w;
                eVar.d(i0Var3, i0Var3);
                wm0Var.f3163u0.f47843f = true;
                wm0Var.f3143e.S();
                eVar.l();
                if (i0Var2 instanceof xl0) {
                    xl0Var = (xl0) i0Var2;
                } else {
                    xl0Var = null;
                }
                xl0 xl0Var2 = xl0Var;
                d0Var.i1(i10, i11, z10);
                if (i0Var2 != null) {
                    i0Var2.l();
                }
                wm0Var.B0();
                wm0Var.setVerticalScrollBarEnabled(false);
                w7.x5 x5Var = (w7.x5) this.f33435i;
                if (x5Var != null) {
                    x5Var.c();
                }
                wm0Var.V1 = true;
                if (xl0Var2 != null) {
                    xl0Var2.f32808c = true;
                    xl0Var2.d = false;
                    xl0Var2.f32809e.clear();
                    xl0Var2.f32810f.clear();
                }
                wm0Var.addOnLayoutChangeListener(new wl0(this, i0Var2, arrayList, z12, xl0Var2));
                return;
            }
            d0Var.i1(i10, i11, z10);
        }
    }

    public void e(w7.x5 x5Var) {
        this.f33435i = x5Var;
    }

    public zl0(p4.e eVar, p4.w wVar, p4.q qVar, int i10, p4.w wVar2, Collection collection) {
        this.f33429a = 1;
        this.f33437k = null;
        this.f33431c = false;
        this.d = false;
        this.f33436j = new WeakReference(eVar);
        this.f33434g = wVar;
        this.f33432e = qVar;
        this.f33430b = i10;
        this.f33433f = eVar.d;
        this.h = wVar2;
        this.f33435i = collection != null ? new ArrayList(collection) : null;
        eVar.f45214a.postDelayed(new org.telegram.ui.web.t0(this, 8), 15000L);
    }
}
