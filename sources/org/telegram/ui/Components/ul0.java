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
public class ul0 {
    public final int f31547a;
    public int f31548b;
    public boolean f31549c;
    public boolean d;
    public final Object f31550e;
    public final Object f31551f;
    public Object f31552g;
    public Object h;
    public Object f31553i;
    public final Object f31554j;
    public Object f31555k;

    public ul0(rm0 rm0Var, s4.d0 d0Var) {
        this.f31547a = 0;
        this.f31554j = new SparseArray();
        this.f31555k = new HashMap();
        this.f31550e = rm0Var;
        this.f31551f = d0Var;
    }

    public final void a() {
        switch (this.f31547a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f31552g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                rm0 rm0Var = (rm0) this.f31550e;
                rm0Var.setVerticalScrollBarEnabled(true);
                rm0Var.V1 = false;
                s4.i0 adapter = rm0Var.getAdapter();
                if (adapter instanceof sl0) {
                    ((sl0) adapter).E();
                }
                this.f31552g = null;
                int childCount = rm0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = rm0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) childAt).c(false, false);
                    }
                }
                return;
            default:
                p4.q qVar = (p4.q) this.f31550e;
                if (!this.f31549c && !this.d) {
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
        p4.v vVar = (p4.v) this.f31551f;
        int i10 = this.f31548b;
        WeakReference weakReference = (WeakReference) this.f31554j;
        p4.x.b();
        if (!this.f31549c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f45376g == this && ((kVar = (c0.k) this.f31555k) == null || !kVar.isCancelled())) {
                this.f31549c = true;
                eVar.f45376g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f45372b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f45371a.obtainMessage(263, vVar);
                        obtainMessage.arg1 = i10;
                        obtainMessage.sendToTarget();
                        p4.q qVar = eVar2.f45374e;
                        if (qVar != null) {
                            qVar.h(i10);
                            eVar2.f45374e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (p4.q qVar2 : hashMap.values()) {
                                qVar2.h(i10);
                                qVar2.d();
                            }
                            hashMap.clear();
                        }
                        eVar2.f45374e = null;
                    }
                }
                p4.e eVar3 = (p4.e) weakReference.get();
                if (eVar3 != null) {
                    p4.b bVar = eVar3.f45371a;
                    p4.v vVar2 = (p4.v) this.f31552g;
                    eVar3.d = vVar2;
                    eVar3.f45374e = (p4.q) this.f31550e;
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
                    eVar3.f45372b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f31553i;
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
        sl0 sl0Var;
        s4.i0 i0Var;
        long j3;
        HashMap hashMap = (HashMap) this.f31555k;
        SparseArray sparseArray = (SparseArray) this.f31554j;
        s4.d0 d0Var = (s4.d0) this.f31551f;
        rm0 rm0Var = (rm0) this.f31550e;
        if (!rm0Var.V1) {
            if (rm0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.n0 itemAnimator = rm0Var.getItemAnimator();
                    pl0 pl0Var = new pl0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        c(i10, i11, z10, false);
                    } else {
                        itemAnimator.f47793b.add(pl0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (rm0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f31548b == -1) {
                d0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = rm0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f31548b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                rm0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                s4.i0 adapter = rm0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = rm0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    d0Var.getClass();
                    sparseArray.put(s4.p0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f47757b && !this.f31549c)) {
                        i0Var = adapter;
                    } else {
                        if (this.f31549c) {
                            int b10 = ((s4.q0) childAt.getLayoutParams()).f47824a.b();
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
                            j3 = ((s4.q0) childAt.getLayoutParams()).f47824a.f47705e;
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
                rm0Var.B0();
                rm0Var.o0();
                ra.a aVar = rm0Var.d;
                aVar.m((ArrayList) aVar.d);
                aVar.m((ArrayList) aVar.f47175e);
                aVar.f47173b = 0;
                pf.e eVar = rm0Var.f3140b;
                s4.i0 i0Var3 = rm0Var.f3167w;
                eVar.d(i0Var3, i0Var3);
                rm0Var.f3165u0.f47656f = true;
                rm0Var.f3145e.T();
                eVar.l();
                if (i0Var2 instanceof sl0) {
                    sl0Var = (sl0) i0Var2;
                } else {
                    sl0Var = null;
                }
                sl0 sl0Var2 = sl0Var;
                d0Var.i1(i10, i11, z10);
                if (i0Var2 != null) {
                    i0Var2.l();
                }
                rm0Var.B0();
                rm0Var.setVerticalScrollBarEnabled(false);
                w7.y5 y5Var = (w7.y5) this.f31553i;
                if (y5Var != null) {
                    y5Var.c();
                }
                rm0Var.V1 = true;
                if (sl0Var2 != null) {
                    sl0Var2.f30815c = true;
                    sl0Var2.d = false;
                    sl0Var2.f30816e.clear();
                    sl0Var2.f30817f.clear();
                }
                rm0Var.addOnLayoutChangeListener(new rl0(this, i0Var2, arrayList, z12, sl0Var2));
                return;
            }
            d0Var.i1(i10, i11, z10);
        }
    }

    public void d(w7.y5 y5Var) {
        this.f31553i = y5Var;
    }

    public ul0(p4.e eVar, p4.v vVar, p4.q qVar, int i10, p4.v vVar2, Collection collection) {
        this.f31547a = 1;
        this.f31555k = null;
        this.f31549c = false;
        this.d = false;
        this.f31554j = new WeakReference(eVar);
        this.f31552g = vVar;
        this.f31550e = qVar;
        this.f31548b = i10;
        this.f31551f = eVar.d;
        this.h = vVar2;
        this.f31553i = collection != null ? new ArrayList(collection) : null;
        eVar.f45371a.postDelayed(new org.telegram.ui.web.q0(this, 9), 15000L);
    }
}
