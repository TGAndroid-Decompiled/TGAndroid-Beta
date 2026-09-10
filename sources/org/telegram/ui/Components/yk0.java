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
public class yk0 {
    public final int f29443a;
    public int f29444b;
    public boolean f29445c;
    public boolean d;
    public final Object e;
    public final Object f29446f;
    public Object f29447g;
    public Object h;
    public Object f29448i;
    public final Object f29449j;
    public Object f29450k;

    public yk0(vl0 vl0Var, s4.c0 c0Var) {
        this.f29443a = 0;
        this.f29449j = new SparseArray();
        this.f29450k = new HashMap();
        this.e = vl0Var;
        this.f29446f = c0Var;
    }

    public final void a() {
        switch (this.f29443a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f29447g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                vl0 vl0Var = (vl0) this.e;
                vl0Var.setVerticalScrollBarEnabled(true);
                vl0Var.X1 = false;
                s4.h0 adapter = vl0Var.getAdapter();
                if (adapter instanceof wk0) {
                    ((wk0) adapter).E();
                }
                this.f29447g = null;
                int childCount = vl0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = vl0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) childAt).c(false, false);
                    }
                }
                return;
            default:
                p4.q qVar = (p4.q) this.e;
                if (!this.f29445c && !this.d) {
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
        p4.v vVar = (p4.v) this.f29446f;
        int i10 = this.f29444b;
        WeakReference weakReference = (WeakReference) this.f29449j;
        p4.x.b();
        if (!this.f29445c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f39681g == this && ((kVar = (c0.k) this.f29450k) == null || !kVar.isCancelled())) {
                this.f29445c = true;
                eVar.f39681g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f39678b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f39677a.obtainMessage(263, vVar);
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
                    p4.b bVar = eVar3.f39677a;
                    p4.v vVar2 = (p4.v) this.f29447g;
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
                    eVar3.f39678b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f29448i;
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
        wk0 wk0Var;
        s4.h0 h0Var;
        long j3;
        HashMap hashMap = (HashMap) this.f29450k;
        SparseArray sparseArray = (SparseArray) this.f29449j;
        s4.c0 c0Var = (s4.c0) this.f29446f;
        vl0 vl0Var = (vl0) this.e;
        if (!vl0Var.X1) {
            if (vl0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.m0 itemAnimator = vl0Var.getItemAnimator();
                    tk0 tk0Var = new tk0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        c(i10, i11, z10, false);
                    } else {
                        itemAnimator.f41690b.add(tk0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (vl0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f29444b == -1) {
                c0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = vl0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f29444b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                vl0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                s4.h0 adapter = vl0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = vl0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    c0Var.getClass();
                    sparseArray.put(s4.o0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f41660b && !this.f29445c)) {
                        h0Var = adapter;
                    } else {
                        if (this.f29445c) {
                            int b10 = ((s4.p0) childAt.getLayoutParams()).f41716a.b();
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
                            j3 = ((s4.p0) childAt.getLayoutParams()).f41716a.e;
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
                vl0Var.B0();
                vl0Var.o0();
                qg.m0 m0Var = vl0Var.d;
                m0Var.m((ArrayList) m0Var.d);
                m0Var.m((ArrayList) m0Var.e);
                m0Var.f40808b = 0;
                of.e eVar = vl0Var.f1532b;
                s4.h0 h0Var3 = vl0Var.f1558w;
                eVar.d(h0Var3, h0Var3);
                vl0Var.f1555t0.f41771f = true;
                vl0Var.e.R();
                eVar.l();
                if (h0Var2 instanceof wk0) {
                    wk0Var = (wk0) h0Var2;
                } else {
                    wk0Var = null;
                }
                wk0 wk0Var2 = wk0Var;
                c0Var.i1(i10, i11, z10);
                if (h0Var2 != null) {
                    h0Var2.l();
                }
                vl0Var.B0();
                vl0Var.setVerticalScrollBarEnabled(false);
                w7.b6 b6Var = (w7.b6) this.f29448i;
                if (b6Var != null) {
                    b6Var.c();
                }
                vl0Var.X1 = true;
                if (wk0Var2 != null) {
                    wk0Var2.f28786c = true;
                    wk0Var2.d = false;
                    wk0Var2.e.clear();
                    wk0Var2.f28787f.clear();
                }
                vl0Var.addOnLayoutChangeListener(new vk0(this, h0Var2, arrayList, z12, wk0Var2));
                return;
            }
            c0Var.i1(i10, i11, z10);
        }
    }

    public yk0(p4.e eVar, p4.v vVar, p4.q qVar, int i10, p4.v vVar2, Collection collection) {
        this.f29443a = 1;
        this.f29450k = null;
        this.f29445c = false;
        this.d = false;
        this.f29449j = new WeakReference(eVar);
        this.f29447g = vVar;
        this.e = qVar;
        this.f29444b = i10;
        this.f29446f = eVar.d;
        this.h = vVar2;
        this.f29448i = collection != null ? new ArrayList(collection) : null;
        eVar.f39677a.postDelayed(new org.telegram.ui.Components.voip.x(this, 20), 15000L);
    }
}
