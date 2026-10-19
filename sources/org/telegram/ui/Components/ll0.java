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
public class ll0 {
    public final int f28243a;
    public int f28244b;
    public boolean f28245c;
    public boolean d;
    public final Object e;
    public final Object f28246f;
    public Object f28247g;
    public Object h;
    public Object f28248i;
    public final Object f28249j;
    public Object f28250k;

    public ll0(im0 im0Var, s4.b0 b0Var) {
        this.f28243a = 0;
        this.f28249j = new SparseArray();
        this.f28250k = new HashMap();
        this.e = im0Var;
        this.f28246f = b0Var;
    }

    public final void a() {
        switch (this.f28243a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f28247g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                im0 im0Var = (im0) this.e;
                im0Var.setVerticalScrollBarEnabled(true);
                im0Var.V1 = false;
                s4.g0 adapter = im0Var.getAdapter();
                if (adapter instanceof jl0) {
                    ((jl0) adapter).E();
                }
                this.f28247g = null;
                int childCount = im0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = im0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.n4) {
                        ((org.telegram.ui.Cells.n4) childAt).e(false, false);
                    }
                }
                return;
            default:
                p4.q qVar = (p4.q) this.e;
                if (!this.f28245c && !this.d) {
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
        p4.v vVar = (p4.v) this.f28246f;
        int i10 = this.f28244b;
        WeakReference weakReference = (WeakReference) this.f28249j;
        p4.x.b();
        if (!this.f28245c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f44091g == this && ((lVar = (c0.l) this.f28250k) == null || !lVar.isCancelled())) {
                this.f28245c = true;
                eVar.f44091g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f44088b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f44087a.obtainMessage(263, vVar);
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
                    p4.b bVar = eVar3.f44087a;
                    p4.v vVar2 = (p4.v) this.f28247g;
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
                    eVar3.f44088b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f28248i;
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
        jl0 jl0Var;
        s4.g0 g0Var;
        long j10;
        HashMap hashMap = (HashMap) this.f28250k;
        SparseArray sparseArray = (SparseArray) this.f28249j;
        s4.b0 b0Var = (s4.b0) this.f28246f;
        im0 im0Var = (im0) this.e;
        if (!im0Var.V1) {
            if (im0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.l0 itemAnimator = im0Var.getItemAnimator();
                    gl0 gl0Var = new gl0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        c(i10, i11, z10, false);
                    } else {
                        itemAnimator.f45988b.add(gl0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (im0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f28244b == -1) {
                b0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = im0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f28244b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                im0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                s4.g0 adapter = im0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = im0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    b0Var.getClass();
                    sparseArray.put(s4.n0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f45956b && !this.f28245c)) {
                        g0Var = adapter;
                    } else {
                        if (this.f28245c) {
                            int b10 = ((s4.o0) childAt.getLayoutParams()).f46014a.b();
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
                            j10 = ((s4.o0) childAt.getLayoutParams()).f46014a.e;
                        }
                        hashMap.put(Long.valueOf(j10), childAt);
                    }
                    if (childAt instanceof org.telegram.ui.Cells.n4) {
                        ((org.telegram.ui.Cells.n4) childAt).e(true, true);
                    }
                    i12++;
                    adapter = g0Var;
                }
                s4.g0 g0Var2 = adapter;
                im0Var.B0();
                im0Var.o0();
                s4.b bVar = im0Var.d;
                bVar.m((ArrayList) bVar.d);
                bVar.m((ArrayList) bVar.e);
                bVar.f45894b = 0;
                qf.e eVar = im0Var.f3605b;
                s4.g0 g0Var3 = im0Var.f3631w;
                eVar.d(g0Var3, g0Var3);
                im0Var.f3629u0.f46069f = true;
                im0Var.e.R();
                eVar.l();
                if (g0Var2 instanceof jl0) {
                    jl0Var = (jl0) g0Var2;
                } else {
                    jl0Var = null;
                }
                jl0 jl0Var2 = jl0Var;
                b0Var.i1(i10, i11, z10);
                if (g0Var2 != null) {
                    g0Var2.l();
                }
                im0Var.B0();
                im0Var.setVerticalScrollBarEnabled(false);
                w7.a6 a6Var = (w7.a6) this.f28248i;
                if (a6Var != null) {
                    a6Var.c();
                }
                im0Var.V1 = true;
                if (jl0Var2 != null) {
                    jl0Var2.f27557c = true;
                    jl0Var2.d = false;
                    jl0Var2.e.clear();
                    jl0Var2.f27558f.clear();
                }
                im0Var.addOnLayoutChangeListener(new il0(this, g0Var2, arrayList, z12, jl0Var2));
                return;
            }
            b0Var.i1(i10, i11, z10);
        }
    }

    public void d(w7.a6 a6Var) {
        this.f28248i = a6Var;
    }

    public ll0(p4.e eVar, p4.v vVar, p4.q qVar, int i10, p4.v vVar2, Collection collection) {
        this.f28243a = 1;
        this.f28250k = null;
        this.f28245c = false;
        this.d = false;
        this.f28249j = new WeakReference(eVar);
        this.f28247g = vVar;
        this.e = qVar;
        this.f28244b = i10;
        this.f28246f = eVar.d;
        this.h = vVar2;
        this.f28248i = collection != null ? new ArrayList(collection) : null;
        eVar.f44087a.postDelayed(new org.telegram.ui.web.z1(this, 3), 15000L);
    }
}
