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
    public final int f23028a;
    public int f23029b;
    public boolean f23030c;
    public boolean d;
    public final Object e;
    public final Object f23031f;
    public Object f23032g;
    public Object h;
    public Object f23033i;
    public final Object f23034j;
    public Object f23035k;

    public bl0(yl0 yl0Var, s4.c0 c0Var) {
        this.f23028a = 0;
        this.f23034j = new SparseArray();
        this.f23035k = new HashMap();
        this.e = yl0Var;
        this.f23031f = c0Var;
    }

    public final void a() {
        switch (this.f23028a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f23032g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                yl0 yl0Var = (yl0) this.e;
                yl0Var.setVerticalScrollBarEnabled(true);
                yl0Var.X1 = false;
                s4.h0 adapter = yl0Var.getAdapter();
                if (adapter instanceof zk0) {
                    ((zk0) adapter).E();
                }
                this.f23032g = null;
                int childCount = yl0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = yl0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) childAt).c(false, false);
                    }
                }
                return;
            default:
                p4.q qVar = (p4.q) this.e;
                if (!this.f23030c && !this.d) {
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
        p4.v vVar = (p4.v) this.f23031f;
        int i10 = this.f23029b;
        WeakReference weakReference = (WeakReference) this.f23034j;
        p4.x.b();
        if (!this.f23030c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f40871g == this && ((kVar = (c0.k) this.f23035k) == null || !kVar.isCancelled())) {
                this.f23030c = true;
                eVar.f40871g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f40868b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f40867a.obtainMessage(263, vVar);
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
                    p4.b bVar = eVar3.f40867a;
                    p4.v vVar2 = (p4.v) this.f23032g;
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
                    eVar3.f40868b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f23033i;
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
        HashMap hashMap = (HashMap) this.f23035k;
        SparseArray sparseArray = (SparseArray) this.f23034j;
        s4.c0 c0Var = (s4.c0) this.f23031f;
        yl0 yl0Var = (yl0) this.e;
        if (!yl0Var.X1) {
            if (yl0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.m0 itemAnimator = yl0Var.getItemAnimator();
                    wk0 wk0Var = new wk0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        d(i10, i11, z10, false);
                    } else {
                        itemAnimator.f43075b.add(wk0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (yl0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f23029b == -1) {
                c0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = yl0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f23029b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                yl0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                s4.h0 adapter = yl0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = yl0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    c0Var.getClass();
                    sparseArray.put(s4.o0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f43045b && !this.f23030c)) {
                        h0Var = adapter;
                    } else {
                        if (this.f23030c) {
                            int b10 = ((s4.p0) childAt.getLayoutParams()).f43101a.b();
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
                            j3 = ((s4.p0) childAt.getLayoutParams()).f43101a.e;
                        }
                        hashMap.put(Long.valueOf(j3), childAt);
                    }
                    if (childAt instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) childAt).c(true, true);
                    }
                    i12++;
                    adapter = h0Var;
                }
                s4.h0 h0Var2 = adapter;
                yl0Var.C0();
                yl0Var.p0();
                ra.a aVar = yl0Var.d;
                aVar.m((ArrayList) aVar.d);
                aVar.m((ArrayList) aVar.e);
                aVar.f42497b = 0;
                of.e eVar = yl0Var.f2839b;
                s4.h0 h0Var3 = yl0Var.f2865w;
                eVar.d(h0Var3, h0Var3);
                yl0Var.f2862t0.f43156f = true;
                yl0Var.e.S();
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
                yl0Var.C0();
                yl0Var.setVerticalScrollBarEnabled(false);
                w7.z5 z5Var = (w7.z5) this.f23033i;
                if (z5Var != null) {
                    z5Var.c();
                }
                yl0Var.X1 = true;
                if (zk0Var2 != null) {
                    zk0Var2.f30902c = true;
                    zk0Var2.d = false;
                    zk0Var2.e.clear();
                    zk0Var2.f30903f.clear();
                }
                yl0Var.addOnLayoutChangeListener(new yk0(this, h0Var2, arrayList, z12, zk0Var2));
                return;
            }
            c0Var.i1(i10, i11, z10);
        }
    }

    public void e(w7.z5 z5Var) {
        this.f23033i = z5Var;
    }

    public bl0(p4.e eVar, p4.v vVar, p4.q qVar, int i10, p4.v vVar2, Collection collection) {
        this.f23028a = 1;
        this.f23035k = null;
        this.f23030c = false;
        this.d = false;
        this.f23034j = new WeakReference(eVar);
        this.f23032g = vVar;
        this.e = qVar;
        this.f23029b = i10;
        this.f23031f = eVar.d;
        this.h = vVar2;
        this.f23033i = collection != null ? new ArrayList(collection) : null;
        eVar.f40867a.postDelayed(new org.telegram.ui.web.r0(this, 9), 15000L);
    }
}
