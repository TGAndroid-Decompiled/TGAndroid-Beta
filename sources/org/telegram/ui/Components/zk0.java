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
public class zk0 {
    public final int f30913a;
    public int f30914b;
    public boolean f30915c;
    public boolean d;
    public final Object e;
    public final Object f30916f;
    public Object f30917g;
    public Object h;
    public Object f30918i;
    public final Object f30919j;
    public Object f30920k;

    public zk0(wl0 wl0Var, s4.c0 c0Var) {
        this.f30913a = 0;
        this.f30919j = new SparseArray();
        this.f30920k = new HashMap();
        this.e = wl0Var;
        this.f30916f = c0Var;
    }

    public final void a() {
        switch (this.f30913a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f30917g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                wl0 wl0Var = (wl0) this.e;
                wl0Var.setVerticalScrollBarEnabled(true);
                wl0Var.X1 = false;
                s4.h0 adapter = wl0Var.getAdapter();
                if (adapter instanceof xk0) {
                    ((xk0) adapter).E();
                }
                this.f30917g = null;
                int childCount = wl0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = wl0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) childAt).c(false, false);
                    }
                }
                return;
            default:
                p4.q qVar = (p4.q) this.e;
                if (!this.f30915c && !this.d) {
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
        p4.v vVar = (p4.v) this.f30916f;
        int i10 = this.f30914b;
        WeakReference weakReference = (WeakReference) this.f30919j;
        p4.x.b();
        if (!this.f30915c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f40823g == this && ((kVar = (c0.k) this.f30920k) == null || !kVar.isCancelled())) {
                this.f30915c = true;
                eVar.f40823g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f40820b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f40819a.obtainMessage(263, vVar);
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
                    p4.b bVar = eVar3.f40819a;
                    p4.v vVar2 = (p4.v) this.f30917g;
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
                    eVar3.f40820b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f30918i;
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
        xk0 xk0Var;
        s4.h0 h0Var;
        long j3;
        HashMap hashMap = (HashMap) this.f30920k;
        SparseArray sparseArray = (SparseArray) this.f30919j;
        s4.c0 c0Var = (s4.c0) this.f30916f;
        wl0 wl0Var = (wl0) this.e;
        if (!wl0Var.X1) {
            if (wl0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.m0 itemAnimator = wl0Var.getItemAnimator();
                    uk0 uk0Var = new uk0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        c(i10, i11, z10, false);
                    } else {
                        itemAnimator.f43040b.add(uk0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (wl0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f30914b == -1) {
                c0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = wl0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f30914b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                wl0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                s4.h0 adapter = wl0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = wl0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    c0Var.getClass();
                    sparseArray.put(s4.o0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f43010b && !this.f30915c)) {
                        h0Var = adapter;
                    } else {
                        if (this.f30915c) {
                            int b10 = ((s4.p0) childAt.getLayoutParams()).f43066a.b();
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
                            j3 = ((s4.p0) childAt.getLayoutParams()).f43066a.e;
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
                wl0Var.B0();
                wl0Var.o0();
                ra.a aVar = wl0Var.d;
                aVar.m((ArrayList) aVar.d);
                aVar.m((ArrayList) aVar.e);
                aVar.f42462b = 0;
                of.e eVar = wl0Var.f2832b;
                s4.h0 h0Var3 = wl0Var.f2858w;
                eVar.d(h0Var3, h0Var3);
                wl0Var.f2855t0.f43121f = true;
                wl0Var.e.S();
                eVar.l();
                if (h0Var2 instanceof xk0) {
                    xk0Var = (xk0) h0Var2;
                } else {
                    xk0Var = null;
                }
                xk0 xk0Var2 = xk0Var;
                c0Var.i1(i10, i11, z10);
                if (h0Var2 != null) {
                    h0Var2.l();
                }
                wl0Var.B0();
                wl0Var.setVerticalScrollBarEnabled(false);
                w7.z5 z5Var = (w7.z5) this.f30918i;
                if (z5Var != null) {
                    z5Var.c();
                }
                wl0Var.X1 = true;
                if (xk0Var2 != null) {
                    xk0Var2.f30353c = true;
                    xk0Var2.d = false;
                    xk0Var2.e.clear();
                    xk0Var2.f30354f.clear();
                }
                wl0Var.addOnLayoutChangeListener(new wk0(this, h0Var2, arrayList, z12, xk0Var2));
                return;
            }
            c0Var.i1(i10, i11, z10);
        }
    }

    public void d(w7.z5 z5Var) {
        this.f30918i = z5Var;
    }

    public zk0(p4.e eVar, p4.v vVar, p4.q qVar, int i10, p4.v vVar2, Collection collection) {
        this.f30913a = 1;
        this.f30920k = null;
        this.f30915c = false;
        this.d = false;
        this.f30919j = new WeakReference(eVar);
        this.f30917g = vVar;
        this.e = qVar;
        this.f30914b = i10;
        this.f30916f = eVar.d;
        this.h = vVar2;
        this.f30918i = collection != null ? new ArrayList(collection) : null;
        eVar.f40819a.postDelayed(new org.telegram.ui.web.q0(this, 9), 15000L);
    }
}
